package com.wordpress.lauromanoelpiresjr.contadordepessoas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnone, btntwo, btnthree, btnfour, btnfive, btnsix;

    int zerowoman = 0;
    int zerogirl = 0;
    int zerooldw = 0;
    int zeroadult = 0;
    int zerokids = 0;
    int zeroelderly = 0;
    int zeroman = 0;
    int zeroboy = 0;
    int zerooldm = 0;
    int zerofinal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incrementButtonOneQuantity();
        incrementButtonTwoQuantity();
        incrementButtonThreeQuantity();
        incrementButtonFourQuantity();
        incrementButtonFiveQuantity();
        incrementButtonSixQuantity();


    }


    //LB
    private void incrementButtonOneQuantity() {

        Button incrementButton = findViewById(R.id.btnone);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                zerowoman = zerowoman + 1;
                zeroadult = zeroadult + 1;
                zerofinal = zerofinal + 1;

                TextView quantityText = findViewById(R.id.zerowoman);
                TextView adultquantityText = findViewById(R.id.zeroadult);
                TextView finalquantityText = findViewById(R.id.zerofinal);
                quantityText.setText(String.valueOf(zerowoman));
                adultquantityText.setText(String.valueOf(zeroadult));
                finalquantityText.setText(String.valueOf(zerofinal));
            }
        });

    }

    private void incrementButtonTwoQuantity() {

        Button incrementButton = findViewById(R.id.btntwo);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                zerogirl = zerogirl + 1;
                zerokids = zerokids + 1;
                zerofinal = zerofinal + 1;

                TextView quantityText = findViewById(R.id.zerogirl);
                TextView kidsquantityText = findViewById(R.id.zerokids);
                TextView finalquantityText = findViewById(R.id.zerofinal);
                quantityText.setText(String.valueOf(zerogirl));
                kidsquantityText.setText(String.valueOf(zerokids));
                finalquantityText.setText(String.valueOf(zerofinal));
            }
        });

    }

    private void incrementButtonThreeQuantity() {

        Button incrementButton = findViewById(R.id.btnthree);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                zerooldw = zerooldw + 1;
                zeroelderly = zeroelderly + 1;
                zerofinal = zerofinal + 1;

                TextView quantityText = findViewById(R.id.zerooldw);
                TextView elderlyquantityText = findViewById(R.id.zeroelderly);
                TextView finalquantityText = findViewById(R.id.zerofinal);
                quantityText.setText(String.valueOf(zerooldw));
                elderlyquantityText.setText(String.valueOf(zeroelderly));
                finalquantityText.setText(String.valueOf(zerofinal));
            }
        });

    }

    //RB
    private void incrementButtonFourQuantity() {

        Button incrementButton = findViewById(R.id.btnfour);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                zeroman = zeroman + 1;
                zeroadult = zeroadult + 1;
                zerofinal = zerofinal + 1;

                TextView quantityText = findViewById(R.id.zeroman);
                TextView adultquantityText = findViewById(R.id.zeroadult);
                TextView finalquantityText = findViewById(R.id.zerofinal);
                quantityText.setText(String.valueOf(zeroman));
                adultquantityText.setText(String.valueOf(zeroadult));
                finalquantityText.setText(String.valueOf(zerofinal));
            }
        });

    }

    private void incrementButtonFiveQuantity() {

        Button incrementButton = findViewById(R.id.btnfive);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                zeroboy = zeroboy + 1;
                zerokids = zerokids + 1;
                zerofinal = zerofinal + 1;

                TextView quantityText = findViewById(R.id.zeroboy);
                TextView kidsquantityText = findViewById(R.id.zerokids);
                TextView finalquantityText = findViewById(R.id.zerofinal);
                quantityText.setText(String.valueOf(zeroboy));
                kidsquantityText.setText(String.valueOf(zerokids));
                finalquantityText.setText(String.valueOf(zerofinal));
            }
        });

    }

    private void incrementButtonSixQuantity() {

        Button incrementButton = findViewById(R.id.btnsix);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                zerooldm = zerooldm + 1;
                zeroelderly = zeroelderly + 1;
                zerofinal = zerofinal + 1;

                TextView quantityText = findViewById(R.id.zerooldm);
                TextView elderlyquantityText = findViewById(R.id.zeroelderly);
                TextView finalquantityText = findViewById(R.id.zerofinal);
                quantityText.setText(String.valueOf(zerooldm));
                elderlyquantityText.setText(String.valueOf(zeroelderly));
                finalquantityText.setText(String.valueOf(zerofinal));
            }
        });

    }


}
