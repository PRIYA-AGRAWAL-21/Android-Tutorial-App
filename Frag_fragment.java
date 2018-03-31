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
public class Frag_fragment extends Fragment {
    TextView t1,t2;
    ImageView iv1,iv2;


    public Frag_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v1=inflater.inflate(R.layout.frag_fragment, container, false);
        t1=(TextView)v1.findViewById(R.id.t1);
        t2=(TextView)v1.findViewById(R.id.t2);
        // Inflate the layout for this fragment
        iv1=(ImageView)v1.findViewById(R.id.iv1);
        iv2=(ImageView)v1.findViewById(R.id.iv2);
return v1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1.setText("***Fragment***\n" +
                "Fragment is a chunk part of an activity which is used for achieving  paired based designing to achieve reusability of GUI as well as show effective GUI(large screen). A fragment is a piece of an application's user interface or behavior that can be placed in  an activity  which enable more modular activity design.It will not be wrong if we say, a fragment is a kind of sub-activity.Following are some important points about a fragment.\n" +
                "•\tA fragment has its own layout and its own  behavior with its own lifecycle callbacks.\n" +
                "•\tyou can add or remove fragments in an activity while the activity is running.\n" +
                "•\tYou can combine multiple fragments in a single activity to build a multi-pane UI.\n" +
                "•\tA fragment can be used  in multiple activities.\n" +
                "•\tFragment life-cycle is  closely related to the life-cycle of its host activity which means when the activity is paused,all the fragments available in the activity will also be stopped.\n" +
                "•\tA fragment can implement a behavior that has no user interface component.\n" +
                "•\tFragments were added to the android API in Honeycomb version of Android which API version 11.\n" +
                "\n" +
                "You create fragments by  extending \"Fragment\" class and you can insert a fragment into your activity layout by declaring  the fragment in activity's  layout file , as a <fragment> element.\n" +
                "Prior to fragment introduction, we had a limitation because we can show only a single activity on the screen at one given point in time.So we were not able to divide device screen and control different parts separately.But with the introduction of fragment we got more flexibility and removed the limitation of having a single activity on the screen at a time.Now we can have a single activity but each activity can comprise of multiple  fragments which will have their own layout, events and complete lifecycle.\n" +
                "Following is a typical example of how two UI modules defined by fragments can be combined into one activity for  a tablet design,but separated for a handset design.\n");
        iv1.setImageResource(R.drawable.fragment1);
        t2.setText("The application can embed two fragments in Activity A,when running on a tablet-sized device.However, on a handset-sized screen ,there's not enough room for both fragments,so activity  A includes only the fragment for the list of articles, and when the user selects an article ,it starts Activity B, which includes the second fragment to read the article.\n" +
                "\n" +
                "FRAGMENT  LIFE CYCLE:\n" +
                "Fragments have their own life cycle very similar to an android activity.\n" +
                "Phase 1:  When a fragment gets created ,it goes through the following states:\n" +
                "onAttach()\n" +
                "onCreate()\n" +
                "onCreateView()\n" +
                "onActivityCreated()\n" +
                "Phase 2: :  When a fragment becomes visible ,it goes through the following states:\n" +
                "onStart()\n" +
                "onResume()\n" +
                "Phase 3:  When a fragment goes into the background mode,it goes through the following states:\n" +
                "onPaused()\n" +
                "onStop()\n" +
                "Phase 4:  When a fragment is destroyed ,it goes through the following states:\n" +
                "onPaused()\n" +
                "onStop()\n" +
                "ondestroyView()\n" +
                "onDestroy()\n" +
                "onDetach()\n");
        iv2.setImageResource(R.drawable.fragment2);
    }
}
