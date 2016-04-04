package com.calyrsoftware.app1.myapp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import info.androidhive.materialdesign.R;

/**
 * Created by Roberto on 25/10/2015.
 */
public class BancofortalezaFragment extends Fragment {

    MapView mMapView;
    private GoogleMap googleMap; // Might be null if Google Play services APK is not available.
    public BancofortalezaFragment(){
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bancofortaleza, container, false);
        Toast.makeText(getContext(), getString(R.string.title_fortaleza), Toast.LENGTH_SHORT).show();
        //setUpMapIfNeeded(rootView);
        // inflat and return the layout
        View v = inflater.inflate(R.layout.fragment_bancofortaleza, container,
                false);
        mMapView = (MapView) v.findViewById(R.id.mapViewFortaleza);
        mMapView.onCreate(savedInstanceState);

        mMapView.onResume();// needed to get the map to display immediately

        try {
            MapsInitializer.initialize(getActivity().getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }

        googleMap = mMapView.getMap();
        googleMap.setMyLocationEnabled(true); //Location
        googleMap.getUiSettings().setCompassEnabled(true); //Compass
        googleMap.getUiSettings().setIndoorLevelPickerEnabled(true); //Indoor
        googleMap.getUiSettings().setMapToolbarEnabled(true); //Map toolsbar
        googleMap.getUiSettings().setZoomControlsEnabled(true);
        // latitude and longitude
        double latitude = -17.408677;
        double longitude = -66.040862;
        // create marker

        // Changing marker icon
        LatLng inicio = new LatLng(latitude, longitude);

        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(inicio).zoom(14).build();
        googleMap.animateCamera(CameraUpdateFactory
                .newCameraPosition(cameraPosition));

        /*googleMap.addPolyline(new PolylineOptions().geodesic(true)
                .add(new LatLng(latitude, longitude))  // Sydney
                .add(new LatLng(-17.403416, -66.038394))  // Fiji
                .add(new LatLng(-17.400509, -66.045882))  // Hawaii
                .add(new LatLng(-17.401676, -66.046183))
                .add(new LatLng(-17.404076, -66.040604))
                .add(new LatLng(-17.403495, -66.040314))
                .add(new LatLng(-17.403736, -66.039778))
                .add(new LatLng(-17.405067, -66.040405))// Mountain View
        );*/
        MarkerOptions markerend = new MarkerOptions().position(
                new LatLng(-17.403685, -66.038583)).title("Agencia Sacaba").snippet("Calle Bolivar No.366 entre Av. Ayacucho y calle Colon Zona Central");
        markerend.icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        // adding marker
        googleMap.addMarker(markerend);




/*
        -17.109292 -66.041140
                -17.403416, -66.038394
                -17.400509, -66.045882
                -17.401676, -66.046183

                -17.404076, -66.040604
                -17.403495, -66.040314

                -17.403736, -66.039778
                -17.405067, -66.040405
  */
        // Perform any camera updates here
        return v;


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
