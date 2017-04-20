package com.example.suranits.connectmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CallMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_map);


    }//end main
    public void runCallMap(View view){
        EditText latitude = (EditText) findViewById(R.id.mapLat);
        EditText longtitude = (EditText) findViewById(R.id.mapLong);
        EditText labell = (EditText) findViewById(R.id.mapLabel);

        String lat =latitude.getText().toString().trim();// แปลง เป็น string
        String longti = longtitude.getText().toString().trim();
        String mlabell = labell.getText().toString().trim();

        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:13.759764,100.541532(ศูยน์ราวงน้ำ)");// link googlemap
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        //mapIntent.setPackage("com.google.andriod.app.maps");//ใช้งานกับโทรศัทพ์มือถือเท่านั้น(ใช้งานกับgooglemapโดยตรง)
        startActivity(mapIntent);

}//end runcallmap
}//end class
