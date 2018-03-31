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
public class Frag_features extends Fragment {
    TextView t;
    ImageView iv;


    public Frag_features() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v1= inflater.inflate(R.layout.frag_features, container, false);

        t=(TextView)v1.findViewById(R.id.t1);
        iv=(ImageView)v1.findViewById(R.id.iv1);
        return v1;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        iv.setImageResource(R.drawable.android_features1);
        t.setText("Features of Android :\n" +
                "\n" +
                "After learning history of android, let's see the features of android. The important features of android are given below:\n" +
                "1)It provides support for:\n" +
                "•\tmessaging services: (SMS and MMS)\n" +
                "•\tstorage : SQLite (a lightweight  open source relational database) \n" +
                "•\tconnectivity: (GSM, CDMA, Bluetooth,Wi-Fi,LTE,NFC etc), media,etc.\n" +
                "•\tMedia : H-263,H-264,AMR,GIF,PNG,JPEG,WAV,MP3,MPEG-4 SP,AMR-WB etc.\n" +
                "•\tAndroid Beam: A popular NFC-based technology that lets users instantly share,just by touching two NFC-enables phones together.\n" +
                "•\tGCM : Google Cloud Messaging is a service that lets developers send short message data to their users on android devices ,without needing a proprietary sync solution.\n" +
                "•\tWI-FI direct : A technology that lets app discover and pair directly ,over a high bandwidth peer to peer connection.\n" +
                "2) It support Multi-Touching,web browser,Multi-Language( Support single and bidirectional text),Resizable widgets (Widgets are resizable,so user can expend them to show more content or shrink them to save space).\n" +
                "3) Anyone can customize the Android Platform.\n" +
                "4) There are a lot of mobile applications that can be chosen by the consumer.\n" +
                "5) It provides many interesting features like weather details, opening screen,etc.\n" +"\n"+
                "**Widgets have long been a huge advantage of Android over iOS. With iOS 8, Apple finally just implemented \"widgets\", but they are pretty limited. You can only add them to your Notification Center.\n");
    }

}
