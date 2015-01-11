package bada.successtherealliferpg;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class getName extends ActionBarActivity {
    public final static String EXTRA_NAME = "com.bada.successtherealliferpg.name";
        public final static String EXTRA_DATE = "com.bada.successtherealliferpg.date";


        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_name);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_get_name, menu);
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
    public void getNameContinue(View view){
        Intent setAintent = new Intent(this, setAccomplishments.class);
        EditText etName = (EditText) findViewById(R.id.getNameName);
        EditText etDate = (EditText) findViewById(R.id.getNameDOB);
        String name = etName.getText().toString();
        String date = etDate.getText().toString();
        setAintent.putExtra(EXTRA_NAME, name);
        setAintent.putExtra(EXTRA_DATE, date);
        if (name != ""&& date != "" && name != "Name" && date != "Date of birth") {
            startActivity(setAintent);
        }
    }
}
