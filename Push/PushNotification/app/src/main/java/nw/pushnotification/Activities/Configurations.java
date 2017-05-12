package nw.pushnotification.Activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.larswerkman.holocolorpicker.ColorPicker;
import com.larswerkman.holocolorpicker.ColorPicker.OnColorChangedListener;
import com.larswerkman.holocolorpicker.OpacityBar;

import nw.pushnotification.R;

public class Configurations extends Activity {

	private ImageView icon;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_configurations);


        icon = (ImageView)findViewById(R.id.imageView1);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(Configurations.this);
        if(prefs.getString("ICON", "floating2").equals("floating3")){
            icon.setImageResource(R.drawable.floating3);
        } else if(prefs.getString("ICON", "floating2").equals("floating4")){
            icon.setImageResource(R.drawable.floating4);
        } else if(prefs.getString("ICON", "floating2").equals("floating5")){
            icon.setImageResource(R.drawable.floating5);
        }

        ImageButton image1 = (ImageButton)findViewById(R.id.imageButton1);
        image1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                setPreferences("floating3");
                icon.setImageResource(R.drawable.floating3);
            }
        });
        ImageButton image2 = (ImageButton)findViewById(R.id.imageButton2);
        image2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setPreferences("floating4");
                icon.setImageResource(R.drawable.floating4);
            }
        });
        ImageButton image3 = (ImageButton)findViewById(R.id.imageButton3);
        image3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setPreferences("floating5");
                icon.setImageResource(R.drawable.floating5);
            }
        });


        Button backHome = (Button)findViewById(R.id.back_main);
        backHome.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMain = new Intent(Configurations.this, MainActivity.class);
                startActivity(intentMain);
            }
        });
    }



	private void setPreferences(String myIconPref)
	{
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(Configurations.this);
		Editor editor = prefs.edit();
		editor.putString("ICON", myIconPref);
		editor.commit();
	}
}
