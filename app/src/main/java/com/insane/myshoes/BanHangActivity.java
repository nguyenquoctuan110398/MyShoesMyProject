package com.insane.myshoes;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BanHangActivity extends AppCompatActivity {
    private Button btnDoanhThu;
    private Button btnKho;
    private Button btnBanHang;
    private Button btnTuyChon;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banhang);
        btnDoanhThu = findViewById(R.id.btn_DoanhThu);
        btnDoanhThu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_DoanhThu = new Intent(BanHangActivity.this, DoangThuActivity.class);
                startActivity(intent_DoanhThu);
            }
        });

        btnBanHang = findViewById(R.id.btn_BanHang);
        btnBanHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_BanHang = new Intent(BanHangActivity.this, BanHangActivity.class);
                startActivity(intent_BanHang);
            }
        });

        btnKho = findViewById(R.id.btn_Kho);
        btnKho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_Kho = new Intent(BanHangActivity.this, KhoActivity.class);
                startActivity(intent_Kho);
            }
        });

        btnTuyChon = findViewById(R.id.btn_TuyChon);
        btnTuyChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_TuyChon = new Intent(BanHangActivity.this, TuyChonActivity.class);
                startActivity(intent_TuyChon);
            }
        });
    }
}
