package com.example.haus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    TextView textView;
    Button but1;
    Button but2;
    Button but3;



    @Override
    protected void OnCreate(BundleSavedInstance){
        super.OnCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView = (TextView) findViewById(R.id.textView);
        But1 = (Button) findViewById(R.id.but1);
        But2 = (Button) findViewById(R.id.but2);
        But3 = (Button) findViewById(R.id.but2);


        But1.setOnClickListener (new View.OnClickListener(){

                @Override
                public void OnClick(View view){
                    textView.setText("Нажата кнопка 1");
                }

        });

        But2.setOnClickListener(this);
    }

    public void clickBut3(View view){
       textView.setText(" Нажата кнопка 3");

    }

@Override
    public void OnClick(View view){
        textView.setText("Нажата кнопка 2");
}

}

