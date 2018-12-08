package com.example.sajib.recylerviewtwo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Sajib on 26-Mar-18.
 */

public class Myrecycleadapter extends RecyclerView.Adapter<Myrecycleadapter.Myviewholder> {
    Context mcontext;
    List<MydataModel> mydataModels;
    Myrecycleadapter(Context context, List<MydataModel> mydataModels){
        this.mcontext=context;
        this.mydataModels=mydataModels;

    }

    @Override
    public Myrecycleadapter.Myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_my_recycleview,parent,false);
        return new Myviewholder(view);
    }

    @Override
    public void onBindViewHolder(Myrecycleadapter.Myviewholder holder, int position) {
        Picasso.with(mcontext).load(mydataModels.get(position).getImageurl()).into(holder.imageView);
        holder.textView.setText(mydataModels.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return mydataModels.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView textView;
        public Myviewholder(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageid);
            textView=itemView.findViewById(R.id.textid);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
