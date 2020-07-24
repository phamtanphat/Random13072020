package com.example.random13072020;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //global
    EditText mEdtSomin, mEdtSomax;
    Button mBtnRandom;
    TextView mTvKetqua;
    String mValue = "";
    Random mRandom ;
    int mRandomValue = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ánh xạ
        mBtnRandom = findViewById(R.id.buttonRandom);
        mEdtSomax = findViewById(R.id.edittextSomax);
        mEdtSomin = findViewById(R.id.edittextSomin);
        mTvKetqua = findViewById(R.id.textviewKetqua);

        mRandom = new Random();

        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validate
                String textSmin = mEdtSomin.getText().toString();
                String textSmax = mEdtSomax.getText().toString();
                if (textSmin.isEmpty() || textSmax.isEmpty()){
                    Toast.makeText(
                            MainActivity.this,
                            "Bạn chưa nhập đủ thông tin",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                // Điều kiện 1 : Số min không lớn hơn số max
                // Điêu kiện 2 : Số max = 0 => min = 0 , max = 1

                int sMin = Integer.parseInt(textSmin);
                int sMax = Integer.parseInt(textSmax);

                if (sMin >= sMax){
                    sMax = sMin + 1;
                }
                mEdtSomin.setText(sMin + "");
                mEdtSomax.setText(sMax + "");
                // Hien thi
                mRandomValue = mRandom.nextInt(sMax - sMin + 1) + sMin;
                mValue = mValue + mRandomValue + " - ";
                mTvKetqua.setText(mValue);
            }
        });

//        Yêu cầu
//        1 : Nhập dữ liệu (validate)
//                + Không được bỏ trống
//                + Số min không được lớn hơn số max
//        2 : Xử lý
//                + Hiển thị kết quả theo chuỗi như sau : 1 - 2 - 4 - 5 - 2
//                + Các giá trị không được hiển thị quá 2 lần : 1 - 2 - 4 - 5
    }

}