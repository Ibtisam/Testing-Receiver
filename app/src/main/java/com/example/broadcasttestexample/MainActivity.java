package com.example.broadcasttestexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String CUSTOM_ACTION = "com.example.manifestdeclaredreceiver.ACTION_SIMPLEST_BCAST";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(CUSTOM_ACTION);
                intent.putExtra("MESS", "Hello Receiver");
                sendBroadcast(intent);
            }
        });
    }
}
