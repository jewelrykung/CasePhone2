package sdu.thanaset.casephone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }
    public void homebnt (View view){
        Intent intent = new Intent(Search.this,Home.class);
        startActivity(intent);
    }
    public void searchbnt (View view){
        Intent intent = new Intent(Search.this,Search.class);
        startActivity(intent);
    }
    public void highlightbtn (View view){
        Intent intent = new Intent(Search.this,Highlight.class);
        startActivity(intent);
    }
    public void basketbtn (View view){
        Intent intent = new Intent(Search.this,Basket.class);
        startActivity(intent);
    }
    public void paybtn (View view){
        Intent intent = new Intent(Search.this,Pay.class);
        startActivity(intent);
    }


}
