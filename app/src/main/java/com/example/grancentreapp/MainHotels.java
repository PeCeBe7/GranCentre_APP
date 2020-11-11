package com.example.grancentreapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.media.Image;
import android.media.Rating;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainHotels extends AppCompatActivity implements View.OnClickListener {
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hotels);
        ImageView iv1 = findViewById(R.id.img_fonda);
        ImageView iv2 = findViewById(R.id.img_granollers);
        ImageView iv3 = findViewById(R.id.img_iris);
        ImageView iv4 = findViewById(R.id.img_bib);
        ImageView iv5 = findViewById(R.id.img_atenea);
        ImageView iv6 = findViewById(R.id.img_h);
        ImageView iv7 = findViewById(R.id.img_ciutat);
        Button bt_trucar1 = findViewById(R.id.trucar1);
        Button bt_trucar2 = findViewById(R.id.trucar2);
        Button bt_trucar3 = findViewById(R.id.trucar3);
        Button bt_trucar4 = findViewById(R.id.trucar4);
        Button bt_trucar5 = findViewById(R.id.trucar5);
        Button bt_trucar6 = findViewById(R.id.trucar6);
        Button bt_trucar7 = findViewById(R.id.trucar7);
        Button bt_web1 = findViewById(R.id.web1);
        Button bt_web2 = findViewById(R.id.web2);
        Button bt_web3 = findViewById(R.id.web3);
        Button bt_web4 = findViewById(R.id.web4);
        Button bt_web5 = findViewById(R.id.web5);
        Button bt_web6 = findViewById(R.id.web6);
        Button bt_web7 = findViewById(R.id.web7);
        final RatingBar ratingBar3 = findViewById(R.id.desc1) ;
        LayerDrawable stars = (LayerDrawable) ratingBar3.getProgressDrawable();
        stars.getDrawable(0).setColorFilter(Color.LTGRAY, PorterDuff.Mode.SRC_ATOP);
        stars.getDrawable(2).setColorFilter(Color.rgb(255,201,14), PorterDuff.Mode.SRC_ATOP);
        stars.getDrawable(1).setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_ATOP);
        bt_trucar1.setOnClickListener(this);
        bt_trucar2.setOnClickListener(this);
        bt_trucar3.setOnClickListener(this);
        bt_trucar4.setOnClickListener(this);
        bt_trucar5.setOnClickListener(this);
        bt_trucar6.setOnClickListener(this);
        bt_trucar7.setOnClickListener(this);
        bt_web1.setOnClickListener(this);
        bt_web2.setOnClickListener(this);
        bt_web3.setOnClickListener(this);
        bt_web4.setOnClickListener(this);
        bt_web5.setOnClickListener(this);
        bt_web6.setOnClickListener(this);
        bt_web7.setOnClickListener(this);
        iv1.setOnClickListener(this);
        iv2.setOnClickListener(this);
        iv3.setOnClickListener(this);
        iv4.setOnClickListener(this);
        iv5.setOnClickListener(this);
        iv6.setOnClickListener(this);
        iv7.setOnClickListener(this);
    }

    @Override
    public void onClick(final View v) {
        if(v instanceof Button)
        {
            Button bt = (Button) v;
            switch(bt.getId())
            {
                case R.id.trucar1:
                    callHotel("938700312");break;
                case R.id.trucar2:
                    callHotel("938795100");break;
                case R.id.trucar3:
                    callHotel("938792929");break;
                case R.id.trucar4:
                    callHotel("938407132");break;
                case R.id.trucar5:
                    callHotel("938794820");break;
                case R.id.trucar6:
                    callHotel("938606688");break;
                case R.id.trucar7:
                    callHotel("938796220");break;
                case R.id.web1:
                    enterWeb("https://hotelfondaeuropa.com");break;
                case R.id.web2:
                    enterWeb("https://www.hotelgranollers.com");break;
                case R.id.web3:
                    enterWeb("https://www.hoteliris.com");break;
                case R.id.web4:
                    enterWeb("https://www.hotel-bb.com/es/hotel/barcelona-granollers");break;
                case R.id.web5:
                    enterWeb("https://www.aparthotelateneavalles.com/es/");break;
                case R.id.web6:
                    enterWeb("https://www.hotelh.es");break;
                case R.id.web7:
                    enterWeb("https://www.hotelciutatgranollers.com");break;
            }
        }
        else {
            if (v instanceof ImageView) {
                ImageView iv = (ImageView) v;
                switch (iv.getId()) {
                    case R.id.img_fonda:
                        localitzacio("geo:@41.6082916,2.2868614,17z");break;
                    case R.id.img_granollers:
                        localitzacio("geo:@41.594182,2.2812076,16z");break;
                    case R.id.img_iris:
                        localitzacio("geo:@41.6012923,2.2880538,17z");break;
                    case R.id.img_bib:
                        localitzacio("geo:@41.614031,2.2995126,16z");break;
                    case R.id.img_atenea:
                        localitzacio("geo:@41.5975141,2.2864746,16z");break;
                    case R.id.img_h:
                        localitzacio("geo:@41.5808675,2.281323,17z");break;
                    case R.id.img_ciutat:
                        localitzacio("geo:@41.600791,2.2939303,17z");break;
                }
            }

        }
    }
    private void localitzacio (String str) {
        Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse(str));
        startActivity(intent4);
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