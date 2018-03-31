package com.developers.droidteam.androidapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_explicitintent extends Fragment {
    TextView t1,t2,t3,t4,t5,t6;
    ImageView iv1,iv2,iv3,iv4,iv5,iv6;


    public Frag_explicitintent() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View v1=inflater.inflate(R.layout.frag_explicitintent, container, false);
        t1=(TextView)v1.findViewById(R.id.t1);
        t2=(TextView)v1.findViewById(R.id.t2);
        t3=(TextView)v1.findViewById(R.id.t3);
        t4=(TextView)v1.findViewById(R.id.t4);
        t5=(TextView)v1.findViewById(R.id.t5);
        t6=(TextView)v1.findViewById(R.id.t6);

        iv1=(ImageView)v1.findViewById(R.id.iv1);
        iv2=(ImageView)v1.findViewById(R.id.iv2);
        iv3=(ImageView)v1.findViewById(R.id.iv3);
        iv4=(ImageView)v1.findViewById(R.id.iv4);
        iv5=(ImageView)v1.findViewById(R.id.iv5);
        iv6=(ImageView)v1.findViewById(R.id.iv6);
        return v1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1.setText("Android Explicit intent : specifies the component to be invoked from activity. In other words, we can call another activity in android by explicit intent.\n" +
                "1.\tWe can also pass the information from one activity to another using explicit intent.\n" +
                "2.\tHere, we are going to see an example to call one activity from another and vice-versa\n");
        iv1.setImageResource(R.drawable.explicite);
        t2.setText("This can be done by following small code:\n" +
                "\n" +
                "Intent i= new Intent (reference of sourceactivity, destinationactivity.class);\n" +
                "Startactivity(i);\n" +
                " Let’s see the  whole implementation: \n" +
                "\n" +
                "MainActivity.java (i.e. our Activity A)\n");
        iv2.setImageResource(R.drawable.explicite1);
        t3.setText("\n" +
                "Forintent.java (i.e our  Activity B)\n");
        iv3.setImageResource(R.drawable.explicite2);
        t4.setText("**In both activity we have used on click listener method which is used to add action on component click. In our example our component is button whose id is defined in corresponding xml files. So on button click our action (using intent)that is to move from one activity to another activity will be performed.\n" +
                "\n" +
                "activity_main.xml :\n" +
                "\n");
        iv4.setImageResource(R.drawable.explicite3);
        t5.setText("Intentfile.xml (xml file of second Activity)");
        iv5.setImageResource(R.drawable.explicite4);
        t6.setText("Output: \n" +
                "\n");
        t6.setGravity(Gravity.LEFT);
        iv6.setImageResource(R.drawable.explicite7);
        iv6.setForegroundGravity(Gravity.CENTER);

    }
}
