package com.insane.myshoes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TuyChonActivity extends AppCompatActivity {
    private Button btnDoanhThu;
    private Button btnKho;
    private Button btnBanHang;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuychon);
        btnDoanhThu = findViewById(R.id.btn_DoanhThu);
        btnDoanhThu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_DoanhThu = new Intent(TuyChonActivity.this, DoangThuActivity.class);
                startActivity(intent_DoanhThu);
            }
        });

        btnBanHang = findViewById(R.id.btn_BanHang);
        btnBanHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_BanHang = new Intent(TuyChonActivity.this, BanHangActivity.class);
                startActivity(intent_BanHang);
            }
        });

        btnKho = findViewById(R.id.btn_Kho);
        btnKho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_Kho = new Intent(TuyChonActivity.this, KhoActivity.class);
                startActivity(intent_Kho);
            }
        });


    }
}