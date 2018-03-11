package com.example.rafaelcidro.startprogramy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Opening1 extends AppCompatActivity {
    TextView opening1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening1);

        opening1 = (TextView) findViewById(R.id.pular_instrucoes1);
        opening1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Opening1.this,MainActivity.class);
                startActivity(it);
            }
        });
    }
    public void startActivityOp2(View view){
        Intent activityOp2 = new Intent(this,Opening2.class);
        startActivity(activityOp2);


    }

}
