package com.example.myfirstap;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Very important variable here - helps link buttons to all pages
    private Button BtnMove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Button Happy link
        BtnMove = findViewById(R.id.buttonHappy);
        BtnMove.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                moveToActivityHappy();
            }
        });

        //Button Sad link
        BtnMove = findViewById(R.id.buttonSad);
        BtnMove.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                moveToActivitySad();
            }
        });

        //Button Angry link
        BtnMove = findViewById(R.id.buttonAngry);
        BtnMove.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                moveToActivityAngry();
            }
        });

        //Button Fearful link
        BtnMove = findViewById(R.id.buttonFearful);
        BtnMove.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                moveToActivityFearful();
            }
        });

        //Button Lonely link
        BtnMove = findViewById(R.id.buttonLonely);
        BtnMove.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                moveToActivityLonely();
            }
        });

        //Button Jealous link
        BtnMove = findViewById(R.id.buttonJealous);
        BtnMove.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                moveToActivityJealous();
            }
        });

    }

    private void moveToActivityHappy(){

        Intent intent = new Intent(MainActivity.this, HappyActivity.class);
        startActivity(intent);
    }

    private void moveToActivitySad(){

        Intent intent = new Intent(MainActivity.this, SadActivity.class);
        startActivity(intent);
    }

    private void moveToActivityAngry(){

        Intent intent = new Intent(MainActivity.this, AngryActivity.class);
        startActivity(intent);
    }

    private void moveToActivityFearful(){

        Intent intent = new Intent(MainActivity.this, FearfulActivity.class);
        startActivity(intent);
    }

    private void moveToActivityLonely(){

        Intent intent = new Intent(MainActivity.this, LonelyActivity.class);
        startActivity(intent);
    }

    private void moveToActivityJealous(){

        Intent intent = new Intent(MainActivity.this, JealousActivity.class);
        startActivity(intent);
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
}
