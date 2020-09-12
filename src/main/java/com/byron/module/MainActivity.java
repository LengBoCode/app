package com.byron.module;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.byron.business_a.AUtils;
import com.byron.business_b.BUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.net).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, com.byron.business_a.MainActivity.class);
//                startActivity(intent);
//                BUtils.sayHello(MainActivity.this);
                AUtils.sayHello(MainActivity.this);
//                Toast.makeText(MainActivity.this, getString(R.string.from_a),Toast.LENGTH_LONG).show();
            }
        });

        findViewById(R.id.db).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, com.byron.business_a.MainActivity.class);
//                startActivity(intent);
//                BUtils.sayHello(MainActivity.this);
                BUtils.sayHello(MainActivity.this);
                Intent intent = new Intent(MainActivity.this, com.byron.business_b.activities.MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
