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
public class Frag_menu extends Fragment {
    TextView t1,t2;
    ImageView iv1;


    public Frag_menu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v1= inflater.inflate(R.layout.fragment_frag_menu, container, false);
        t1=(TextView)v1.findViewById(R.id.t1);
        t2=(TextView)v1.findViewById(R.id.t2);

        iv1=(ImageView)v1.findViewById(R.id.iv1);
        return v1; }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1.setText("*****MENU*****\n" +
                "For all menu types, Android provides a standard XML format to define menu items. Instead of building a menu in your activity's code, you should define a menu and all its items in an XML menu resource. You can then inflate the menu resource (load it as a Menu object) in your activity or fragment.\n" +
                "Using a menu resource is a good practice for a few reasons:\n" +
                "•\tIt's easier to visualize the menu structure in XML.\n" +
                "•\tIt separates the content for the menu from your application's behavioral code.\n" +
                "•\tIt allows you to create alternative menu configurations for different platform versions, screen sizes, and other configurations by leveraging the app resources framework.\n" +
                "To define the menu, create an XML file inside your project's res/menu/ directory and build the menu with the following elements:\n" +
                "<menu>\n" +
                "Defines a Menu, which is a container for menu items. A <menu> element must be the root node for the file and can hold one or more <item> and <group> elements.\n" +
                "<item>\n" +
                "Creates a MenuItem, which represents a single item in a menu. This element may contain a nested <menu> element in order to create a submenu.\n" +
                "<group>\n" +
                "An optional, invisible container for <item> elements. It allows you to categorize menu items so they share properties such as active state and visibility.\n" +
                "\n" +
                "ATTRIBUTES:\n" +
                " The items in the above menu include the following attributes:\n" +
                "android:id\n" +
                "A resource ID that's unique to the item, which allows the application to recognize the item when the user selects it.\n" +
                "android:icon\n" +
                "A reference to a drawable to use as the item's icon.\n" +
                "android:title\n" +
                "A reference to a string to use as the item's title.\n" +
                "android:showAsAction\n" +
                "Specifies when and how this item should appear as an action item in the app bar.\n" +
                "\n" +
                "TYPES OF MENU:\n");
        iv1.setImageResource(R.drawable.menu1);
        t2.setText("\n" +
                "There are 3 types of menus:\n" +
                "•\tOptions menus – these are mainly an activity’s menu items. Usually these options impact the app, an example being the Settings option\n" +
                "•\tContext menus – these are menus that appear in a floating window when the user clicks on a particular element. These options affect that element\n" +
                "•\tPopup menus – this is also a floating window. It displays a list of items anchored to the view that the user clicked.\n" +
                "\n");
    }
}
