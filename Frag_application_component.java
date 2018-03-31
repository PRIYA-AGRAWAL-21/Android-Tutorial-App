package com.developers.droidteam.androidapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_application_component extends Fragment {
    TextView t1,t;
    ImageView iv;
    TableLayout tl;
    TableRow tr;



    public Frag_application_component() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v1=inflater.inflate(R.layout.fragment_frag_application_component, container, false);
        t1=(TextView)v1.findViewById(R.id.txt);
        t=(TextView)v1.findViewById(R.id.t1);
      tl=(TableLayout) v1.findViewById(R.id.tbl);
        tr=(TableRow) v1.findViewById(R.id.tr1);
        iv=(ImageView)v1.findViewById(R.id.iv1);
        return v1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1.setText("Application components or android components are the essential building blocks of an android application.These components are loosely coupled by the application manifest file AndroidManifest.xml that describes each component of application and how they interact.\n" +
                "The fundamental components of android are Activities ,Services ,Broadcast Receiver ,Content Provider ,Intent.\n");
    iv.setImageResource(R.drawable.cutepic);

    t.setText("•\tActivities:\n" +
            "An activity represent a single screen with a  user interface .For example an e-mail application might have one activity that shows a list of new image,another activity to compose an e-mail, and another for  reading.If an application has more than one activity , than one of them should be marked as the activity that is presented when the appliaction is launched.\n" +
            "An activity is  implemented as a subclass of AppCompatActivity  Class as follows-\n" +
            "public class MainActivity extends AppCompatActivity  {\n" +
            "}\n" +
            "•\tServices:\n" +
            "A service is a component that runs in the background to perform long running operations.For  example  ,a service might play music in the background while the user is in a different application, or it might fetch data over the network without blocking user interaction with an activity.\n" +
            "An service is  implemented as a subclass of Service  Class as follows-\n" +
            "public class MyService extends Service {\n" +
            "}\n" +
            "•\tBroadcast Receiver:\n" +
            "Broadcast receivers simply respond to broadcast message from other applications or from the system. For example ,Application can also initiate broadcast to let other application know that some data has been downloaded to the device and is available for the device to use,so this is broadcast receiver who will intercept this communication and will initiate  appropriate action.\n" +
            "A broadcast receiver is implemented as a subclass of  BroadcastReceiver class and each message is broadcast as an Intent object.\n" +
            "public  class Myreceiver extends BroadcastReceiver {\n" +
            "}\n" +
            "•\tContent Provider :\n" +
            "A content provider component supplies data from one application to other on request. Such request are handled by the methods of the ContentResolver class. The data may be stored in the file system,the database or somewhere else entirely.\n" +
            "A content Provider is implemented as a subclass of ContentProvider class as follows:\n" +
            "publuc class MycontentProvider extends ContentProvider {\n" +
            "}\n" +
            "•\tIntent :\n" +
            "Intent is used to invoke components. It is mainly used to:\n" +
            "o\tStart the service\n" +
            "o\tLaunch the activity\n" +
            "o\tDisplay a web page\n" +
            "o\tDisplay a list of contacts\n" +
            "o\tBroadcast a message\n" +
            "o\tDial a phone call etc.\n" +
            "\n" +
            "For example: you may write the following code to send an email:\n" +
            "Intent i=new Intent (Intent.ACTION_SENDTO);\n" +
            "intent.setData (Uri.parse(\"mailto:\"+\"xyz@gmail.com\"));\n" +
            "startActivity(i);\t\n" +
            "\n" +
            "•\tADDITIONAL COMPONENTS :\n");}
}
