package com.insane.myshoes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DoangThuActivity extends AppCompatActivity {
  private Button btnKho;
  private Button btnBanHang;
  private Button btnTuyChon;
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_doanhthu);

    btnBanHang = findViewById(R.id.btn_BanHang);
    btnBanHang.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent_BanHang = new Intent(DoangThuActivity.this, BanHangActivity.class);
        startActivity(intent_BanHang);
      }
    });

    btnKho = findViewById(R.id.btn_Kho);
    btnKho.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent_Kho = new Intent(DoangThuActivity.this, KhoActivity.class);
        startActivity(intent_Kho);
      }
    });

    btnTuyChon = findViewById(R.id.btn_TuyChon);
    btnTuyChon.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent_TuyChon = new Intent(DoangThuActivity.this, TuyChonActivity.class);
        startActivity(intent_TuyChon);
      }
    });
  }
}