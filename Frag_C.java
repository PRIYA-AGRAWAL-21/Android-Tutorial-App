package com.developers.droidteam.androidapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_C extends Fragment {
    Button b1,b2,b3,b4,b5;


    public Frag_C() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v1= inflater.inflate(R.layout.frag__c, container, false);
        b1=(Button)v1.findViewById(R.id.b1);
        b2=(Button)v1.findViewById(R.id.b2);
        b3=(Button)v1.findViewById(R.id.b3);
        b4=(Button)v1.findViewById(R.id.b4);
        b5=(Button)v1.findViewById(R.id.b5);
        return v1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.f1, new Frag_activitylife(), "C1");
                ft.addToBackStack("a");
                ft.commit();

            }
        });
       b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm= getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.f1,new Frag_intent(),"C2");
                ft.addToBackStack("a");
                ft.commit();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm= getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.f1,new Frag_implicitintent(),"C3");
                ft.addToBackStack("a");
                ft.commit();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm= getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.f1,new Frag_explicitintent(),"C4");
                ft.addToBackStack("a");
                ft.commit();


            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm= getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.f1,new Frag_startactivityforresult(),"C5");
                ft.addToBackStack("a");
                ft.commit();


            }
        });

    }
}
