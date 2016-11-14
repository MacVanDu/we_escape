package dumv.com.selockhome.cuadu.DoiTuong;

/**
 * Created by 8470p on 11/8/2016.
 */

public class Cauhoi {
    private int soTT;
    private String cauSai1,cauSai2,cauSai3;
    private String cauDung;

    public String getCauDung() {
        return cauDung;
    }

    public void setCauDung(String cauDung) {
        this.cauDung = cauDung;
    }

    public String getCauSai1() {
        return cauSai1;
    }

    public void setCauSai1(String cauSai1) {
        this.cauSai1 = cauSai1;
    }

    public String getCauSai2() {
        return cauSai2;
    }

    public void setCauSai2(String cauSai2) {
        this.cauSai2 = cauSai2;
    }

    public String getCauSai3() {
        return cauSai3;
    }

    public void setCauSai3(String cauSai3) {
        this.cauSai3 = cauSai3;
    }

    public int getSoTT() {
        return soTT;
    }

    public void setSoTT(int soTT) {
        this.soTT = soTT;
    }

    public Cauhoi(String cauDung, String cauSai1, String cauSai2, String cauSai3, int soTT) {
        this.cauDung = cauDung;
        this.cauSai1 = cauSai1;
        this.cauSai2 = cauSai2;
        this.cauSai3 = cauSai3;
        this.soTT = soTT;
    }
}
