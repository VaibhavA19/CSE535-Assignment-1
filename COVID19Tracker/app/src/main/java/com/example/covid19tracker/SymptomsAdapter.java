package com.example.covid19tracker;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SymptomsAdapter extends RecyclerView.Adapter<SymptomsAdapter.SymptomViewHolder> {

    private final ArrayList<Symptom> symptomArrayList;
    public SymptomsAdapter(ArrayList<Symptom> symptomArrayList) {
        this.symptomArrayList = symptomArrayList;
    }

    @NonNull
    @Override
    public SymptomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View currentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.symptom_list_item ,parent, false);
        return new SymptomViewHolder(currentView);
    }

    @Override
    public void onBindViewHolder(@NonNull SymptomViewHolder holder, int position) {
        Symptom currentSymptom = this.symptomArrayList.get(position);
        holder.SymptomNameTextView.setText(currentSymptom.getName());
        Log.d("AAAAAAAAAAAAAAA"," "+ position);
        holder.SymptomRatingBar.setRating(currentSymptom.getRating());
        // holder.SymptomRatingBar.setOnRatingBarChangeListener((ratingBar, v, b) -> );
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return this.symptomArrayList.size();
    }

    class SymptomViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView SymptomNameTextView;
        RatingBar SymptomRatingBar;

        public SymptomViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            SymptomNameTextView = (TextView) itemView.findViewById(R.id.symptom_name_text_view);
            SymptomRatingBar = (RatingBar) itemView.findViewById(R.id.symptom_rating_bar);
        }
    }
}
