package dumv.com.selockhome.cuadu.DoiTuong;

/**
 * Created by 8470p on 11/2/2016.
 */

public class TinhNghi {
    private String ten;
    private String tuoi;
    private String moTa,dongCoGA;
    private int anh,xoTTXuastHien;

    public int getXoTTXuastHien() {
        return xoTTXuastHien;
    }

    public void setXoTTXuastHien(int xoTTXuastHien) {
        this.xoTTXuastHien = xoTTXuastHien;
    }

    public int getAnh() {
        return anh;
    }

    public String getDongCoGA() {
        return dongCoGA;
    }

    public void setDongCoGA(String dongCoGA) {
        this.dongCoGA = dongCoGA;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }
}
