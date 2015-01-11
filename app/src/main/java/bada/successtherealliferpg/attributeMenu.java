package bada.successtherealliferpg;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class attributeMenu extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String st = intent.getStringExtra(quizTen.EXTRA_STR);
        String name = intent.getStringExtra(quizTen.EXTRA_NAME);
        String date = intent.getStringExtra(quizTen.EXTRA_DATE);
        String cha = intent.getStringExtra(quizTen.EXTRA_cha);
        String inte = intent.getStringExtra(quizTen.EXTRA_inte);
        String wil = intent.getStringExtra(quizTen.EXTRA_wil);

        setContentView(R.layout.activity_attribute_menu);
      /**  EditText t = (EditText)  findViewById(R.id.textViewH);
        t.setText("Health: "+ st);
        EditText b = (EditText)  findViewById(R.id.editTextdob);
        b.setText("DOB: "+ date);
        EditText v = (EditText)  findViewById(R.id.textViewName);
        v.setText("NAme: "+ name);*/

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_attribute_menu, menu);
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
