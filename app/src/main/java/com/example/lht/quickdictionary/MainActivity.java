package com.example.lht.quickdictionary;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* final DrawerLayout mDrawerLayout = findViewById(R.id.dl_main_drawer);
        NavigationView navigationView = findViewById(R.id.nav_main_navigation);
        if (navigationView != null){
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    item.setChecked(true);
                    String title = item.getTitle().toString();
                    Toast.makeText(getApplicationContext(),title, Toast.LENGTH_SHORT).show();
                    //关闭导航菜单
                    mDrawerLayout.closeDrawers();
                    return true;
                }
            });
        }*/
    }
}
