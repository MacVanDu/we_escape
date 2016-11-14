package dumv.com.selockhome.cuadu.Data;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

import dumv.com.selockhome.cuadu.DoiTuong.CotTruyen;
import dumv.com.selockhome.cuadu.DoiTuong.ManhMoi;
import dumv.com.selockhome.cuadu.DoiTuong.NhiemVu;
import dumv.com.selockhome.cuadu.DoiTuong.TinhNghi;
import dumv.com.selockhome.cuadu.R;

/**
 * Created by 8470p on 11/2/2016.
 */

public class    duLieu {
    private static duLieu dt;
    private CotTruyen cotTruyen ;
    private ArrayList<TinhNghi> arTinhNghi;
    private ArrayList<NhiemVu> arrNHiemVu;

    static {
        dt = new duLieu();
    }

    public ArrayList<TinhNghi> getArTinhNghi() {
        return arTinhNghi;
    }

    public CotTruyen getCotTruyen() {
        return cotTruyen;
    }

    public static duLieu getDt() {
        return dt;
    }

    private void setCotTruyen() {
        if (cotTruyen.getSuViecVA().equals(" ")) {
            String a = "Đêm hôm qua có 1 án mạng xảy ra tại rạp xiêc LUNU " +
                    "nạn nhan là ông Băn 37 tuổi là chủ rạp xiếc" +
                    " và bà Hơ 28 tuổi là vợ của ông Băn " +
                    ".Hung thủ đang bị tình nghi là 1 con hổ vằn trong rạp xiếc."
                    + "\nTheo báo thì ông Băn đã bị con Hổ cào chết , còn bà Hơ thì bị 1 phát cào mát 1 nửa mặt và đanng bất tỉnh" +
                    "\n ? Liệu con hổ có phảo là hung thủ";
            cotTruyen.setSuViecVA(a);
        }
    }

    private void setArTinhNghi() {
        if (arTinhNghi.size() == 0) {
            TinhNghi ho = new TinhNghi();
            ho.setAnh(R.drawable.ho);
            ho.setTen("Con Hổ");
            ho.setMoTa("Là một con hổ hung dữ trong dạp xiếc nhưng rất nghe lời ông Băn , chỉ có ông ăn mới điều khiển dc nó khi diễn , và cũng chỉ có ông băn và vợ mới cho nó ăn được");
            ho.setTuoi("0");
            ho.setDongCoGA("Do nhầm lẫn giữa thức ăn và ông chủ của mình lên nó đã giết nhàm ông Băn");
            ho.setXoTTXuastHien(0);

            TinhNghi baHo = new TinhNghi();
            baHo.setAnh(R.drawable.baho);
            baHo.setTuoi("24");
            baHo.setTen("Bà Hơ");
            baHo.setMoTa("Là vợ của ông Băn chủ rạp xiếc , bà là một người phụ nữa cực xinh đẹp bị ông Băn bát về làm vợ khi mới 18 tuổi, và từ đó cuộc đời bà là những chuỗi đau khổ");
            baHo.setXoTTXuastHien(3);
            baHo.setDongCoGA("do căm ghét người chông độc ác của mình và muốn có 1 cuộc sông mới vui vẻ hơn nên đã mượn con hổ đẻ ra tay hãm hại chồng");

            TinhNghi anhCa = new TinhNghi();
            anhCa.setAnh(R.drawable.ka);
         anhCa.setTuoi("29");
            anhCa.setTen("Anh Ca");
            anhCa.setDongCoGA("Muốn Cùng bà Hơ bỏ trốn khỏi rạp xiếc để có một hạnh phúc của 2 người tại 1 nơi nào đó xa xôi, nhưng sợ ông Băn ngăn cản lên đã ra tay sat hại và đổ tội cho con hổ");
            anhCa.setXoTTXuastHien(5);
            anhCa.setMoTa("là trợ diexn của đoàn xiếc , anh có 1 vóc dáng vạm vỡ và 1 gương mặt điểm trai ,anh cũng là người tình bí mật của bà Hơ");

            arTinhNghi.add(ho);
            arTinhNghi.add(baHo);
            arTinhNghi.add(anhCa);
        }
    }
    public void taoDuLieu(){
        cotTruyen = new CotTruyen();
        arTinhNghi = new ArrayList<>();
        arrNHiemVu= new ArrayList<>();
        vetArrNV();
        setArTinhNghi();
        setCotTruyen();
    }
    private void vetArrNV(){
        ManhMoi mm= new ManhMoi(R.drawable.baho,"Cai Chay no abcxyz","Baf a");
        NhiemVu nv= new NhiemVu(10,R.drawable.baho,"cu dam thep",0,new LatLng(21.03092148, 105.85371673))  ;
        nv.setArrManhMoi(mm);
        arrNHiemVu.add(nv);
    }

    public ArrayList<NhiemVu> getArrNHiemVu() {
        return arrNHiemVu;
    }
}
