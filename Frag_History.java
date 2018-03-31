package com.developers.droidteam.androidapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_History extends Fragment {
    TextView t;


    public Frag_History() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragmentory
        View v1=inflater.inflate(R.layout.frag__history, container, false);
     t=(TextView)v1.findViewById(R.id.t1);
        return v1;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t.setText("Android is an open source and Linux-based Operating System for mobile devices such as smartphones and tablet computers.\n" +
                "\n" +
                " The history and versions of android are interesting to know.Let's understand it:\n" +
                "\n" +
                "1)  Initially, Andy Rubin founded Android Incorporation (Inc.) in Palo Alto, California, United States in October, 2003.\n" +
                "\n" +
                "2) In 17th August 2005, Google purchased android Incorporation. Since then, it is in the subsidiary of Google Incorporation.\n" +
                "\n" +
                "3) The head employees of Android Incorporation are Andy Rubin, Rich Miner, Chris White and Nick Sears.\n" +
                "\n" +
                "4) Android is the nick name of Andy Rubin given by coworkers because of his love to robots.\n" +
                "\n" +
                "5) In 2007, Google (in association with OHA) announces the development of android OS.\n" +
                "\n" +
                "6) In 2008, HTC launched the first android mobile.\n" +
                "\n" +
                "What is Open Handset Alliance (OHA)???\n" +
                "It's a consortium of 84 companies such as google, samsung, AKM, synaptics, KDDI, Garmin, Teleca, Ebay, Intel etc.\n" +
                "It was established on 5th November, 2007, led by Google. It is committed to advance open standards, provide services and deploy handsets using the Android Plateform.\n" +
                "\n" +
                "\n" +
                "Current List of Android Versions :\n" +
                "•\tv(1.0)\t\n" +
                "•\t v(1.1)\n" +
                "•\tCupcake (v1.5)\n" +
                "•\tDonut (v1.6)\n" +
                "•\tEclair (v2.0)\n" +
                "•\tFroYo (v2.2)\n" +
                "•\tGingerbread (v2.3)\n" +
                "•\tHoneycomb (v3.0)\n" +
                "•\tIce Cream Sandwich (v4.0)\n" +
                "•\tJelly Bean (v4.1, v4.2, v4.3)\n" +
                "•\tKitKat (v4.4)\n" +
                "•\tLollipop (v5.0)\n" +
                "•\tMarshmallow (v6.0)\n" +
                "•\tNougat (v7.0)\n" +
                "•\tO(v8.0)\n");
    }
}
