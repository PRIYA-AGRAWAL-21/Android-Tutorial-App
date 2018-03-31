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
public class Frag_hidetitlebar extends Fragment {

    TextView t,t1;
    ImageView iv,iv1;

    public Frag_hidetitlebar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v1=inflater.inflate(R.layout.fragment_frag_hidetitlebar, container, false);
        t1=(TextView)v1.findViewById(R.id.t1);

        t=(TextView)v1.findViewById(R.id.txt);
        iv=(ImageView)v1.findViewById(R.id.iv1);
        iv1=(ImageView)v1.findViewById(R.id.iv2);
        return v1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t.setText("Android Hide Title Bar Example\n" +
                "In this example, we are going to explain how to hide the title bar and how to display content in full screen mode.\n" +
                "The requestWindowFeature(Window.FEATURE_NO_TITLE) method of Activity must be called to hide the title. But, it must be coded before the setContentView method.\n");
    iv.setImageResource(R.drawable.ht1);
        t1.setText("\n" +
                "The setFlags() method of Window class is used to display content in full screen mode. You need to pass theWindowManager.LayoutParams.FLAG_FULLSCREEN constant in the setFlags method.\n");
        iv1.setImageResource(R.drawable.ht2);}
}
