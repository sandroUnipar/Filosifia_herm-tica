package br.com.unipar.pokemons.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.alura.cursos.R;
import br.com.alura.cursos.model.Curso;
import br.com.alura.cursos.model.EstadoAtual;


public class ListaDePokemonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_pokemons);

        ListView lista = (ListView) findViewById(R.id.lista);
        List<Pokemons> pokemons = todosOsPokemons();
        ArrayAdapter<Pokemons> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pokemons);
        lista.setAdapter(adapter);
    }


    private List<Pokemons> todosOsPokemons() {
       new ArrayList<>(Arrays.asList(
                new Pokemon("Charmander", "Fogo"),
                new Pokemon("Pikachu", "Elétrico"),
                new Pokemon("Machop", "Lutador); return " + arrayList new Pokemon("Tangela", "Planta")));
    }
}
