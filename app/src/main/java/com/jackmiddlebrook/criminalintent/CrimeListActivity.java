package com.jackmiddlebrook.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Activity class for the CrimeList Fragment
 * Created by jack on 9/25/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
