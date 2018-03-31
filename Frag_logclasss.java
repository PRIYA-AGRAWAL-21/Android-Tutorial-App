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
public class Frag_logclasss extends Fragment {
    TextView t1,t2;
    ImageView iv1,iv2;


    public Frag_logclasss() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v1=inflater.inflate(R.layout.frag_logclasss, container, false);
        t1=(TextView)v1.findViewById(R.id.t1);
        t2=(TextView)v1.findViewById(R.id.t2);
        iv1=(ImageView)v1.findViewById(R.id.iv1);
        iv2=(ImageView)v1.findViewById(R.id.iv2);
        return v1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1.setText("\n" +
                "*****LOG CLASS****\n" +
                "\n" +
                "Log class is mainly used for debugging purpose. Android Monitor includes the logcat monitor that displays debug messages. The logcat monitor displays system messages, such as when a garbage collection occurs,as well as messages that you can add to your app using the Log class .\n" +
                "Logcat Message Format : Every Android log message has a tag and a priority associated with it. The tag of a system log message is a short string indicating the system component from which the message originates. A user defined tag can be any string that you find helpful.It is defined as \n" +
                "Log.d(tag,message);\n" +
                "The priority is one of the following values:\n" +
                "V-Verbose(lowest Priority)\n" +
                "D-Debug\n" +
                "I-Info\n" +
                "W-Warning\n" +
                "E-Error\n" +
                "A-Assert\n" +
                "To see the message: first use log class and then run the app and then see the message in Display Android Monitor and click the logcat tab.\n");
        iv1.setImageResource(R.drawable.log1);
        t2.setText("\n" +
                "//We have used log.e in oncreate method and verify if it works properly ,our message will be shown on android monitor :\n");
    iv2.setImageResource(R.drawable.log2);}
}
