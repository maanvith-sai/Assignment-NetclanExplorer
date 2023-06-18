package com.maanvith.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.slider.Slider;
import com.google.android.material.slider.LabelFormatter;
public class refineScreen extends AppCompatActivity {

    TextView textView1, textView2, textViewFinal, textViewcount;
    EditText editTextStatus;

    String[] dropdownItems = {"Available | Hey Let Us Connect", "Away | Stay Discreet And Watch", "Busy | Do Not Disturb | Will Catch Up Later", "SOS | Emergency! Need Assistance! HELP"};
    private TextView labelText;
    Button button1,button2,button3,button4,button5,button6,button7,button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine_screen);

        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

        textViewFinal = findViewById(R.id.textViewFinalCount);
        textViewcount = findViewById(R.id.textViewCount);

        editTextStatus = findViewById(R.id.editTextStatus);

        editTextStatus.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String s = editTextStatus.getText().toString();
                int num = s.length();
                if(num<=250){
                    textViewcount.setText(""+(int)num);
                }
                else{
                    textViewcount.setTextColor(Color.RED);
                    textViewcount.setText(""+(int)num);
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setBackgroundColor(getResources().getColor(R.color.toolbar));
        getWindow().setStatusBarColor(getResources().getColor(R.color.status));

        toolbar.setNavigationIcon(R.drawable.ic_back_arrow);
        setTitle("Refine");


        toolbar.setNavigationOnClickListener(v -> onBackPressed());

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, dropdownItems);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = spinner.getItemAtPosition(position).toString();
                // Handle the selected item
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Handle the case when no item is selected
            }
        });
        Slider slider = findViewById(R.id.slider);
        //labelText = findViewById(R.id.labelText);

        button1 =findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setBackgroundColor(getResources().getColor(R.color.blue));
                button1.setTextColor(getResources().getColor(android.R.color.white));
            }
        });
        button2 =findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2.setBackgroundColor(getResources().getColor(R.color.blue));
                button2.setTextColor(getResources().getColor(android.R.color.white));
            }
        });
        button3 =findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3.setBackgroundColor(getResources().getColor(R.color.blue));
                button3.setTextColor(getResources().getColor(android.R.color.white));
            }
        });
        button4 =findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button4.setBackgroundColor(getResources().getColor(R.color.blue));
                button4.setTextColor(getResources().getColor(android.R.color.white));
            }
        });
        button5 =findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button5.setBackgroundColor(getResources().getColor(R.color.blue));
                button5.setTextColor(getResources().getColor(android.R.color.white));
            }
        });
        button6 =findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button6.setBackgroundColor(getResources().getColor(R.color.blue));
                button6.setTextColor(getResources().getColor(android.R.color.white));
            }
        });
        button7 =findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button7.setBackgroundColor(getResources().getColor(R.color.blue));
                button7.setTextColor(getResources().getColor(android.R.color.white));
            }
        });
        button8 =findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button8.setBackgroundColor(getResources().getColor(R.color.blue));
                button8.setTextColor(getResources().getColor(android.R.color.white));
            }
        });














    }
}