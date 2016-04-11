package ice_pbru.aupan.jutarat.travelsouth;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private Button AboutMeButton;
    private ListView travelsouth_Listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind widget
        bindWidget();

        buttonController();

        createListView();


    }//Main Method

    private void createListView() {
        final int[] intIcon = {R.drawable.lawlang_01, R.drawable.panyhi_02, R.drawable.lampomtaw_03, R.drawable.fantasy_04, R.drawable.hgi_05,
                R.drawable.lanta_06, R.drawable.kokao_07, R.drawable.tugboran_08, R.drawable.kainok_09, R.drawable.nangyan_10,
                R.drawable.pahgan_11, R.drawable.kradan_12, R.drawable.kowsog_13, R.drawable.payam_14, R.drawable.praboromtatchaiya_15,R.drawable.pukattrigai_16, R.drawable.sanbutterfly_17, R.drawable.samui_18, R.drawable.tachai_19, R.drawable.sannam_20};

        final String[] titleStrings = new String[20];
        titleStrings[0] = "เกาะเหลาเหลียง";
        titleStrings[1] = "เกาะปันหยี";
        titleStrings[2] = "แหลมพรหมเทพ";
        titleStrings[3] = "ภูเก็ตแฟนตาซี";
        titleStrings[4] = "เกาะไหง";
        titleStrings[5] = "เกาะลันตา";
        titleStrings[6] = "เกาะคอเขา";
        titleStrings[7] = "ตึกโบราณสถาปัตยกรรมแบบชิโน-โปรตุกีส เมืองเก่าภูเก็ต";
        titleStrings[8] = "เกาะไข่นอก";
        titleStrings[9] = "เกาะนางยวน";
        titleStrings[10] = "เกาะพะงัน";
        titleStrings[11] = "เกาะกระดาน";
        titleStrings[12] = "อุทยานแห่งชาติเขาสก";
        titleStrings[13] = "เกาะพยาม";
        titleStrings[14] = "วัดพระบรมธาตุไชยาราชวรวิหาร";
        titleStrings[15] = "ภูเก็ต ทริกอาย มิวเซียม ";
        titleStrings[16] = "สวนผีเสื้อและโลกแมลง ภูเก็ต ";
        titleStrings[17] = "เกาะสมุย";
        titleStrings[18] = "เกาะตาชัย";
        titleStrings[19] = "สวนน้ำ Splash Jungle";

        String[] detailStrings = getResources().getStringArray(R.array.detail_short);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, intIcon, titleStrings, detailStrings);
        travelsouth_Listview.setAdapter(myAdapter);

        travelsouth_Listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);

                intent.putExtra("Title", titleStrings[i]);
                intent.putExtra("Image", intIcon[i]);
                intent.putExtra("Index", i);

                startActivity(intent);
            }
        });


    }//create list view

    private void buttonController() {
        AboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://fongbeerza.wordpress.com/2014/05/21/%E0%B8%9B%E0%B8%A3%E0%B8%B0%E0%B8%A7%E0%B8%B1%E0%B8%95%E0%B8%B4%E0%B8%AA%E0%B9%88%E0%B8%A7%E0%B8%99%E0%B8%95%E0%B8%B1%E0%B8%A7-3/"));
                startActivity(intent);
            }
        });




    }//button controller

    private void bindWidget() {
        AboutMeButton = (Button) findViewById(R.id.button);
        travelsouth_Listview = (ListView) findViewById(R.id.listView);


    }//bind widget


}//Main Class

