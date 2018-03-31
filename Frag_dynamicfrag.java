package com.developers.droidteam.androidapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_dynamicfrag extends Fragment {
    TextView t1,t2,t3,t4,t5,t6;
    ImageView iv1,iv2,iv3,iv4,iv5,iv6;


    public Frag_dynamicfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v1=inflater.inflate(R.layout.fragment_frag_dynamicfrag, container, false);
        t1=(TextView)v1.findViewById(R.id.t1);
        t2=(TextView)v1.findViewById(R.id.t2);
        t3=(TextView)v1.findViewById(R.id.t3);
        iv1=(ImageView)v1.findViewById(R.id.iv1);
        iv2=(ImageView)v1.findViewById(R.id.iv2);
        iv3=(ImageView)v1.findViewById(R.id.iv3);
        return v1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1.setText("Dynamic   Insertion  of fragment : For dynamic insertion of fragment  you need to add fragment in java file . For this we need fragment manager which holds all information of fragments and an object of fragment Transaction through which we will add or replace(if any fragment preexists, it will replace that fragment by it self) fragment and at last we have to commit () our transaction.\n" +
                "MainActivity.java\n");
        iv1.setImageResource(R.drawable.dynamicfrag1);
        t2.setText("** We can also add fragment on component click (Button,Textview,Imageview etc) using the same java code inside onclicklistener method.\n" +
                "\n" +
                "Frag_A.xml\n");
        iv2.setImageResource(R.drawable.staticfrag2);
        t3.setText("**No need to do anything in activity_main.xml. \n" +
                "Output: Frag_ A  dynamically inserted and is visible at runtime.\n");
        iv3.setImageResource(R.drawable.staticfrag3);
    }
}


