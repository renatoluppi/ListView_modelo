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

    private ListView listaFrutas;
    private String[] frutas= {
            "Laranja" , "Maça", "Banana", "Uva", "Goiaba", "Abacaxi",
            "Pessego", "Melancia", "Maracujá" , "Pitanga"
    };

    private String[] cor= {"Laranja é amarela", "Maça é vermelha", "banana é amarela", "Uva é verde", "Goiaba é verde", "Abacaxi é verde", "Péssego é amarelo",
            " Melancia é amarela", "Maracujá é amarelo", "Pitanga é amarela, verde ou vermelha"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaFrutas = (ListView) findViewById(R.id.listaPraiasId);

        ArrayAdapter<String> benjamim = new ArrayAdapter<String>(
                getApplicationContext(),android.R.layout.simple_list_item_1, android.R.id.text1, frutas);

        listaFrutas.setAdapter(benjamim);

        listaFrutas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int codigoPosicao = i;
                Toast.makeText(getApplicationContext(), cor[codigoPosicao], Toast.LENGTH_SHORT).show();
            }
        });
    }



    
}
