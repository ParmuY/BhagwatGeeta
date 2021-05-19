package com.parmu.bhagvadgita.fragments;


import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.misc.RecycleViewAdapter;
import com.parmu.bhagvadgita.misc.RecycleViewItem;
import java.util.ArrayList;

public class ListViewFragment extends Fragment {
    ArrayList<RecycleViewItem> recycleViewItemList;
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecycleViewAdapter recycleViewAdapter;

    public ListViewFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @SuppressLint("RestrictedApi")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootListViewFrag = inflater.inflate(R.layout.fragment_list_view, container, false);
        ActionBar actionBar = ((AppCompatActivity) requireActivity()).getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("अध्याय");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_hamburger_menu);
        mRecyclerView = rootListViewFrag.findViewById(R.id.recycler_view);
        arrayListForRecyclerView();
        configForRecyclerView();
        return rootListViewFrag;
    }


    private void arrayListForRecyclerView(){
        recycleViewItemList = new ArrayList<>();
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon1,"अर्जुनविषाद योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon2,"सांख्य योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon3,"कर्म योग "));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon4,"ज्ञानकर्मसंन्यास योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon5,"कर्मसंन्यास योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon6,"आत्मसंयम योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon7,"ज्ञानविज्ञान योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon8,"अक्षरब्रह्म योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon9,"राजविद्याराजगुह्य योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon10,"विभूतियोग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon11,"विश्वरूपदर्शन योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon12,"भक्ति योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon13,"क्षेत्र-क्षेत्रज्ञविभागयोग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon14,"गुणत्रयविभाग योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon15,"पुरुषोत्तम योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon16,"दैवासुरसम्पद्विभाग योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon17,"श्रद्धात्रयविभाग योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon18,"मोक्षसंन्यास योग"));
    }
    private void configForRecyclerView(){

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        recycleViewAdapter = new RecycleViewAdapter(recycleViewItemList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(recycleViewAdapter);
        recycleViewAdapter.setOnItemClickListener(position -> {
            if(position==0) {
                Bundle bundle1 = new Bundle();
                bundle1.putString("adhyayname", "adhyay1");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view, AdhyayFragment.class, bundle1, "adhyay1")
                        .addToBackStack("adhyay1")
                        .commit();
            }
            else if(position==1) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("adhyayname","adhyay2");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle2,"adhyay2")
                        .addToBackStack("adhyay")
                        .commit();
            }
            else if(position==2) {
                Bundle bundle3 = new Bundle();
                bundle3.putString("adhyayname","adhyay3");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle3,"adhyay3")
                        .addToBackStack("adhyay")
                        .commit();
            }
            else if(position==3) {
                Bundle bundle4 = new Bundle();
                bundle4.putString("adhyayname","adhyay3");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle4,"adhyay4")
                        .addToBackStack("adhyay")
                        .commit();
            }
            else if(position==4) {
                Bundle bundle5 = new Bundle();
                bundle5.putString("adhyayname","adhyay5");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle5,"adhyay5")
                        .addToBackStack("adhyay")
                        .commit();
            }
            else if(position==5) {
                Bundle bundle6 = new Bundle();
                bundle6.putString("adhyayname","adhyay6");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle6,"adhyay6")
                        .addToBackStack("adhyay")
                        .commit();
            }
            else if(position==6) {
                Bundle bundle7 = new Bundle();
                bundle7.putString("adhyayname","adhyay7");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle7,"adhyay7")
                        .addToBackStack("adhyay")
                        .commit();
            }
            else if(position==7) {
                Bundle bundle8 = new Bundle();
                bundle8.putString("adhyayname","adhyay8");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle8,"adhyay8")
                        .addToBackStack("adhyay")
                        .commit();
            }
            else if(position==8) {
                Bundle bundle9 = new Bundle();
                bundle9.putString("adhyayname","adhyay9");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle9,"adhyay9")
                        .addToBackStack("adhyay")
                        .commit();
            }
            else if(position==9) {
                Bundle bundle10 = new Bundle();
                bundle10.putString("adhyayname","adhyay10");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle10,"adhyay10")
                        .addToBackStack("adhyay")
                        .commit();
            }
            else if(position==10) {
                Bundle bundle11 = new Bundle();
                bundle11.putString("adhyayname","adhyay11");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle11,"adhyay11")
                        .addToBackStack("adhyay")
                        .commit();
            }
            else if(position==11) {
                Bundle bundle12 = new Bundle();
                bundle12.putString("adhyayname","adhyay12");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle12,"adhyay12")
                        .addToBackStack("adhyay")
                        .commit();
            }
            else if(position==12) {
                Bundle bundle13 = new Bundle();
                bundle13.putString("adhyayname","adhyay13");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle13,"adhyay13")
                        .addToBackStack("adhyay")
                        .commit();
            }
            else if(position==13) {
                Bundle bundle14 = new Bundle();
                bundle14.putString("adhyayname","adhyay14");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle14,"adhyay14")
                        .addToBackStack("adhyay")
                        .commit();
            }
            else if(position==14) {
                Bundle bundle15 = new Bundle();
                bundle15.putString("adhyayname","adhyay15");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle15,"adhyay15")
                        .addToBackStack("adhyay")
                        .commit();
            }
            else if(position==15) {
                Bundle bundle16 = new Bundle();
                bundle16.putString("adhyayname","adhyay16");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle16,"adhyay16")
                        .addToBackStack("adhyay")
                        .commit();
            }
            else if(position==16) {
                Bundle bundle17 = new Bundle();
                bundle17.putString("adhyayname","adhyay17");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle17,"adhyay17")
                        .addToBackStack("adhyay")
                        .commit();
            }
            else if(position==17) {
                Bundle bundle18 = new Bundle();
                bundle18.putString("adhyayname","adhyay18");
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.frag_container_list_view,AdhyayFragment.class,bundle18,"adhyay18")
                        .addToBackStack("adhyay")
                        .commit();
            }
        });
    }
}