package com.example.aprendiendolsm.controladorCalendario;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagerController1 extends FragmentPagerAdapter {
    int numOftaps;

    public PagerController1(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numOftaps = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new DiasSemana();
            case 1:
                return new Meses();
            case 2:
                return new Estaciones();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOftaps;
    }
}
