package com.example.sathosaapp.Utils;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import com.example.sathosaapp.R;
import com.example.sathosaapp.Sathosa.SathosaFruitItems;
import com.example.sathosaapp.Sathosa.SathosaGroceryItems;
import com.example.sathosaapp.Sathosa.SathosaMeatItems;
import com.example.sathosaapp.Sathosa.SathosaMilkItems;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNaviagtionViewHelper {

    public static void enableNavigation(final Context context, BottomNavigationView view)
    {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.milk:
                        Intent intent1 = new Intent(context, SathosaMilkItems.class);
                        ActivityOptions options1 = ActivityOptions.makeCustomAnimation(
                                context,
                                android.R.anim.fade_in,
                                android.R.anim.fade_out);
                        context.startActivity(intent1, options1.toBundle());
                        break;

                    case R.id.grocery:
                        Intent intent2 = new Intent(context, SathosaGroceryItems.class);
                        ActivityOptions options2 = ActivityOptions.makeCustomAnimation(
                                context,
                                android.R.anim.fade_in,
                                android.R.anim.fade_out);
                        context.startActivity(intent2, options2.toBundle());
                        break;

                    case R.id.fruits:
                        Intent intent3 = new Intent(context, SathosaFruitItems.class);
                        ActivityOptions options3 = ActivityOptions.makeCustomAnimation(
                                context,
                                android.R.anim.fade_in,
                                android.R.anim.fade_out);
                        context.startActivity(intent3, options3.toBundle());
                        break;

                    case R.id.meat:
                        Intent intent4 = new Intent(context, SathosaMeatItems.class);
                        ActivityOptions options4 = ActivityOptions.makeCustomAnimation(
                                context,
                                android.R.anim.fade_in,
                                android.R.anim.fade_out);
                        context.startActivity(intent4, options4.toBundle());
                        break;
                }
                return true;
            }
        });

    }


}
