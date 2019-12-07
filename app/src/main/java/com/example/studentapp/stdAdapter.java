package com.example.studentapp;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.List;
public class stdAdapter extends RecyclerView.Adapter<stdAdapter.stdVh> {
    Context context ;
    List<student> students ;
    public  stdAdapter(Context context,List<student> students ){
        this.context = context;
        this.students=students;
    }
    @NonNull
    @Override
    public stdVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_std ,parent , false );
        return new stdVh(view);
    }
    @Override
    public void onBindViewHolder(@NonNull stdVh holder, int position) {
        holder.setData(students.get(position));
    }
    @Override
    public int getItemCount() {return students.size();
    }

     class stdVh extends RecyclerView.ViewHolder {
        TextView std_id,std_name,std_level,std_avg;
         public stdVh(@NonNull View itemView) {
             super(itemView);
             std_id = itemView.findViewById(R.id.std_id);
             std_name = itemView.findViewById(R.id.std_name);
             std_level = itemView.findViewById(R.id.std_level);
             std_avg = itemView.findViewById(R.id.std_avg);
         }

         public void setData(final student student) {
             std_id.setText(student.getId());
             std_name.setText(student.getName());
             std_level.setText(student.getLevel());
             std_avg.setText(student.getAvg());

             itemView.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Toast.makeText(context, student.getName(), Toast.LENGTH_SHORT).show();
                     Intent intent = new Intent(itemView.getContext() ,stdActivity.class);
                     intent.putExtra("id",student.getId());
                     intent.putExtra("name",student.getName());
                     intent.putExtra("level",student.getLevel());
                     intent.putExtra("Avg",student.getAvg());
                     itemView.getContext().startActivity(intent);
                 }
             });

         }
     }
}
