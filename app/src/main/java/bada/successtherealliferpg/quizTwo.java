package bada.successtherealliferpg;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class quizTwo extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_quiz_two);
        SharedPreferences saveData = getPreferences(MODE_PRIVATE);
        String n = saveData.getString("profName","David D Davidson");
        String d = saveData.getString("profDate","4/20/1994");
        String nDis = "Name: "+ n;
        String dDis = " DOB: "+ d;
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(nDis + dDis);
        setContentView(textView);

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
}
