package com.example.gyakorlo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String text;
    private int red;
    private int green;
    private int blue;
    EditText editText;
    Button nagyBetu;
    Button kisBetu;
    Button veletlenSzin;
    TextView megjelenit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.EditText);
        nagyBetu = (Button) findViewById(R.id.NagyBetus);
        kisBetu = (Button) findViewById(R.id.KisBetus);
        veletlenSzin = (Button) findViewById(R.id.VeletlenSzin);
        megjelenit = (TextView) findViewById(R.id.Megjelenit);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                text = editText.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        nagyBetu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                megjelenit.setText(text.toUpperCase());
            }
        });
    }
}