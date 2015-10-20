package com.jiangwenrou.app.clearableedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private EditText coupon_code, coupon_code0;
    private ImageView btn_clear, btn_clear0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coupon_code = (EditText) findViewById(R.id.coupon_code);
        btn_clear = (ImageView) findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coupon_code.setText("");
                //coupon_code.clearFocus();
            }
        });
        coupon_code.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() > 0) {
                    btn_clear.setVisibility(View.VISIBLE);
                } else {
                    btn_clear.setVisibility(View.GONE);
                }

            }
        });
        coupon_code.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!coupon_code.hasFocus()) {
                    btn_clear.setVisibility(View.GONE);
                } else if (coupon_code.length() > 0) {
                    btn_clear.setVisibility(View.VISIBLE);
                }
            }
        });

        coupon_code0 = (EditText) findViewById(R.id.coupon_code0);
        btn_clear0 = (ImageView) findViewById(R.id.btn_clear0);
        btn_clear0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coupon_code0.setText("");
                //coupon_code.clearFocus();
            }
        });
        coupon_code0.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() > 0) {
                    btn_clear0.setVisibility(View.VISIBLE);
                } else {
                    btn_clear0.setVisibility(View.GONE);
                }

            }
        });
        coupon_code0.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!coupon_code0.hasFocus()) {
                    btn_clear0.setVisibility(View.GONE);
                } else if (coupon_code0.length() > 0) {
                    btn_clear0.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
