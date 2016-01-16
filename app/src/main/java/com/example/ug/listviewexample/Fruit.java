package com.example.ug.listviewexample;

/**
 * Created by UG on 2015-12-29.
 */
public class Fruit { // 자바 빈 (java Bean)
    int img; // 사진 - res/drawable
    String name = "";
    boolean isDomestic;
    String shipDate = "";

    // 생성자가 있으면 객체 생성시 편리하다
    public Fruit(int img, String name, boolean isDomestic, String shipDate) {
        this.img = img;
        this.name = name;
        this.isDomestic = isDomestic;
        this.shipDate = shipDate;
    }
    public Fruit() {}// 기존 코드와 호환을 위해서 생성자 작업시 기본생성자도 추가
}
