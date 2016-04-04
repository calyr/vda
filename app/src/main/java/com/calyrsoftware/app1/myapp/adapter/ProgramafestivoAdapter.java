package com.calyrsoftware.app1.myapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.calyrsoftware.app1.myapp.model.Programafestivo;
import com.calyrsoftware.app1.myapp.model.Telefonosdeemergencia;

import java.util.ArrayList;

import info.androidhive.materialdesign.R;

/**
 * Created by Roberto on 22/10/2015.
 */
public class ProgramafestivoAdapter extends ArrayAdapter<Programafestivo> {
    public ProgramafestivoAdapter(Context context, ArrayList<Programafestivo> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Programafestivo pf = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.programafestivo_row, parent, false);
        }

        //TextView title = (TextView)convertView.findViewById(R.id.pfTitulo);
        //TextView address = (TextView)convertView.findViewById(R.id.pfDescripcion);
        //TextView date = (TextView)convertView.findViewById(R.id.pfFecha);
        //TextView hour = (TextView)convertView.findViewById(R.id.pfHorario);

        //title.setText(pf.getTitulo());
        //address.setText(pf.getDescripcion());
        //date.setText(pf.getFecha());
        //hour.setText(pf.getHorario());

        //return super.getView(position, convertView, parent);
        return convertView;
    }
}
