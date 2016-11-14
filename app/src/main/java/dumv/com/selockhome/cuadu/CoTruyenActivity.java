package dumv.com.selockhome.cuadu;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import dumv.com.selockhome.cuadu.Data.duLieu;
import dumv.com.selockhome.cuadu.DataVuAn.VuAn;
import dumv.com.selockhome.cuadu.DoiTuong.TinhNghi;
import dumv.com.selockhome.cuadu.adapter.TinhNghiAdapter;

/**
 * Created by 8470p on 11/6/2016.
 */

public class CoTruyenActivity extends AppCompatActivity {
    TextView txvCotTruyen;
    ListView lsvDSTinhNghi;
    Button btnXem,btnPhaAn;
    TinhNghiAdapter nghiAdapter;
    LinearLayout lot;
    int xem = 0;
    dilogTTTinhNghi tinhNghi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cot_truyen);
        khoiTaoData();
        anhXa();
        ganDuLieu();
        setClick();
    }

    public void anhXa() {
        txvCotTruyen = (TextView) findViewById(R.id.txv_CotTruyen);
       lsvDSTinhNghi = (ListView) findViewById(R.id.lsv_dsTinhNghi);
        btnXem = (Button) findViewById(R.id.btn_xem);
        btnPhaAn=(Button)findViewById(R.id.btnPhaAn);
        lot = (LinearLayout) findViewById(R.id.lot);
    }

    public void khoiTaoData() {

        duLieu.getDt().taoDuLieu();
    }

    public void ganDuLieu() {
        txvCotTruyen.setText(duLieu.getDt().getCotTruyen().getSuViecVA().toString());
        nghiAdapter = new TinhNghiAdapter(this.getBaseContext(), 0, duLieu.getDt().getArTinhNghi());
        lsvDSTinhNghi.setAdapter(nghiAdapter);
    }

    private void setClick() {
        btnXem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xem == 0) {
                    lsvDSTinhNghi.setVisibility(View.VISIBLE);
                    lot.setVisibility(View.GONE);
                    xem = 1;
                    btnXem.setText("Đọc Cốt Chuyện");
                } else {
                    lsvDSTinhNghi.setVisibility(View.GONE);
                    lot.setVisibility(View.VISIBLE);
                    xem = 0;
                    btnXem.setText("Danh Sách tình Nghi");
                }
            }
        });
        lsvDSTinhNghi.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                if(position<= VuAn.getVuAn().getNBO()){
                tinhNghi=new dilogTTTinhNghi(CoTruyenActivity.this);
                tinhNghi.hien(nghiAdapter.getItem(position));
                tinhNghi.show();                       }

                return false;
            }
        });
        btnPhaAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoTruyenActivity.this,MapsActivity.class));
            }
        });
    }

    class dilogTTTinhNghi extends Dialog {

        private TextView txvTuoi, txvMoTa, txvDocCo;
        private ImageView txvTuoiHungThu;
        private Button btnDong;

        public dilogTTTinhNghi(Context context) {
            super(context);
            setContentView(R.layout.dialog_tt_tinhnghi);
            anhXa();
        }

        private void anhXa() {
            btnDong=(Button)findViewById(R.id.btnDong);
            btnDong.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dismiss();
                }
            });
            txvTuoi = (TextView) findViewById(R.id.txvTuoiHungThu);
            txvMoTa = (TextView) findViewById(R.id.txvMoTaHungThu);
            txvDocCo = (TextView) findViewById(R.id.txv_DongCo);
            txvTuoiHungThu = (ImageView) findViewById(R.id.imgAnhHungThu);
        }

      public void hien(TinhNghi i){
          txvMoTa.setText(i.getMoTa());
          txvTuoi.setText(i.getTuoi()+" Tuổi");
          txvDocCo.setText(i.getDongCoGA());
          txvTuoiHungThu.setImageResource(i.getAnh());
          setTitle(i.getTen());

      }

    }
}
