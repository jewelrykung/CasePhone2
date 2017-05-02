package sdu.thanaset.casephone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Samsung extends AppCompatActivity {
    ListView listView;
    private int[] ints = new int[]{R.drawable.not8a,R.drawable.not8b,R.drawable.note88c,R.drawable.note8d,R.drawable.not8f,
                                   R.drawable.not8g,R.drawable.note8h,R.drawable.note8i,R.drawable.note8j};
    private String[]  titleStrings,detailStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung);

        listView = (ListView) findViewById(R.id.sumsung);
        titleStrings = getResources().getStringArray(R.array.samsung);
        detailStrings = getResources().getStringArray(R.array.totaliphone);

        MyAdapter mydetailpro = new MyAdapter(Samsung.this,ints,titleStrings,detailStrings);
        listView.setAdapter(mydetailpro);


    }
    public void searchbnt (View view){
        Intent intent = new Intent(Samsung.this,Search.class);
        startActivity(intent);
    }
    public void homebnt (View view){
        Intent intent = new Intent(Samsung.this,Home.class);
        startActivity(intent);
    }
    public void highlightbtn (View view){
        Intent intent = new Intent(Samsung.this,Highlight.class);
        startActivity(intent);
    }
    public void basketbtn (View view){
        Intent intent = new Intent(Samsung.this,Basket.class);
        startActivity(intent);
    }
    public void paybtn (View view){
        Intent intent = new Intent(Samsung.this,Pay.class);
        startActivity(intent);
    }
}
