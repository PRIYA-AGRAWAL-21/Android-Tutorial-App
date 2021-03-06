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
public class Frag_helloworld extends Fragment {
    TextView t1, t2, t3, t4, t5, t6, t7;
    ImageView i1, i2, i3, i4, i5;

    public Frag_helloworld() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v1 = inflater.inflate(R.layout.fragment_frag_helloworld, container, false);
        t1 = (TextView) v1.findViewById(R.id.txt);
        t2 = (TextView) v1.findViewById(R.id.t1);
        t3 = (TextView) v1.findViewById(R.id.t2);
        t4 = (TextView) v1.findViewById(R.id.t3);
        t5 = (TextView) v1.findViewById(R.id.t5);
        t6 = (TextView) v1.findViewById(R.id.t6);
        t7=(TextView) v1.findViewById(R.id.t7);
        i1 = (ImageView) v1.findViewById(R.id.iv1);
        i2 = (ImageView) v1.findViewById(R.id.iv2);
        i3 = (ImageView) v1.findViewById(R.id.iv3);
        i4 = (ImageView) v1.findViewById(R.id.iv4);
        i5 = (ImageView) v1.findViewById(R.id.iv5);
        return v1;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1.setText("***************HELLO    WORLD**************\n" +
                "Follow the option file -->new project-->now name your application as HelloWorld using the wizard window as follows:\n");
        i1.setImageResource(R.drawable.hw1);
        t2.setText("Next ,follow the instructions provided and keep all other enteries as default till the final step. Once your project is created successfully , you will have the following text screen.");
        i2.setImageResource(R.drawable.hw2);
        t3.setText("AppCompatActivity is a Java class that creates a default window on the screen where we can place  different components such as Button,EditText, Spinner,etc.It is like the frame of Java AWT.\n" +
                "The OnCreate() method is called when AppCompatActivity  class is created.\n" +
                "The setContentView(R.layout.activity_main) gives information about our layout resources or runtime view .Here,our layout resources are defined in activity_main.xml file.\n");
        i3.setImageResource(R.drawable.hw3);
        t4.setText("The activity_main.xml is a layout file available in res/layout directory.You will modify this file very fequently to change the layout of your application.\n" +
                "\n" +
                "Before you run your app, you should be aware of a few directories and files in the android project.\n" +
                "\n");
        i4.setImageResource(R.drawable.hw4);
        t5.setText("R.java   is the auto-generated file that contains ids for all the resources of res directory.It is generated by aapt(Android Asset Packaging Tool) and you should not modify the content of the R.java file .Whenever you create any component on xml file , a corresponding id is created in R.java file which can be used in the Java source file later.So we can say R.java file is the glue between the activity Java files like Main_Activity.java and the resource like activity_main.xml .");
   t7.setText("\n" +
           "AndroidManifest file\n");
    i5.setImageResource(R.drawable.hw5);
        t6.setText("\n" +
            "The AndroidManifest.xml file contains information of your package, including components of the application such as activities, services, broadcast receivers, content providers etc.\n" +
            "It performs some other tasks also:\n" +
            "It is responsible to protect the application to access any protected parts by providing the permissions.\n" +
            "It also declares the android api that the application is going to use.\n" +
            "It lists the instrumentation classes. The instrumentation classes provides profiling and other informations. These informations are removed just before the application is published etc.\n" +
            "Elements of the AndroidManifest.xml file\n" +
            "The elements used in the above xml file are described below.\n" +
            "<manifest>\n" +
            "manifest is the root element of the AndroidManifest.xml file. It has package attribute that describes the package name of the activity class.This  file work as an interface between Android OS and your application, so if  you don't  declare your component in this file , then it will not be considered by the operating system,so you must declare all the components in this file.\n" +
            "<application>\n" +
            "application is the sub-element of the manifest. It includes the namespace declaration. This element contains several sub-elements that declares the application component such as activity etc.\n" +
            "The commonly used attributes are of this element are icon, label, theme etc.\n" +
            "android:icon represents the icon for all the android application components.\n" +
            "android:label works as the default label for all the application components.\n" +
            "android:theme represents a common theme for all the android activities.\n" +
            "Following is the list of tags which you will use in your manifest fie to specify your different Android application components.\n" +
            "●\t<activity> elements for activities\n" +
            "●\t<service> elements for services \n" +
            "●\t<receiver> elements for broadcast receiver\n" +
            "●\t<provider> elements for content provider\n" +
            "<activity>\n" +
            "activity is the subelement of application and represents an activity that must be defined in the AndroidManifest.xml file. It has many attributes such as label, name, theme, launchMode etc.\n" +
            "android:label represents a label i.e. displayed on the screen.\n" +
            "android:name represents a name for the activity class. It is required attribute.\n" +
            "<intent-filter>\n" +
            "intent-filter is the sub-element of activity that describes the type of intent to which activity, service or broadcast receiver can respond to.\n" +
            "<action>\n" +
            "It adds an action for the intent-filter. The intent-filter must have at least one action element.\n" +
            "<category>\n" +
            "It adds a category name to an intent-filter.\n" +
            "\n");}
}