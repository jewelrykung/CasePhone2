package sdu.thanaset.casephone;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Thanaset on 30/4/2560.
 */

public class MyAdapter extends BaseAdapter {

    //Explicit
    private Context highlight;
    private Context context;//,highlightt;
    private int [] ints ;
    private int [] intss;
    private String [] titleStrings,detailStrings;
    private String [] detailpro;

    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    public MyAdapter(Context highlightt, int[] intss, String[] detailpro) {
        this.highlight = highlightt;
        this.intss = intss;
        this.detailpro = detailpro;
    }


    @Override
    public int getCount( ) { //ใช้นับจำนวนข้อมูล แล้วส่งไป getview
        return ints.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {//รับจำนวนข้อมูลแล้วนำไปแสดงผลต่อบนหน้าเว็ป
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =layoutInflater.inflate(R.layout.phone,parent,false);//ของmylistview

        ImageView imageView = (ImageView) view.findViewById(R.id.imvIcon);
        TextView titletextView = (TextView) view.findViewById(R.id.txtTitleLiv);
        TextView detailtextView  = (TextView) view.findViewById(R.id.txtDetaiLiv);

        imageView.setImageResource(ints[position]);
        titletextView.setText(titleStrings[position]);
        detailtextView.setText(detailStrings[position]);



        //LayoutInflater layoutInflater1 = (LayoutInflater) highlight.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //View view1 = layoutInflater1.inflate(R.layout.product,parent,false);

        //ImageView imageView1 = (ImageView) view1.findViewById(R.id.imagepro);
        //TextView textView = (TextView) view1.findViewById(R.id.txtdetailproduct);

        //imageView1.setImageResource(intss[position]);
        //textView.setText(detailpro[position]);





        return view;
    }


} // main class
