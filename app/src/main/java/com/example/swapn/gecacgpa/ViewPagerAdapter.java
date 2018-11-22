package com.example.swapn.gecacgpa;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter{


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if(position ==0){

            CbcsMech objCbcsMech  = new CbcsMech();
            return objCbcsMech;
        }
        else
        {
            OldMech objoldMech = new OldMech();
            return objoldMech;
        }
        /*position = position + 1;
        Bundle bundle = new Bundle();
        bundle.putString("message","Fragement"+position);
        objCbcsMech.setArguments(bundle);*/

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position = position +1;
        if(position==1){
            return "CBCS";
        }
        else
        {
            return "NonCBCS";
        }

    }
}
