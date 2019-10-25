package id.ac.polinema.recyclerviewsangatsederhana;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.ContentAdapter_tugas1;
import id.ac.polinema.recyclerviewsangatsederhana.models.ItemContent;

public class Tugas1Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ItemContent> itemContentsArray;
    ContentAdapter_tugas1 adapter;

    private int[] ListImage = new int[]{
      R.drawable.c1c,
      R.drawable.c2c,
      R.drawable.c3c,
      R.drawable.c4c,
      R.drawable.c5c
    };

    private String[] ListTitle = new String[]{
            "Rainbow Splash",
            "Rainbow Cube",
            "Wolfie",
            "Tools",
            "Ruler"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1);
        recyclerView = findViewById(R.id.view_tugas1);
        itemContentsArray = List();
        adapter = new ContentAdapter_tugas1(itemContentsArray, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private ArrayList<ItemContent> List() {
        ArrayList<ItemContent> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            ItemContent itemContent = new ItemContent();
            itemContent.setTitle(ListTitle[i]);
            itemContent.setImage(ListImage[i]);
            list.add(itemContent);
        }
        return list;
    }
}
