package dumv.com.selockhome.cuadu.DoiTuong;

/**
 * Created by 8470p on 11/2/2016.
 */

public class CotTruyen {
    StringBuilder suViecVA;
    public CotTruyen(){
        suViecVA= new StringBuilder(" ");
    }

    public StringBuilder getSuViecVA() {
        return suViecVA;
    }

    public void setSuViecVA(String suViecVA) {
        this.suViecVA.append(suViecVA);
    }
}
