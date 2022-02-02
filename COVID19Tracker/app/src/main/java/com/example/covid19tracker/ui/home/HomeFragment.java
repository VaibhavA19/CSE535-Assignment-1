package com.example.covid19tracker.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covid19tracker.R;
import com.example.covid19tracker.Symptom;
import com.example.covid19tracker.SymptomsAdapter;
import com.example.covid19tracker.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_home,container,false);


        ArrayList<Symptom> symptomArrayList = new ArrayList<Symptom>();
        symptomArrayList.add(new Symptom("Fever",0));
        symptomArrayList.add(new Symptom("Cough",0));
        symptomArrayList.add(new Symptom("Body Pain",0));
        symptomArrayList.add(new Symptom("Cold",0));
        SymptomsAdapter symptomsAdapter = new SymptomsAdapter(symptomArrayList);
        Log.d("AAAAAAAAAAAAAAA"," in gomeeeeeeeeee fragment");
        RecyclerView symptomsRecyclerView = (RecyclerView)view.findViewById(R.id.symptom_list_view);
        symptomsRecyclerView.setAdapter(symptomsAdapter);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}