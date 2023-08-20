package com.parmu.bhagvadgita.fragments;

import android.Manifest;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagvadgita.misc.RequestPermissions;
import com.parmu.bhagvadgita.misc.ShareAsBitmap;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class SlokaPagerFragment extends Fragment {

    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private FloatingActionButton fabPlayBtn;
    private boolean fileExist;
    private String fileName;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();
//
//    private static String KEY_ARGU_FILE_EXIST = "fileexist";
//    private static String KEY_ARGU_FILE_NAME = "filename";
//    private static String KEY_ARGU_SANSKRIT = "sanskrit";
//    private static String KEY_ARGU_BHAVARTH = "bhavarth";


    public SlokaPagerFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestPermissions = new RequestPermissions();
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_1, container, false);
        tvSanskrit = view.findViewById(R.id.sanskrit_1);
        tvBhavarth = view.findViewById(R.id.bhavarth_1);
        fabPlayBtn = view.findViewById(R.id.fabplaysound);

        assert getArguments() != null;
        tvSanskrit.setText(getArguments().getString("sanskrit"));
        tvBhavarth.setText(getArguments().getString("bhavarth"));
        fileExist = getArguments().getBoolean("fileexist");
        fileName = getArguments().getString("filename");
        checkIfFileExist();

        fabPlayBtn.setOnClickListener(view1 -> {
            try {
                ClassForCombinedMediaPlayer.playDisSound(getContext(),fileName,fabPlayBtn);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
           });
        return view;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.share_shlola && item.isEnabled()){
            item.setEnabled(false);
            timerForShareSloka(item);
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getContext());
            String adhyayNumber = String.valueOf(AdhyayFragment.getAdhyayNum());
            try {
                shareAsBitmap.share_bitMap_to_Apps(getContext(), tvSanskrit,tvBhavarth, adhyayNumber,"imgC"+adhyayNumber+"S"+AdhyayFragment.getPagerPositon());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        }
        return true;
    }
    private void checkIfFileExist(){

        if(!fileExist){
            fabPlayBtn.setImageResource(R.drawable.ic_baseline_arrow_downward_24);
        }
        else{
            fabPlayBtn.setImageResource(R.drawable.ic_baseline_volume_up_24);
        }
    }

    private void timerForShareSloka(@NonNull MenuItem item){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                requireActivity().runOnUiThread(() -> {
                    item.setEnabled(true);
                    timer.cancel();
                });
            }
        },3000);
    }
}
