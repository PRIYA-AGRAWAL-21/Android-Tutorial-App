package com.developers.droidteam.androidapp;

import android.content.ClipData;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.f1,new Frag_A(),"A");
        ft.commit();
        tabLayout=(TabLayout)findViewById(R.id.tab);
        TabLayout.Tab firsttab=tabLayout.newTab();
        firsttab.setText("Intro to Android");
        firsttab.setIcon(R.mipmap.ic_launcher);
        tabLayout.addTab(firsttab);
        TabLayout.Tab Secondtab =tabLayout.newTab();
        Secondtab.setText("Android Widgets");
      //  Secondtab.setIcon(R.mipmap.ic_launcher);
        tabLayout.addTab(Secondtab);
        TabLayout.Tab Thirdtab=tabLayout.newTab();
       Thirdtab.setText("Activity and Intent");
    //    Thirdtab.setIcon(R.mipmap.ic_launcher);
        tabLayout.addTab(Thirdtab);
        TabLayout.Tab Fourthtab=tabLayout.newTab();
        Fourthtab.setText("Android Fragments");
     //   Fourthtab.setIcon(R.mipmap.ic_launcher);
        tabLayout.addTab(Fourthtab);
        TabLayout.Tab Fifthtab =tabLayout.newTab();
        Fifthtab.setText("Android Menu");
        //   Fourthtab.setIcon(R.mipmap.ic_launcher);
        tabLayout.addTab(Fifthtab);
        TabLayout.Tab sixthtab =tabLayout.newTab();
        sixthtab.setText("Android Services");
        //   Fourthtab.setIcon(R.mipmap.ic_launcher);
        tabLayout.addTab(sixthtab);

    tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            Fragment fragment = null;
            String s = "";
            switch (tab.getPosition()) {

                case 0: {
                    fragment = new Frag_A();

                    s = "a";
                    break;
                }
                case 1:
                    fragment = new Frag_B();
                    s = "b";
                    break;
                case 2:
                    fragment = new Frag_C();
                    s = "c";
                    break;
                case 3:
                    fragment = new Frag_D();
                    s = "d";
                    break;
                case 4:
                    fragment = new Frag_E();
                    s = "e";
                    break;}


                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.f1, fragment, s);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();

        }
        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    });
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi=getMenuInflater();
        mi.inflate(R.menu.myoptionmenu,menu);
        return super.onCreateOptionsMenu(menu);



    }

   @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       String data = item.getTitle().toString();
       if (data.equals("Intro To Android")) {



       }

       return super.onOptionsItemSelected(item);
   }
}
