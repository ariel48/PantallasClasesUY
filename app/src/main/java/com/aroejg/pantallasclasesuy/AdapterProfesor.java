package com.aroejg.pantallasclasesuy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterProfesor extends RecyclerView.Adapter<AdapterProfesor.ProfesorViewHolder> {


    private List<Profesor> listaProfesores;

    public AdapterProfesor(List<Profesor> listaProfesores){
        this.listaProfesores = listaProfesores;

    }

    @NonNull
    @Override
    public ProfesorViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.profesor_card_view, viewGroup, false);
        return new ProfesorViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfesorViewHolder profesorViewHolder, int i) {
        profesorViewHolder.ivImagen.setImageResource(listaProfesores.get(i).getImagen());
        profesorViewHolder.tvNombre.setText(listaProfesores.get(i).getNombre());
        profesorViewHolder.tvTelefono.setText(listaProfesores.get(i).getTelefono());
        profesorViewHolder.tvEmail.setText(listaProfesores.get(i).getEmail());

    }

    @Override
    public int getItemCount() {
        return listaProfesores.size();
    }

    public class ProfesorViewHolder extends RecyclerView.ViewHolder {

        ImageView ivImagen;
        TextView tvNombre, tvTelefono, tvEmail;

        public ProfesorViewHolder(@NonNull View itemView) {
            super(itemView);

            ivImagen = itemView.findViewById(R.id.imagen);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvTelefono = itemView.findViewById(R.id.tvTelefono);
            tvEmail = itemView.findViewById(R.id.tvEmail);

        }
    }
}
