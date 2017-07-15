package com.example.havoc.custombottomnavigationtemplet.Activtiy;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.havoc.custombottomnavigationtemplet.BottomNavigationHelper.BottomNavigationViewHelper;
import com.example.havoc.custombottomnavigationtemplet.Fragment.HomeFragment;
import com.example.havoc.custombottomnavigationtemplet.Fragment.LibraryFragment;
import com.example.havoc.custombottomnavigationtemplet.Fragment.SubscriptionFragment;
import com.example.havoc.custombottomnavigationtemplet.Fragment.TrendingFragment;
import com.example.havoc.custombottomnavigationtemplet.R;

public class MainActivity extends AppCompatActivity {



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    selectedFragment=HomeFragment.newInstance();
                    break;
                case R.id.navigation_trending:
                    selectedFragment= TrendingFragment.newInstance();
                    break;
                case R.id.navigation_subs:
                    selectedFragment= SubscriptionFragment.newInstance();
                    break;
                case R.id.navigation_library:
                    selectedFragment= LibraryFragment.newInstance();
                    break;

            }
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.content, selectedFragment);
            transaction.commit();
            return true;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //removing the animation in bottom navigation
        BottomNavigationViewHelper.removeShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //Manually displaying the first fragment - one time only
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content, HomeFragment.newInstance());
        transaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.upload){


        }else if (item.getItemId()==R.id.search){


        }
        return super.onOptionsItemSelected(item);
    }
}
