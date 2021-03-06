package bada.successtherealliferpg;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class quizEight extends ActionBarActivity {

    public final static String EXTRA_NAME = "com.bada.successtherealliferpg.name";
    public final static String EXTRA_DATE = "com.bada.successtherealliferpg.date";
    public final static String EXTRA_STR = "com.bada.successtherealliferpg.str";
    public final static String EXTRA_cha = "com.bada.successtherealliferpg.cha";
    public final static String EXTRA_inte = "com.bada.successtherealliferpg.inte";
    public final static String EXTRA_wil = "com.bada.successtherealliferpg.wil";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_eight);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz_eight, menu);
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
        Intent qEight = new Intent(this,quizNine.class);
        int s;

        String st = intent.getStringExtra(quizSeven.EXTRA_STR);
        String name = intent.getStringExtra(quizSeven.EXTRA_NAME);
        String date = intent.getStringExtra(quizSeven.EXTRA_DATE);
        String cha = intent.getStringExtra(quizSeven.EXTRA_cha);
        String inte = intent.getStringExtra(quizSeven.EXTRA_inte);
        String wil = intent.getStringExtra(quizSeven.EXTRA_wil);
        s = Integer.parseInt(st);

        s+= 4;
        st = String.valueOf(s);
        qEight.putExtra(EXTRA_NAME,name);
        qEight.putExtra(EXTRA_DATE,date);
        qEight.putExtra(EXTRA_cha,cha);
        qEight.putExtra(EXTRA_STR,st);
        qEight.putExtra(EXTRA_inte,inte);
        qEight.putExtra(EXTRA_wil,wil);
        //go to next question
        startActivity(qEight);
    }

    public void bClick(View view){
        Intent intent = getIntent();
        Intent qEight = new Intent(this,quizNine.class);
        int s;

        String st = intent.getStringExtra(quizSeven.EXTRA_STR);
        String name = intent.getStringExtra(quizSeven.EXTRA_NAME);
        String date = intent.getStringExtra(quizSeven.EXTRA_DATE);
        String cha = intent.getStringExtra(quizSeven.EXTRA_cha);
        String inte = intent.getStringExtra(quizSeven.EXTRA_inte);
        String wil = intent.getStringExtra(quizSeven.EXTRA_wil);
        s = Integer.parseInt(wil);

        s+= 4;
        wil = String.valueOf(s);
        qEight.putExtra(EXTRA_NAME,name);
        qEight.putExtra(EXTRA_DATE,date);
        qEight.putExtra(EXTRA_cha,cha);
        qEight.putExtra(EXTRA_STR,st);
        qEight.putExtra(EXTRA_inte,inte);
        qEight.putExtra(EXTRA_wil,wil);
        //go to next question
        startActivity(qEight);
    }

    public void cClick(View view){
        Intent intent = getIntent();
        Intent qEight = new Intent(this,quizNine.class);
        int s;

        String st = intent.getStringExtra(quizSeven.EXTRA_STR);
        String name = intent.getStringExtra(quizSeven.EXTRA_NAME);
        String date = intent.getStringExtra(quizSeven.EXTRA_DATE);
        String cha = intent.getStringExtra(quizSeven.EXTRA_cha);
        String inte = intent.getStringExtra(quizSeven.EXTRA_inte);
        String wil = intent.getStringExtra(quizSeven.EXTRA_wil);
        s = Integer.parseInt(cha);

        s+= 4;
        cha = String.valueOf(s);
        qEight.putExtra(EXTRA_NAME,name);
        qEight.putExtra(EXTRA_DATE,date);
        qEight.putExtra(EXTRA_cha,cha);
        qEight.putExtra(EXTRA_STR,st);
        qEight.putExtra(EXTRA_inte,inte);
        qEight.putExtra(EXTRA_wil,wil);
        //go to next question
        startActivity(qEight);
    }

    public void dClick(View view){
        Intent intent = getIntent();
        Intent qEight = new Intent(this,quizNine.class);
        int s;

        String st = intent.getStringExtra(quizSeven.EXTRA_STR);
        String name = intent.getStringExtra(quizSeven.EXTRA_NAME);
        String date = intent.getStringExtra(quizSeven.EXTRA_DATE);
        String cha = intent.getStringExtra(quizSeven.EXTRA_cha);
        String inte = intent.getStringExtra(quizSeven.EXTRA_inte);
        String wil = intent.getStringExtra(quizSeven.EXTRA_wil);
        s = Integer.parseInt(inte);

        s+= 4;
        inte = String.valueOf(s);
        qEight.putExtra(EXTRA_NAME,name);
        qEight.putExtra(EXTRA_DATE,date);
        qEight.putExtra(EXTRA_cha,cha);
        qEight.putExtra(EXTRA_STR,st);
        qEight.putExtra(EXTRA_inte,inte);
        qEight.putExtra(EXTRA_wil,wil);
        //go to next question
        startActivity(qEight);
    }

}
