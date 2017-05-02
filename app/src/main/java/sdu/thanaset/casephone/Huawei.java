package sdu.thanaset.casephone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Huawei extends AppCompatActivity {

    ListView listView;
    private int[] ints =new int[]{R.drawable.huaweiaghjk,R.drawable.huaweiahgjk,R.drawable.huaweiahjkgl,R.drawable.huaweiajjf,
            R.drawable.huaweiasssdg,R.drawable.huaweiassss,R.drawable.huaweiassss,R.drawable.huaweiasssdg,
            R.drawable.huaweiajjf,R.drawable.huaweiahjkgl,R.drawable.huaweiahgjk,R.drawable.huaweiatryu,
            R.drawable.huaweiauti,R.drawable.huaweiauyi,R.drawable.huaweiazxcxvbvjm,R.drawable.huaweiawer,
    };
    private String[]  titleStrings,detailStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huawei);

        listView = (ListView) findViewById(R.id.huawei);
        titleStrings = getResources().getStringArray(R.array.title);
        detailStrings = getResources().getStringArray(R.array.totaliphone);

        MyAdapter mydetailpro = new MyAdapter(Huawei.this,ints,titleStrings,detailStrings);
        listView.setAdapter(mydetailpro);
    }
    public void searchbnt (View view){
        Intent intent = new Intent(Huawei.this,Search.class);
        startActivity(intent);
    }
    public void homebnt (View view){
        Intent intent = new Intent(Huawei.this,Home.class);
        startActivity(intent);
    }
    public void highlightbtn (View view){
        Intent intent = new Intent(Huawei.this,Highlight.class);
        startActivity(intent);
    }
    public void basketbtn (View view){
        Intent intent = new Intent(Huawei.this,Basket.class);
        startActivity(intent);
    }
    public void paybtn (View view){
        Intent intent = new Intent(Huawei.this,Pay.class);
        startActivity(intent);
    }
}
