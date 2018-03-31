package com.developers.droidteam.androidapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_dalvik extends Fragment {
    TextView t,t1;
    ImageView iv;


    public Frag_dalvik() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View v1=inflater.inflate(R.layout.fragment_frag_dalvik, container, false);
        t1=(TextView)v1.findViewById(R.id.t1);

        t=(TextView)v1.findViewById(R.id.txt);
        iv=(ImageView)v1.findViewById(R.id.iv1);
        return v1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t.setText("Dalvik Virtual Machine | DVM\n" +
                "As we know the modern JVM is high performance and provides excellent memory management. But it needs to be optimized for low-powered handheld devices as well.\n" +
                "The Dalvik Virtual Machine (DVM) is an android virtual machine optimized for mobile devices. It optimizes the virtual machine for memory, battery life and performance.\n" +
                "Dalvik is a name of a town in Iceland. The Dalvik VM was written by Dan Bornstein.\n" +
                "The Dex compiler converts the class files into the .dex file that run on the Dalvik VM. Multiple class files are converted into one dex file.\n" +
                "Let's see the compiling and packaging process from the source file:\n");
        iv.setImageResource(R.drawable.dalvik);
        t1.setText("The javac tool compiles the java source file into the class file.\n" +
                "The dx tool takes all the class files of your application and generates a single .dex file. It is a platform-specific tool.\n" +
                "The Android Assets Packaging Tool (aapt) handles the packaging process.\n");
    }
}


