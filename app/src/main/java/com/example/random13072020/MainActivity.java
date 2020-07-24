package com.example.random13072020;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //global
    EditText mEdtSomin, mEdtSomax;
    Button mBtnRandom;
    TextView mTvKetqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ánh xạ
        mBtnRandom = findViewById(R.id.buttonRandom);
        mEdtSomax = findViewById(R.id.edittextSomax);
        mEdtSomin = findViewById(R.id.edittextSomin);
        mTvKetqua = findViewById(R.id.textviewKetqua);

        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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