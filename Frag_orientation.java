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
public class Frag_orientation extends Fragment {
TextView t1,t2,t3,t4,t5,t6;
    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9;

    public Frag_orientation() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v1=inflater.inflate(R.layout.fragment_frag_orientation, container, false);
        t1=(TextView)v1.findViewById(R.id.t1);
        t2=(TextView)v1.findViewById(R.id.t2);
        t3=(TextView)v1.findViewById(R.id.t3);
        t4=(TextView)v1.findViewById(R.id.t4);
        t5=(TextView)v1.findViewById(R.id.t5);
        t6=(TextView)v1.findViewById(R.id.t6);
        i1=(ImageView)v1.findViewById(R.id.iv1);
        i2=(ImageView)v1.findViewById(R.id.iv2);
        i3=(ImageView)v1.findViewById(R.id.iv3);
        i4=(ImageView)v1.findViewById(R.id.iv4);
        i5=(ImageView)v1.findViewById(R.id.iv5);
        i6=(ImageView)v1.findViewById(R.id.iv6);
        i7=(ImageView)v1.findViewById(R.id.iv7);
        i8=(ImageView)v1.findViewById(R.id.iv8);
        i9=(ImageView)v1.findViewById(R.id.iv9);

        return v1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1.setText("*********************Android screen  orientation**********************\n" +
                "The screen orientation is the attribute of activity element.The orientation of android activity can be portrait , landscape, sensor, unspecified,etc.\n" +
                "Value                    Description\n" +
                "unspecified          It is the default value.In such case, system chooses the orientation.\n" +
                "portrait                 taller not wider\n" +
                "landscape             wider not taller\n" +
                "sensor                    orientation is determined by the device orientation sensor.\n" +
                "\n" +
                "HOW TO FIX ORIENTATION?\n" +
                "If you want to fix the orientation of the activity then you have to give its orientation in manifest file.\n");
      t2.setText("HOW TO FIX ORIENTATION?\n" +
              "If you want to fix the orientation of the activity then you have to give its orientation in manifest file.\n");
        i1.setImageResource(R.drawable.orientation);
   i2.setImageResource(R.drawable.fixconfig);
        t3.setText("HOW TO KNOW THE ORIENTATION OF ACTIVITY AT RUNTIME?\n" +
                "In order to know the changes in orientation at runtime we have to add configChanges in manifest file as follows:\n");
i3.setImageResource(R.drawable.onconfig);
        t4.setText("To provide a message or notification for change in configuration , there is a method OnConfigurationChanged in Java class.");
      i4.setImageResource(R.drawable.image);
        t5.setText(" \n" +
                "** here Toast has been used just to display the message fo a short span of time.\n" +
                "On running the above code ...\n");
        i5.setImageResource(R.drawable.config2);
        i6.setImageResource(R.drawable.config1);
        t6.setText("BUT HOW WILL WE KNOW THAT ORIENTATION CHANGES FOM PORTRAIT TO LANDSCAPE OR VICE VERSA? \n" +
                "For this we have the following code in java...\n");
        i7.setImageResource(R.drawable.conava);
        i8.setImageResource(R.drawable.i8);
        i9.setImageResource(R.drawable.i9);





    }
}
