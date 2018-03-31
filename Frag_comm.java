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
public class Frag_comm extends Fragment {
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,iv10,iv11;



    public Frag_comm() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View v1= inflater.inflate(R.layout.frag_comm, container, false);
        t1=(TextView)v1.findViewById(R.id.t1);
        t2=(TextView)v1.findViewById(R.id.t2);
        t3=(TextView)v1.findViewById(R.id.t3);
        t4=(TextView)v1.findViewById(R.id.t4);
        t5=(TextView)v1.findViewById(R.id.t5);
        t6=(TextView)v1.findViewById(R.id.t6);
        t8=(TextView)v1.findViewById(R.id.t8);
        t7=(TextView)v1.findViewById(R.id.t7);


        iv1=(ImageView)v1.findViewById(R.id.iv1);
        iv2=(ImageView)v1.findViewById(R.id.iv2);
        iv3=(ImageView)v1.findViewById(R.id.iv3);
        iv4=(ImageView)v1.findViewById(R.id.iv4);
        iv5=(ImageView)v1.findViewById(R.id.iv5);
        iv6=(ImageView)v1.findViewById(R.id.iv6);
        iv7=(ImageView)v1.findViewById(R.id.iv7);
        iv8=(ImageView)v1.findViewById(R.id.iv8);
        iv9=(ImageView)v1.findViewById(R.id.iv9);
        iv10=(ImageView)v1.findViewById(R.id.iv10);
        iv11=(ImageView)v1.findViewById(R.id.iv11);
        return v1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1.setText("*************Communication  between  Fragments******************\n" +
                " Basically, for two fragments communicate, you need to make a Fragment A reference to the Fragment B and everything is resolved. This communication problem can be solved by using an Event Carrier, which is an interface that contains any method which will be responsible for loading the event of a Fragment to the other through the Activity.\n");
        iv1.setImageResource(R.drawable.comm1);
        t2.setText("The basic requirements to implement this method are:\n" +
                "1] fragment A ----> activity\n");
        iv2.setImageResource(R.drawable.comm2);
        t3.setText("Notice that the FragmentA has access through the communicator attribute to the method implemented in MainActivity. One can notice that the onAttach method, present in Fragment lifecycle was used to receive the operating system a reference of the Activity, and how it implements the communicator interface, there is no problem in making a cast to assign it to object.\n" +
                "Without onAttach() method it will throw an error. Also the communicator interface could be placed within the class FragmentA, ensuring that the interface would not be exposed more than it should.\n" +
                "Following is the Event Carrier interface and which will be implemented in the Activity.\n");
        iv3.setImageResource(R.drawable.comm3);
        t4.setText("2] activity -----> fragment B");
        iv4.setImageResource(R.drawable.comm4);
        t5.setText("In FragmentB frag = code (FragmentB)manager.findFragmentById(R.id.fragment2),\n" +
                " It is instantiated FragmentB a type of object that will receive the return of findFragmentById method, which is passed the id of the Fragment in question (in the case FragmentB) or findfragmentByTag method can also be used,which is passed the tag of the fragment. The cast is important in this case, so it can not be forgotten. Finally, the change method is called passing as a parameter the data, but only explain more about when implemented FragmentB code.\n" +
                "\n" +
                "Now lets see the whole code in which some data is calculated in fragment A and is transferred from fragment A to fragment B via  an interface( which is defined in the main activity),and this data is displayed in fragment B.\n" +
                "Fragment A:\n");
        iv5.setImageResource(R.drawable.comm5);
        t6.setText("MainActivity: In main activity , two buttons are used to dynamically insert the two fragments as explained in previous tutorial.");
        iv6.setImageResource(R.drawable.comm6);
        t7.setText("Fragment B:");
        t7.setGravity(Gravity.LEFT);
        iv7.setImageResource(R.drawable.comm7);
        t8.setText("output:");
        iv8.setImageResource(R.drawable.comm8);
        iv9.setImageResource(R.drawable.comm9);
        iv10.setImageResource(R.drawable.comm10);
        iv11.setImageResource(R.drawable.comm11);

    }
}
