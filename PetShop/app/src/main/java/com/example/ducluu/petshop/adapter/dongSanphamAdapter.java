package com.example.ducluu.petshop.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ducluu.petshop.R;
import com.example.ducluu.petshop.model.thucung;

import java.util.ArrayList;

public class dongSanphamAdapter extends BaseAdapter {
    public Context context;
    public ArrayList<thucung> thucungArrayList;

    public dongSanphamAdapter(Context context, ArrayList<thucung> thucungArrayList) {
        this.context = context;
        this.thucungArrayList = thucungArrayList;
    }

    @Override
    public int getCount() {
        return thucungArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return thucungArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public class viewHolder{
        public TextView txttensp, txtgiasp, txtsoluong,txtmota;
        public ImageView imgsp;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        viewHolder viewHolder = null;
        if(view == null){
            viewHolder = new viewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.dong_sanpham ,null);
            viewHolder.txttensp = (TextView) view.findViewById(R.id.texttensp);
            viewHolder.txtgiasp= (TextView) view.findViewById(R.id.txtgiasp);
            viewHolder.txtmota= (TextView) view.findViewById(R.id.textmota);
            viewHolder.txtsoluong=(TextView) view.findViewById(R.id.textsl);
            viewHolder.imgsp= (ImageView) view.findViewById(R.id.imHinhsp);
        }
        else {
            viewHolder = (viewHolder) view.getTag();
        }

        thucung sp = (thucung) getItem(i);
        viewHolder.txttensp.setText(sp.getTenthu());
        viewHolder.txtgiasp.setText("giá:"+(sp.getGia())+ "Đ");
        viewHolder.txtmota.setText(sp.getMota());
        viewHolder.txtsoluong.setText(sp.getSoluongcon());
        viewHolder.imgsp.setImageResource(sp.getHinh());
        return view;
    }

}
