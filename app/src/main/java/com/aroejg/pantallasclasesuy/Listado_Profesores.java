package com.aroejg.pantallasclasesuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Listado_Profesores extends AppCompatActivity {

    List<Profesor> listaProfesores;

    private RecyclerView rvProfesores;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado__profesores);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setSubtitle(R.string.app_subtitulo);


        rvProfesores = findViewById(R.id.rvProfesores);

        listaProfesores = new ArrayList<Profesor>();

        listaProfesores.add(new Profesor(R.drawable.imagendiploma, "Juan", "212313", "juan@hoa.es"));
        listaProfesores.add(new Profesor(R.drawable.imagendiploma, "Pedro", "667313", "pedor@hoa.es"));
        listaProfesores.add(new Profesor(R.drawable.imagendiploma, "Maria", "25344313", "maria@hoa.es"));
        listaProfesores.add(new Profesor(R.drawable.imagendiploma, "Ignacio", "675313", "ignacio@hoa.es"));
        listaProfesores.add(new Profesor(R.drawable.imagendiploma, "Diego", "998913", "Diego@hoa.es"));


        rvProfesores.setHasFixedSize(true);

        lManager = new LinearLayoutManager(this);
        rvProfesores.setLayoutManager(lManager);

        adapter = new AdapterProfesor(listaProfesores);
        rvProfesores.setAdapter(adapter);



    }
}