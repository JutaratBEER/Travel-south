package ice_pbru.aupan.jutarat.travelsouth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView tittleTextView, detailTextView;
    private ImageView travelsouthImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind widget
        bindWidget();

        //show View
        showView();




    }//Main method

    private void showView() {

        String strTitle = getIntent().getStringExtra("Title");
        int intIcon = getIntent().getIntExtra("Image", R.drawable.lawlang_01);
        int intIndex = getIntent().getIntExtra("Index", 0);

        tittleTextView.setText(strTitle);
        travelsouthImageView.setImageResource(intIcon);

        String[] strDetail = getResources().getStringArray(R.array.travelsouth);
        detailTextView.setText(strDetail[intIndex]);



    }//show view

    private void bindWidget() {

        tittleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        travelsouthImageView = (ImageView) findViewById(R.id.imageView2);



    }//bind widget


}//Main Class
