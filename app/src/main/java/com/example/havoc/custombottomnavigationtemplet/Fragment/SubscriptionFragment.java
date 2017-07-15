package com.example.havoc.custombottomnavigationtemplet.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.havoc.custombottomnavigationtemplet.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SubscriptionFragment extends Fragment {


    public static SubscriptionFragment newInstance() {

        SubscriptionFragment fragment= new SubscriptionFragment();
        return fragment;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_subscription, container, false);
    }

}
