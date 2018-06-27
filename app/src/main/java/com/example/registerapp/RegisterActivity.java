package com.example.registerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private Button btnComfirm;
    private Button btnReturn;
    private TextView tvNum;
    private TextView tvPass;
    private TextView tvPassAgain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnComfirm= (Button) findViewById(R.id.btn_comfirm);
        btnReturn= (Button) findViewById(R.id.btn_return);
        tvNum= (TextView) findViewById(R.id.tv_num);
        tvPass= (TextView) findViewById(R.id.tv_pass);
        tvPassAgain= (TextView) findViewById(R.id.tv_pass_again);
        btnComfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
            private void showResult() {
                Bundle bundle = getIntent().getExtras();
                btnReturn.setText(bundle.getInt("Amount") + "");//'+""'是用于转化成字符串
                btnComfirm.setText(bundle.getInt("COM_WIN") + "");
                btnComfirm.setText(bundle.getInt("PLAYER_WIN") + "");
                btnReturn.setText(bundle.getInt("COM_PLAYER") + "");
            }
        });

    }
}
