package id.ac.polinema.recyclerviewsangatsederhana;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlerPraktikum(View view) {
        startActivity(new Intent(this, PraktikumActivity.class));
    }

    public void handlerTugas1(View view) {
        startActivity(new Intent(this, Tugas1Activity.class));
    }

    public void handlerTugas2(View view) {
        startActivity(new Intent(this, Tugas2Activity.class));
    }

    public void handlerTugas3(View view) {
        startActivity(new Intent(this, Tugas3Activity.class));
    }
}
