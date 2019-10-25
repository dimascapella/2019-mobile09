package id.ac.polinema.recyclerviewsangatsederhana.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import id.ac.polinema.recyclerviewsangatsederhana.R;
import id.ac.polinema.recyclerviewsangatsederhana.models.ItemContent;

public class ContentAdapter_tugas2 extends RecyclerView.Adapter<ContentAdapter_tugas2.MyViewHolder> {

    private ArrayList<ItemContent> itemContents;
    private LayoutInflater inflater;

    public ContentAdapter_tugas2(ArrayList<ItemContent> itemContents, Context context) {
        this.itemContents = itemContents;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ContentAdapter_tugas2.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.tugas2_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContentAdapter_tugas2.MyViewHolder holder, int position) {
        holder.title.setText(itemContents.get(position).getTitle());
        holder.image.setImageResource(itemContents.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return (itemContents != null) ? itemContents.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.text_t2);
            image = itemView.findViewById(R.id.image_t2);
        }
    }
}
