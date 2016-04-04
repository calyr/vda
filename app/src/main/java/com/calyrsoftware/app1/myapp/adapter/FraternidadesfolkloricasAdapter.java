package com.calyrsoftware.app1.myapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.calyrsoftware.app1.myapp.model.Fraternidadesfolkloricas;
import com.calyrsoftware.app1.myapp.model.Programafestivo;

import java.util.ArrayList;

import info.androidhive.materialdesign.R;

/**
 * Created by Roberto on 22/10/2015.
 */
public class FraternidadesfolkloricasAdapter extends ArrayAdapter<Fraternidadesfolkloricas> {
    public FraternidadesfolkloricasAdapter(Context context, ArrayList<Fraternidadesfolkloricas> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fraternidadesfolkloricas ff = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fraternidadesfolkloricas_row,parent, false);
        }

        TextView categoria = (TextView)convertView.findViewById(R.id.ffCategoria);


        categoria.setText(ff.getCategoria());


        //return super.getView(position, convertView, parent);
        return convertView;
    }
}
