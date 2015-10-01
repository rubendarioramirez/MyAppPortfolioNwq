package com.android.rramirez.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSpoty;
    private Button btnScore;
    private Button btnLibrary;
    private Button btnBuild;
    private Button btnXYZ;
    private Button btnOwnApp;

    //comment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSpoty = (Button)findViewById(R.id.btnSpoty);
        btnScore = (Button)findViewById(R.id.btnScore);
        btnLibrary = (Button)findViewById(R.id.btnLibrary);
        btnBuild = (Button)findViewById(R.id.btnBuild);
        btnXYZ = (Button)findViewById(R.id.btnXYZ);
        btnOwnApp = (Button)findViewById(R.id.btnOwnApp);

        //Spotify Function
        btnSpoty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeToast("This button will launch my Spotify App!");
            }
        });
        //ScoreApp Function
        btnScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeToast("This button will launch my Score App");
            }
        });
        //Library Function
        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeToast("This button will launch my Library App");}
        });
        //BuildItBigger Function
        btnBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeToast("This button will launch my Build it Bigger App");
            }
        });
        //XYZReader Function
        btnXYZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeToast("This button will launch my XYZ Reader App");
            }
        });
        //MyownApp Function
        btnOwnApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeToast("This button will launch my Capstone? Own App");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void makeToast(String message){
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_LONG).show();
    }

}
