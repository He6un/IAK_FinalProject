package com.hegun.finalprojectiak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText words = (EditText) findViewById(R.id.txtWords);

        Button button = (Button)findViewById(R.id.btnSpell);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent spellResult = new Intent(MainActivity.this, SpellResult.class);

                spellResult.putExtra("words", words.getText().toString());

                startActivity(spellResult);
            }
        });
    }
}
