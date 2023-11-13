package pe.edu.idat.appsimplerecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import pe.edu.idat.appsimplerecyclerview.databinding.ItemListBinding;

public class AdapterLista extends RecyclerView.Adapter<AdapterLista.ViewHolder> {

    ArrayList<String> lista = new ArrayList<>();


    @NonNull
    @Override
    public AdapterLista.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(
                ItemListBinding.inflate(
                        LayoutInflater.from(parent.getContext()),
                        parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterLista.ViewHolder holder, int position) {
        String dato = lista.get(position);
        holder.binding.tvitem.setText(dato);

    }

    @Override
    public int getItemCount() { return lista.size(); }

    public void setLista(ArrayList<String> data) {
        lista.addAll(data);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemListBinding binding;
        public ViewHolder(ItemListBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
