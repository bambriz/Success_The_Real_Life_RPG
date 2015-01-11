package bada.successtherealliferpg;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class quizTwo extends ActionBarActivity {

    public final static String EXTRA_NAME = "com.bada.successtherealliferpg.name";
    public final static String EXTRA_DATE = "com.bada.successtherealliferpg.date";
    public final static String EXTRA_STR = "com.bada.successtherealliferpg.str";
    public final static String EXTRA_cha = "com.bada.successtherealliferpg.cha";
    public final static String EXTRA_inte = "com.bada.successtherealliferpg.inte";
    public final static String EXTRA_wil = "com.bada.successtherealliferpg.wil";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_quiz_two);
       // SharedPreferences saveData = getPreferences(MODE_WORLD_READABLE);
       // String n = saveData.getString("profName","David D Davidson");
      //  String d = saveData.getString("profDate","4/20/1994");
       // String nDis = "Name: "+ n;
      //  String dDis = " DOB: "+ d;
       // int a = saveData.getInt("charisma",69);
       // String aS = String.valueOf(a);
       ;

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz_two, menu);
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
    public void aClick(View view){
        //save health attribute bonus +4
        Intent intent = getIntent();
        Intent qTwo = new Intent(this,quizThree.class);
        int s;//c,i,w;

        String st = intent.getStringExtra(quizTwo.EXTRA_STR);
        String name = intent.getStringExtra(quizTwo.EXTRA_NAME);
        String date = intent.getStringExtra(quizTwo.EXTRA_DATE);
        String cha = intent.getStringExtra(quizTwo.EXTRA_cha);
        String inte = intent.getStringExtra(quizTwo.EXTRA_inte);
        String wil = intent.getStringExtra(quizTwo.EXTRA_wil);
        s = Integer.parseInt(st);

        // i = saveData.getInt("intelligence",10);
        // w = saveData.getInt("willpower",10);
        s+= 4;
        st = String.valueOf(s);
        qTwo.putExtra(EXTRA_NAME,name);
        qTwo.putExtra(EXTRA_DATE,date);
        qTwo.putExtra(EXTRA_cha,cha);
        qTwo.putExtra(EXTRA_STR,st);
        qTwo.putExtra(EXTRA_inte,inte);
        qTwo.putExtra(EXTRA_wil,wil);
        //go to next question
        startActivity(qTwo);


    }
    public void bClick(View view){
        Intent intent = getIntent();
        Intent qTwo = new Intent(this,quizThree.class);
        int s;//c,i,w;

        String st = intent.getStringExtra(quizTwo.EXTRA_STR);
        String name = intent.getStringExtra(quizTwo.EXTRA_NAME);
        String date = intent.getStringExtra(quizTwo.EXTRA_DATE);
        String cha = intent.getStringExtra(quizTwo.EXTRA_cha);
        String inte = intent.getStringExtra(quizTwo.EXTRA_inte);
        String wil = intent.getStringExtra(quizTwo.EXTRA_wil);
        s = Integer.parseInt(inte);

        // i = saveData.getInt("intelligence",10);
        // w = saveData.getInt("willpower",10);
        s+= 4;
        inte = String.valueOf(s);
        qTwo.putExtra(EXTRA_NAME,name);
        qTwo.putExtra(EXTRA_DATE,date);
        qTwo.putExtra(EXTRA_cha,cha);
        qTwo.putExtra(EXTRA_STR,st);
        qTwo.putExtra(EXTRA_inte,inte);
        qTwo.putExtra(EXTRA_wil,wil);
        //go to next question
        startActivity(qTwo);
    }

    public void cClick(View view){
        Intent intent = getIntent();
        Intent qTwo = new Intent(this,quizThree.class);
        int s;//c,i,w;

        String st = intent.getStringExtra(quizTwo.EXTRA_STR);
        String name = intent.getStringExtra(quizTwo.EXTRA_NAME);
        String date = intent.getStringExtra(quizTwo.EXTRA_DATE);
        String cha = intent.getStringExtra(quizTwo.EXTRA_cha);
        String inte = intent.getStringExtra(quizTwo.EXTRA_inte);
        String wil = intent.getStringExtra(quizTwo.EXTRA_wil);
        s = Integer.parseInt(wil);

        // i = saveData.getInt("intelligence",10);
        // w = saveData.getInt("willpower",10);
        s+= 4;
        wil = String.valueOf(s);
        qTwo.putExtra(EXTRA_NAME,name);
        qTwo.putExtra(EXTRA_DATE,date);
        qTwo.putExtra(EXTRA_cha,cha);
        qTwo.putExtra(EXTRA_STR,st);
        qTwo.putExtra(EXTRA_inte,inte);
        qTwo.putExtra(EXTRA_wil,wil);
        //go to next question
        startActivity(qTwo);
    }
    public void dClick(View view){
        Intent intent = getIntent();
        Intent qTwo = new Intent(this,quizThree.class);
        int s;//c,i,w;

        String st = intent.getStringExtra(quizTwo.EXTRA_STR);
        String name = intent.getStringExtra(quizTwo.EXTRA_NAME);
        String date = intent.getStringExtra(quizTwo.EXTRA_DATE);
        String cha = intent.getStringExtra(quizTwo.EXTRA_cha);
        String inte = intent.getStringExtra(quizTwo.EXTRA_inte);
        String wil = intent.getStringExtra(quizTwo.EXTRA_wil);
        s = Integer.parseInt(cha);

        // i = saveData.getInt("intelligence",10);
        // w = saveData.getInt("willpower",10);
        s+= 4;
        cha = String.valueOf(s);
        qTwo.putExtra(EXTRA_NAME,name);
        qTwo.putExtra(EXTRA_DATE,date);
        qTwo.putExtra(EXTRA_cha,cha);
        qTwo.putExtra(EXTRA_STR,st);
        qTwo.putExtra(EXTRA_inte,inte);
        qTwo.putExtra(EXTRA_wil,wil);
        //go to next question
        startActivity(qTwo);
    }
}
