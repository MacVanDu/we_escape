package dumv.com.selockhome.cuadu.DoiTuong;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

/**
 * Created by 8470p on 11/8/2016.
 */

public class NhiemVu {
    private int soTT;
    private int icon;
    private String moTa;
    private LatLng viTri;
    private int banKinh;
    private ArrayList<ManhMoi> arrManhMoi;

    public ArrayList<ManhMoi> getArrManhMoi() {
        return arrManhMoi;
    }

    public void setArrManhMoi(ManhMoi arrManhMoi) {
        this.arrManhMoi.add(arrManhMoi);
    }

    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoTT() {
        return soTT;
    }

    public void setSoTT(int soTT) {
        this.soTT = soTT;
    }

    public LatLng getViTri() {
        return viTri;
    }

    public void setViTri(LatLng viTri) {
        this.viTri = viTri;
    }

    public NhiemVu(int banKinh, int icon, String moTa, int soTT, LatLng viTri) {
        this.banKinh = banKinh;
        this.icon = icon;
        this.moTa = moTa;
        this.soTT = soTT;
        this.viTri = viTri;
        arrManhMoi= new ArrayList<>();
    }
}
