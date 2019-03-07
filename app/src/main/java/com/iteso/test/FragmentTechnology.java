package com.iteso.test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iteso.test.beans.ItemProducts;

import java.util.ArrayList;

public class FragmentTechnology extends Fragment {

    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public FragmentTechnology() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_technology, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fragment_technology_recycler_view);

        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);

        ArrayList<ItemProducts> myDataSet = new ArrayList<ItemProducts>();
        ItemProducts alienware = new ItemProducts();
        ItemProducts mac = new ItemProducts();

        alienware.setTitle(getString(R.string.alienware_title)+"");
        alienware.setStore(getString(R.string.alienware_store)+"");
        alienware.setLocation(getString(R.string.alienware_location)+"");
        alienware.setPhone(getString(R.string.alienware_phone)+"");
        alienware.setImage( Integer.parseInt(getString(R.string.alienware_image)));
        alienware.setDescription(getString(R.string.alienware_description)+"");

        mac.setTitle(getString(R.string.mac_title)+"");
        mac.setStore(getString(R.string.mac_store)+"");
        mac.setLocation(getString(R.string.mac_location)+"");
        mac.setPhone(getString(R.string.mac_phone)+"");
        mac.setImage( Integer.parseInt(getString(R.string.mac_image)));
        mac.setDescription(getString(R.string.mac_description)+"");

        myDataSet.add(alienware);
        myDataSet.add(mac);
        mAdapter = new AdapterProduct(myDataSet,getActivity());
        recyclerView.setAdapter(mAdapter);

        return view;
    }
}
