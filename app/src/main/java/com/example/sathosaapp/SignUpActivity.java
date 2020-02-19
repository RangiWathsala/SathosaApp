package com.example.sathosaapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.sathosaapp.Sathosa.SathosaMilkItems;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;

public class SignUpActivity extends AppCompatActivity {

    int MY_REQUEST_CODE = 123;
    List<AuthUI.IdpConfig> providers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        FirebaseApp.initializeApp(this);

        providers = Arrays.asList(
                new AuthUI.IdpConfig.PhoneBuilder().build(),
                new AuthUI.IdpConfig.GoogleBuilder().build());

        showSingInOptions();
    }

    private void showSingInOptions()
    {
        startActivityForResult(
                AuthUI.getInstance().createSignInIntentBuilder()
                .setIsSmartLockEnabled(true)
                .setAvailableProviders(providers)
                .setTheme(R.style.SignUpTheme)
                .build(), MY_REQUEST_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == MY_REQUEST_CODE)
        {
            IdpResponse idpResponse = IdpResponse.fromResultIntent(data);

            if(resultCode == Activity.RESULT_OK)
            {
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                startActivity(new Intent(SignUpActivity.this, SathosaMilkItems.class));
                finish();
//                assert user != null;
//                Toast.makeText(this, " Welcome" + user.getDisplayName(), Toast.LENGTH_LONG).show();
            }
        }
    }
}
