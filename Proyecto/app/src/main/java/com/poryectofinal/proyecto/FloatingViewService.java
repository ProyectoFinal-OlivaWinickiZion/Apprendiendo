package com.poryectofinal.proyecto;

import android.app.Service;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.opengl.Visibility;
import android.os.IBinder;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class FloatingViewService extends Service {
    private WindowManager mWindowManager;
    private View mFloatingView;
    int PorQuePasoVoy=0;


    public FloatingViewService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //Inflate the floating view layout we created
        mFloatingView = LayoutInflater.from(this).inflate(R.layout.layout_floating_widget, null);

        ImageView Screen = (ImageView)this.mFloatingView.findViewById(R.id.screen);
        Screen.setImageResource(R.drawable.screenpas1);
        TextView Paso0 = (TextView)this.mFloatingView.findViewById(R.id.Paso);
        Paso0.setText("Eliga el contacto al que quiere mandarle la nota de voz (audio)");

        PorQuePasoVoy++;
        //Add the view to the window.
        final WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.TYPE_PHONE,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT);

        //Specify the view position
        params.gravity = Gravity.TOP | Gravity.LEFT;        //Initially view will be added to top-left corner
        params.x = 0;
        params.y = 100;

        //Add the view to the window
        mWindowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        mWindowManager.addView(mFloatingView, params);

        //The root element of the collapsed view layout
        final View collapsedView = mFloatingView.findViewById(R.id.collapse_view);
        //The root element of the expanded view layout
        final View expandedView = mFloatingView.findViewById(R.id.expanded_container);

        //Set the close button
        /*
        ImageView closeButtonCollapsed = (ImageView) mFloatingView.findViewById(R.id.close_btn);
        closeButtonCollapsed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //close the service and remove the from from the window
                stopSelf();
            }
        });/*

        //Set the view while floating view is expanded.
        //Set the play button.

        /*
        //Set the next button.
        ImageView nextButton = (ImageView) mFloatingView.findViewById(R.id.next_btn);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FloatingViewService.this, "Playing next song.", Toast.LENGTH_LONG).show();
            }
        });


        //Set the pause button.
        ImageView prevButton = (ImageView) mFloatingView.findViewById(R.id.prev_btn);
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FloatingViewService.this, "Playing previous song.", Toast.LENGTH_LONG).show();
            }
        });

 */
        //Set the close button
        ImageView closeButton = (ImageView) mFloatingView.findViewById(R.id.close_button);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                collapsedView.setVisibility(View.VISIBLE);
                expandedView.setVisibility(View.GONE);
            }
        });


        //Open the application on thi button click
        ImageView openButton = (ImageView) mFloatingView.findViewById(R.id.open_button);
        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Open the application  click.
                Intent intent = new Intent(FloatingViewService.this, Cursos.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);


                //close the service and remove view from the view hierarchy
                stopSelf();
            }
        });

        //Drag and move floating view using user's touch action.
        mFloatingView.findViewById(R.id.root_container).setOnTouchListener(new View.OnTouchListener() {
            private int initialX;
            private int initialY;
            private float initialTouchX;
            private float initialTouchY;


            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:

                        //remember the initial position.
                        initialX = params.x;
                        initialY = params.y;

                        //get the touch location
                        initialTouchX = event.getRawX();
                        initialTouchY = event.getRawY();
                        return true;
                    case MotionEvent.ACTION_UP:
                        int Xdiff = (int) (event.getRawX() - initialTouchX);
                        int Ydiff = (int) (event.getRawY() - initialTouchY);


                        //The check for Xdiff <10 && YDiff< 10 because sometime elements moves a little while clicking.
                        //So that is click event.
                        if (Xdiff < 10 && Ydiff < 10) {
                            if (isViewCollapsed()) {
                                //When user clicks on the image view of the collapsed layout,
                                //visibility of the collapsed layout will be changed to "View.GONE"
                                //and expanded view will become visible.
                                collapsedView.setVisibility(View.GONE);
                                expandedView.setVisibility(View.VISIBLE);
                            }
                        }
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        //Calculate the X and Y coordinates of the view.
                        params.x = initialX + (int) (event.getRawX() - initialTouchX);
                        params.y = initialY + (int) (event.getRawY() - initialTouchY);


                        //Update the layout with new X & Y coordinate
                        mWindowManager.updateViewLayout(mFloatingView, params);
                        return true;
                }
                return false;
            }
        });
    }


    /**
     * Detect if the floating view is collapsed or expanded.
     *
     * @return true if the floating view is collapsed.
     */
    private boolean isViewCollapsed() {
        return mFloatingView == null || mFloatingView.findViewById(R.id.collapse_view).getVisibility() == View.VISIBLE;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mFloatingView != null) mWindowManager.removeView(mFloatingView);
    }


    public void PasoSiguiente(View Vistazo)
    {
        if (PorQuePasoVoy <= 2)
        {
            //The root element of the collapsed view layout
            final View collapsedView = mFloatingView.findViewById(R.id.collapse_view);
            //The root element of the expanded view layout
            final View expandedView = mFloatingView.findViewById(R.id.expanded_container);

            collapsedView.setVisibility(View.VISIBLE);
            expandedView.setVisibility(View.GONE);

            Pasos(PorQuePasoVoy);
            PorQuePasoVoy++;
        }
        else
        {
            ImageButton PasoSig = (ImageButton) mFloatingView.findViewById(R.id.PasoSig);
            ImageButton PasoAnt = (ImageButton) mFloatingView.findViewById(R.id.PasoAnt);

            PasoSig.setEnabled(false);
            PasoAnt.setEnabled(false);
        }




    }
    public void PasoAnterior(View Vistazo)
    {


        if (PorQuePasoVoy <= 2 || PorQuePasoVoy !=0)
        {
            PorQuePasoVoy--;
            Pasos(PorQuePasoVoy);
            //The root element of the collapsed view layout
            final View collapsedView = mFloatingView.findViewById(R.id.collapse_view);
            //The root element of the expanded view layout
            final View expandedView = mFloatingView.findViewById(R.id.expanded_container);

            collapsedView.setVisibility(View.VISIBLE);
            expandedView.setVisibility(View.GONE);
        }
        else
        {
            ImageButton PasoSig = (ImageButton) mFloatingView.findViewById(R.id.PasoSig);
            ImageButton PasoAnt = (ImageButton) mFloatingView.findViewById(R.id.PasoAnt);

            PasoSig.setEnabled(false);
            PasoAnt.setEnabled(false);
        }

    }

    public void Pasos(int Contador)
    {
        TextView PasoPorPasoT = (TextView)this.mFloatingView.findViewById(R.id.Paso);
        ImageView Screen = (ImageView)this.mFloatingView.findViewById(R.id.screen);

        switch(Contador)
        {
            case 0:
                PasoPorPasoT.setText("Eliga el contacto al que quiere mandarle la nota de voz (audio)");
                Screen.setImageResource(R.drawable.screenpas1);
                break;
            case 1:
                PasoPorPasoT.setText("Mantenga presionado el boton del microfono ubicado en el lado derecho inferior");
                Screen.setImageResource(R.drawable.screenpas2);

                break;
            case 2:
                PasoPorPasoT.setText("Suelte el boton para enviar el mensaje, si lo quiere cancelar deslize el dedo hacia la izquierda teniendo el boton presionado");

            case 3:
                PasoPorPasoT.setText("Felicidades usted ha logrado mandar un audio correctamente, puede volver a los cursos presionando el boton para mas cursos");
                Screen.setImageResource(R.drawable.aplausos);
                break;
        }
        if(PorQuePasoVoy <=3)
        {
        }
        else
        {
            Toast MensajeFin;
            MensajeFin = Toast.makeText(this, "No hay mas pasos, si no pudo lograrlo vuelva para atras y si lo logro puede ir a ver mas cursos", Toast.LENGTH_LONG);
            MensajeFin.show();

        }
    }
}