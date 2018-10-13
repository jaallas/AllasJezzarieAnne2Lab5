package com.allas.jezzarie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button act1 = (Button) findViewById(R.id.act2);
        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act1 = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(act1);
            }
        });

    }
}
