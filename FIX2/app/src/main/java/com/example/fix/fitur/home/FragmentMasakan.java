package com.example.fix.fitur.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fix.R;
import com.example.fix.entity.Masakan;
import com.example.fix.fitur.home_detail.DetailMasakanActivity;
import com.example.fix.model.MainViewModel;


import java.util.ArrayList;


public class FragmentMasakan extends Fragment {

    private RecyclerView RV;
    private ArrayList<Masakan> listFromResource = new ArrayList<>();
    private ProgressBar progressBar;
    private GridHeroAdapter listContentAdapter;
    private MainViewModel mainViewModel;
    private String remote_url="http://192.168.43.107/resep/tampilsemua.php/";
    private String base_url="http://192.168.43.107/resep/";
    public FragmentMasakan(String s) {
        this.remote_url = s;
    }

    private void showLoading(Boolean state) {
        if (state) {
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v_show =  inflater.inflate(R.layout.fragment_masakan, container, false);

        progressBar = v_show.findViewById(R.id.progressBar);
        showLoading(true);

        mainViewModel = ViewModelProviders.of(getActivity()).get(MainViewModel.class);
        mainViewModel.setURL(remote_url);
        mainViewModel.getDatas().observe(getViewLifecycleOwner(),getDatas );
        mainViewModel.setDatas(getContext());

        listContentAdapter = new GridHeroAdapter(listFromResource);
        listContentAdapter.notifyDataSetChanged();

        RV = v_show.findViewById(R.id.rv_task);
//        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this.getActivity());
        GridLayoutManager mLayoutManager = new GridLayoutManager(this.getActivity(),2);
        RV.setLayoutManager(mLayoutManager);
        RV.setAdapter(listContentAdapter);

        listContentAdapter.setOnItemClickCallback(new GridHeroAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Masakan d) {
                Intent detail = new Intent(getActivity(), DetailMasakanActivity.class);
                detail.putExtra("masakan",d);
                startActivity(detail);
            }
        });
        return v_show;
    }

    private Observer<ArrayList<Masakan>> getDatas = new Observer<ArrayList<Masakan>>() {
        @Override
        public void onChanged(ArrayList<Masakan> dataItems) {
            if (dataItems != null) {
                listContentAdapter.setData(dataItems);
                showLoading(false);
            }
        }
    };
}