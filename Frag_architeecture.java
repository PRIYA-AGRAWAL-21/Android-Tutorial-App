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
public class Frag_architeecture extends Fragment {
    TextView t,t1;
    ImageView iv;



    public Frag_architeecture() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View v1=inflater.inflate(R.layout.fragment_frag_architeecture, container, false);


        t=(TextView)v1.findViewById(R.id.t1);

        t1=(TextView)v1.findViewById(R.id.txt);
        iv=(ImageView)v1.findViewById(R.id.iv1);
        return v1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1.setText("Android Operating System is a stack of software components which is roughly divided into six sections as shown in the given architechture diagram:");
        iv.setImageResource(R.drawable.androidarchitecture);
        t.setText("\n" +
                "\n" +
                "The Linux Kernel : At the bottom of the layers is Linux-Linux 2.6 with approx 115 patches .\n" +
                "This provide basic system functionality like process management,memory management,\n" +
                "device management like camera,keypad,display etc. Also,the kernel handles all the things that linux\n" +
                "is really good at such as networking and a vast array of device drivers,which take the pain out of interfacing to peripheral hardware.\n" +
                "\n" +
                "***********************\n" +
                "\n" +
                "Hardware Abstraction Layer (HAL):\n" +
                "The hardware abstraction layer (HAL) provides standard interfaces that expose device hardware capabilities to the higher-level Java API framework. \n" +
                "The HAL consists of multiple library modules, each of which implements an interface for a specific type of hardware component, such as the camera or bluetooth module. When a framework API makes a call to access device hardware, the Android system loads the library module for that hardware component.\n" +
                "\n" +
                "*************************\n" +
                "Native C/C++ Libraries :\n" +
                "On the top of Hardware Abstraction Layer there is a set of libraries including open-source Web browser engine Webkit,well known library libc,SQLite database which is a useful repository for storage and sharing of application data,libraries to play and record audio and video,SSl libraries responsibale for Internet \n" +
                "security etc.\n" +
                "Many core Android system components and services, such as ART and HAL, are built from native code that require native libraries written in C and C++.\n" +
                "The Android platform provides Java framework APIs to expose the functionality of some of these native libraries to apps.\n" +
                "\n" +
                "*************************\n" +
                "Android runtime :\n" +
                "\n" +
                "This is the fourth section of the architecture and available on the third layer from the bottom.This section provides a key component  called dalvik Virtual Machine which is a kind of Java Virtual Machine specially designed and optimezed for Android.\n" +
                "\n" +
                "The Dalvik VM makes use of Linux core features like memory management and multi-threading,which is intrinsic in the java language.The Dalvik VM enables every Android Application to run in its own process,with its own instance of the Dalvik Virtual Machine.\n" +
                "\n" +
                "*****************************\n" +
                "JAVA API Framework  :\n" +
                "\n" +
                "The Application Framework Layer provides many higher-level services to application in the form of JAVA classes .Application developers are allowed to make use of these services in their applications , which include the following:\n" +
                "\n" +
                "A rich and extensible View System you can use to build an app’s UI, including lists, grids, text boxes, buttons, and even an embeddable web browser\n" +
                "A Resource Manager, providing access to non-code resources such as localized strings, graphics, and layout files\n" +
                "A Notification Manager that enables all apps to display custom alerts in the status bar\n" +
                "An Activity Manager that manages the lifecycle of apps and provides a common navigation back stack\n" +
                "Content Providers that enable apps to access data from other apps, such as the Contacts app, or to share their own data.\n" +
                "\n" +
                "***********************************\n" +
                "System Applications :\n" +
                "\n" +
                "You will find all the android applications at the top layer .\n" +
                "Examples of such applications are contacts books, browsers, games ,etc.\n" +
                "You will write your application to be installed on this layer only.The system apps function both as apps for users and to provide key capabilities that developers can access from their own app.\n" +
                "For example, if your app would like to deliver an SMS message, you don't need to build that functionality yourself—you can instead invoke whichever SMS app is already installed to deliver a message to the recipient you specify.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");

    }
}
