package com.developers.droidteam.androidapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_installaion extends Fragment {
    TextView t;


    public Frag_installaion() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v1= inflater.inflate(R.layout.fragment_frag_installaion, container, false);
        t=(TextView)v1.findViewById(R.id.t1);
        return v1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t.setText("******INSTALL  ANDROID******\n" +
                "Android supports  Java, c++ , c# , etc  language to develop android application .Java is the officially supported language for android .\n" +
                "You will be glad to know that all the required tools to develop android applications are freely available and can be downloaded from the web. Following is the list of softwares you will need before you start your Android application programming.\n" +
                "•\tJava JDK  latest version\n" +
                "•\tAndroid SDK \n" +
                "•\tEclipse IDE for Java Developers (Optional)\n" +
                "•\tAndroid Development Tools (ADT) Eclipse plug-in (Optional)\n" +
                "•\t\n" +
                "STEP 1: SETUP JAVA DEVELOPMENT KIT (JDK)\n" +
                "you can download the latest version of Java JDK from oracle's Java site  : Java SE Downloads   . After downloading it, you can finally set PATH and JAVA_HOME environment variables to refer to the directory that contains java and javac .\n" +
                "To set the PATH variable permanently, add the full path of the jdk1.7.0\\bin directory to the PATH variable. Typically, this full path looks something like C:\\Program Files\\Java\\jdk1.7.0\\bin. Set the PATH variable as follows on Microsoft Windows:\n" +
                "1.\tClick Start, then Control Panel, then System.\n" +
                "2.\tClick Advanced, then Environment Variables.\n" +
                "3.\tAdd the location of the bin folder of the JDK installation for the PATH variable in System Variables. The following is a typical value for the PATH variable:\n" +
                "C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\Program Files\\Java\\jdk1.7.0\\bin\n" +
                "\n" +
                "\n" +
                "STEP 2: SETUP ANDROID SDK\n" +
                "Setting up Android Studio takes just a few clicks. (You should have already downloaded Android Studio  from https://developer.android.com/studio/index.html)\n" +
                "To install Android Studio on Windows, proceed as follows:\n" +
                "1.\tLaunch the .exe file you downloaded.\n" +
                "2.\tFollow the setup wizard to install Android Studio and any necessary SDK tools.\n" +
                "\n" +
                "\n");
    }
}
