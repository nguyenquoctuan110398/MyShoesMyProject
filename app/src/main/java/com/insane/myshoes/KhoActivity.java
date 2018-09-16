package com.insane.myshoes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class KhoActivity extends AppCompatActivity {
    private Button btnDoanhThu;
    private Button btnBanHang;
    private Button btnTuyChon;
    private ImageButton btnPlus;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kho);

        btnDoanhThu = findViewById(R.id.btn_DoanhThu);
        btnDoanhThu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_DoanhThu = new Intent(KhoActivity.this, DoangThuActivity.class);
                startActivity(intent_DoanhThu);
            }
        });

        btnBanHang = findViewById(R.id.btn_BanHang);
        btnBanHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_BanHang = new Intent(KhoActivity.this, BanHangActivity.class);
                startActivity(intent_BanHang);
            }
        });

        btnTuyChon = findViewById(R.id.btn_TuyChon);
        btnTuyChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_TuyChon = new Intent(KhoActivity.this, TuyChonActivity.class);
                startActivity(intent_TuyChon);
            }
        });

        btnPlus = findViewById(R.id.btn_Plus);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_Plus = new Intent(KhoActivity.this, ThemMatHangActivity.class);
                startActivity(intent_Plus);
            }
        });
    }
}
