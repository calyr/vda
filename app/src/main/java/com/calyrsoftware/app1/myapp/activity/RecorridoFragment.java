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

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;

import info.androidhive.materialdesign.R;

/**
 * Created by callisaya on 27/10/15.
 */
public class RecorridoFragment extends Fragment  {

    MapView mMapView;
    private GoogleMap googleMap; // Might be null if Google Play services APK is not available.
    public RecorridoFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_recorrido, container, false);
        Toast.makeText( getContext() , "Recorrido de la festividad Virgen del Amparo 2015", Toast.LENGTH_LONG).show();
        //setUpMapIfNeeded(rootView);
        // inflat and return the layout
        View v = inflater.inflate(R.layout.fragment_recorrido, container,
                false);
        mMapView = (MapView) v.findViewById(R.id.mapView);
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
        MarkerOptions marker = new MarkerOptions().position(
                new LatLng(latitude, longitude)).title("Partida Entrada Folklorica").snippet("Virgen del Amparo 2015");

        // Changing marker icon
        marker.icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_ROSE));

        // adding marker
        googleMap.addMarker(marker);
        LatLng inicio = new LatLng(latitude, longitude);

        LatLng micentro = new LatLng(-17.404359, -66.040772);

        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(micentro).zoom(16).build();
        googleMap.animateCamera(CameraUpdateFactory
                .newCameraPosition(cameraPosition));

        googleMap.addPolyline(new PolylineOptions().geodesic(true)
                .add(new LatLng(latitude, longitude))  // Sydney
                .add(new LatLng(-17.403416, -66.038394))  // Fiji
                .add(new LatLng(-17.400509, -66.045882))  // Hawaii
                .add(new LatLng(-17.401676, -66.046183))
                .add(new LatLng(-17.404076, -66.040604))
                .add(new LatLng(-17.403495, -66.040314))
                .add(new LatLng(-17.403736, -66.039778))
                .add(new LatLng(-17.405067, -66.040405))// Mountain View
        );
        MarkerOptions markerend = new MarkerOptions().position(
                new LatLng(-17.405067, -66.040405)).title("Llegada Entrada Folklorica").snippet(" Virgen del Amparo 2015");

        // Changing marker icon
        markerend.icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_CYAN));

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




    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded(View v) {
        // Do a null check to confirm that we have not already instantiated the map.
       /* if (googleMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            googleMap = ((SupportMapFragment)getFragmentManager().findFragmentById(R.id.map2)).getMap();
            // Check if we were successful in obtaining the map.
            if (googleMap != null) {
                LatLng sydney = new LatLng(-17.391817, -66.145004);

                googleMap.setMyLocationEnabled(true);
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 13));

                googleMap.addMarker(new MarkerOptions()
                        .title("Universidad Mayor de San Simon")
                        .snippet("La mejor Universidad de Bolivia")
                        .position(sydney));

                googleMap.addPolyline(new PolylineOptions().geodesic(true)
                        .add(new LatLng(-17.391817, -66.145004))  // Sydney
                        .add(new LatLng(-17.387580, -66.155221))  // Fiji
                        .add(new LatLng(21.291, -157.821))  // Hawaii
                        .add(new LatLng(37.423, -122.091))  // Mountain View
                );
            }
        }*/
    }





}
