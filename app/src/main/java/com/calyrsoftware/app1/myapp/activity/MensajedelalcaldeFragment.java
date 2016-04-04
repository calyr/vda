package com.calyrsoftware.app1.myapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.calyrsoftware.app1.myapp.adapter.FraternidadesfolkloricasAdapter;
import com.calyrsoftware.app1.myapp.adapter.MensajedelalcaldeAdapter;
import com.calyrsoftware.app1.myapp.adapter.TelefonosdeemergenciaAdapter;
import com.calyrsoftware.app1.myapp.model.Fraternidadesfolkloricas;
import com.calyrsoftware.app1.myapp.model.Mensajedelalcalde;
import com.calyrsoftware.app1.myapp.model.Telefonosdeemergencia;

import java.util.ArrayList;
import java.util.List;

import info.androidhive.materialdesign.R;

/**
 * Created by Roberto on 21/10/2015.
 */
public class MensajedelalcaldeFragment extends Fragment {

    MensajedelalcaldeAdapter adapter;
    ArrayList<Mensajedelalcalde> mdaList;
    ListView mdaListView;
    public MensajedelalcaldeFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_mensajedelalcalde, container, false);

        mdaList = new ArrayList<>();
        mdaList.add(new Mensajedelalcalde("Humberto Sánchez Sánchez","Alcalde","" ));

        adapter = new MensajedelalcaldeAdapter(container.getContext(),mdaList);

        mdaListView = (ListView) rootView.findViewById(R.id.mdaListView);
        mdaListView.setAdapter(adapter);

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
