package com.example.user.intentex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class welcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        TextView tv=findViewById(R.id.tv);
        tv.setText("wlcome 2 naresh it,"+getIntent().getStringExtra("name")+getIntent().getStringExtra("qualification"));
    }
}
