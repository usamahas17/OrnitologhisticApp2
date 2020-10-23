package com.example.ornitologhisticapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Pegamento extends RecyclerView.Adapter<Pegamento.ViewHolderpegar> {
    ArrayList<Ornitologo> listaornitologo;
    public Pegamento(ArrayList<Ornitologo> unamas){
        this.listaornitologo = unamas;

    }
    @NonNull
    @Override
    public Pegamento.ViewHolderpegar onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View j = LayoutInflater.from(parent.getContext()).inflate(R.layout.avistamiento,null,false);
        return new ViewHolderpegar(j);
    }

    @Override
    public void onBindViewHolder(@NonNull Pegamento.ViewHolderpegar holder, int position) {
        holder.ave.setText(listaornitologo.get(position).getAve());
        holder.fecha.setText(listaornitologo.get(position).getFecha());
        holder.descri.setText(listaornitologo.get(position).getDescricpcion());

    }

    @Override
    public int getItemCount() {
        return listaornitologo.size();
    }public class ViewHolderpegar extends RecyclerView.ViewHolder{
        TextView ave, fecha,descri;
        public ViewHolderpegar(View item){
            super(item);
            ave = item.findViewById(R.id.ave);
            fecha = item.findViewById(R.id.fecha);
            descri=item.findViewById(R.id.descripcion);

        }
    }
}
