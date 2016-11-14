package dumv.com.selockhome.cuadu.DataVuAn;

import java.util.ArrayList;

import dumv.com.selockhome.cuadu.DoiTuong.ManhMoi;
import dumv.com.selockhome.cuadu.DoiTuong.TinhNghi;

/**
 * Created by 8470p on 11/2/2016.
 */

public class VuAn {
    private int NBO=0;
    private static VuAn vuAn;
    private ArrayList<ManhMoi> arrManhMoi= new ArrayList<>();

    public ArrayList<ManhMoi> getArrManhMoi() {
        return arrManhMoi;
    }

    //________________________________ArrTinh Nghi
   private ArrayList<TinhNghi> arrTN= new ArrayList<>();
                   private int SttNhieemjVu=0;
                                  static {
                                      vuAn = new VuAn();
                                  }

    public int getSttNhieemjVu() {
        return SttNhieemjVu;
    }

    public void setSttNhieemjVu(int sttNhieemjVu) {
        SttNhieemjVu = sttNhieemjVu;
    }

    public ArrayList<TinhNghi> getArrTN() {
        return arrTN;
    }

    public int getNBO() {
        return NBO;
    }

    public void setNBO() {
        this.NBO++;
    }

    public static VuAn getVuAn() {
        return vuAn;
    }
}
