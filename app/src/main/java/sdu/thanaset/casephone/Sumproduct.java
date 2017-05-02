package sdu.thanaset.casephone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Sumproduct extends AppCompatActivity {

    ListView listView;

    private int[] ints = new int[]{R.drawable.iphone7plusa1,R.drawable.iphone7plus9,R.drawable.iphone7plus3,R.drawable.iphone7plus4,R.drawable.iphone7plus5,
                                   R.drawable.iphone6plusa,R.drawable.iphone6plusb,R.drawable.iphone6plusc,R.drawable.iphone6plusd,R.drawable.iphone6plusf,
                                   R.drawable.iphone5s1,R.drawable.iphone5s2,R.drawable.iphone5s3,R.drawable.iphone5s4,R.drawable.iphone5s5};
    private String[]  titleStrings,detailStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumproduct);

        listView = (ListView) findViewById(R.id.sumiphone);
        titleStrings = getResources().getStringArray(R.array.iphone);
        detailStrings = getResources().getStringArray(R.array.totaliphone);

        MyAdapter mydetailpro = new MyAdapter(Sumproduct.this,ints,titleStrings,detailStrings);
        listView.setAdapter(mydetailpro);
    }

    public void searchbnt (View view){
        Intent intent = new Intent(Sumproduct.this,Search.class);
        startActivity(intent);
    }
    public void homebnt (View view){
        Intent intent = new Intent(Sumproduct.this,Home.class);
        startActivity(intent);
    }
    public void highlightbtn (View view){
        Intent intent = new Intent(Sumproduct.this,Highlight.class);
        startActivity(intent);
    }
    public void basketbtn (View view){
        Intent intent = new Intent(Sumproduct.this,Basket.class);
        startActivity(intent);
    }
    public void paybtn (View view){
        Intent intent = new Intent(Sumproduct.this,Pay.class);
        startActivity(intent);
    }
}
