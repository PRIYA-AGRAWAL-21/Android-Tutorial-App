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
public class Frag_intent extends Fragment {
    TextView t1,t2,t3;
    ImageView i1,i2;


    public Frag_intent() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v1=inflater.inflate(R.layout.frag_intent, container, false);
        t1=(TextView)v1.findViewById(R.id.t1);
        t2=(TextView)v1.findViewById(R.id.t2);
        t3=(TextView)v1.findViewById(R.id.t3);
        i1=(ImageView)v1.findViewById(R.id.iv1);
        i2=(ImageView)v1.findViewById(R.id.iv2);
        return v1;



    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1.setText("*************************** INTENT **********************************\n" +
                "Intent will help us to jump from one activity to another activity. Intent is like a messenger  which carries some message and help us to move from one component to any other component with-in the application or outside the application . The intents can communicate messages among any of the three core components of an application- activities ,services and broadcast receivers.\n" +
                "For example , let's assume that you have an activity that needs to launch an email client and sends an email using your Android device .For this purpose  , your Activity  would send an ACTION_SEND along with appropriate chooser , to the Android Intent Resolver . The specified chooser gives the proper interface for the user to pick how to send your email data.\n" +
                "Android intents are mainly used to:\n" +
                "o\tStart the service\n" +
                "o\tLaunch an activity\n" +
                "o\tDisplay a web page\n" +
                "o\tDisplay a list of contacts\n" +
                "o\tBroadcast a message\n" +
                "o\tDial a phone call etc.\n" +
                "\n" +
                "There are separate mechanisms for delivering intents to each type of component - activities ,services and broadcast receivers\n");

        t2.setText("INTENT OBJECT :  \n" +
                " An Intent object is a bundle of information which is used by the component that receives the intent plus information used by the Android System.\n" +
                "Types of Android Intents\n" +
                "There are two types of intents in android: implicit and explicit.\n" +
                "1) Implicit Intent\n" +
                "Implicit Intent doesn't specifiy the component. In such case, intent provides information of available components provided by the system that is to be invoked.\n" +
                "For example, you may write the following code to view the webpage.\n");
        i1.setImageResource(R.drawable.intent1);
        t3.setText("\n" +
                "2) Explicit Intent\n" +
                "Explicit Intent specifies the component. In such case, intent provides the external class to be invoked.\n");
        i2.setImageResource(R.drawable.intent2);
    }
}
