package sdu.thanaset.casephone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }
    public void searchbnt (View view){
        Intent intent = new Intent(Home.this,Search.class);
        startActivity(intent);
    }
    public void homebnt (View view){
        Intent intent = new Intent(Home.this,Home.class);
        startActivity(intent);
    }
    public void highlightbtn (View view){
        Intent intent = new Intent(Home.this,Highlight.class);
        startActivity(intent);
    }
    public void basketbtn (View view){
        Intent intent = new Intent(Home.this,Basket.class);
        startActivity(intent);
    }
    public void paybtn (View view){
        Intent intent = new Intent(Home.this,Pay.class);
        startActivity(intent);
    }

    public void btnloginhome (View view){
        Intent intent = new Intent(Home.this,MainActivity.class);
        startActivity(intent);
    }
}
