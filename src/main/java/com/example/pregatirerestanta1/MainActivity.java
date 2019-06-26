package com.example.pregatirerestanta1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.pregatirerestanta1.clase.Autobuz;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Autobuz> listaAutobuze;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaAutobuze = new ArrayList<Autobuz>();
    }

    public void arataDetalii(View view) {
        Toast.makeText(this, getString(R.string.detalii_text), Toast.LENGTH_SHORT).show();
    }

    public void deschideInregistrareAutobuz(View view) {
        Intent intent = new Intent(this, InregistrareAutobuzActivity.class);
        startActivity(intent);
    }

    public void deschideListaAutobuze(View view){
        Intent intent = new Intent(this, ListaAutobuzeActivity.class);
        startActivity(intent);
    }
}
