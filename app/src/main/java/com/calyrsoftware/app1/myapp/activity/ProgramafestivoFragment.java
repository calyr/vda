package com.calyrsoftware.app1.myapp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.calyrsoftware.app1.myapp.adapter.ProgramafestivoAdapter;
import com.calyrsoftware.app1.myapp.model.Programafestivo;

import java.util.ArrayList;

import info.androidhive.materialdesign.R;

/**
 * Created by Roberto on 22/10/2015.
 */
public class ProgramafestivoFragment extends Fragment {
    ProgramafestivoAdapter adapter;
    ArrayList<Programafestivo> pfList;
    ListView pfListView;

    public ProgramafestivoFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_programafestivo, container, false);

        pfList = new ArrayList<>();
        pfList.add(new Programafestivo("Proyección del Documental Virgen del Amparo 2014","Teatro Parroquial","Del Lunes 12 al Jueves 15  de octubre de 2015","09:00 a.m. 15:00 p.m." ));
        /*
        pfList.add(new Programafestivo("Lanzamiento Oficial y Proyección del Documental Festividad Virgen del Amparo 2015","Plaza Principal 6 de Agosto (acera este frente al Templo),","Viernes 16  de octubre de 2015","18:00 p.m" ));

        pfList.add(new Programafestivo("Encuentro de Hermandad de las diferentes Advocaciones Marianas del municipio con la “Virgen del Amparo”\n" +
                "Romería-Peregrinación (Primer Convite)\n","Recorrido Tradicional (Capilla de la Virgen hasta la Plaza Principal 6 de Agosto).","Domingo, 25 de octubre de 2015","12:45 p.m." ));
        pfList.add(new Programafestivo("Solemne eucarística con las imágenes sagradas en el Templo San Pedro de Sacaba","Templo San Pedro de Sacaba","Domingo, 25 de octubre de 2015","17:00 a.m." ));
        pfList.add(new Programafestivo("Exposición de las imágenes sagradas en el interior del Templo San Pedro de Sacaba","Templo San Pedro de Sacaba","Domingo, 25 de octubre de 2015","18:00 a 21:00 p.m." ));

        pfList.add(new Programafestivo("Misa de Novenas de Comerciantes","Templo San Pedro de Sacaba.","Viernes 30 de octubre/ Lunes 02 de noviembre de 2015","18:00 p.m." ));
        pfList.add(new Programafestivo("Misa de Novenas de Transportistas","Templo San Pedro de Sacaba.","Martes 03 de noviembre de 2015","18:00 p.m." ));
        pfList.add(new Programafestivo("Vísperas de la Fiesta de los Cantores","","Miércoles 04 de noviembre de 2015","18:00 p.m." ));
        pfList.add(new Programafestivo("Fiesta de los Cantores","","Jueves 05 de noviembre de 2015","10:30 a.m." ));
        pfList.add(new Programafestivo("Misa de Novenas de Autoridades y Funcionarios","Templo San Pedro de Sacaba.","Jueves 05 de noviembre de 2015","18:00 p.m." ));
        pfList.add(new Programafestivo("Aniversario de Los AFFAS (Asociación de Fraternidades Folklóricas y Autóctonas Sacaba). ","Sede de la Asociación de Fraternidades Folklóricas y Autóctonas Sacaba (Bolívar entre Ingavi y Junín).","Viernes 06 de noviembre de 2015","20:00 p.m." ));
        pfList.add(new Programafestivo("Elección\n" +
                " de la Ñusta de la Festividad de la Virgen del Amparo\n","Coliseo Municipal","Viernes 06 de noviembre de 2015","19:00 p.m." ));
        pfList.add(new Programafestivo("Misa de Novenas en Villa Obrajes","Templo de Villa Obrajes","Sábado 07 de noviembre de 2015","18:00 p.m." ));
        pfList.add(new Programafestivo("Inicio del Convite de la Entrada Folklórica “Festividad Virgen del Amparo 2015”","Recorrido Tradicional (Capilla de la Virgen hasta la Plaza Principal 6 de Agosto).","Domingo, 08 de noviembre de 2015","11:00 a.m." ));
        pfList.add(new Programafestivo("Misa de Novenas de la Policía Boliviana","","Lunes 9 de noviembre de 2015","18:00 p.m." ));
        pfList.add(new Programafestivo("Misa de Novenas Unidades Educativas (Promoción)","","Martes 10 de noviembre de 2015","18:00 p.m." ));
        pfList.add(new Programafestivo("Misa de Novenas Agentes de la Pastoral Sacaba ","","Miércoles 11 de noviembre de 2015","18:00 p.m." ));
        pfList.add(new Programafestivo("Entrada Nocturna en devoción a la Virgen del Amparo.","Recorrido desde el Coliseo Municipal hasta la Plaza Principal 6 de Agosto).","Miércoles 11 de noviembre de 2015","19:00 p.m." ));
        pfList.add(new Programafestivo("Misa de Novenas en Casa de los Pasantes","Plaza Principal 6 de Agosto.","Domingo, 15 de noviembre de 2015","06:00 a.m." ));
        pfList.add(new Programafestivo("Solemne Misa de Fiesta en honor a la “Virgen del Amparo”","Templo San Pedro de Sacaba.","Domingo, 15 de noviembre de 2015","10:00 a.m." ));
        pfList.add(new Programafestivo("Procesión solemne con la imagen de la “Virgen del Amparo”","Recorrido Tradicional (Capilla de la Virgen hasta la Plaza Principal 6 de Agosto).","Domingo, 15 de noviembre de 2015","11:00 p.m." ));
        pfList.add(new Programafestivo("Demostración de las Fraternidades Folklóricas y Autóctonas ","Recorrido Tradicional (Capilla de la Virgen hasta la Plaza Principal 6 de Agosto).","Domingo, 15 de noviembre de 2015","11:00 a.m." ));
        pfList.add(new Programafestivo("Romería hacia el Calvario con la imagen de la “Virgen del Amparo”","Templo San Pedro de Sacaba–Av. Mons. Alcocer-Capilla de Tacoloma","Lunes, 16 de Noviembre de 2015","09:00 a.m." ));
        pfList.add(new Programafestivo("Solemne Misa en honor a la “Virgen del Amparo” con peregrinos y devotos","Capilla de Tacoloma","Lunes, 16 de Noviembre de 2015","11:00 a.m." ));
        pfList.add(new Programafestivo("Retorno del Calvario con la imagen de la “Virgen del Amparo”","Capilla de Tacoloma- Av. Mons. Alcocer- Templo San Pedro de Sacaba","Lunes, 16 de Noviembre de 2015","17:00 p.m." ));
        pfList.add(new Programafestivo("Kacharpaya Romería “Virgen del Amparo” hacia la zona del Puente Mailanku ","Templo San Pedro de Sacaba–Av. Bertho Nicoli-Zona Miraflores Norte (Puente MailanKu).","Martes, 17 de noviembre de 2015","14:00 p.m." ));
        pfList.add(new Programafestivo("Solemne eucaristía con peregrinos y devotos en la zona del Puente Mailanku","Zona Miraflores Norte (Puente MailanKu).","Martes, 17 de noviembre de 2015","15:00 p.m." ));
        pfList.add(new Programafestivo("Retorno de la Kacharpaya con la imagen de la “Virgen del Amparo”","Zona Miraflores Norte (Puente MailanKu).- Av. Bertho Nicoli- Templo San Pedro de Sacaba","Martes, 17 de noviembre de 2015","19:00 p.m." ));
        pfList.add(new Programafestivo("Solemne eucaristía de fiesta de Alasitas","Templo San Pedro de Sacaba","Domingo, 22 de noviembre de 2015","09:00 a.m." ));
        pfList.add(new Programafestivo("Inauguración de la tradicional Feria de Alasitas","Plaza Principal 6 de Agosto.","Domingo, 22 de noviembre de 2015","10:00 a.m." ));
        pfList.add(new Programafestivo("Evaluación de la Festividad de la Virgen del Amparo 2015","Parroquia San Pedro de Sacaba","Viernes 4 de diciembre de 2015","14:00 p.m." ));

*/
        adapter = new ProgramafestivoAdapter(container.getContext(),pfList);

        pfListView = (ListView) rootView.findViewById(R.id.pfListView);
        pfListView.setAdapter(adapter);
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


}
