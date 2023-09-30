package com.example.multiplosfragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListagemFragment dramaFragment = new ListagemFragment();
        ListagemFragment comediaFragment = new ListagemFragment();

        Bundle bundle = new Bundle();
        bundle.putString("categoria", "drama");
        dramaFragment.setArguments(bundle);

        bundle = new Bundle();
        bundle.putString("kevin", "terra azul");
        comediaFragment.setArguments(bundle);

        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().
                replace(R.id.containerDrama, dramaFragment)
                .commit();

        fragmentManager.beginTransaction().
                replace(R.id.containerComedia, comediaFragment)
                .commit();
    }
}