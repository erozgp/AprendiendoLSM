package com.example.aprendiendolsm.controladorFrutasVerduras;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagerController2 extends FragmentPagerAdapter {
    int numOftabs;

    public PagerController2(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numOftabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Frutas();
            case 1:
                return new Verduras();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOftabs;
    }
}
