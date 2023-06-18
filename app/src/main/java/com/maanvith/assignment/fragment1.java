package com.maanvith.assignment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class fragment1 extends Fragment {
    RecyclerView recyclerView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment1, container, false);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Pawan Kalyan","Karimnagar","UI and UX Designer",R.drawable.pk));
        items.add(new Item("Ankitha","Kakinada","Software Tester",R.drawable.a));
        items.add(new Item("Sanjay Gaali","Nellore","Student",R.drawable.sg));
        items.add(new Item("Yerra Kumar","Srikakulam","Freelancer",R.drawable.yk));
        items.add(new Item("Immanuel Mohammad","Kurnool","Android Developer",R.drawable.im));
        items.add(new Item("Sathya Jaggam","Chittor","Student",R.drawable.sj));
        items.add(new Item("Alok Chowdary","Vizag","Marketing Manager",R.drawable.ac));
        items.add(new Item("Prabhu Author","Tirupati","Student",R.drawable.pa));
        items.add(new Item("Amrutha Krishna","Hyderabad","Quality Analyst",R.drawable.ak));
        items.add(new Item("Sathwik Aura","Ongole","Web Developer",R.drawable.sa));




        recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new MyAdapter(getActivity().getApplicationContext(),items ));


        return rootView;




    }
}