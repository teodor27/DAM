package com.example.pregatirerestanta1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pregatirerestanta1.clase.Autobuz;

import java.util.ArrayList;

public class ListaAutobuzeActivity extends AppCompatActivity {

    ArrayList<String> listaNrInmatriculare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_autobuze);

        ListView listView = findViewById(R.id.listViewAutobuze);
        listaNrInmatriculare = new ArrayList<String>();

        for(Autobuz autobuz : MainActivity.listaAutobuze) {
            listaNrInmatriculare.add(autobuz.getNrInmatriculare());
        }

        final ArrayAdapter<String> adaptor = new ArrayAdapter<>(this, R.layout.simple_list_item, listaNrInmatriculare);
        listView.setAdapter(adaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MainActivity.listaAutobuze.remove(position);

                Intent intent = new Intent(ListaAutobuzeActivity.this, InregistrareAutobuzActivity.class);
                startActivity(intent);
            }
        });
    }
}
