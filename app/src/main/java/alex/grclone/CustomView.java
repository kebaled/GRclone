package alex.grclone;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by alex on 29/09/14.
 */

public class CustomView extends View
{
    Paint mPaint;
    static int dimCella=20;
    static int xiniz = 30;
    static int yiniz = 30;
    int width;
    int height;
    int widthReale;
    int heightReale;
    //    int col = Color.CYAN;
    //Rect rect = new Rect(,,,);
    //Rect rect = new Rect(,,,+dimcella);
    public CustomView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();

        Point size = new Point();
        display.getSize(size);
        width = size.x ;
        height = size.y ;
        widthReale = width - getPaddingRight() - getPaddingLeft();
        heightReale = height - getPaddingTop() - getPaddingBottom();


        Bitmap imgProva = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_launcher);
        mPaint = new Paint();
        //se vai qui ti dice come mettere la bitmap sopra la View:
        // http://www.anddev.it/index.php?topic=1532.0
    }

@Override
protected void onMeasure(int widthMeasureSpec,int heightMeasureSpec)
{
    int size = width>height?height:width;
    setMeasuredDimension(size ,size);
}

@Override
protected void onDraw(Canvas canvas)
{
    super.onDraw(canvas);
    int numCelle = widthReale>heightReale?heightReale:widthReale;

    /* todo: per gestire il gioco e muovere i robots
    * bisogna forse fare una cosa del genere: (presa qui:
    * http://developer.android.com/guide/topics/ui/declaring-layout.html)
    *fatta qui per una
    * ListView
    *
    * ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
    *    android.R.layout.simple_list_item_1, myStringArray);
    *
    * ListView listView = (ListView) findViewById(R.id.listview);
    *    listView.setAdapter(adapter);
    * ecc. vedi link
    *
    * */





    numCelle /= dimCella;
    numCelle-=2;

    for(int i=0;i<numCelle;i++)
      for(int j=0;j<numCelle;j++) {
          if ((i + j) % 2 == 0)
              mPaint.setColor(Color.CYAN);
          else
              mPaint.setColor(Color.BLUE);
          canvas.drawRect(xiniz + (j * dimCella), yiniz + (i * dimCella),xiniz + (j * dimCella) + dimCella, yiniz + (i * dimCella)+dimCella, mPaint);
          //canvas.drawCircle(xiniz + (j * dimCella), yiniz + (i * dimCella), 30, mPaint);
      }
}
}