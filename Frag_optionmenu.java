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
public class Frag_optionmenu extends Fragment {
    TextView t1,t2,t3,t4;
    ImageView iv1,iv2,iv3,iv4;

    public Frag_optionmenu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v1=inflater.inflate(R.layout.frag_optionmenu, container, false);
        t1=(TextView)v1.findViewById(R.id.t1);
        t2=(TextView)v1.findViewById(R.id.t2);
        t3=(TextView)v1.findViewById(R.id.t3);
        t4=(TextView)v1.findViewById(R.id.t4);


        iv1=(ImageView)v1.findViewById(R.id.iv1);
        iv2=(ImageView)v1.findViewById(R.id.iv2);
        iv3=(ImageView)v1.findViewById(R.id.iv3);
        iv4=(ImageView)v1.findViewById(R.id.iv4);

        return v1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1.setText("****Option  Menu****\n" +
                "Android Option Menus are the primary menus of android. They can be used for settings, search, delete item etc. The options menu is typically used for providing additional info about an app, as well as linking to a help and settings sections.\n" +
                "Steps for creating option menu \n" +
                "\n" +
                "1.\tCreate a menu xml.\n" +
                "            To create a menu,right click on res then select create a new resource file,choose resource type as menu  and give a desired name to your file.\n");
        iv1.setImageResource(R.drawable.option1);
        t2.setText("2.\tRegister the menu in Activity.\n" +
                "             The menu is registered in the main activity  using the MenuInflater class  inside the onCreateOptionMenu.\n");
        iv2.setImageResource(R.drawable.option2);
        t3.setText("3.\tCode implementation for click on menu items.\n" +
                "            To respond to user interaction with your menu, you first need to detect it within your Activity class. Add the following method outline after the \"onCreateOptionsMenu\" method:\n");
        iv3.setImageResource(R.drawable.option3);
        t4.setText("Inside this method, which returns a boolean value, you can add code to respond to each particular item. The system will automatically call the \"onOptionsItemSelected\" method when the user chooses any of the options menu items.");
        iv4.setImageResource(R.drawable.option4);
    }
}
