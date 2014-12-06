package alex.grclone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;


/**
 * Created by alex on 23/09/14.
 */

public class Game extends Activity {

//    private GridView griglia;
//    private ImageView sfondo;
    CustomView cv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
//        cv=(CustomView)findViewById(R.id.customView);


    //    creaGriglia();
        // GridView griglia = (GridView) findViewById(R.id.griglia);
        // griglia.setColumnWidth(7);

    }

    public void backMenuGo(View view)
    {
        Intent intent = new Intent(this, StartMenu.class) ;
        startActivity(intent);
        return;

    }


}

