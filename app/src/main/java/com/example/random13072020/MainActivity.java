package com.example.random13072020;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //global
    EditText mEdtSomin, mEdtSomax;
    Button mBtnRandom, mBtnAddRange, mBtnReset;
    TextView mTvKetqua;
    String mValue = "";
    Random mRandom;
    int mRandomValue = 0;
    ArrayList<Integer> mArrayRange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ánh xạ
        mBtnRandom = findViewById(R.id.buttonRandom);
        mEdtSomax = findViewById(R.id.edittextSomax);
        mEdtSomin = findViewById(R.id.edittextSomin);
        mTvKetqua = findViewById(R.id.textviewKetqua);
        mBtnAddRange = findViewById(R.id.buttonRange);
        mBtnReset = findViewById(R.id.buttonReset);

        mRandom = new Random();
        mArrayRange = new ArrayList<>();

        mBtnAddRange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validate
                String textSmin = mEdtSomin.getText().toString();
                String textSmax = mEdtSomax.getText().toString();
                if (textSmin.isEmpty() || textSmax.isEmpty()) {
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

                if (sMin >= sMax) {
                    sMax = sMin + 1;
                }
                mEdtSomin.setText(sMin + "");
                mEdtSomax.setText(sMax + "");

                // Add range
                if (mArrayRange.size() > 0) {
                    mArrayRange.clear();
                }
                for (int i = sMin; i <= sMax; i++) {
                    mArrayRange.add(i);
                }
            }
        });
        mBtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xu ly clear neu array khac null
                if (mArrayRange != null && mArrayRange.size() > 0) {
                    mArrayRange.clear();
                    mEdtSomin.setText("");
                    mEdtSomax.setText("");
                }
            }
        });

        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Task 1 : xử lý random
//                     + Random giá trị trong mảng
//                     + Hiển thị giá trị và sau đó xóa nó đi
//                10 -> 0 - 9 : random trả về index trong mảng
                if (mArrayRange.size() <= 0){
                    Toast.makeText(MainActivity.this, "Kết thúc", Toast.LENGTH_SHORT).show();
                    return;
                }
                int index = mRandom.nextInt(mArrayRange.size());
                mRandomValue = mArrayRange.get(index);
//                //Cách 1 : Hiển thị
//                if (mArrayRange.size() == 1){
//                    mValue += mRandomValue;
//                }else{
//                    mValue += mRandomValue + " - ";
//                }

                //Cách 2 : Substring
                mValue += mRandomValue + " - ";
                if (mArrayRange.size() == 1){
//                    0 - 1 - 2 - 3 - 4 - 5 - : Giữ lại từ vị trí 0 đến length - 3
                    mValue = mValue.substring(0 , mValue.length() - 3);
                }
//                <========>
                mTvKetqua.setText(mValue);
                mArrayRange.remove(index);




//                Task 2 : Hiển thị theo chuỗi như sau
//                    + Chuỗi : 1 - 2 - 3 - 4
            }
        });

//        Yêu cầu
//        1 : Nhập dữ liệu (validate)
//                + Không được bỏ trống
//                + Số min không được lớn hơn số max
//        2 : Xử lý
//                + Hiển thị kết quả theo chuỗi như sau : 1 - 2 - 4 - 5 - 2 -
//                + Các giá trị không được hiển thị quá 2 lần : 1 - 2 - 4 - 5
//        ArrayList  trong collections
//        Xu lý chuỗi split ,subString


    }

    // Task
    // 1 : Hien thị giao diện
//        - Button add range (Khi người dùng thêm giá trị random )
//        - Button reset (Khi giá trị random đã tồn tại , khi hết số random)
//        - Button random(Khi giá trị random lớn hơn 0)

}