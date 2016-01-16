package com.example.ug.listviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Fruit> al = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ListView 로 카카오톡 만들기
        //    1. 다량의 데이터
        //    2. Adapter (데이터와 view의 연결 관계를 정의)
        //    3. AdapterView (ListView)
        Fruit m1 = new Fruit();
        m1.img = R.drawable.apple;
        m1.name = "사과";
        m1.isDomestic = true;
        m1.shipDate = "2015.01.25";
        al.add(m1);
        al.add(new Fruit(R.drawable.banana, "바나나", true, "2014.08.12"));
        al.add(new Fruit(R.drawable.cherry, "체리", false, "2015.07.45"));
        al.add(new Fruit(R.drawable.jadoo_plum, "자두", false, "2015.09.20"));
        al.add(new Fruit(R.drawable.melon, "멜론", false, "1998.08.01"));
        al.add(new Fruit(R.drawable.remon, "레몬", true, "2001.07.31"));


        // adapter
        KakaoAdapter adapter = new KakaoAdapter(
                getApplicationContext(), // 현재 화면의 제어권자
                R.layout.row,             // 한행을 그려줄 layout
                al);                     // 다량의 데이터

        ListView lv = (ListView) findViewById(R.id.listView1);
        lv.setAdapter(adapter);

        // 이벤트 처리
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Log.d("test", "아이템클릭, postion : " + position +
                        ", id : " + id);
            }
        });

    } // end of onCreate
} // end of class





