package sdu.thanaset.casephone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Highlight extends AppCompatActivity {

    ListView listView;
    private int[] ints = new int[]{R.drawable.iphone7plusa1,R.drawable.iphone6plusa,R.drawable.iphone5s1,
                                  R.drawable.not8a,R.drawable.samsungj71,R.drawable.huaweiaghjk};

    private String[]  titleStrings,detailStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highlight);
        //Initial view
        listView = (ListView) findViewById(R.id.livproduct);
        //get value

        titleStrings = getResources().getStringArray(R.array.detailproduct);
        detailStrings = getResources().getStringArray(R.array.detailproductblank);

        //Substring detailstring ตัดคำในส่วนของ detailstring เพื่อไม่มีข้อความไม่เกิน30 char
        //shortStrings = new String[titleStringss.length];//จอง พื้นที่ในหน่วยความจำ shortstring
        //for (int i = 0; i < titleStringss.length; i++) {
         //   shortStrings[i] = titleStringss[i].substring(0, 29) + "...";
       // }//end for
        //create listview
        MyAdapter mydetailpro = new MyAdapter(Highlight.this,ints,titleStrings,detailStrings);
        listView.setAdapter(mydetailpro);

    }


    public void homebnt (View view){
      Intent intent = new Intent(Highlight.this,Home.class);
      startActivity(intent);
  }
      public void searchbnt (View view) {
          Intent intent = new Intent(Highlight.this, Search.class);
          startActivity(intent);
      }
      public void highlightbtn (View view){
          Intent intent = new Intent(Highlight.this,Highlight.class);
          startActivity(intent);
      }
      public void basketbtn (View view){
          Intent intent = new Intent(Highlight.this,Basket.class);
          startActivity(intent);
      }
      public void paybtn (View view){
          Intent intent = new Intent(Highlight.this,Pay.class);
          startActivity(intent);
      }
}

