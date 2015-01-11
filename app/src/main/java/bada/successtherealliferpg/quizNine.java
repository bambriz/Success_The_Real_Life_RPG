package bada.successtherealliferpg;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class quizNine extends ActionBarActivity {

    public final static String EXTRA_NAME = "com.bada.successtherealliferpg.name";
    public final static String EXTRA_DATE = "com.bada.successtherealliferpg.date";
    public final static String EXTRA_STR = "com.bada.successtherealliferpg.str";
    public final static String EXTRA_cha = "com.bada.successtherealliferpg.cha";
    public final static String EXTRA_inte = "com.bada.successtherealliferpg.inte";
    public final static String EXTRA_wil = "com.bada.successtherealliferpg.wil";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_nine);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz_nine, menu);
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
        Intent qNine = new Intent(this,quizTen.class);
        int s;

        String st = intent.getStringExtra(quizNine.EXTRA_STR);
        String name = intent.getStringExtra(quizNine.EXTRA_NAME);
        String date = intent.getStringExtra(quizNine.EXTRA_DATE);
        String cha = intent.getStringExtra(quizNine.EXTRA_cha);
        String inte = intent.getStringExtra(quizNine.EXTRA_inte);
        String wil = intent.getStringExtra(quizNine.EXTRA_wil);
        s = Integer.parseInt(st);

        s+= 4;
        st = String.valueOf(s);
        qNine.putExtra(EXTRA_NAME,name);
        qNine.putExtra(EXTRA_DATE,date);
        qNine.putExtra(EXTRA_cha,cha);
        qNine.putExtra(EXTRA_STR,st);
        qNine.putExtra(EXTRA_inte,inte);
        qNine.putExtra(EXTRA_wil,wil);
        //go to next question
        startActivity(qNine);
    }

    public void bClick(View view){
        Intent intent = getIntent();
        Intent qNine = new Intent(this,quizTen.class);
        int s;

        String st = intent.getStringExtra(quizNine.EXTRA_STR);
        String name = intent.getStringExtra(quizNine.EXTRA_NAME);
        String date = intent.getStringExtra(quizNine.EXTRA_DATE);
        String cha = intent.getStringExtra(quizNine.EXTRA_cha);
        String inte = intent.getStringExtra(quizNine.EXTRA_inte);
        String wil = intent.getStringExtra(quizNine.EXTRA_wil);
        s = Integer.parseInt(inte);

        s+= 4;
        st = String.valueOf(s);
        qNine.putExtra(EXTRA_NAME,name);
        qNine.putExtra(EXTRA_DATE,date);
        qNine.putExtra(EXTRA_cha,cha);
        qNine.putExtra(EXTRA_STR,st);
        qNine.putExtra(EXTRA_inte,inte);
        qNine.putExtra(EXTRA_wil,wil);
        //go to next question
        startActivity(qNine);
    }

    public void cClick(View view){
        Intent intent = getIntent();
        Intent qNine = new Intent(this,quizTen.class);
        int s;

        String st = intent.getStringExtra(quizNine.EXTRA_STR);
        String name = intent.getStringExtra(quizNine.EXTRA_NAME);
        String date = intent.getStringExtra(quizNine.EXTRA_DATE);
        String cha = intent.getStringExtra(quizNine.EXTRA_cha);
        String inte = intent.getStringExtra(quizNine.EXTRA_inte);
        String wil = intent.getStringExtra(quizNine.EXTRA_wil);
        s = Integer.parseInt(wil);

        s+= 4;
        st = String.valueOf(s);
        qNine.putExtra(EXTRA_NAME,name);
        qNine.putExtra(EXTRA_DATE,date);
        qNine.putExtra(EXTRA_cha,cha);
        qNine.putExtra(EXTRA_STR,st);
        qNine.putExtra(EXTRA_inte,inte);
        qNine.putExtra(EXTRA_wil,wil);
        //go to next question
        startActivity(qNine);
    }

    public void dClick(View view){
        Intent intent = getIntent();
        Intent qNine = new Intent(this,quizTen.class);
        int s;

        String st = intent.getStringExtra(quizNine.EXTRA_STR);
        String name = intent.getStringExtra(quizNine.EXTRA_NAME);
        String date = intent.getStringExtra(quizNine.EXTRA_DATE);
        String cha = intent.getStringExtra(quizNine.EXTRA_cha);
        String inte = intent.getStringExtra(quizNine.EXTRA_inte);
        String wil = intent.getStringExtra(quizNine.EXTRA_wil);
        s = Integer.parseInt(cha);

        s+= 4;
        st = String.valueOf(s);
        qNine.putExtra(EXTRA_NAME,name);
        qNine.putExtra(EXTRA_DATE,date);
        qNine.putExtra(EXTRA_cha,cha);
        qNine.putExtra(EXTRA_STR,st);
        qNine.putExtra(EXTRA_inte,inte);
        qNine.putExtra(EXTRA_wil,wil);
        //go to next question
        startActivity(qNine);
    }

}
