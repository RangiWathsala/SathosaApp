package com.example.sathosaapp.Sathosa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.sathosaapp.R;
import com.example.sathosaapp.Utils.BottomNaviagtionViewHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SathosaGroceryItems extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    int i =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sathosa_grocery_items);

        Toast.makeText(this, "bla", Toast.LENGTH_LONG).show();


        bottomNavigationView = findViewById(R.id.bottomNavigationViewBar);
        bottomNavigation();
    }

    void bottomNavigation()
    {
        BottomNaviagtionViewHelper.enableNavigation(this, bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(i);
        menuItem.setChecked(true);
    }
}

