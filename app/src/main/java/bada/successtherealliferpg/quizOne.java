package bada.successtherealliferpg;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class quizOne extends ActionBarActivity {
    Intent qTwo = new Intent(this,quizTwo.class);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_one);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz_one, menu);
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
        int s;//c,i,w;
        SharedPreferences saveData = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = saveData.edit();
        s = saveData.getInt("health",10);

       // i = saveData.getInt("intelligence",10);
       // w = saveData.getInt("willpower",10);
        s+= 4;
        editor.putInt("health",s);
        //commit attrivute update
        editor.commit();
        //go to next question
        startActivity(qTwo);


    }
    public void bClick(View view){
        SharedPreferences saveData = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = saveData.edit();
        int  i = saveData.getInt("intelligence",10);
        i+= 4;
        editor.putInt("intelligence",i);
        //commit attrivute update
        editor.commit();
        //go to next question
        startActivity(qTwo);
    }

    public void cClick(View view){
        SharedPreferences saveData = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = saveData.edit();
        int  w = saveData.getInt("willpower",10);
        w+= 4;
        editor.putInt("willpower",i);
        //commit attrivute update
        editor.commit();
        //go to next question
        startActivity(qTwo);
    }
    public void dClick(View view){
        SharedPreferences saveData = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = saveData.edit();
        int  c = saveData.getInt("charisma",10);
        c+= 4;
        editor.putInt("charisma",i);
        //commit attrivute update
        editor.commit();
        //go to next question
        startActivity(qTwo);
    }
}
