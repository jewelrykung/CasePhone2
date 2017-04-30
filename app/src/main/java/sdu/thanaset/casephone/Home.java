package sdu.thanaset.casephone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Home extends AppCompatActivity {

    ListView listView;
    private int[] ints =new int[]{R.drawable.huaweiaghjk,R.drawable.huaweiahgjk,R.drawable.huaweiahjkgl,R.drawable.huaweiajjf,
                                  R.drawable.huaweiasssdg,R.drawable.huaweiassss,R.drawable.huaweiassss,R.drawable.huaweiasssdg,
                                  R.drawable.huaweiajjf,R.drawable.huaweiahjkgl,R.drawable.huaweiahgjk,R.drawable.huaweiatryu,
                                  R.drawable.huaweiauti,R.drawable.huaweiauyi,R.drawable.huaweiazxcxvbvjm,R.drawable.huaweiawer,};

    private String[] titleStrings, detailStrings,shortStrings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //Initial view
        listView = (ListView) findViewById(R.id.liveTraffic);
        //get value
        titleStrings = getResources().getStringArray(R.array.title);
        detailStrings = getResources().getStringArray(R.array.detail);

        //Substring detailstring ตัดคำในส่วนของ detailstring เพื่อไม่มีข้อความไม่เกิน30 char
        // shortStrings = new String[detailStrings.length];//จอง พื้นที่ในหน่วยความจำ shortstring
        //for (int i=0;i<detailStrings.length;i++){
        //    shortStrings[i]=detailStrings[i].substring(0,29)+"...";
        // }//end for
        //create listview
        MyAdapter myAdapter = new MyAdapter(Home.this,ints,titleStrings,detailStrings);
        listView.setAdapter(myAdapter);

    }


   // public void searchbnt (View view){
     //   Intent intent = new Intent(Home.this,Search.class);
    //    startActivity(intent);
   // }
   // public void homebnt (View view){
    //    Intent intent = new Intent(Home.this,Home.class);
    //    startActivity(intent);
    //}
   // public void highlightbtn (View view){
    //    Intent intent = new Intent(Home.this,Highlight.class);
   //     startActivity(intent);
    //}
   // public void basketbtn (View view){
   //     Intent intent = new Intent(Home.this,Basket.class);
    //    startActivity(intent);
   // }
   // public void paybtn (View view){
   //     Intent intent = new Intent(Home.this,Pay.class);
   //     startActivity(intent);
   // }

  //  public void btnloginhome (View view){
   //     Intent intent = new Intent(Home.this,MainActivity.class);
   //     startActivity(intent);
   // }
}
