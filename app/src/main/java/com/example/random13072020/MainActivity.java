package com.example.random13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ctrl + p : xem tham so truyen vao
        int value = tinhTong(5,10);
        Log.d("BBB" ,String.valueOf(value));
    }
    // 1 : Pham vi truy cap : Access modifier (class , bien , function)
    // 2 : Gia tri sau khi thuc thi
    // 3 : Ten cua phuong thuc (theo camelcase)
    // public , private , protected , default
    private int tinhTong(int a , int b){
        int ketqua = a + b;
        return ketqua;
    }
    private void inThongBao(String msg){
        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();
    }
}