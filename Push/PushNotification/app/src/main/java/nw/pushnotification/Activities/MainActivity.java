package nw.pushnotification.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import nw.pushnotification.R;
import nw.pushnotification.Activities.ServiceFloating;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends Activity {


    @InjectView(R.id.start_service)
    Button startService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.start_service)
    public void startService() {
        startService(new Intent(MainActivity.this, ServiceFloating.class));
    }


    }

