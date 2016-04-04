package com.calyrsoftware.app1.myapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.calyrsoftware.app1.myapp.model.Mensajedelalcalde;
import com.calyrsoftware.app1.myapp.model.Telefonosdeemergencia;

import java.util.ArrayList;

import info.androidhive.materialdesign.R;

/**
 * Created by Roberto on 26/10/2015.
 */
public class MensajedelalcaldeAdapter  extends ArrayAdapter<Mensajedelalcalde> {
    public MensajedelalcaldeAdapter(Context context, ArrayList<Mensajedelalcalde> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Mensajedelalcalde  mda = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.mensajedelalcalde_row, parent, false);
        }

        //TextView name = (TextView)convertView.findViewById(R.id.mdanombre);
        //TextView title = (TextView)convertView.findViewById(R.id.mdatitulo);
        //TextView text= (TextView)convertView.findViewById(R.id.mdatexto);


        //name.setText(mda.getNombre());
        //title.setText(mda.getTitulo());
        //text.setText(mda.getMensaje());

        //return super.getView(position, convertView, parent);
        return convertView;
    }
}
