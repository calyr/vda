package com.calyrsoftware.app1.myapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.calyrsoftware.app1.myapp.activity.MainActivity;
import com.calyrsoftware.app1.myapp.model.Menuprincipal;

import java.util.ArrayList;

import info.androidhive.materialdesign.R;

/**
 * Created by callisaya on 29/10/15.
 */
public class MenuprincipalAdapter  extends RecyclerView.Adapter<MenuprincipalAdapter.ViewHolder> {
    private static final String TAG = "MenuprincipalApdater";

    //private String[] mDataSet;
    private ArrayList<Menuprincipal> mDataSet;
    // BEGIN_INCLUDE(recyclerViewSampleViewHolder)
    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView titulo;
        private final ImageView imagenId;
        public ViewHolder(View v) {
            super(v);
            // Define click listener for the ViewHolder's View.
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try {
                        ((MainActivity)v.getContext()).displayView(getPosition());
                    } catch (Exception e) {
                        // ignore
                    }


                    Log.d(TAG, "Element " + getPosition() + " clicked.");



                }
            });


            titulo = (TextView) v.findViewById(R.id.mpTitulo);

            imagenId = (ImageView) v.findViewById(R.id.mpImagenView);
        }


        public TextView getTitulo() {
            return titulo;
        }
        public ImageView getImagenId(){
            return imagenId;
        }

    }
    // END_INCLUDE(recyclerViewSampleViewHolder)

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used by RecyclerView.
     */
    public MenuprincipalAdapter(ArrayList<Menuprincipal> dataSet) {
        mDataSet = dataSet;
    }

    // BEGIN_INCLUDE(recyclerViewOnCreateViewHolder)
    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.menuprincipal_row, viewGroup, false);

        return new ViewHolder(v);
    }
    // END_INCLUDE(recyclerViewOnCreateViewHolder)

    // BEGIN_INCLUDE(recyclerViewOnBindViewHolder)
    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");

        // Get element from your dataset at this position and replace the contents of the view
        // with that element
//        viewHolder.getTextView().setText(mDataSet.[position]);
        Log.d(TAG, "Descripcion " + mDataSet.get(position).getTitulo() + " set.");

        viewHolder.getTitulo().setText(mDataSet.get(position).getTitulo());
        viewHolder.getImagenId().setImageResource(mDataSet.get(position).getImagenId());

//        viewHolder.getTextView().setText(mDataSet.get(position));

    }
    // END_INCLUDE(recyclerViewOnBindViewHolder)

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
