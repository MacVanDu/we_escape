package dumv.com.selockhome.cuadu;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import dumv.com.selockhome.cuadu.Data.duLieu;
import dumv.com.selockhome.cuadu.DataVuAn.VuAn;
import dumv.com.selockhome.cuadu.DoiTuong.NhiemVu;

import static dumv.com.selockhome.cuadu.R.id.map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, LocationListener {
    private TextView noidungnv, soTTNhiemVu;
    private GoogleMap mMap;
    private LocationManager locationManager;

    NhiemVu manhMoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(map);
        mapFragment.getMapAsync(this);
        khoitao();
        setNV();
        setHienNV();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback() {
            @Override
            public void onMapLoaded() {
                veNV();
            }
        });
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    @Override
    public void onLocationChanged(Location location) {
        if (TinhKHoangCach(location, manhMoi.getViTri()) < manhMoi.getBanKinh()) {
            Toast.makeText(MapsActivity.this, "Da Den " + manhMoi.getBanKinh() + " === " + TinhKHoangCach(location, manhMoi.getViTri()), Toast.LENGTH_SHORT).show();
           if(VuAn.getVuAn().getNBO()<duLieu.getDt().getArrNHiemVu().size()) {layManhMoi();
            setNV();
            setHienNV();           }
        }
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

    private void khoitao() {
        noidungnv = (TextView) findViewById(R.id.noidungnv);
        soTTNhiemVu = (TextView) findViewById(R.id.soTTNhiemVu);
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 10, this);

    }

    public double TinhKHoangCach(Location StartP, LatLng EndP) {
        double distance;
        Location lt = new Location("a");
        lt.setLatitude(EndP.latitude);
        lt.setLongitude(EndP.longitude);
        distance = StartP.distanceTo(lt);
        return distance;
    }

    private void veNV() {
        mMap.clear();
        mMap.addMarker(new MarkerOptions().position(manhMoi.getViTri()).title(manhMoi.getMoTa()));
    }

    private void setNV() {
//        VuAn.getVuAn().setNBO();
        manhMoi = duLieu.getDt().getArrNHiemVu().get(0);
    }

    private void setHienNV() {
        soTTNhiemVu.setText("" +( VuAn.getVuAn().getNBO()+1));
        noidungnv.setText(manhMoi.getMoTa());
    }

    private void layManhMoi() {
        for (int i = 0; i < manhMoi.getArrManhMoi().size(); i++) {
            VuAn.getVuAn().getArrManhMoi().add(manhMoi.getArrManhMoi().get(i));
        }
    }
}
