package voice_to_text.sandy148101.com.menu_bar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =(TextView)findViewById(R.id.textView);


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               relativeLayout.setBackgroundColor(getResources().getColor(R.color.itemcolor3));

            }
        });
        relativeLayout =(RelativeLayout)findViewById(R.id.relativelayout);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
 int id = item.getItemId();
 if(id==R.id.profile)
 {
   relativeLayout.setBackgroundColor(Color.RED);
   return  true;
 }
 if(id==R.id.settings)
 {

     relativeLayout.setBackgroundColor(Color.BLUE);
     return  true;
 }

        if(id==R.id.orders)
        {

            relativeLayout.setBackgroundColor(Color.GRAY);
            return  true;
        }




 return  true;
    }
}
