package dumv.com.selockhome.cuadu.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import dumv.com.selockhome.cuadu.DataVuAn.VuAn;
import dumv.com.selockhome.cuadu.DoiTuong.TinhNghi;
import dumv.com.selockhome.cuadu.R;

/**
 * Created by 8470p on 11/6/2016.
 */

public class TinhNghiAdapter extends ArrayAdapter<TinhNghi> {
    private Context ct;
    ArrayList<TinhNghi> arr;

    public TinhNghiAdapter(Context context, int resource, List<TinhNghi> objects) {
        super(context, resource, objects);
        this.ct = context;
        arr = new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) ct.getSystemService(ct.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.item_tinh_nghi, null);
        }
        if(arr.size()>0&&position<= VuAn.getVuAn().getNBO()){
            ImageView img=(ImageView)row.findViewById(R.id.item_img_anhTN);
            TextView txv= (TextView)row.findViewById(R.id.item_txv_TenTN);
            img.setImageResource(arr.get(position).getAnh());
            txv.setText(arr.get(position).getTen());
        }
        return row;
    }
}
