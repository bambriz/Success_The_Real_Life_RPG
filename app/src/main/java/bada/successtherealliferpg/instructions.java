package bada.successtherealliferpg;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class instructions extends ActionBarActivity {

    public final static String EXTRA_NAME = "com.bada.successtherealliferpg.name";
    public final static String EXTRA_DATE = "com.bada.successtherealliferpg.date";
    public final static String EXTRA_STR = "com.bada.successtherealliferpg.str";
    public final static String EXTRA_cha = "com.bada.successtherealliferpg.cha";
    public final static String EXTRA_inte = "com.bada.successtherealliferpg.inte";
    public final static String EXTRA_wil = "com.bada.successtherealliferpg.wil";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String name = intent.getStringExtra(getName.EXTRA_NAME);
        String date = intent.getStringExtra(getName.EXTRA_DATE);
        SharedPreferences profData = getPreferences(MODE_WORLD_READABLE);
        SharedPreferences.Editor editor = profData.edit();
        editor.putString("profName", name).commit();
        editor.putString("profDate", date).commit();
        setContentView(R.layout.activity_instructions);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_instructions, menu);
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
    public void instructionContinue(View view){
        Intent intent = getIntent();
        Intent quiz = new Intent(this, quizOne.class);
        String name = intent.getStringExtra(getName.EXTRA_NAME);
        String date = intent.getStringExtra(getName.EXTRA_DATE);
       // SharedPreferences profData = getPreferences(MODE_WORLD_READABLE);
       // SharedPreferences.Editor editor = profData.edit();
        int str,cha,inte,wil;
        str = cha = inte = wil = 10;
        quiz.putExtra(EXTRA_NAME,name);
        quiz.putExtra(EXTRA_DATE,date);
        quiz.putExtra(EXTRA_cha,String.valueOf(cha));
        quiz.putExtra(EXTRA_STR,String.valueOf(str));
        quiz.putExtra(EXTRA_inte,String.valueOf(inte));
        quiz.putExtra(EXTRA_wil,String.valueOf(wil));

       /* editor.putString("profName", name);
        editor.commit();
        editor.putString("profDate", date);
        editor.commit();
       // profData.onSharedPreferenceChanged(profData, "profName");
        editor.putInt("health",str);
        editor.commit();
        editor.putInt("intelligence",inte);
        editor.commit();
        editor.putInt("charisma",cha);
        editor.apply();
        editor.putInt("willpower",wil);
        editor.apply();
   */
        //commit data

        // pernamently save name and date
        startActivity(quiz);

    }



}
