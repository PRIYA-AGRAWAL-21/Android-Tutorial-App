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
public class Frag_startactivityforresult extends Fragment {
    TextView t1,t2,t3;
    ImageView i1,i2,i3;


    public Frag_startactivityforresult() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.frag_startactivityforresult, container, false);
        t1=(TextView)v.findViewById(R.id.t1);
        t2=(TextView)v.findViewById(R.id.t2);
        t3=(TextView)v.findViewById(R.id.t3);
        i1=(ImageView)v.findViewById(R.id.iv1);
        i2=(ImageView)v.findViewById(R.id.iv2);
        return v;


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1.setText("Getting a Result from an Activity\n" +
                "By the help of android startActivityForResult() method, we can get result from another activity.\n" +
                "By the help of android startActivityForResult() method, we can send information from one activity to another and vice-versa. The android startActivityForResult method, requires a result from the second activity (activity to be invoked).\n" +
                "In such case, we need to override the onActivityResult method that is invoked automatically when second activity returns result.\n" +
                "For example, your app can start a camera app and receive the captured photo as a result. Or, you might start the People app in order for the user to select a contact and you'll receive the contact details as a result.\n" +
                "Of course, the activity that responds must be designed to return a result. When it does, it sends the result as another Intent object. Your activity receives it in the onActivityResult() callback.\n" +
                "Note: You can use explicit or implicit intents when you call startActivityForResult(). When starting one of your own activities to receive a result, you should use an explicit intent to ensure that you receive the expected result.\n" +
                "\n" +
                "Start the Activity\n" +
                "There's nothing special about the Intent object you use when starting an activity for a result, but you do need to pass an additional integer argument to the startActivityForResult() method.\n" +
                "The integer argument is a \"request code\" that identifies your request. When you receive the result Intent, the callback provides the same request code so that your app can properly identify the result and determine how to handle it.\n" +
                "For example, here's how to start an activity that allows the user to pick a contact:\n");
        i1.setImageResource(R.drawable.startactfr);
        t2.setText("Receive the Result\n" +
                "When the user is done with the subsequent activity and returns, the system calls your activity's onActivityResult() method. This method includes three arguments:\n" +
                "•\tThe request code you passed to startActivityForResult().\n" +
                "•\tA result code specified by the second activity. This is either RESULT_OK if the operation was successful or RESULT_CANCELED if the user backed out or the operation failed for some reason.\n" +
                "•\tAn Intent that carries the result data.\n" +
                "For example, here's how you can handle the result for the \"pick a contact\" intent:\n");
        i2.setImageResource(R.drawable.startactfr2);
        t3.setText("In this example, the result Intent returned by Android's Contacts or People app provides a content Uri that identifies the contact the user selected.\n" +
                "In order to successfully handle the result, you must understand what the format of the result Intent will be. Doing so is easy when the activity returning a result is one of your own activities. Apps included with the Android platform offer their own APIs that you can count on for specific result data. For instance, the People app always returns a result with the content URI that identifies the selected contact, and the Camera app returns a  in the \"data\" extra\n");

    }
}
