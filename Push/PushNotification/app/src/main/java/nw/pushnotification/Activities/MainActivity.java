package nw.pushnotification.Activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import nw.pushnotification.R;
import nw.pushnotification.Service.ServiceFloating;
import nw.pushnotification.Service.ServiceFloating;

public class MainActivity extends Activity {
	
	public static int OVERLAY_PERMISSION_REQ_CODE = 1234;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}


	public void AlCurso(View vistazo) {
		Button Launch = (Button) vistazo;
		Bundle bundle = getIntent().getExtras();
		//	Button config = (Button)findViewById(R.id.button_config);
		int Elegido = Launch.getId();
		switch (Elegido) {
			case R.id.button1:

				if (bundle != null && bundle.getString("LAUNCH").equals("YES")) {
					startService(new Intent(MainActivity.this, ServiceFloating.class));
				}

				Launch.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				});

				 /* Button stop = (Button)findViewById(R.id.button2);
				stop.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				}); */

				/* ImageView github = (ImageView)findViewById(R.id.imageView1);
				github.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						String url = "https://github.com/marshallino16/FloatingNotification";
						Intent i = new Intent(Intent.ACTION_VIEW);
						i.setData(Uri.parse(url));
						startActivity(i);
					}
				}); */

				/*config.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Intent intent = new Intent(MainActivity.this, Configurations.class);
						startActivity(intent);
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
					 }};
					 */

				checkPermission();

				break;
			case R.id.button2:

				if (bundle != null && bundle.getString("LAUNCH").equals("YES")) {
					startService(new Intent(MainActivity.this, ServiceFloating.class));
				}

				Launch.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				});

				 /* Button stop = (Button)findViewById(R.id.button2);
				stop.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				}); */

				/* ImageView github = (ImageView)findViewById(R.id.imageView1);
				github.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						String url = "https://github.com/marshallino16/FloatingNotification";
						Intent i = new Intent(Intent.ACTION_VIEW);
						i.setData(Uri.parse(url));
						startActivity(i);
					}
				}); */

				/*config.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Intent intent = new Intent(MainActivity.this, Configurations.class);
						startActivity(intent);
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
					 }};
					 */
				checkPermission();

				break;
			case R.id.button3:

				if (bundle != null && bundle.getString("LAUNCH").equals("YES")) {
					startService(new Intent(MainActivity.this, ServiceFloating.class));
				}

				Launch.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				});

				 /* Button stop = (Button)findViewById(R.id.button2);
				stop.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				}); */

				/* ImageView github = (ImageView)findViewById(R.id.imageView1);
				github.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						String url = "https://github.com/marshallino16/FloatingNotification";
						Intent i = new Intent(Intent.ACTION_VIEW);
						i.setData(Uri.parse(url));
						startActivity(i);
					}
				}); */

				/*config.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Intent intent = new Intent(MainActivity.this, Configurations.class);
						startActivity(intent);
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
					 }};
					 */
				checkPermission();

				break;
			case R.id.button4:

				if (bundle != null && bundle.getString("LAUNCH").equals("YES")) {
					startService(new Intent(MainActivity.this, ServiceFloating.class));
				}

				Launch.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				});

				 /* Button stop = (Button)findViewById(R.id.button2);
				stop.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				}); */

				/* ImageView github = (ImageView)findViewById(R.id.imageView1);
				github.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						String url = "https://github.com/marshallino16/FloatingNotification";
						Intent i = new Intent(Intent.ACTION_VIEW);
						i.setData(Uri.parse(url));
						startActivity(i);
					}
				}); */

				/*config.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Intent intent = new Intent(MainActivity.this, Configurations.class);
						startActivity(intent);
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
					 }};
					 */
				checkPermission();

				break;
			case R.id.button5:

				if (bundle != null && bundle.getString("LAUNCH").equals("YES")) {
					startService(new Intent(MainActivity.this, ServiceFloating.class));
				}

				Launch.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				});

				 /* Button stop = (Button)findViewById(R.id.button2);
				stop.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				}); */

				/* ImageView github = (ImageView)findViewById(R.id.imageView1);
				github.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						String url = "https://github.com/marshallino16/FloatingNotification";
						Intent i = new Intent(Intent.ACTION_VIEW);
						i.setData(Uri.parse(url));
						startActivity(i);
					}
				}); */

				/*config.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Intent intent = new Intent(MainActivity.this, Configurations.class);
						startActivity(intent);
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
					 }};
					 */
				checkPermission();

				break;
			case R.id.button6:

				if (bundle != null && bundle.getString("LAUNCH").equals("YES")) {
					startService(new Intent(MainActivity.this, ServiceFloating.class));
				}

				Launch.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				});

				 /* Button stop = (Button)findViewById(R.id.button2);
				stop.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				}); */
				/* ImageView github = (ImageView)findViewById(R.id.imageView1);
				github.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						String url = "https://github.com/marshallino16/FloatingNotification";
						Intent i = new Intent(Intent.ACTION_VIEW);
						i.setData(Uri.parse(url));
						startActivity(i);
					}
				}); */

				/*config.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Intent intent = new Intent(MainActivity.this, Configurations.class);
						startActivity(intent);
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
					 }};
					 */
				checkPermission();

				break;
			case R.id.button7:

				if (bundle != null && bundle.getString("LAUNCH").equals("YES")) {
					startService(new Intent(MainActivity.this, ServiceFloating.class));
				}

				Launch.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				});

				 /* Button stop = (Button)findViewById(R.id.button2);
				stop.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				}); */

				/* ImageView github = (ImageView)findViewById(R.id.imageView1);
				github.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						String url = "https://github.com/marshallino16/FloatingNotification";
						Intent i = new Intent(Intent.ACTION_VIEW);
						i.setData(Uri.parse(url));
						startActivity(i);
					}
				}); */

			/*config.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Intent intent = new Intent(MainActivity.this, Configurations.class);
						startActivity(intent);
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
					 }};
					 */
				checkPermission();

				break;
			case R.id.button8:


				if (bundle != null && bundle.getString("LAUNCH").equals("YES")) {
					startService(new Intent(MainActivity.this, ServiceFloating.class));
				}

				Launch.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				});

				 /* Button stop = (Button)findViewById(R.id.button2);
				stop.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				}); */

				/* ImageView github = (ImageView)findViewById(R.id.imageView1);
				github.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						String url = "https://github.com/marshallino16/FloatingNotification";
						Intent i = new Intent(Intent.ACTION_VIEW);
						i.setData(Uri.parse(url));
						startActivity(i);
					}
				}); */

			/*config.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Intent intent = new Intent(MainActivity.this, Configurations.class);
						startActivity(intent);
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
					 }};
					 */
				checkPermission();

				break;
			case R.id.button9:


				if (bundle != null && bundle.getString("LAUNCH").equals("YES")) {
					startService(new Intent(MainActivity.this, ServiceFloating.class));
				}

				Launch.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				});

				 /* Button stop = (Button)findViewById(R.id.button2);
				stop.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				}); */

				/* ImageView github = (ImageView)findViewById(R.id.imageView1);
				github.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						String url = "https://github.com/marshallino16/FloatingNotification";
						Intent i = new Intent(Intent.ACTION_VIEW);
						i.setData(Uri.parse(url));
						startActivity(i);
					}
				}); */

				/*config.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Intent intent = new Intent(MainActivity.this, Configurations.class);
						startActivity(intent);
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
					 }};
					 */
				checkPermission();

				break;
			case R.id.button10:


				if (bundle != null && bundle.getString("LAUNCH").equals("YES")) {
					startService(new Intent(MainActivity.this, ServiceFloating.class));
				}

				Launch.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				});

				 /* Button stop = (Button)findViewById(R.id.button2);
				stop.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
				}); */

				/* ImageView github = (ImageView)findViewById(R.id.imageView1);
				github.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						String url = "https://github.com/marshallino16/FloatingNotification";
						Intent i = new Intent(Intent.ACTION_VIEW);
						i.setData(Uri.parse(url));
						startActivity(i);
					}
				}); */

			/*config.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Intent intent = new Intent(MainActivity.this, Configurations.class);
						startActivity(intent);
						stopService(new Intent(MainActivity.this, ServiceFloating.class));
					}
					 }};
					 */


				break;
		}
	}

	public void checkPermission() {
		if(Build.VERSION.SDK_INT >= 23) {
			if (!Settings.canDrawOverlays(MainActivity.this)) {
				Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
						Uri.parse("package:" + getPackageName()));
				startActivityForResult(intent, OVERLAY_PERMISSION_REQ_CODE);
			}
		}
	}


	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == OVERLAY_PERMISSION_REQ_CODE) {
			if (!Settings.canDrawOverlays(this)) {
				// SYSTEM_ALERT_WINDOW permission not granted...
			}
		}
	}

	@Override
	protected void onResume() {
		Bundle bundle = getIntent().getExtras();

		if(bundle != null && bundle.getString("LAUNCH").equals("YES")) {
			startService(new Intent(MainActivity.this, ServiceFloating.class));
		}
		super.onResume();
	}
}





