package com.example.registerapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;
    private Button btnRegister;
    private Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnRegister = (Button) findViewById(R.id.btn_register);
     //   btnClose = (Button) findViewById(R.id.btn_close);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);                                                 //实现意图页面跳转
                Toast.makeText(MainActivity.this, "登陆成功", Toast.LENGTH_LONG).show();

            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);//设置意图完成页面跳转
                Bundle bundle = new Bundle();//键值对传参
                bundle.putInt("Amount", 0);
                bundle.putInt("COM_WIN", 0);
                bundle.putInt("PLAYER_WIN", 0);
                bundle.putInt("COM_PLAYER", 0);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
//        btnClose.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SharedPreferences sharedPreferences = getSharedPreferences("asd", 0);
//                closeContextMenu();
//                Toast.makeText(MainActivity.this, "退出成功", Toast.LENGTH_LONG).show();
//                finish();
//            }
//        });
    }
}
