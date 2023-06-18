package com.maanvith.assignment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView profile;
    TextView name,place,role;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        profile = itemView.findViewById(R.id.imageViewProfile);
        name = itemView.findViewById(R.id.textViewName);
        place=itemView.findViewById(R.id.textViewPlace);
        role=itemView.findViewById(R.id.textViewRole);
    }
}
