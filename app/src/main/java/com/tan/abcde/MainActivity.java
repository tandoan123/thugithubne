package com.tan.abcde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // vừa code vừa ghi chú sẽ giúp code dễ hơn cho tất cả mọi người
        Toast.makeText(this, "hello how are you ?", Toast.LENGTH_SHORT).show();
    }
}