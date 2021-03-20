package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edUser, edPassword;
    Button buttonSubmit;
    String user,pwsd;

    public String validasi(){
        String UserTrue = "adeliapi";
        String pwsdTrue = "zahra02";

        if (UserTrue.equals(edUser.getText().toString()) && pwsdTrue.equals(edPassword.getText().toString())){
            return "1";
        }
        else if(!UserTrue.equals(edUser.getText().toString()) && !pwsdTrue.equals(edPassword.getText().toString())){
            return "2";
        }
        else if(!UserTrue.equals(edUser.getText().toString()) && pwsdTrue.equals(edPassword.getText().toString())){
            return "3";
        }
        else if (UserTrue.equals(edUser.getText().toString()) && !pwsdTrue.equals(edPassword.getText().toString())){
            return "4";
        }
        return "0";
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edUser = (EditText) findViewById(R.id.edUser);
        edPassword = (EditText) findViewById(R.id.edPassword);
        buttonSubmit = (Button) findViewById(R.id.button);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = edUser.getText().toString();
                pwsd = edPassword.getText().toString();

                //untuk menampilkan toast
                if (validasi() == "1"){
                    //jika benar dan sukses
                    Toast t = Toast.makeText(getApplicationContext(),
                            "user dan password benar", Toast.LENGTH_LONG);
                    t.show();
                    Bundle bendel = new Bundle();
                    bendel.putString("a", user.trim());
                    bendel.putString("b", pwsd.trim());

                    Intent intenBaru = new Intent(MainActivity.this,Activity2.class);
                    intenBaru.putExtras(bendel);
                    startActivity(intenBaru);
                }

                else if (validasi() == "2"){
                    //jika gagal
                    Toast t = Toast.makeText(getApplicationContext(),
                            "user dan password salah", Toast.LENGTH_LONG);
                    t.show();
                }

                else if (validasi() == "3"){
                    // jika user benar pw salah
                    Toast t = Toast.makeText(getApplicationContext(),
                            "user salah", Toast.LENGTH_LONG);
                    t.show();
                }

                else if (validasi () == "4"){
                    //jika user benar pw salah
                    Toast t = Toast.makeText(getApplicationContext(),
                            "password salah", Toast.LENGTH_LONG);
                    t.show();
                }

            }
        });

    }
}