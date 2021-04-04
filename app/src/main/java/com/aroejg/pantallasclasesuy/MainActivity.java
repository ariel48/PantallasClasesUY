package com.aroejg.pantallasclasesuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.os.VibrationAttributes;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "COM.CLASESUY.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setSubtitle(R.string.app_subtitulo);


    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, Listado_Profesores.class);
        EditText editText = (EditText) findViewById(R.id.etUsuarioEmail);
        String msg = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, msg);
        startActivity(intent);

    }
}