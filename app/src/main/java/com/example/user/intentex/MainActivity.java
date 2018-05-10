package com.example.user.intentex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dial(View view) {
        Intent i = new Intent();
        EditText et = findViewById(R.id.et);
        i.setData(Uri.parse("tel:" + et.getText().toString()));
        i.setAction(Intent.ACTION_DIAL);
        startActivity(i);
    }

    public void next(View view) {
        Intent i = new Intent(this, welcomeActivity.class);
        EditText et1 = findViewById(R.id.et1);
        EditText et2 = findViewById(R.id.et2);
        i.putExtra("name", et1.getText().toString());
        i.putExtra("qualification", et2.getText().toString());
        startActivity(i);

    }

    public void whatsapp(View view) {
        Intent i = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
        startActivity(i);
        if (i != null) {
            startActivity(i);
        } else {
            Intent i1 = new Intent();
            i1.setAction(Intent.ACTION_VIEW);
            i1.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp"));
            startActivity(i1);

        }
    }
}
