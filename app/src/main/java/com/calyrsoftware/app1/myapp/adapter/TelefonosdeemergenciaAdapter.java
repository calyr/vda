package com.calyrsoftware.app1.myapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.calyrsoftware.app1.myapp.model.Telefonosdeemergencia;

import java.util.ArrayList;

import info.androidhive.materialdesign.R;

/**
 * Created by Roberto on 22/10/2015.
 */
public class TelefonosdeemergenciaAdapter extends ArrayAdapter<Telefonosdeemergencia> {
    public TelefonosdeemergenciaAdapter(Context context, ArrayList<Telefonosdeemergencia> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Telefonosdeemergencia tde = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.telefonosdeemergencia_row, parent, false);
        }

        TextView name = (TextView)convertView.findViewById(R.id.tde_nombre);
        TextView address = (TextView)convertView.findViewById(R.id.tde_direccion);
        TextView phone = (TextView)convertView.findViewById(R.id.tde_telefono);

        name.setText(tde.getNombre());
        address.setText(tde.getDireccion());
        phone.setText(tde.getTelefono());

        //return super.getView(position, convertView, parent);
        return convertView;
    }
}
