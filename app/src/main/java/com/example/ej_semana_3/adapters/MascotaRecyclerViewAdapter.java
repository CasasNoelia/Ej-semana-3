package com.example.ej_semana_3.adapters;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.ej_semana_3.R;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ej_semana_3.entities.Mascota;

import java.util.List;

public class MascotaRecyclerViewAdapter extends RecyclerView.Adapter<MascotaRecyclerViewAdapter.ViewHolder> {

    private Context context;
    private List<Mascota> mascotas;


    public MascotaRecyclerViewAdapter(Context context, List<Mascota> mascotas) {
        this.context = context;
        this.mascotas = mascotas;
    }

    @NonNull
    @Override
    public MascotaRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaRecyclerViewAdapter.ViewHolder holder, int position) {
        final Mascota mascota;
        mascota = mascotas.get(position);
        holder.nombre.setText(mascota.getNombre().toString());
        holder.rating.setText(mascota.getRating());
        BitmapDrawable ob = new BitmapDrawable(context.getResources(), mascota.getImagen());
        holder.imagen.setBackground(ob);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nombre, rating;
        private ImageView imagen;

        private View rootView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rootView = itemView;
            nombre = itemView.findViewById(R.id.nombre);
            imagen = itemView.findViewById(R.id.imagen);
            rating = itemView.findViewById(R.id.rating);
        }
    }
}
