package com.example.adasapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView left_signal, right_signal, collision_warnning;

    FloatingActionButton dropdown, dropdown2, but1, but2, but3, but4, but5, but6, but7;
    Float translationY = 100f;
    Boolean isMenuOpen = false;
    OvershootInterpolator interpolator = new OvershootInterpolator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);
        initFabMenu();



        left_signal = findViewById(R.id.left_signal);
        Animation left_Animation = new AlphaAnimation(1, 0);
        left_Animation.setDuration(400);
        left_Animation.setRepeatCount(Animation.INFINITE);
        left_Animation.setRepeatMode(Animation.REVERSE);
        left_signal.startAnimation(left_Animation);

        right_signal = findViewById(R.id.right_signal);
        Animation right_Animation = new AlphaAnimation(1, 0);
        right_Animation.setDuration(400);
        right_Animation.setRepeatCount(Animation.INFINITE);
        right_Animation.setRepeatMode(Animation.REVERSE);
        right_signal.startAnimation(right_Animation);

        collision_warnning = findViewById(R.id.collision);
        Animation collision_Animation = new AlphaAnimation(1, 0);
        collision_Animation.setDuration(700);
        collision_Animation.setRepeatCount(Animation.INFINITE);
        collision_Animation.setRepeatMode(Animation.REVERSE);
        collision_warnning.startAnimation(collision_Animation);
    }
    private void initFabMenu()
    {
        dropdown = findViewById(R.id.dropdown);
        dropdown2 = findViewById(R.id.dropdown2);
        but1 = findViewById(R.id.but1);
        but2 = findViewById(R.id.but2);
        but3 = findViewById(R.id.but3);
        but4 = findViewById(R.id.but4);
        but5 = findViewById(R.id.but5);
        but6 = findViewById(R.id.but6);
        but7 = findViewById(R.id.but7);

        but1.setAlpha(0f);
        but2.setAlpha(0f);
        but3.setAlpha(0f);
        but4.setAlpha(0f);
        but5.setAlpha(0f);
        but6.setAlpha(0f);
        but7.setAlpha(0f);

        but1.setTranslationY(translationY);
        but2.setTranslationY(translationY);
        but3.setTranslationY(translationY);
        but4.setTranslationY(translationY);
        but5.setTranslationY(translationY);
        but6.setTranslationY(translationY);
        but7.setTranslationY(translationY);

        dropdown.setOnClickListener(this);
        dropdown2.setOnClickListener(this);
        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
        but3.setOnClickListener(this);
        but4.setOnClickListener(this);
        but5.setOnClickListener(this);
        but6.setOnClickListener(this);
        but7.setOnClickListener(this);

    }

    private void openMenu() {
        isMenuOpen = !isMenuOpen;
        dropdown.animate().setInterpolator(interpolator).rotationBy(180f).setDuration(300).start();
        but4.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        but5.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        but6.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        but7.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
    }

    private void openMenu2() {
        isMenuOpen = !isMenuOpen;
        dropdown2.animate().setInterpolator(interpolator).rotationBy(180f).setDuration(300).start();
        but1.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        but2.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        but3.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
    }
    private  void closeMenu(){
        isMenuOpen = !isMenuOpen;
        dropdown.animate().setInterpolator(interpolator).rotationBy(180f).setDuration(300).start();
        but4.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        but5.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        but6.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        but7.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
    }
    private void closeMenu2(){
        dropdown2.animate().setInterpolator(interpolator).rotationBy(180f).setDuration(300).start();
        but1.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        but2.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        but3.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.dropdown2:
                if(isMenuOpen){
                    closeMenu2();
                }
                else {
                    openMenu2();
                }
                break;

            case R.id.but1:
                break;
            case R.id.but2:
                startActivity(new Intent(MainActivity.this, Pop1.class));
                break;
            case R.id.but3:
                startActivity(new Intent(MainActivity.this, Pop2.class));
                break;
        }

        switch (v.getId()) {
            case R.id.dropdown:
                if(isMenuOpen){
                    closeMenu();
                }
                else{
                    openMenu();
                }
                break;

            case R.id.but4:
                startActivity(new Intent(MainActivity.this, Pop3.class));
                break;
            case R.id.but5:
                break;
            case R.id.but6:
                startActivity(new Intent(MainActivity.this, Pop4.class));
                break;
            case R.id.but7:
                startActivity(new Intent(MainActivity.this, Pop5.class));
                break;

        }

    }
}