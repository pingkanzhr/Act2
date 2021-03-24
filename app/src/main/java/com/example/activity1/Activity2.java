package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class Activity2 extends AppCompatActivity{
    TextView tuser, tpw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act2);

        tuser=findViewById(R.id.tvuser);
        tpw=findViewById(R.id.tvpw);

        Bundle bendel2 = this.getIntent().getExtras();
        String user = bendel2.getString("a");
        String pwsd = bendel2.getString("b");

        tuser.setText(user);
        tpw.setText(pwsd);

    }

}
