package com.example.grancentreapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;


public class MainRestaurant extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13;

    //implements AdapterView.OnItemSelectedListener, View.OnClickListener
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_restaurant);
        card1 = findViewById(R.id.primer);
        card2 = findViewById(R.id.segon);
        card3 = findViewById(R.id.tercer);
        card4 = findViewById(R.id.quart);
        card5 = findViewById(R.id.cinque);
        card6 = findViewById(R.id.sise);
        card7 = findViewById(R.id.sete);
        card8 = findViewById(R.id.vuite);
        card9 = findViewById(R.id.nove);
        card10 = findViewById(R.id.deue);
        card11 = findViewById(R.id.onze);
        card12 = findViewById(R.id.dotze);
        card13 = findViewById(R.id.tretze);
        ImageView iv1 = findViewById(R.id.img_viena), iv2 = findViewById(R.id.img_naguabo), iv3 = findViewById(R.id.img_burger);
        ImageView iv4 = findViewById(R.id.img_atarasi), iv5 = findViewById(R.id.img_montagu), iv6 = findViewById(R.id.img_pizza);
        ImageView iv7 = findViewById(R.id.img_rajol), iv8 = findViewById(R.id.img_wagaya), iv9 = findViewById(R.id.img_gallegos);
        ImageView iv10 = findViewById(R.id.img_wok), iv11 = findViewById(R.id.img_pitapes), iv12 = findViewById(R.id.img_fosters);
        ImageView iv13 = findViewById(R.id.img_telepizza);
        Button bt_trucar1 = findViewById(R.id.trucar1), bt_trucar2 = findViewById(R.id.trucar2), bt_trucar3 = findViewById(R.id.trucar3);
        Button bt_trucar4 = findViewById(R.id.trucar4), bt_trucar5 = findViewById(R.id.trucar5), bt_trucar6 = findViewById(R.id.trucar6);
        Button bt_trucar7 = findViewById(R.id.trucar7);
        Button bt_trucar8 = findViewById(R.id.trucar8), bt_trucar9 = findViewById(R.id.trucar9);
        Button bt_trucar10 = findViewById(R.id.trucar10), bt_trucar11 = findViewById(R.id.trucar11), bt_trucar12 = findViewById(R.id.trucar12);
        Button bt_trucar13 = findViewById(R.id.trucar13);
        Button bt_web1 = findViewById(R.id.web1);
        Button bt_web2 = findViewById(R.id.web2);
        Button bt_web3 = findViewById(R.id.web3);
        Button bt_web4 = findViewById(R.id.web4);
        Button bt_web5 = findViewById(R.id.web5);
        Button bt_web6 = findViewById(R.id.web6);
        Button bt_web7 = findViewById(R.id.web7);
        Button bt_web8 = findViewById(R.id.web8);
        Button bt_web9 = findViewById(R.id.web9);
        Button bt_web10 = findViewById(R.id.web10);
        Button bt_web11 = findViewById(R.id.web11);
        Button bt_web12 = findViewById(R.id.web12);
        Button bt_web13 = findViewById(R.id.web13);
        pintarEstrellas();
        bt_trucar1.setOnClickListener(this);
        bt_trucar2.setOnClickListener(this);
        bt_trucar3.setOnClickListener(this);
        bt_trucar4.setOnClickListener(this);
        bt_trucar5.setOnClickListener(this);
        bt_trucar6.setOnClickListener(this);
        bt_trucar7.setOnClickListener(this);
        bt_trucar8.setOnClickListener(this);
        bt_trucar9.setOnClickListener(this);
        bt_trucar10.setOnClickListener(this);
        bt_trucar11.setOnClickListener(this);
        bt_trucar12.setOnClickListener(this);
        bt_trucar13.setOnClickListener(this);
        bt_web1.setOnClickListener(this);
        bt_web2.setOnClickListener(this);
        bt_web3.setOnClickListener(this);
        bt_web4.setOnClickListener(this);
        bt_web5.setOnClickListener(this);
        bt_web6.setOnClickListener(this);
        bt_web7.setOnClickListener(this);
        bt_web8.setOnClickListener(this);
        bt_web9.setOnClickListener(this);
        bt_web10.setOnClickListener(this);
        bt_web11.setOnClickListener(this);
        bt_web12.setOnClickListener(this);
        bt_web13.setOnClickListener(this);
        iv1.setOnClickListener(this);
        iv2.setOnClickListener(this);
        iv3.setOnClickListener(this);
        iv4.setOnClickListener(this);
        iv5.setOnClickListener(this);
        iv6.setOnClickListener(this);
        iv7.setOnClickListener(this);
        iv8.setOnClickListener(this);
        iv9.setOnClickListener(this);
        iv10.setOnClickListener(this);
        iv11.setOnClickListener(this);
        iv12.setOnClickListener(this);
        iv13.setOnClickListener(this);
        Spinner spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
    }

    private void pintarEstrellas() {
        final RatingBar ratingBar1 = findViewById(R.id.rat1);
        final RatingBar ratingBar2 = findViewById(R.id.rat2);
        final RatingBar ratingBar3 = findViewById(R.id.rat3);
        final RatingBar ratingBar4 = findViewById(R.id.rat4);
        final RatingBar ratingBar5 = findViewById(R.id.rat5);
        final RatingBar ratingBar6 = findViewById(R.id.rat6);
        final RatingBar ratingBar7 = findViewById(R.id.rat7);
        final RatingBar ratingBar8 = findViewById(R.id.rat8);
        final RatingBar ratingBar9 = findViewById(R.id.rat9);
        final RatingBar ratingBar10 = findViewById(R.id.rat10);
        final RatingBar ratingBar11 = findViewById(R.id.rat11);
        final RatingBar ratingBar12 = findViewById(R.id.rat12);
        final RatingBar ratingBar13 = findViewById(R.id.rat13);
        LayerDrawable stars1 = (LayerDrawable) ratingBar1.getProgressDrawable();
        LayerDrawable stars2 = (LayerDrawable) ratingBar2.getProgressDrawable();
        LayerDrawable stars3 = (LayerDrawable) ratingBar3.getProgressDrawable();
        LayerDrawable stars4 = (LayerDrawable) ratingBar4.getProgressDrawable();
        LayerDrawable stars5 = (LayerDrawable) ratingBar5.getProgressDrawable();
        LayerDrawable stars6 = (LayerDrawable) ratingBar6.getProgressDrawable();
        LayerDrawable stars7 = (LayerDrawable) ratingBar7.getProgressDrawable();
        LayerDrawable stars8 = (LayerDrawable) ratingBar8.getProgressDrawable();
        LayerDrawable stars9 = (LayerDrawable) ratingBar9.getProgressDrawable();
        LayerDrawable stars10 = (LayerDrawable) ratingBar10.getProgressDrawable();
        LayerDrawable stars11 = (LayerDrawable) ratingBar11.getProgressDrawable();
        LayerDrawable stars12 = (LayerDrawable) ratingBar12.getProgressDrawable();
        LayerDrawable stars13 = (LayerDrawable) ratingBar13.getProgressDrawable();
        stars1.getDrawable(2).setColorFilter(Color.rgb(255, 201, 14), PorterDuff.Mode.SRC_ATOP);
        stars2.getDrawable(2).setColorFilter(Color.rgb(255, 201, 14), PorterDuff.Mode.SRC_ATOP);
        stars3.getDrawable(2).setColorFilter(Color.rgb(255, 201, 14), PorterDuff.Mode.SRC_ATOP);
        stars4.getDrawable(2).setColorFilter(Color.rgb(255, 201, 14), PorterDuff.Mode.SRC_ATOP);
        stars5.getDrawable(2).setColorFilter(Color.rgb(255, 201, 14), PorterDuff.Mode.SRC_ATOP);
        stars6.getDrawable(2).setColorFilter(Color.rgb(255, 201, 14), PorterDuff.Mode.SRC_ATOP);
        stars7.getDrawable(2).setColorFilter(Color.rgb(255, 201, 14), PorterDuff.Mode.SRC_ATOP);
        stars8.getDrawable(2).setColorFilter(Color.rgb(255, 201, 14), PorterDuff.Mode.SRC_ATOP);
        stars9.getDrawable(2).setColorFilter(Color.rgb(255, 201, 14), PorterDuff.Mode.SRC_ATOP);
        stars10.getDrawable(2).setColorFilter(Color.rgb(255, 201, 14), PorterDuff.Mode.SRC_ATOP);
        stars11.getDrawable(2).setColorFilter(Color.rgb(255, 201, 14), PorterDuff.Mode.SRC_ATOP);
        stars12.getDrawable(2).setColorFilter(Color.rgb(255, 201, 14), PorterDuff.Mode.SRC_ATOP);
        stars13.getDrawable(2).setColorFilter(Color.rgb(255, 201, 14), PorterDuff.Mode.SRC_ATOP);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            card1.setVisibility(View.VISIBLE);
            card2.setVisibility(View.VISIBLE);
            card3.setVisibility(View.VISIBLE);
            card4.setVisibility(View.VISIBLE);
            card5.setVisibility(View.VISIBLE);
            card6.setVisibility(View.VISIBLE);
            card7.setVisibility(View.VISIBLE);
            card8.setVisibility(View.VISIBLE);
            card9.setVisibility(View.VISIBLE);
            card10.setVisibility(View.VISIBLE);
            card11.setVisibility(View.VISIBLE);
            card12.setVisibility(View.VISIBLE);
            card13.setVisibility(View.VISIBLE);
        } else if (position == 1) {
            card1.setVisibility(View.GONE);
            card2.setVisibility(View.VISIBLE);
            card3.setVisibility(View.GONE);
            card4.setVisibility(View.GONE);
            card5.setVisibility(View.GONE);
            card6.setVisibility(View.VISIBLE);
            card7.setVisibility(View.GONE);
            card8.setVisibility(View.GONE);
            card9.setVisibility(View.GONE);
            card10.setVisibility(View.GONE);
            card11.setVisibility(View.GONE);
            card12.setVisibility(View.GONE);
            card13.setVisibility(View.VISIBLE);
        } else if (position == 2) {
            card1.setVisibility(View.GONE);
            card2.setVisibility(View.GONE);
            card3.setVisibility(View.GONE);
            card4.setVisibility(View.VISIBLE);
            card5.setVisibility(View.GONE);
            card6.setVisibility(View.GONE);
            card7.setVisibility(View.GONE);
            card8.setVisibility(View.VISIBLE);
            card9.setVisibility(View.GONE);
            card10.setVisibility(View.VISIBLE);
            card11.setVisibility(View.GONE);
            card12.setVisibility(View.GONE);
            card13.setVisibility(View.GONE);
        } else if (position == 3) {
            card1.setVisibility(View.VISIBLE);
            card2.setVisibility(View.GONE);
            card3.setVisibility(View.VISIBLE);
            card4.setVisibility(View.GONE);
            card5.setVisibility(View.GONE);
            card6.setVisibility(View.GONE);
            card7.setVisibility(View.GONE);
            card8.setVisibility(View.GONE);
            card9.setVisibility(View.GONE);
            card10.setVisibility(View.GONE);
            card11.setVisibility(View.GONE);
            card12.setVisibility(View.GONE);
            card13.setVisibility(View.VISIBLE);
        } else if (position == 4) {
            card1.setVisibility(View.GONE);
            card2.setVisibility(View.GONE);
            card3.setVisibility(View.GONE);
            card4.setVisibility(View.GONE);
            card5.setVisibility(View.VISIBLE);
            card6.setVisibility(View.GONE);
            card7.setVisibility(View.VISIBLE);
            card8.setVisibility(View.GONE);
            card9.setVisibility(View.VISIBLE);
            card10.setVisibility(View.GONE);
            card11.setVisibility(View.VISIBLE);
            card12.setVisibility(View.GONE);
            card13.setVisibility(View.GONE);
        } else if (position == 5) {
            card1.setVisibility(View.GONE);
            card2.setVisibility(View.GONE);
            card3.setVisibility(View.GONE);
            card4.setVisibility(View.GONE);
            card5.setVisibility(View.GONE);
            card6.setVisibility(View.GONE);
            card7.setVisibility(View.GONE);
            card8.setVisibility(View.GONE);
            card9.setVisibility(View.VISIBLE);
            card10.setVisibility(View.GONE);
            card11.setVisibility(View.GONE);
            card12.setVisibility(View.GONE);
            card13.setVisibility(View.GONE);
        } else if (position == 6) {
            card1.setVisibility(View.GONE);
            card2.setVisibility(View.GONE);
            card3.setVisibility(View.GONE);
            card4.setVisibility(View.GONE);
            card5.setVisibility(View.GONE);
            card6.setVisibility(View.GONE);
            card7.setVisibility(View.GONE);
            card8.setVisibility(View.GONE);
            card9.setVisibility(View.GONE);
            card10.setVisibility(View.GONE);
            card11.setVisibility(View.GONE);
            card12.setVisibility(View.VISIBLE);
            card13.setVisibility(View.GONE);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        if (v instanceof Button) {
            Button bt = (Button) v;
            switch (bt.getId()) {
                case R.id.trucar1:
                    callHotel("938404156");
                    break;
                case R.id.trucar2:
                    callHotel("938707848");
                    break;
                case R.id.trucar3:
                    callHotel("938406885");
                    break;
                case R.id.trucar4:
                    callHotel("689875685");
                    break;
                case R.id.trucar5:
                    callHotel("930139114");
                    break;
                case R.id.trucar6:
                    callHotel("933607841");
                    break;
                case R.id.trucar7:
                    callHotel("931524656");
                    break;
                case R.id.trucar8:
                    callHotel("931583481");
                    break;
                case R.id.trucar9:
                    callHotel("938403039");
                    break;
                case R.id.trucar10:
                    callHotel("938468707");
                    break;
                case R.id.trucar11:
                    callHotel("938703162");
                    break;
                case R.id.trucar12:
                    callHotel("937815142");
                    break;
                case R.id.trucar13:
                    callHotel("938793336");
                    break;
                case R.id.web1:
                    enterWeb("https://www.viena.es");
                    break;
                case R.id.web2:
                    enterWeb("https://www.naguabo.cat");
                    break;
                case R.id.web3:
                    enterWeb("https://www.burgerking.es");
                    break;
                case R.id.web4:
                    enterWeb("https://www.atarasiisushi.cat");
                    break;
                case R.id.web5:
                    enterWeb("https://www.montagugranollers.com");
                    break;
                case R.id.web6:
                    enterWeb("https://www.pizzeria1900.cat");
                    break;
                case R.id.web7:
                    enterWeb("https://www.elrajol.es");
                    break;
                case R.id.web8:
                    enterWeb("https://www.wagaya.es");
                    break;
                case R.id.web9:
                    enterWeb("https://www.osgalegos.com");
                    break;
                case R.id.web10:
                    enterWeb("https://www.chequerestaurante.com/cheque/granollers/wok-158");
                    break;
                case R.id.web11:
                    enterWeb("https://www.fostershollywood.es");
                    break;
                case R.id.web12:
                    enterWeb("https://www.pitapes.cat/");
                    break;
                case R.id.web13:
                    enterWeb("https://www.telepizza.es");
                    break;
            }
        } else if (v instanceof ImageView) {
            ImageView iv = (ImageView) v;
            switch (iv.getId()) {
                case R.id.img_viena:
                    localitzacio("geo:41.611671,2.3014409,17z");
                    break;
                case R.id.img_naguabo:
                    localitzacio("geo:41.609842,2.2869893,17z");
                    break;
                case R.id.img_burger:
                    localitzacio("geo:41.6098767,2.2716684,14z");
                    break;
                case R.id.img_atarasi:
                    localitzacio("geo:41.6098529,2.2872166,17z");
                    break;
                case R.id.img_montagu:
                    localitzacio("geo:41.6109199,2.2893636,21z");
                    break;
                case R.id.img_pizza:
                    localitzacio("geo:41.6103098,2.302557,21z");
                    break;
                case R.id.img_rajol:
                    localitzacio("geo:41.6081423,2.2889042,21z");
                    break;
                case R.id.img_wagaya:
                    localitzacio("geo:41.6102037,2.2908371,21z");
                    break;
                case R.id.img_gallegos:
                    localitzacio("geo:41.6176084,2.2924514,21z");
                    break;
                case R.id.img_wok:
                    localitzacio("geo:41.5993707,2.2767628,21z");
                    break;
                case R.id.img_pitapes:
                    localitzacio("geo:41.605491,2.28621,21z");
                    break;
                case R.id.img_fosters:
                    localitzacio("geo:41.6096999,2.3028802,21z");
                    break;
                case R.id.img_telepizza:
                    localitzacio("geo:41.6089511,2.2845576,21z");
                    break;
            }
        }
    }

    private void localitzacio(String str) {
        Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse(str));
        startActivity(intent4);
    }

    private void enterWeb(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    private void callHotel(String num) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + num));
        startActivity(intent);
    }
}