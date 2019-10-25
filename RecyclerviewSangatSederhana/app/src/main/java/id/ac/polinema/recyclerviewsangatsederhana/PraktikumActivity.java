package id.ac.polinema.recyclerviewsangatsederhana;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.SuperHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class PraktikumActivity extends AppCompatActivity {

    RecyclerView rvSuperHero;
    List<SuperHero> superHeroList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktikum);
        rvSuperHero = findViewById(R.id.rvSuperHero);
        SuperHero hero = new SuperHero("Petruk");
        superHeroList.add(hero);
        hero = new SuperHero("Gareng");
        superHeroList.add(hero);
        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(superHeroList);
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }
}
