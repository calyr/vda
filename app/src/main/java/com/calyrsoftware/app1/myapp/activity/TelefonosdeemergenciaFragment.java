package com.calyrsoftware.app1.myapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.calyrsoftware.app1.myapp.adapter.TelefonosdeemergenciaAdapter;
import com.calyrsoftware.app1.myapp.model.Telefonosdeemergencia;

import java.util.ArrayList;

import info.androidhive.materialdesign.R;

/**
 * Created by Roberto on 21/10/2015.
 */
public class TelefonosdeemergenciaFragment extends Fragment {

    ArrayList<Telefonosdeemergencia> lista;
    TelefonosdeemergenciaAdapter adapter;
    ListView tdeListView;
    public TelefonosdeemergenciaFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((MainActivity) getActivity()).getSupportActionBar().show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_telefonosdeemergencia, container, false);

        tdeListView = (ListView) rootView.findViewById(R.id.tdeListView);
        this.lista = new ArrayList<>();
        this.lista.add( new Telefonosdeemergencia("Hospital México","Distrito 1","4701717" ));
        this.lista.add( new Telefonosdeemergencia("Hospital Salomón Klein","Distrito 2\nZona Quintanilla","4715117"));
        this.lista.add( new Telefonosdeemergencia("Bomberos Sacaba","Distrito 4\nZona Huallani","4726500" ));
        this.lista.add( new Telefonosdeemergencia("E.P.I. No 1 F.E.L.C.C.","Distrito 1\nAvenida Circunvalación, puente Huayani","4703550" ));
        this.lista.add( new Telefonosdeemergencia("F.E.L.C.V.","Distrito 1\n" +
                "Avenida Circunvalación, puente Huayani","4704726"));
        this.lista.add( new Telefonosdeemergencia("Transito Sacaba","Distrito 1\nZona ex-Tranca","4700065" ));
        this.lista.add( new Telefonosdeemergencia("Dirección provincial de la policía","Distrito 1\nPlaza principal","4704377" ));
        this.lista.add( new Telefonosdeemergencia("Módulo Policial No 1","Distrito 7\nVilla Obrajes","4025033" ));
        this.lista.add( new Telefonosdeemergencia("Módulo Policial No 2","Distrito 4\nZona Inca Rancho","4271445" ));
        this.lista.add( new Telefonosdeemergencia("E.P.I. No 4","Distrito 4\nZona Guadalupe","4273274" ));
        this.lista.add( new Telefonosdeemergencia("Módulo Policial No 5","Distrito 6\nLa Villa Zona El Abra","4714401" ));
        this.lista.add( new Telefonosdeemergencia("E.P.I. No 6","Distrito 6\nAv. Octava sur","4710660" ));
        this.lista.add( new Telefonosdeemergencia("Módulo Policial No 6","Distrito 6\nLuis Espinal Zona El Abra","4714821" ));
        this.lista.add( new Telefonosdeemergencia("Módulo Policial No 12","Distrito 2\nZona Chillijchi","4719031" ));
        this.lista.add( new Telefonosdeemergencia("Módulo Policial No 15","Distrito 2\nZona Amancayas","4303609" ));
        this.lista.add( new Telefonosdeemergencia("Radio Patrullas","Distrito 2\nZona Chacacollo","4011828" ));
        this.lista.add( new Telefonosdeemergencia("Defensoría de la niñez y adolescencia","Distrito 1","4701329" ));
        this.lista.add( new Telefonosdeemergencia("Defensoría de la niñez y adolescencia","Distrito 2","4723440" ));
        this.lista.add( new Telefonosdeemergencia("Defensoría de la niñez y adolescencia","Distrito 3","4299665" ));
        this.lista.add( new Telefonosdeemergencia("Defensoría de la niñez y adolescencia","Distrito 4","4276318" ));
        this.lista.add( new Telefonosdeemergencia("Defensoría de la niñez y adolescencia","Distrito 6","4712738" ));
        this.lista.add( new Telefonosdeemergencia("Gobierno Autónomo Municipal de Sacaba","Distrito 1\nPlaza 6 de Agosto","4701677" ));
        this.lista.add( new Telefonosdeemergencia("GERES","Distrito 1\nPlaza 6 de Agosto","4700357" ));
        this.lista.add( new Telefonosdeemergencia("EMAPAS","Distrito 1\nPlaza 6 de Agosto","4706525" ));
        this.lista.add( new Telefonosdeemergencia("Zoonosis","Distrito 1","4660398" ));





        Toast.makeText( getContext() , "Por favor, presione para llamar", Toast.LENGTH_LONG).show();

        adapter = new TelefonosdeemergenciaAdapter(container.getContext(),lista);

        tdeListView.setAdapter(adapter);
        this.tdeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArrayList<String> lista2 = new ArrayList<String>();
                lista2.add("4701717");
                lista2.add("4715117");
                lista2.add("4726500");
                lista2.add("4703550");
                lista2.add("4704726");
                lista2.add("4700065");
                lista2.add("4704377");
                lista2.add("4025033");
                lista2.add("4271445");
                lista2.add("4273274");
                lista2.add("4714401");
                lista2.add("4710660");
                lista2.add("4714821");
                lista2.add("4719031");
                lista2.add("4303609");
                lista2.add("4011828");
                lista2.add("4701329");
                lista2.add("4723440");
                lista2.add("4299665");
                lista2.add("4276318");
                lista2.add("4712738");
                lista2.add("4701677");
                lista2.add("4700357");
                lista2.add("4706525");
                lista2.add("4660398");
                Intent callIntent;

                callIntent = new Intent(Intent.ACTION_CALL, ussdToCallableUri("tel:4"+lista2.get(position)));
                startActivity(callIntent);

                /*
                switch (position){
                    case 0:
                        //callIntent = new Intent(Intent.ACTION_CALL, ussdToCallableUri("*105#"));
                        callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:44703061"));
                        startActivity(callIntent);
                        break;
                    case 1:
                        callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:44715117"));
                        startActivity(callIntent);
                        break;
                    case 2:
                        callIntent = new Intent(Intent.ACTION_CALL, ussdToCallableUri("tel:44701329"));
                        startActivity(callIntent);
                        break;
                    case 3:
                        //callIntent = new Intent(Intent.ACTION_CALL, ussdToCallableUri("*105#"));
                        callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:44703550"));
                        startActivity(callIntent);
                        break;
                    case 4:
                        callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:44704726"));
                        startActivity(callIntent);
                        break;
                    case 5:
                        callIntent = new Intent(Intent.ACTION_CALL, ussdToCallableUri("tel:4470065"));
                        startActivity(callIntent);
                        break;
                    case 6:
                        //callIntent = new Intent(Intent.ACTION_CALL, ussdToCallableUri("*105#"));
                        callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:44726500"));
                        startActivity(callIntent);
                        break;
                    case 7:
                        callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:44011828"));
                        startActivity(callIntent);
                        break;
                    case 8:
                        callIntent = new Intent(Intent.ACTION_CALL, ussdToCallableUri("tel:44704377"));
                        startActivity(callIntent);
                        break;
                    case 9:
                        //callIntent = new Intent(Intent.ACTION_CALL, ussdToCallableUri("*105#"));
                        callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:44025033"));
                        startActivity(callIntent);
                        break;
                    case 10:
                        callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:44271445"));
                        startActivity(callIntent);
                        break;
                    case 11:
                        callIntent = new Intent(Intent.ACTION_CALL, ussdToCallableUri("tel:44714401"));
                        startActivity(callIntent);
                        break;
                    case 12:
                        //callIntent = new Intent(Intent.ACTION_CALL, ussdToCallableUri("*105#"));
                        callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:44714821"));
                        startActivity(callIntent);
                        break;
                    case 13:
                        callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:44719031"));
                        startActivity(callIntent);
                        break;
                    case 14:
                        callIntent = new Intent(Intent.ACTION_CALL, ussdToCallableUri("tel:44303609"));
                        startActivity(callIntent);
                        break;
                    case 15:
                        //callIntent = new Intent(Intent.ACTION_CALL, ussdToCallableUri("*105#"));
                        callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:44273274"));
                        startActivity(callIntent);
                        break;
                    case 16:
                        callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:44710660"));
                        startActivity(callIntent);
                        break;
                    case 17:
                        callIntent = new Intent(Intent.ACTION_CALL, ussdToCallableUri("tel:44715117"));
                        startActivity(callIntent);
                        break;


                }*/
            }
        });
        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    private Uri ussdToCallableUri(String ussd){
        String uriString = "";
        if(!ussd.startsWith("tel:"))
            uriString += "tel:";

        for(char c: ussd.toCharArray()){
            if( c == '#'){
                uriString += Uri.encode("#");
            }else{
                uriString += c;
            }
        }
        return Uri.parse(uriString);
    }
}
