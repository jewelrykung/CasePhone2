package sdu.thanaset.casephone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
    }
    public void homebnt (View view){
        Intent intent = new Intent(Pay.this,Home.class);
        startActivity(intent);
    }
    public void searchbnt (View view) {
        Intent intent = new Intent(Pay.this, Search.class);
        startActivity(intent);
    }
    public void highlightbtn (View view){
        Intent intent = new Intent(Pay.this,Highlight.class);
        startActivity(intent);
    }
    public void basketbtn (View view){
        Intent intent = new Intent(Pay.this,Basket.class);
        startActivity(intent);
    }
    public void paybtn (View view){
        Intent intent = new Intent(Pay.this,Pay.class);
        startActivity(intent);
    }
}
