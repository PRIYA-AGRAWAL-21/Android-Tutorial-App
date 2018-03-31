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
public class Frag_implicitintent extends Fragment {
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7;



    public Frag_implicitintent() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v1=inflater.inflate(R.layout.frag_implicitintent, container, false);
        t1=(TextView)v1.findViewById(R.id.t1);
        t2=(TextView)v1.findViewById(R.id.t2);
        t3=(TextView)v1.findViewById(R.id.t3);
        t4=(TextView)v1.findViewById(R.id.t4);
        t5=(TextView)v1.findViewById(R.id.t5);
        t6=(TextView)v1.findViewById(R.id.t6);
        t7=(TextView)v1.findViewById(R.id.t7);
        t8=(TextView)v1.findViewById(R.id.t8);
        iv1=(ImageView)v1.findViewById(R.id.iv1);
        iv2=(ImageView)v1.findViewById(R.id.iv2);
        iv3=(ImageView)v1.findViewById(R.id.iv3);
        iv4=(ImageView)v1.findViewById(R.id.iv4);
        iv5=(ImageView)v1.findViewById(R.id.iv5);
        iv6=(ImageView)v1.findViewById(R.id.iv6);
        iv7=(ImageView)v1.findViewById(R.id.iv7);

        return v1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1.setText("\n" +
                "Implicit Intent doesn't specifiy the component. In such case, intent provides information of available components provided by the system that is to be invoked.so in implicite intent we specify action and data on which the action has to be performed.\n" +
                "For example, you may write the following code to view the webpage.\n");
        iv1.setImageResource(R.drawable.implicitfirst);
        t2.setText("Let’s see the   whole implementation: \n" +
                "MainActivity.java :\n");
        iv2.setImageResource(R.drawable.implicite);
        t3.setText("** chooser is optional . It is only used to just show the choice of application (that is available to perform the particular action) every time.\n" +
                "\n" +
                " activity_main.xml:\n");
        iv3.setImageResource(R.drawable.implicite1);
        t4.setText("\n" +
                "Before running the program you have to give required  permissions  in manifest file.\n" +
                "OUTPUT:  \n");
        iv4.setImageResource(R.drawable.implicite2);
        t5.setText("\n" +
                "On Click on Go on Google\n");
        t5.setGravity(Gravity.CENTER);
        iv5.setImageResource(R.drawable.implicite3);
        t6.setText("On Click on Chrome");
        t6.setGravity(Gravity.CENTER);
        iv6.setImageResource(R.drawable.implicit4);
        t7.setText("\n" +
                "** We can perform more   action with implicit intent some of them are given below but before this let’s see the manifest file.\n");
        iv7.setImageResource(R.drawable.implicite5);
        t8.setText("Some Implicit intent are given below:\n" +
                "•\tFor Sending SMS/MMS : \n" +
                "        \t  String number = \"12346556\";  // The number on which you want to send SMS\n" +
                "                startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts(\"sms\", number, null)));\n" +
                "•\t For dial a number:\n" +
                "try {\n" +
                "                    Intent intent = (new Intent(Intent.ACTION_DIAL, Uri.parse(\"tel:7087220680\")));\n" +
                "                    startActivity(intent);\n" +
                "                } catch (android.content.ActivityNotFoundException e) {\n" +
                "\n" +
                "                    Toast.makeText(getApplicationContext(), \"App failed\", Toast.LENGTH_LONG).show();\n" +
                "                }\n" +
                "•\tFor Sending Email :\n" +
                "                try {\n" +
                "                    Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(\"mailto:\" +                   \"priyaagrawal1001@gmail.com\"));\n" +
                "                    intent.putExtra(Intent.EXTRA_SUBJECT, \"Subject\");\n" +
                "                    intent.putExtra(Intent.EXTRA_TEXT, \"Body\");\n" +
                "                    startActivity(Intent.createChooser(intent, \"Select One\"));\n" +
                "                } \n" +
                "catch (android.content.ActivityNotFoundException e) {      Toast.makeText(getApplicationContext(), \"App failed\", Toast.LENGTH_LONG).show();\n" +
                "                }\n" +
                "•\tFor Open Google map:\n" +
                "                Intent i = new Intent(Intent.ACTION_VIEW);\n" +
                "                i.setData(Uri.parse(\"geo:30.900965.344,75.87277\"));\n" +
                "                startActivity(i);\n" +
                "•\tFor calling :                          \n" +
                "                String num = \"6789654311”\n" +
                "Intent i = new Intent(Intent.ACTION_CALL, Uri.parse(\"tel:\" + num));\n" +
                "  if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {\n" +
                "                                          return;}\n" +
                "    // startActivity(Intent.createChooser(i, \"Select one\"));\n" +
                "   startActivity(i);\n" +
                "•\tFor Open Play Store:\n" +
                "Intent i = new Intent(Intent.ACTION_VIEW,       Uri.parse(\"market://details?id=com.example.android\"));\n" +
                " startActivity(i);\n" +
                "•\tFor Open Calendar:       \n" +
                "  Uri.Builder builder = CalendarContract.CONTENT_URI.buildUpon();\n" +
                "   builder.appendPath(\"time\");\n" +
                "    ContentUris.appendId(builder, Calendar.getInstance().getTimeInMillis());\n" +
                "    Intent intent = new Intent(Intent.ACTION_VIEW)  .setData(builder.build());\n" +
                "    startActivity(Intent.createChooser(intent,\"Select One\"));\n" +
                "// For this you have to take READ_CALENDAR,WRITE_CALENDAR permission from manifest file.\n" +
                "**<uses-permission android:name=\"android.permission.READ_CALENDAR\"/>\n" +
                "     <uses-permission android:name=\"android.permission.WRITE_CALENDAR\"/\n" +
                "\n" +
                "•\tSharing a Text msg:\n" +
                "                Intent sendIntent = new Intent();\n" +
                "                sendIntent.setAction(Intent.ACTION_SEND);\n" +
                "                sendIntent.putExtra(Intent.EXTRA_TEXT, \"Having a Sister is the best gift of the God to us\");\n" +
                "                sendIntent.setType(\"text/plain\");\n" +
                "                startActivity(Intent.createChooser(sendIntent, \"Select One\"));\n" +
                "   \n" +
                "•\t Open Camera: \n" +
                "   Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE_SECURE);\n" +
                "   startActivity(takePictureIntent);\n" +
                "            \n" +
                "•\tAudio Recording:\n" +
                "  Intent intent = new Intent (Intent.ACTION_PICK,         MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);\n" +
                "   startActivity(Intent.createChooser(intent, \"Select one\"));\n" +
                "•\tFor Open Gallery:\n" +
                "                Intent i = new Intent();\n" +
                "                i.setAction(Intent.ACTION_GET_CONTENT);\n" +
                "                i.setType(\"video/* imgage/*\");\n" +
                "startActivity(Intent.createChooser(i, \"Select one\"));\n");

    }
}
