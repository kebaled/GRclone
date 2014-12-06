package alex.grclone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by alex on 23/09/14.
 */
public class Credits extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
    }


    public void backMenuGo(View view)
    {
        Intent intent = new Intent(this, StartMenu.class) ;

        startActivity(intent);

        return;
    }



}
