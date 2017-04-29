package sdu.thanaset.casephone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Highlight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highlight);
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
