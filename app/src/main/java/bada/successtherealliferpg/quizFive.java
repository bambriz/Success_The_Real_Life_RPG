package bada.successtherealliferpg;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class quizFive extends ActionBarActivity {

    public final static String EXTRA_NAME = "com.bada.successtherealliferpg.name";
    public final static String EXTRA_DATE = "com.bada.successtherealliferpg.date";
    public final static String EXTRA_STR = "com.bada.successtherealliferpg.str";
    public final static String EXTRA_cha = "com.bada.successtherealliferpg.cha";
    public final static String EXTRA_inte = "com.bada.successtherealliferpg.inte";
    public final static String EXTRA_wil = "com.bada.successtherealliferpg.wil";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_five);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz_five, menu);
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
        Intent intent = getIntent();
        Intent qFive = new Intent(this,quizSix.class);
        int s;

        String st = intent.getStringExtra(quizFive.EXTRA_STR);
        String name = intent.getStringExtra(quizFive.EXTRA_NAME);
        String date = intent.getStringExtra(quizFive.EXTRA_DATE);
        String cha = intent.getStringExtra(quizFive.EXTRA_cha);
        String inte = intent.getStringExtra(quizFive.EXTRA_inte);
        String wil = intent.getStringExtra(quizFive.EXTRA_wil);
        s = Integer.parseInt(inte);

        s+= 4;
        st = String.valueOf(s);
        qFive.putExtra(EXTRA_NAME,name);
        qFive.putExtra(EXTRA_DATE,date);
        qFive.putExtra(EXTRA_cha,cha);
        qFive.putExtra(EXTRA_STR,st);
        qFive.putExtra(EXTRA_inte,inte);
        qFive.putExtra(EXTRA_wil,wil);
        //go to next question
        startActivity(qFive);
    }

    public void bClick(View view){
        Intent intent = getIntent();
        Intent qFive = new Intent(this,quizSix.class);
        int s;

        String st = intent.getStringExtra(quizFive.EXTRA_STR);
        String name = intent.getStringExtra(quizFive.EXTRA_NAME);
        String date = intent.getStringExtra(quizFive.EXTRA_DATE);
        String cha = intent.getStringExtra(quizFive.EXTRA_cha);
        String inte = intent.getStringExtra(quizFive.EXTRA_inte);
        String wil = intent.getStringExtra(quizFive.EXTRA_wil);
        s = Integer.parseInt(st);

        s+= 4;
        st = String.valueOf(s);
        qFive.putExtra(EXTRA_NAME,name);
        qFive.putExtra(EXTRA_DATE,date);
        qFive.putExtra(EXTRA_cha,cha);
        qFive.putExtra(EXTRA_STR,st);
        qFive.putExtra(EXTRA_inte,inte);
        qFive.putExtra(EXTRA_wil,wil);
        //go to next question
        startActivity(qFive);
    }

    public void cClick(View view){
        Intent intent = getIntent();
        Intent qFive = new Intent(this,quizSix.class);
        int s;

        String st = intent.getStringExtra(quizFive.EXTRA_STR);
        String name = intent.getStringExtra(quizFive.EXTRA_NAME);
        String date = intent.getStringExtra(quizFive.EXTRA_DATE);
        String cha = intent.getStringExtra(quizFive.EXTRA_cha);
        String inte = intent.getStringExtra(quizFive.EXTRA_inte);
        String wil = intent.getStringExtra(quizFive.EXTRA_wil);
        s = Integer.parseInt(wil);

        s+= 4;
        st = String.valueOf(s);
        qFive.putExtra(EXTRA_NAME,name);
        qFive.putExtra(EXTRA_DATE,date);
        qFive.putExtra(EXTRA_cha,cha);
        qFive.putExtra(EXTRA_STR,st);
        qFive.putExtra(EXTRA_inte,inte);
        qFive.putExtra(EXTRA_wil,wil);
        //go to next question
        startActivity(qFive);
    }

    public void dClick(View view){
        Intent intent = getIntent();
        Intent qFive = new Intent(this,quizSix.class);
        int s;

        String st = intent.getStringExtra(quizFive.EXTRA_STR);
        String name = intent.getStringExtra(quizFive.EXTRA_NAME);
        String date = intent.getStringExtra(quizFive.EXTRA_DATE);
        String cha = intent.getStringExtra(quizFive.EXTRA_cha);
        String inte = intent.getStringExtra(quizFive.EXTRA_inte);
        String wil = intent.getStringExtra(quizFive.EXTRA_wil);
        s = Integer.parseInt(cha);

        s+= 4;
        st = String.valueOf(s);
        qFive.putExtra(EXTRA_NAME,name);
        qFive.putExtra(EXTRA_DATE,date);
        qFive.putExtra(EXTRA_cha,cha);
        qFive.putExtra(EXTRA_STR,st);
        qFive.putExtra(EXTRA_inte,inte);
        qFive.putExtra(EXTRA_wil,wil);
        //go to next question
        startActivity(qFive);
    }

}