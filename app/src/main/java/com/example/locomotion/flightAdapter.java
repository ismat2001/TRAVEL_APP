package com.example.locomotion;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class flightAdapter extends RecyclerView.Adapter<flightAdapter.ViewHolder> {
    String names[], place[], charges[];
    Context mContext;

    public flightAdapter(String[] names, String[] place, String[] charges, Context mContext) {
        this.place = place;
        this.names = names;
        this.charges = charges;
        this.mContext = mContext;
    }

    @Override
    public flightAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_i_t_e_m__v_i_e_w, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(flightAdapter.ViewHolder holder, int position) {
        holder.names.setText(names[position]);
        holder.charges.setText(charges[position]);
        holder.place.setText(place[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Your choice is:" + names[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView names, place, charges;

        public ViewHolder(View itemView) {
            super(itemView);
            names = itemView.findViewById(R.id.itemName);
            place = itemView.findViewById(R.id.place);
            charges = itemView.findViewById(R.id.fare);

        }
    }
}