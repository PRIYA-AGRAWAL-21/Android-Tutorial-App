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
public class Frag_staticfrag extends Fragment {
    TextView t1,t2,t3,t4,t5,t6;
    ImageView iv1,iv2,iv3,iv4,iv5,iv6;

    public Frag_staticfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v1= inflater.inflate(R.layout.fragment_frag_staticfrag, container, false);
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
        t1.setText("Statically Insertion  of fragment : For static insertion of fragment just put the fragment in xml file of that activity in which you want to add fragment.\n" +
                "See the code:\n" +
                "activity_main.xml \n" +
                "//Only fragment part is shown\n");
        iv1.setImageResource(R.drawable.staticfrag1);
        t2.setText("Frag_A.xml");
        iv2.setImageResource(R.drawable.staticfrag2);
        t3.setText("**No need to do anything in MainActivity.java.\n" +
                "Output: Frag_ A   statically inserted and is visible at runtime.\n");
        iv3.setImageResource(R.drawable.staticfrag3);
    }
}
