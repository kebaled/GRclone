package alex.grclone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class StartMenu extends Activity {

    //pulsanti
    private Button button_play, button_options, button_credits, button_rule, button_exit;
    private Toast toast;

    public void creditsGo(View view)
    {
        Intent intent = new Intent(this, Credits.class) ;
        startActivity(intent);
        return;
    }

    public void playGo(View view)
    {
        Intent intent = new Intent(this, Game.class) ;
        startActivity(intent);
        return;
    }


    public void optionsGo(View view)
    {
        button_credits = (Button) findViewById(R.id.button_options);
        button_credits.setText("Picche");
        toast = Toast.makeText(getApplicationContext(), "Non implementato", Toast.LENGTH_SHORT);
        toast.show();
        toast.setMargin(5,40);

        //button_credits.setText("Credits");
        return;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.start_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
