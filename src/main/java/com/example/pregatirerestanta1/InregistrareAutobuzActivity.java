package com.example.pregatirerestanta1;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.pregatirerestanta1.clase.Autobuz;

public class InregistrareAutobuzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inregistrare_autobuz);
    }

    public void inregistreaza(View view) {
        EditText nrInmatriculare = findViewById(R.id.inputNrInmatriculare);
        EditText nrLinie = findViewById(R.id.inputLinie);
        EditText sofer = findViewById(R.id.inputSofer);
        EditText nrLocuri = findViewById(R.id.inputNrDeLocuri);

        if(nrInmatriculare.getText().toString().equals("") ||
        nrLinie.getText().toString().equals("") ||
        sofer.getText().toString().equals("") ||
        nrLocuri.getText().toString().equals("")) {
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Error");
            alerta.setMessage("Nu trebuie sa aveti field-uri goale!!");
            alerta.setPositiveButton("OK", null);
            alerta.create().show();
        } else {
            Autobuz autobuz = new Autobuz();
            autobuz.setNrInmatriculare(nrInmatriculare.getText().toString());
            autobuz.setLinie(Integer.parseInt(nrLinie.getText().toString()));
            autobuz.setSofer(sofer.getText().toString());
            autobuz.setNrLocuri(Integer.parseInt(nrLocuri.getText().toString()));

            MainActivity.listaAutobuze.add(autobuz);
        }

        finish();

    }
}
