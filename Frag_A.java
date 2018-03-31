package com.developers.droidteam.androidapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.ButtonBarLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_A extends Fragment {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    TextView t;


    public Frag_A() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View v1=inflater.inflate(R.layout.frag_a, container, false);
         b1=(Button)v1.findViewById(R.id.b1);
        b2=(Button)v1.findViewById(R.id.b2);
        b3=(Button)v1.findViewById(R.id.b3);
        b4=(Button)v1.findViewById(R.id.b4);
        b5=(Button)v1.findViewById(R.id.b5);
        b6=(Button)v1.findViewById(R.id.b6);
        b7=(Button)v1.findViewById(R.id.b7);
        b8=(Button)v1.findViewById(R.id.b8);
        b9=(Button)v1.findViewById(R.id.b9);
        b10=(Button)v1.findViewById(R.id.b10);
        b11=(Button)v1.findViewById(R.id.b11);
        return v1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.f1,new Frag_History(),"A1");
              ft.addToBackStack("a");
                ft.commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.f1,new Frag_features(),"A2");
                ft.addToBackStack("a");
                ft.commit();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.f1,new Frag_architeecture(),"A3");
                ft.addToBackStack("a");
                ft.commit();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.f1,new Frag_application_component(),"A4");
                ft.addToBackStack("a");
                ft.commit();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.f1,new Frag_installaion(),"A5");
                ft.addToBackStack("a");
                ft.commit();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.f1,new Frag_helloworld(),"A6");
                ft.addToBackStack("a");
                ft.commit();}
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.f1,new Frag_dalvik(),"A7");
                ft.addToBackStack("a");
                ft.commit();}});

                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        FragmentManager fm=getFragmentManager();
                        FragmentTransaction ft=fm.beginTransaction();
                        ft.add(R.id.f1,new Frag_hidetitlebar(),"A8");
                        ft.addToBackStack("a");
                        ft.commit();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.f1,new Frag_orientation(),"A9");
                ft.addToBackStack("a");
                ft.commit();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.f1,new Frag_intentfilter(),"A10");
                ft.addToBackStack("a");
                ft.commit();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.f1,new Frag_logclasss(),"A11");
                ft.addToBackStack("a");
                ft.commit();
            }
        });



    }}
