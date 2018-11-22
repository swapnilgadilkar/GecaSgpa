package com.example.swapn.gecacgpa;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.swapn.gecacgpa.noncbcs.packag.CivilNcFinal;
import com.example.swapn.gecacgpa.noncbcs.packag.CseNcFinal;
import com.example.swapn.gecacgpa.noncbcs.packag.ElectricalNcFinal;
import com.example.swapn.gecacgpa.noncbcs.packag.EtcNcFinal;
import com.example.swapn.gecacgpa.noncbcs.packag.ItNcFinal;
import com.example.swapn.gecacgpa.noncbcs.packag.McaNcFinal;
import com.example.swapn.gecacgpa.noncbcs.packag.MechNcFinal;


/**
 * A simple {@link Fragment} subclass.
 */
public class OldMech extends Fragment {


    public static int ncbranch_sem;
    Button sem_one,sem_two,sem_three,sem_four,sem_five,sem_six,sem_seven,sem_eight;

    public OldMech() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_old_mech,container,false);
        TextView label_branch = view.findViewById(R.id.lbl_branch);
        label_branch.setText(MainActivity.branch);



        // Inflate the layout for this fragment

        sem_one =(Button)view.findViewById(R.id.ib_sem_one);
        sem_two = (Button)view.findViewById(R.id.ib_sem_two);
        sem_three = (Button)view.findViewById(R.id.ib_sem_three);
        sem_four = (Button)view.findViewById(R.id.ib_sem_four);
        sem_five = (Button)view.findViewById(R.id.ib_sem_five);
        sem_six = (Button)view.findViewById(R.id.ib_sem_six);
        sem_seven = (Button)view.findViewById(R.id.ib_sem_seven);
        sem_eight = (Button)view.findViewById(R.id.ib_sem_eight);

        sem_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ncbranch_sem = 1;
                call();
            }
        });
        sem_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncbranch_sem = 2;
                call();
            }
        });
        sem_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncbranch_sem = 3;
                call();
            }
        });
        sem_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncbranch_sem = 4;
                call();
            }
        });
        sem_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncbranch_sem = 5;
                call();
            }
        });
        sem_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncbranch_sem = 6;
                call();
            }
        });
        sem_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncbranch_sem = 7;
                call();
            }
        });
        sem_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncbranch_sem = 8;
                call();
            }
        });

        //Toast.makeText(getActivity(),"hell",Toast.LENGTH_LONG).show();
        // Inflate the layout for this fragment






        return view;

    }
    public void call()
    {
        switch(MainActivity.branch)
        {
            case "Mechanical":{
                Intent intent = new Intent(getActivity(),MechNcFinal.class);
                startActivity(intent);
                break;
            }
            case "Civil":{
                Intent intent = new Intent(getActivity(),CivilNcFinal.class);
                startActivity(intent);
                break;
            }
            case "Electrical":{
                Intent intent = new Intent(getActivity(),ElectricalNcFinal.class);
                startActivity(intent);
                break;
            }
            case "ETC":{
                Intent intent = new Intent(getActivity(),EtcNcFinal.class);
                startActivity(intent);
                break;
            }

            case "IT":{
                Intent intent = new Intent(getActivity(),ItNcFinal.class);
                startActivity(intent);
                break;
            }
            case "CSE":{
                Intent intent = new Intent(getActivity(),CseNcFinal.class);
                startActivity(intent);
                break;
            }
            case "MCA":{
                Intent intent = new Intent(getActivity(),McaNcFinal.class);
                startActivity(intent);
                break;
            }
        }

    }






    }


