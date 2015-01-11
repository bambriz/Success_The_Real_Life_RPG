package bada.successtherealliferpg;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class instructions extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
        SharedPreferences profData = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = profData.edit();
        int str,cha,inte,wil;
        str = cha = inte = wil = 10;
        editor.putInt("health",str);
        editor.putInt("intelligence",inte);
        editor.putInt("charisma",cha);
        editor.putInt("willpower",wil);
        editor.putString("profName", name);
        editor.putString("profDate", date);
        //commit data
        editor.commit();
        // pernamently save name and date
        startActivity(quiz);

    }
}
