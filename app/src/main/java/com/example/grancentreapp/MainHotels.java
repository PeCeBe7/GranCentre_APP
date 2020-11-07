package com.example.grancentreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainHotels extends AppCompatActivity implements View.OnClickListener {
    String id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hotels);
        Button bt_trucar = findViewById(R.id.trucar);
        Button bt_trucar1 = findViewById(R.id.trucar1);
        Button bt_trucar2 = findViewById(R.id.trucar2);
        Button bt_trucar3 = findViewById(R.id.trucar3);
        Button bt_trucar4 = findViewById(R.id.trucar4);
        Button bt_web = findViewById(R.id.web);
        Button bt_web1 = findViewById(R.id.web1);
        Button bt_web2 = findViewById(R.id.web2);
        Button bt_web3 = findViewById(R.id.web3);
        Button bt_web4 = findViewById(R.id.web4);
        bt_trucar.setOnClickListener(this);
        bt_trucar1.setOnClickListener(this);
        bt_trucar2.setOnClickListener(this);
        bt_trucar3.setOnClickListener(this);
        bt_trucar4.setOnClickListener(this);
        bt_web.setOnClickListener(this);
        bt_web1.setOnClickListener(this);
        bt_web2.setOnClickListener(this);
        bt_web3.setOnClickListener(this);
        bt_web4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Button bt = (Button) v;
        //id=getResources().getResourceEntryName(bt.getId());
        switch(bt.getId())
        {
            case R.id.trucar:
                callHotel("938700312");break;
            case R.id.trucar1:
                callHotel("938795100");break;
            case R.id.trucar2:
                callHotel("938792929");break;
            case R.id.trucar3:
                callHotel("938407132");break;
            case R.id.trucar4:
                callHotel("938794820");break;
            case R.id.trucar5:
                callHotel("938606688");break;
            case R.id.trucar6:
                callHotel("938796220");break;
            case R.id.web:
                enterWeb("https://hotelfondaeuropa.com");break;
            case R.id.web1:
                enterWeb("https://www.hotelgranollers.com");break;
            case R.id.web2:
                enterWeb("https://www.hoteliris.com");break;
            case R.id.web3:
                enterWeb("https://www.hotel-bb.com/es/hotel/barcelona-granollers");break;
            case R.id.web4:
                enterWeb("https://www.aparthotelateneavalles.com/es/");break;
            case R.id.web5:
                enterWeb("https://www.hotelh.es");break;
            case R.id.web6:
                enterWeb("https://www.hotelciutatgranollers.com");break;
        }
    }
    private void enterWeb(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
        startActivity(intent);
    }
    private void callHotel(String num)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+num));
        startActivity(intent);
    }
}