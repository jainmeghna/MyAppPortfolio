package com.jainmeghna.myappportfollio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class PortfolioActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfollio);

        TextView project1, project2, project3, project4,project5,myOwnApp;

        //onclick implementation of each textview which will take to respactive apps
        project1 = (TextView)findViewById(R.id.project1);
        project1.setOnClickListener(this);
       // project1.setOnClickListener((android.view.View.OnClickListener) this);

        project2 = (TextView)findViewById(R.id.project2);
        project2.setOnClickListener(this);
        //project2.setOnClickListener((android.view.View.OnClickListener) this);

        project3 = (TextView)findViewById(R.id.project3);
        project3.setOnClickListener(this);
        //project3.setOnClickListener((android.view.View.OnClickListener) this);

        project4 = (TextView)findViewById(R.id.project4);
        project4.setOnClickListener(this);
        //project4.setOnClickListener((android.view.View.OnClickListener) this);

        project5 = (TextView)findViewById(R.id.project5);
        project1.setOnClickListener(this);
        //project5.setOnClickListener((android.view.View.OnClickListener) this);

        myOwnApp = (TextView)findViewById(R.id.myOwnApp);
        myOwnApp.setOnClickListener(this);
        //myOwnApp.setOnClickListener((android.view.View.OnClickListener)this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfollio, menu);
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

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.project1:
                Toast.makeText(PortfolioActivity.this,"This button will launch my Spotify Streamer!",Toast.LENGTH_LONG).show();
                break;
            case R.id.project2:
                Toast.makeText(PortfolioActivity.this,"This button will launch my Score App!",Toast.LENGTH_LONG).show();
                break;
            case R.id.project3:
                Toast.makeText(PortfolioActivity.this,"This button will launch my Library Appr!",Toast.LENGTH_LONG).show();
                break;
            case R.id.project4:
                Toast.makeText(PortfolioActivity.this,"This button will launch my Build it bigger!",Toast.LENGTH_LONG).show();
                break;
            case R.id.project5:
                Toast.makeText(PortfolioActivity.this,"This button will launch my XYZ Reader!",Toast.LENGTH_LONG).show();
                break;
            case R.id.myOwnApp:
                Toast.makeText(PortfolioActivity.this,"This button will launch my capstone!",Toast.LENGTH_LONG).show();
                break;
        }

    }
}
