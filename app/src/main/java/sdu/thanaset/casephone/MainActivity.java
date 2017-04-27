package sdu.thanaset.casephone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register (View view){
        Intent intent = new Intent(MainActivity.this,Register.class);
        startActivity(intent);

    }
    public void login (View view){
        Intent intent = new Intent(MainActivity.this,Home.class);
        startActivity(intent);


        }
    }
