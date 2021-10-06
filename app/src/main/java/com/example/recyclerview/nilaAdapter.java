package com.example.recyclerview;

import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class nilaAdapter extends RecyclerView.Adapter<nilaAdapter.nilaViewHolder> {

    //menampung data yang dikirim dari model kedalam array list
    private ArrayList<nila> nilaArrayList;

    public nilaAdapter(ArrayList<nila> nilaArrayList) {

        this.nilaArrayList = nilaArrayList;
    }

    @NonNull
    @Override
    public nilaAdapter.nilaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //mengambil view parent
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        //menempelkan template item ke dalam view utama"mainactivity"
        View view = layoutInflater.inflate(R.layout.nila_item, parent, false);
        return new nilaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull nilaAdapter.nilaViewHolder holder, int position) {
        final nila Nila = nilaArrayList.get(position);
        //mengatur data yang dikirim agar ditempatkan pada item yang sesuai
        holder.txtNim.setText(Nila.getNim());
        holder.txtNama.setText(Nila.getNama());
        holder.txtProdi.setText(Nila.getGol());
        holder.txtAngkatan.setText(Nila.getAngkatan());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), Detailnila.class);
                intent.putExtra("nila", (Parcelable) Nila);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (nilaArrayList != null) ? nilaArrayList.size() : 0;
    }

    public class nilaViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNim, txtNama, txtProdi , txtAngkatan;

        public nilaViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNim = itemView.findViewById(R.id.txtNim);
            txtNama = itemView.findViewById(R.id.txtNama);
            txtProdi = itemView.findViewById(R.id.txtGol);
            txtAngkatan = itemView.findViewById(R.id.txtAngkatan);
        }
    }
}
