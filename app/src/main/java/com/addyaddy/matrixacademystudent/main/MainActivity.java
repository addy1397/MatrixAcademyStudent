package com.addyaddy.matrixacademystudent.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.addyaddy.matrixacademystudent.R;
import com.addyaddy.matrixacademystudent.main.dashboard.DashboardFragment;
import com.addyaddy.matrixacademystudent.main.me.MeFragment;
import com.addyaddy.matrixacademystudent.main.resources.ResourcesFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_dashboard:
                    loadFragment(new DashboardFragment());
                    return true;
                case R.id.navigation_resources:
                    loadFragment(new ResourcesFragment());
                    return true;
                case R.id.navigation_me:
                    loadFragment(new MeFragment());
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        loadFragment(new DashboardFragment());

    }

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.mainFrameLayout, fragment);
        fragmentManager.popBackStackImmediate();
        transaction.commit();
    }
}
