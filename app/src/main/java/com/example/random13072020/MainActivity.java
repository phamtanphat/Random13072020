package com.example.random13072020;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Vector;

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

//        mBtnRandom.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Validate
//                String textSmin = mEdtSomin.getText().toString();
//                String textSmax = mEdtSomax.getText().toString();
//                if (textSmin.isEmpty() || textSmax.isEmpty()){
//                    Toast.makeText(
//                            MainActivity.this,
//                            "Bạn chưa nhập đủ thông tin",
//                            Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                // Điều kiện 1 : Số min không lớn hơn số max
//                // Điêu kiện 2 : Số max = 0 => min = 0 , max = 1
//
//                int sMin = Integer.parseInt(textSmin);
//                int sMax = Integer.parseInt(textSmax);
//
//                if (sMin >= sMax){
//                    sMax = sMin + 1;
//                }
//                // Hien thi
//
//                mRandomValue = mRandom.nextInt(sMax - sMin + 1) + sMin;
//                mValue = mValue + mRandomValue + " - ";
//
//                mTvKetqua.setText(mValue);
//                mEdtSomin.setText(sMin + "");
//                mEdtSomax.setText(sMax + "");
//
//            }
//        });

//        Yêu cầu
//        1 : Nhập dữ liệu (validate)
//                + Không được bỏ trống
//                + Số min không được lớn hơn số max
//        2 : Xử lý
//                + Hiển thị kết quả theo chuỗi như sau : 1 - 2 - 4 - 5 - 2 -
//                + Các giá trị không được hiển thị quá 2 lần : 1 - 2 - 4 - 5
//        ArrayList  trong collections
//        Xu lý chuỗi split ,subString

        ArrayList<String> arrayNames = new ArrayList<>();

        // Thêm
        arrayNames.add("Nguyen Van Teo");
        arrayNames.add("Nguyen Van Ti");

        // Cập nhật
//        arrayNames.set(2 , "Nguyen Van Tuan");

        // Xóa
        arrayNames.remove(0);

        Log.d("BBB",arrayNames.get(0) + "");

    }

    // Task
    // 1 : Hien thị giao diện
//        - Button add range (Khi người dùng thêm giá trị random )
//        - Button reset (Khi giá trị random đã tồn tại , khi hết số random)
//        - Button random(Khi giá trị random lớn hơn 0)

}