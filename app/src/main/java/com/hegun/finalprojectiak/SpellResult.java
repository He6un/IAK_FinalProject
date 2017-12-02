package com.hegun.finalprojectiak;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;

public class SpellResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spell_result);

        TextView nameOut = (TextView) findViewById(R.id.nameOutput);
        TextView spellOut = (TextView) findViewById(R.id.spellOutput);

        Intent spellResult = getIntent();
        Bundle bundle = spellResult.getExtras();

        String words = bundle.getString("words");

        String[] wordSeparted = words.split("");

        StringBuilder t = new StringBuilder();
        Resources res = getResources();

        for (int i =1; i<wordSeparted.length; i++){
            // maaf menggunakan banyak if karena keterbatasan waktu dan pengetahuan
            // disini letak pertanyaan saya untuk Riksa Suviana
            // apakah bisa di simplified menggunakan for loop?
            if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.A)))){
                t.append(res.getText(R.string.A));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.B)))){
                t.append(res.getText(R.string.B));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.C)))){
                t.append(res.getText(R.string.C));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.D)))){
                t.append(res.getText(R.string.D));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.E)))){
                t.append(res.getText(R.string.E));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.F)))){
                t.append(res.getText(R.string.F));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.G)))){
                t.append(res.getText(R.string.G));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.H)))){
                t.append(res.getText(R.string.H));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.I)))){
                t.append(res.getText(R.string.I));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.J)))){
                t.append(res.getText(R.string.J));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.K)))){
                t.append(res.getText(R.string.K));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.L)))){
                t.append(res.getText(R.string.L));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.M)))){
                t.append(res.getText(R.string.M));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.N)))){
                t.append(res.getText(R.string.N));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.O)))){
                t.append(res.getText(R.string.O));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.P)))){
                t.append(res.getText(R.string.P));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.Q)))){
                t.append(res.getText(R.string.Q));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.R)))){
                t.append(res.getText(R.string.R));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.S)))){
                t.append(res.getText(R.string.S));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.T)))){
                t.append(res.getText(R.string.T));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.U)))){
                t.append(res.getText(R.string.U));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.V)))){
                t.append(res.getText(R.string.V));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.W)))){
                t.append(res.getText(R.string.W));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.X)))){
                t.append(res.getText(R.string.X));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.Y)))){
                t.append(res.getText(R.string.Y));
                t.append(" - ");
            }else if((wordSeparted[i].toUpperCase().equals(res.getResourceEntryName(R.string.Z)))){
                t.append(res.getText(R.string.Z));
                t.append(" - ");
            }
        }

        nameOut.setText(words.toUpperCase());
        spellOut.setText(t.toString().substring(0, t.length() -3));


    }
}
