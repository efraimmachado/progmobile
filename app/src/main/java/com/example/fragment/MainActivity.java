package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.fragment.fragment.ChamadasFragment;
import com.example.fragment.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button btnConversas;
    private Button btnChamadas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("EVENTOS","on create - MainActivity");
        btnConversas = findViewById(R.id.btnConversas);
        btnChamadas = findViewById(R.id.btnChamadas);

        btnConversas.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ConversasFragment fragment = new ConversasFragment();
                Bundle bundle = new Bundle();
                bundle.putString("nome", "Zalmoxis");
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fragContainer, fragment)
                        .commit();
            }
        });

        btnChamadas.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fragContainer, new ChamadasFragment())
                        .commit();
            }
        });

    }
}