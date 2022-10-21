package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner spinner_LWV,spinner1,spinner2;
    List<String> mainList = new ArrayList<String>();
    List<String> lengthList = new ArrayList<String>();
    List<String> weightList = new ArrayList<String>();
    List<String> volumeList = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner_LWV = findViewById(R.id.spinner_LWV);
        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        mainList.add("Length");
        mainList.add("Weight");
        mainList.add("Volume");
        ArrayAdapter<String> adapter_LWV = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,mainList);
        spinner_LWV.setAdapter(adapter_LWV);
        //lengthList
        lengthList.add("Centimeter");
        lengthList.add("Meter");
        lengthList.add("Kilometer");
        //WeightList
        weightList.add("gram");
        weightList.add("Kilogram");
        weightList.add("Tonnes");
        //VolumeList
        volumeList.add("ml");
        volumeList.add("liter");
        volumeList.add("gallon");
        spinner_LWV.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    ArrayAdapter<String> adapter_length = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line,lengthList);
                    spinner1.setAdapter(adapter_length);
                    spinner2.setAdapter(adapter_length);
                }
                if(i==1){
                    ArrayAdapter<String> adapter_weight = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line,weightList);
                    spinner1.setAdapter(adapter_weight);
                    spinner2.setAdapter(adapter_weight);
                }
                if(i==2){
                    ArrayAdapter<String> adapter_volume = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line,volumeList);
                    spinner1.setAdapter(adapter_volume);
                    spinner2.setAdapter(adapter_volume);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}