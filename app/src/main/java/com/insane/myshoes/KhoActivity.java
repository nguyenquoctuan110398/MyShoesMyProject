package com.insane.myshoes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class KhoActivity extends AppCompatActivity {
    private Button btnDoanhThu;
    private Button btnKho;
    private Button btnBanHang;
    private Button btnTuyChon;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kho);
        btnDoanhThu = (Button) findViewById(R.id.btn_doanhthu);

        btnDoanhThu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(KhoActivity.this, DoangThuActivity.class);
                startActivity(intent1);
            }
        });

    }
}
