package com.example.scorpio.exitapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("提醒");
        builder.setMessage("确定退出当前应用程序？？？");
        builder.setPositiveButton("立即退出", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();//关闭当前的activity
                //把自己的进程杀死
                //自杀的方法
                android.os.Process.killProcess(android.os.Process.myPid());
                //System.exit(0);
            }
        });
        builder.setNegativeButton("取消", null);
        builder.show();
    }
}
