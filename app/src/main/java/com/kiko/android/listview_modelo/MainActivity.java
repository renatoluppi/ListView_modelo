package com.kiko.android.listview_modelo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

// TODO: 01/12/18 subir no github!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 

// TODO: 01/12/18 inserir breves descricoes nos itens das praias     

    private ListView listaPraias;
    private String[] praias = {
            "Santos" , "Praia Grande", "Monguaguá", "Florianópolis", "Natal", "Caxias",
            "Interlagos", "Vila Maria", "Brooklin" , "São Pedro", "Monaco", "Indonésia", "Paris", "Italia", "Brasil"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPraias = (ListView) findViewById(R.id.listaPraiasId);

        ArrayAdapter<String> benjamim = new ArrayAdapter<String>(
                getApplicationContext(),android.R.layout.simple_list_item_1, android.R.id.text1, praias);

        listaPraias.setAdapter(benjamim);

        listaPraias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int codigoPosicao = i;
                String valorClicado = listaPraias.getItemAtPosition(codigoPosicao).toString();
                Toast.makeText(getApplicationContext(), valorClicado, Toast.LENGTH_SHORT).show();
            }
        });
    }



    
}
