package sdu.thanaset.casephone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class Highlight extends AppCompatActivity {

    //ListView listView,listView2,listView3,listView4;

    //private int[] ints = new int[]{R.drawable.iphone7plusa1};

   // private int[] intss = new int[]{R.drawable.not8a};
   // private int[] ints3 = new int[]{R.drawable.oppof1};
   // private int[] ints4 = new int[]{R.drawable.huaweiaghjk};



    //private String[]  titleStrings,detailStrings,titleStrings2,titleStrings3,titleStrings4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highlight);
        //Initial view
        //listView = (ListView) findViewById(R.id.livproduct);
        //listView2 = (ListView) findViewById(R.id.livproduct2);
        //listView3 = (ListView) findViewById(R.id.livproduct3);
        //listView4 = (ListView) findViewById(R.id.livproduct4);


        //get value

        //titleStrings = getResources().getStringArray(R.array.detailproduct);
        //titleStrings2 = getResources().getStringArray(R.array.detailproduct2);
        //titleStrings3 = getResources().getStringArray(R.array.detailproduct3);
        //titleStrings4 = getResources().getStringArray(R.array.detailproduct4);

        //detailStrings = getResources().getStringArray(R.array.detailproductblank);

        //Substring detailstring ตัดคำในส่วนของ detailstring เพื่อไม่มีข้อความไม่เกิน30 char
        //shortStrings = new String[titleStringss.length];//จอง พื้นที่ในหน่วยความจำ shortstring
        //for (int i = 0; i < titleStringss.length; i++) {
         //   shortStrings[i] = titleStringss[i].substring(0, 29) + "...";
       // }//end for
        //create listview
       // MyAdapter mydetailpro = new MyAdapter(Highlight.this,ints,titleStrings,detailStrings);
        //listView.setAdapter(mydetailpro);

       // MyAdapter mydetailpro2 = new MyAdapter(Highlight.this,intss,titleStrings2,detailStrings);
       // listView2.setAdapter(mydetailpro2);

       // MyAdapter mydetailpro3 = new MyAdapter(Highlight.this,ints3,titleStrings3,detailStrings);
       // listView3.setAdapter(mydetailpro3);

        //MyAdapter mydetailpro4 = new MyAdapter(Highlight.this,ints4,titleStrings4,detailStrings);
        //listView4.setAdapter(mydetailpro4);

    }

    public  void iphoneon (View view){
        Intent intent = new Intent(Highlight.this,Sumproduct.class);
        startActivity(intent);
    }
    public  void samsungon (View view){
        Intent intent = new Intent(Highlight.this,Samsung.class);
        startActivity(intent);
    }
    public  void oppoon (View view){
        Intent intent = new Intent(Highlight.this,Oppo.class);
        startActivity(intent);
    }

    public  void hueweion (View view){
        Intent intent = new Intent(Highlight.this,Huawei.class);
        startActivity(intent);
    }

    public void homebnt (View view){
      Intent intent = new Intent(Highlight.this,Home.class);
      startActivity(intent);
  }
    public  void  iphone (View view){
        Intent intent = new Intent(Highlight.this,Sumproduct.class);
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

