package sdu.thanaset.casephone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Oppo extends AppCompatActivity {

    ListView listView;
    private int[] ints = new int[]{R.drawable.oppof1,R.drawable.oppof12,R.drawable.oppof13,R.drawable.oppof14,R.drawable.oppof15,
            R.drawable.oppof16,R.drawable.oppof17,R.drawable.oppof18,R.drawable.oppof10,R.drawable.oppof111,R.drawable.oppof112,R.drawable.oppof114};
    private String[]  titleStrings,detailStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oppo);

        listView = (ListView) findViewById(R.id.oppo);
        titleStrings = getResources().getStringArray(R.array.oppo);
        detailStrings = getResources().getStringArray(R.array.totaliphone);

        MyAdapter mydetailpro = new MyAdapter(Oppo.this,ints,titleStrings,detailStrings);
        listView.setAdapter(mydetailpro);
    }
    public void searchbnt (View view){
        Intent intent = new Intent(Oppo.this,Search.class);
        startActivity(intent);
    }
    public void homebnt (View view){
        Intent intent = new Intent(Oppo.this,Home.class);
        startActivity(intent);
    }
    public void highlightbtn (View view){
        Intent intent = new Intent(Oppo.this,Highlight.class);
        startActivity(intent);
    }
    public void basketbtn (View view){
        Intent intent = new Intent(Oppo.this,Basket.class);
        startActivity(intent);
    }
    public void paybtn (View view){
        Intent intent = new Intent(Oppo.this,Pay.class);
        startActivity(intent);
    }
}
