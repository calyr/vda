package com.calyrsoftware.app1.myapp.activity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import info.androidhive.materialdesign.R;


public class MainActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener {


    private Toolbar mToolbar;
    private FragmentDrawer drawerFragment;
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener(this);

        displayView(11);

    }




    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Por favor, utilice el menú para navegar", Toast.LENGTH_LONG).show();
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       /* if (id == R.id.action_settings) {
            Log.d("Mostrando la infor","Toda la info del boton setting");
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }

    public void displayView(int position) {
        Fragment fragment = null;
        Bundle args = new Bundle();
        String title = getString(R.string.app_name);
        switch (position) {
            case 0:
                fragment = new ProgramafestivoFragment();
                title = getString(R.string.title_programafestivo);
                break;
            case 1:

                if (!verificaConexion(this)) {

                    fragment = new RecorridosinFragment();
                }else{
                    fragment = new RecorridoFragment();
                }

                title = getString(R.string.title_recorrido);
                break;
            case 2:
                fragment = new FraternidadesfolkloricasFragment();
                title = getString(R.string.title_fraternidadesfolkloricas);
                break;
            case 3:
                fragment = new MenubancosFragment();
                title = getString(R.string.title_cajerosautomaticos);
                break;

            case 4:
                fragment = new GastronomiaFragment();
                title  = getString(R.string.title_gastronomia);
                break;
            case 5:
                fragment = new TurismoFragment();
                title  = getString(R.string.title_turismo);
                break;
            case 6:
                fragment = new TelefonosdeemergenciaFragment();
                title = getString(R.string.title_telefonosdeemergencia);
                break;
            case 7:
                fragment = new OylFragment();
                title = getString(R.string.title_ordenanzasyleyes);
                break;
            case 8:
                fragment = new MensajedelalcaldeFragment();
                title = getString(R.string.title_mensajedelalcalde);
                break;

            case 9:
                fragment = new RedesocialesFragment();
                title = getString(R.string.title_redessociales);
                break;

            case 11:
                fragment = new PortadaFragment();
                title = getString(R.string.title_portada);
                break;
            case 20:
            fragment = new MenuprincipalFragment();
                  break;

            case 31:
                fragment = new BancofieFragment();

                title = getString(R.string.title_fie);
                break;

            case 32:
                fragment = new BancobisaFragment();
                title = getString(R.string.title_bisa);
                break;

            case 33:
                fragment = new BancounionFragment();
                title = getString(R.string.title_union);
                break;

            case 34:
                fragment = new BancoeconomicoFragment();

                title = getString(R.string.title_economico);
                break;

            case 35:
                fragment = new BancolosandesFragment();

                title = getString(R.string.title_losandes);
                break;

            case 36:
                fragment = new BancofortalezaFragment();

                title = getString(R.string.title_fortaleza);
                break;
            case 37:
                fragment = new BancosolFragment();

                title = getString(R.string.title_sol);
                break;
            case 38:
                fragment = new EcofuturoFragment();
                title = getString(R.string.title_ecofuturo);
                break;


            case 39:
                fragment = new BancoprodemFragment();

                title = getString(R.string.title_prodem);
                break;


            case 40:

                fragment = new BancofassilFragment();
                title = getString(R.string.title_fassil);
                break;




            case 41:
                fragment = new QuillacolloFragment();
                title = getString(R.string.title_quillacollo);
                break;

            case 42:
                fragment = new CrecerFragment();

                title = getString(R.string.title_crecer);
                break;


            case 43:
                fragment = new PioxFragment();


                title = getString(R.string.title_piox);
                break;



            case 44:
                fragment = new CacefFragment();

                title = getString(R.string.title_cacef);
                break;

            case 45:
                fragment = new EmprenderFragment();

                title = getString(R.string.title_emprender);
                break;

            case 46:
                fragment = new FubodeFragment();
                title = getString(R.string.title_fubode);
                break;



            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }


    public void mostrar(View view) {
        displayView(0);
    }

    public void mostrarBF(View view){
        displayView(10);
    }

    public void mostrarMenu(View view) {
        displayView(20);
    }

    public void mostrarYoutube(View view) {
        try{
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/SACABACBBABO"));
            startActivity(intent);
        }catch (ActivityNotFoundException ex){
            Intent intent=new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/user/SACABACBBABO"));
            startActivity(intent);
        }
    }

    public void mostrarFacebook(View view) {
        try{
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/municipiosacaba"));
            startActivity(intent);
        }catch (ActivityNotFoundException ex){
            Intent intent=new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/municipiosacaba"));
            startActivity(intent);
        }
    }

    public static boolean verificaConexion(Context ctx) {
        boolean bConectado = false;
        ConnectivityManager connec = (ConnectivityManager) ctx
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        // No sólo wifi, también GPRS
        NetworkInfo[] redes = connec.getAllNetworkInfo();
        // este bucle debería no ser tan ñapa
        for (int i = 0; i < 2; i++) {
            // ¿Tenemos conexión? ponemos a true
            if (redes[i].getState() == NetworkInfo.State.CONNECTED) {
                bConectado = true;
            }
        }
        return bConectado;
    }


}
