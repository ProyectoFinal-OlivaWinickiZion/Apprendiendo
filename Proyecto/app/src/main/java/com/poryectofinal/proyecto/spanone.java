package com.poryectofinal.proyecto;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 42647486 on 9/6/2017.
 */

public class spanone extends Fragment implements View.OnClickListener {
    private String title;
    private int image;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.spanone, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.txtMain);
        tvLabel.setText(title);

        ImageView imageView = (ImageView) view.findViewById(R.id.imgMain);
        imageView.setImageResource(image);

        Button Boton = (Button)view.findViewById(R.id.Comenzar);
        Boton.setOnClickListener(this);


        return view;
    }

    public void onClick(View vistazo)
    {
        MainActivity ActivityAnfitriona = (MainActivity)getActivity();
        //ActivityAnfitriona.Spans;
    }
}
