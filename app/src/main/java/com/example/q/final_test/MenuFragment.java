package com.example.q.final_test;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MenuFragment extends Fragment {
    ArrayList<String> menu;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        menu= new ArrayList<>();
        menu.add("Add");
        menu.add("View");
        menu.add("Theme");

        final ArrayAdapter<String> menuAdapter = new ArrayAdapter<String>( //สร้าง adapter
                getActivity(), android.R.layout.simple_list_item_1, menu
        );

        ListView menuList = (ListView) getView().findViewById(R.id.menu_list);
        menuList.setAdapter(menuAdapter);

        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Log.d("MENU", "CLICK ON MENU = "+menu.get(i));

                if(menu.get(i).equals("Add")){
                    Log.d("USER", "GO TO ADD");
                }
                else if(menu.get(i).equals("View")){
                    Log.d("UESR", "GO TO VIEW");
                }
                else if(menu.get(i).equals("Theme")){
                    Log.d("USER", "GO TO THEME");
                }
            }
        });

    }
}
