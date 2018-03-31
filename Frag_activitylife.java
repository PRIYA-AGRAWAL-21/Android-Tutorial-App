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
public class Frag_activitylife extends Fragment {
    TextView t1,t2,t3,t4,t5,t6;
    ImageView i1,i2,i3,i4,i5,i6;


    public Frag_activitylife() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View v1= inflater.inflate(R.layout.frag_activitylife, container, false);
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
        return  v1;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1.setText("Android Activity Lifecycle is controlled by 7 methods of appCompatActivity class. \n" +
                "An activity is the single screen in android. It is like window or frame of Java. By the help of activity, you can place all your UI components or widgets in a single screen. The 7 lifecycle method of Activity describes how activity will behave at different states.\n" +
                "Android Activity Lifecycle methods\n" +
                "Let's see the 7 lifecycle methods of android activity.\n");
        i1.setImageResource(R.drawable.activity1);
        t2.setText("Android Activity Lifecycle Example\n" +
                "It provides the details about the invocation of life cycle methods of activity. In this example, we are displaying the content on the logcat.\n" +
                "File: MainActivity.java\n");
        i2.setImageResource(R.drawable.activity2);
        t3.setText("Output:\n" +
                "You will not see any output on the emulator or device. You need to open logcat as here, we have used log class .\n");
        i3.setImageResource(R.drawable.activity3);
        t4.setText("\n" +
                "Now click on the HOME Button. You will see onPause method is invoked.& After a while, you will see onStop method is invoked.\n");
        i4.setImageResource(R.drawable.activity4);
        t5.setText("Now see on the emulator. It is on the home. Now click on the center button to launch the app again. Now click on the  app icon.\n" +
                "Now see on the logcat: onRestart, onStart and onResume methods are invoked.\n");
        i5.setImageResource(R.drawable.activity5);
        t6.setText("Now click on the back button. Now you will see onPause methods is invoked. After a while, you will see onStop and onDestroy methods are invoked.");
i6.setImageResource(R.drawable.activity6);    }
}
