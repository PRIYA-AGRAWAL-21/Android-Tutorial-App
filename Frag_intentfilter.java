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
public class Frag_intentfilter extends Fragment {
TextView t1,t2;
    ImageView iv1;

    public Frag_intentfilter() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v1=inflater.inflate(R.layout.fragment_frag_intentfilter, container, false);
        t1=(TextView)v1.findViewById(R.id.t1);
        t2=(TextView)v1.findViewById(R.id.t2);
        iv1=(ImageView)v1.findViewById(R.id.iv1);
        return v1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1.setText("Intent Filter in Manifest File:\n" +
                "UseD FOR ACTivity As : Intent filter will help us to launch the activity i.e. it will tell which activity will be shown when the user will start an application . It is used as follows:\n");
iv1.setImageResource(R.drawable.intent1);
        t2.setText("Now if you want to broadcast the second activity first ,simply put the intent filter inside second activity.\n" +
                "\n" +
                "**If  Intent Filter is used in more than one activity then that activity is broadcasted which is found first .\n" +
                "CAN BE CONTAINED IN:\n" +
                "<activity> \t\n" +
                "<service> \n" +
                "<receiver>\n" +
                "MUST CONTAIN:\n" +
                "<action> : It adds an action to an intent filter. If there is no <action> elements in an intent-filter, the filter dose not accept any intent objects. \n" +
                "CAN CONTAIN:\n" +
                "<category> : It adds the category name to an intent-filter.\n" +
                "<data>    :  It adds a data specification to an intent-filter. The \n" +
                "Specification can be just a data type or just a URI or both.\n" +
                " \n" +
                " \n" +
                "\t\t\n" +
                "\n" +
                "          \n");
    }
}
