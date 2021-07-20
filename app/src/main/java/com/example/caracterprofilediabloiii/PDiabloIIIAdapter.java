package com.example.caracterprofilediabloiii;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PDiabloIIIAdapter extends RecyclerView.Adapter<PDiabloIIIAdapter.ViewHolder> {

    private List<Caracter> listCaracterView;
    private Context context;

    public PDiabloIIIAdapter(Context context, List<Caracter> listCaracterView)
    {
        this.context = context;
        this.listCaracterView = listCaracterView;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) { //PDiabloIIIAdapter.ViewHolder
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pdiabloiii_row_list, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Caracter data = listCaracterView.get(position);
        viewHolder.image.setImageResource(data.pimgclass);
        viewHolder.classe.setText(data.classe);
        viewHolder.force.setText(data.force);
        viewHolder.dexterity.setText(data.dexterity);
        viewHolder.intelligence.setText(data.intelligence);
        viewHolder.vitality.setText(data.vitality);
        viewHolder.damage.setText(data.damage);
        viewHolder.recovery.setText(data.recovery);

        viewHolder.itemView.setOnClickListener(v ->  {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setIcon((listCaracterView.get(position).pimgclass))
                        .setTitle(listCaracterView.get(position).classe)
                        .setMessage("I'm " + listCaracterView.get(position).classe + "!")
                        .setCancelable(false)
                        .setPositiveButton("Close", null);
                builder.create().show();
        });
    }

    @Override
    public int getItemCount() { return listCaracterView.size(); }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView classe, force, dexterity, intelligence, vitality, damage, recovery;
        ImageView image;
        LinearLayout parent;
        private CardView recycler_view;

        public ViewHolder(View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            image = itemView.findViewById(R.id.image);
            classe = itemView.findViewById(R.id.classe);
            force = itemView.findViewById(R.id.force);
            dexterity = itemView.findViewById(R.id.dexterity);
            intelligence = itemView.findViewById(R.id.intelligence);
            vitality = itemView.findViewById(R.id.vitality);
            damage = itemView.findViewById(R.id.damage);
            recovery = itemView.findViewById(R.id.recovery);
            recycler_view = itemView.findViewById(R.id.recycler_view);
        }
    }
}
