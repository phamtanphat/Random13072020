package com.example.random13072020;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lam tron : 0.5
//        long value = Math.round(1.49);
//        Log.d("BBB","Round value " + value);

        // Lam tron len : 0.1
//        double value1 = Math.ceil(0.1);
//        Log.d("BBB","Ceil value " + value1);

        // Lam tron xuong : 0.9
//        double value2 = Math.floor(0.9);
//        Log.d("BBB","Floor value " + value2);

        // Ham random
        // 0 - 5
        double random = Math.floor(Math.random() * 6);
        Log.d("BBB",random + "");


    }




//    private void dinhNghiaPhuongThuc(){
//        // ctrl + p : xem tham so truyen vao
////        int value = tinhTong(5,10);
////        Log.d("BBB" ,String.valueOf(value));
//        inThongBao("Activity running");
//        // 1 : Pham vi truy cap : Access modifier (class , bien , function)
//        // 2 : Gia tri sau khi thuc thi
//        // 3 : Ten cua phuong thuc (theo camelcase)
//        // public , private , protected , default
//        private int tinhTong(int a , int b){
//            int ketqua = a + b;
//            return ketqua;
//        }
//        private void inThongBao(String msg){
//            Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();
//        }
//    }
}