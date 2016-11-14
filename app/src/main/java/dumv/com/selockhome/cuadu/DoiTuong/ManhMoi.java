package dumv.com.selockhome.cuadu.DoiTuong;

/**
 * Created by 8470p on 11/9/2016.
 */

public class ManhMoi {
    private int HinhAnh;
    private String ten,moTa;

    public ManhMoi() {
    }

    public ManhMoi(int hinhAnh, String moTa, String ten) {
        HinhAnh = hinhAnh;
        this.moTa = moTa;
        this.ten = ten;
    }

    public int getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        HinhAnh = hinhAnh;
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
}
