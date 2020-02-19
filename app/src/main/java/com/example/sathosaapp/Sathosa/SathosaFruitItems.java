package com.example.sathosaapp.Sathosa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.sathosaapp.R;
import com.example.sathosaapp.Utils.BottomNaviagtionViewHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SathosaFruitItems extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sathosa_fruit_items);

        bottomNavigationView = findViewById(R.id.bottomNavigationViewBar);
        bottomNavigation();
    }
    void bottomNavigation()
    {
        BottomNaviagtionViewHelper.enableNavigation(this, bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);
    }
}
