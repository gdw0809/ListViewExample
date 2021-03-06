package com.example.ug.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by UG on 2015-12-29.
 */
public class KakaoAdapter extends BaseAdapter {
    Context context;     // 현재 화면의 제어권자
    int layout;              // 한행을 그려줄 layout
    ArrayList<Fruit> al;     // 다량의 데이터
    LayoutInflater inf; // 화면을 그려줄 때 필요
    public KakaoAdapter(Context context, int layout, ArrayList<Fruit> al) {
        this.context = context;
        this.layout = layout;
        this.al = al;
        this.inf = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() { // 총 데이터의 개수를 리턴
        return al.size();
    }
    @Override
    public Object getItem(int position) { // 해당번째의 데이터 값
        return al.get(position);
    }
    @Override
    public long getItemId(int position) { // 해당번째의 고유한 id 값
        return position;
    }
    @Override // 해당번째의 행에 내용을 셋팅(데이터와 레이아웃의 연결관계 정의)
    public View getView(int position, View convertView, ViewGroup parent) {
        //해당행 순서,   해당행 레이아웃,          리스트뷰
        // 한행의 화면을 셋팅하는 메서드 (가장 중요)
        if (convertView == null)
            convertView = inf.inflate(layout, null);
            //xml파일로 레이아웃객체 생성

        ImageView iv = (ImageView)convertView.findViewById(R.id.imageView1);
        TextView tvName=(TextView)convertView.findViewById(R.id.tvName);
        TextView tvSex =(TextView)convertView.findViewById(R.id.tvOrigin);
        TextView tvBirthDay=(TextView)convertView.findViewById(R.id.tvShipDate);

        Fruit m = al.get(position);

        iv.setImageResource(m.img);
        tvName.setText(m.name);
        tvSex.setText(m.isDomestic ? "국산" : "수입산");
        tvBirthDay.setText("출하일:" + m.shipDate);
        return convertView;
    }
}