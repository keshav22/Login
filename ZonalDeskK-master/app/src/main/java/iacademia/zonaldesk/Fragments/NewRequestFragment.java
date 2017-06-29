package iacademia.zonaldesk.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import iacademia.zonaldesk.GridAdapter;
import iacademia.zonaldesk.Queryform;
import iacademia.zonaldesk.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewRequestFragment extends android.app.Fragment {


    public NewRequestFragment() {

    }
        // Required empty public constructor


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.frag_new_req, container, false);
        return rootView;


    }
}
