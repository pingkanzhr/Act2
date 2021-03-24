package com.example.activity1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarAct extends AppCompatActivity {
    EditText edNama, edAlamat, edUser, edPass, edrepas, fabsimpan;

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act2);

        edNama = findViewById(R.id.edNama);
        edAlamat = findViewById(R.id.edAlamat);
        edUser = findViewById(R.id.edUser);
        edPass = findViewById(R.id.edPass);
        edrepas = findViewById(R.id.edrepas);
        fab = findViewById(R.id.fabsimpan);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edNama.getText().toString().isEmpty() ||
                        edAlamat.getText().toString().isEmpty() ||
                        edUser.getText().toString().isEmpty() ||
                        edPass.getText().toString().isEmpty() ||
                        edrepas.getText().toString().isEmpty()) {
                    Snackbar.make(v, "Wajib isi seluruh data !!!", Snackbar.LENGTH_LONG).show();
                } else {
                    if (edPass.getText().toString().equals(edPass.getText().toString())) {
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil...",
                                Toast.LENGTH_LONG).show();

                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    } else {
                        Snackbar.make(v, "Password dan Repassword sama ya",
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
