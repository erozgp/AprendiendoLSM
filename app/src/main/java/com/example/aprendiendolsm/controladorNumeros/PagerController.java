package com.example.aprendiendolsm.controladorNumeros;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {
    int numOftabs;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numOftabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new UnoADiez();
            case 1:
                return new Decenas();
            case 2:
                return new Cientos();
            case 3:
                return new Ordinales();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOftabs;
    }
}
