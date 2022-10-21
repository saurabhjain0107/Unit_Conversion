package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner_LWV,spinner1,spinner2;
    EditText textInput;
    Button button;
    TextView result;

    String[] mainList = new String[]{"Length","Weight","Volume"};
    String[] lengthList = new String[]{"Centimeter","meter","kilometer"};
    String[] weightList = new String[]{"gram","Kilogram","Tonnes"};
    String[] volumeList = new String[]{"milliliter","liter","gallon"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner_LWV = findViewById(R.id.spinner_LWV);
        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        textInput = findViewById(R.id.textinput);
        button = findViewById(R.id.button);
        result = findViewById(R.id.Result);

        ArrayAdapter<String> adapter_LWV = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,mainList);
        spinner_LWV.setAdapter(adapter_LWV);
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
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int inputValue = Integer.parseInt(textInput.getText().toString());
                if(spinner_LWV.getSelectedItemPosition()==0){
                    if(spinner1.getSelectedItemPosition()==0){
                        if(spinner2.getSelectedItemPosition()==0){
                            int result = inputValue*1;
                            Toast.makeText(getApplicationContext(),(int)result,Toast.LENGTH_SHORT).show();
                        }
                        if(spinner2.getSelectedItemPosition()==1){
                            int result  = inputValue/100;
                            Toast.makeText(getApplicationContext(),(int)result,Toast.LENGTH_SHORT).show();
                        }
                        if(spinner2.getSelectedItemPosition()==2){
                            int result = inputValue/100000;
                            Toast.makeText(getApplicationContext(),(int)result,Toast.LENGTH_SHORT).show();
                        }
                    }
                    if(spinner1.getSelectedItemPosition()==1){
                        if(spinner2.getSelectedItemPosition()==0){
                            int result = inputValue*100;
                            Toast.makeText(getApplicationContext(),(int)result,Toast.LENGTH_SHORT).show();
                        }
                        if(spinner2.getSelectedItemPosition()==1){
                            int result  = inputValue*1;
                             Toast.makeText(getApplicationContext(),(int)result,Toast.LENGTH_SHORT).show();
                        }
                        if(spinner2.getSelectedItemPosition()==2){
                            int result = inputValue/1000;
                             Toast.makeText(getApplicationContext(),(int)result,Toast.LENGTH_SHORT).show();
                        }
                    }
                    if(spinner1.getSelectedItemPosition()==2){
                        if(spinner2.getSelectedItemPosition()==0){
                            int result = inputValue*100000;
                             Toast.makeText(getApplicationContext(),(int)result,Toast.LENGTH_SHORT).show();
                        }
                        if(spinner2.getSelectedItemPosition()==1){
                            int result  = inputValue*1000;
                             Toast.makeText(getApplicationContext(),(int)result,Toast.LENGTH_SHORT).show();
                        }
                        if(spinner2.getSelectedItemPosition()==2){
                            int result = inputValue*1;
                             Toast.makeText(getApplicationContext(),(int)result,Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                if(spinner_LWV.getSelectedItemPosition()==1) {
                    if (spinner1.getSelectedItemPosition() == 0) {
                        if (spinner2.getSelectedItemPosition() == 0) {
                            int result = inputValue;
                            Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                        }
                        if (spinner2.getSelectedItemPosition() == 1) {
                            int result = inputValue / 1000;
                            Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                        }
                        if (spinner2.getSelectedItemPosition() == 2) {
                            int result = inputValue * 1000000;
                            Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (spinner1.getSelectedItemPosition() == 1) {
                        if (spinner2.getSelectedItemPosition() == 0) {
                            int result = inputValue * 1000;
                            Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                        }
                        if (spinner2.getSelectedItemPosition() == 1) {
                            int result = inputValue;
                            Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                        }
                        if (spinner2.getSelectedItemPosition() == 2) {
                            int result = inputValue / 1000;
                            Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (spinner1.getSelectedItemPosition() == 2) {
                        if (spinner2.getSelectedItemPosition() == 0) {
                            int result = inputValue * 1000000;
                            Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                        }
                        if (spinner2.getSelectedItemPosition() == 1) {
                            int result = inputValue * 1000;
                            Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                        }
                        if (spinner2.getSelectedItemPosition() == 2) {
                            int result = inputValue;
                            Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                        }
                        if (spinner1.getSelectedItemPosition() == 0) {
                            if (spinner2.getSelectedItemPosition() == 0) {
                                int result = inputValue;
                                Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                            }
                            if (spinner2.getSelectedItemPosition() == 1) {
                                int result = inputValue / 1000;
                                Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                            }
                            if (spinner2.getSelectedItemPosition() == 2) {
                                double result = (inputValue / (0.000264));
                                Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                            }
                        }
                        if (spinner1.getSelectedItemPosition() == 1) {
                            if (spinner2.getSelectedItemPosition() == 0) {
                                int result = inputValue * 1000;
                                Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                            }
                            if (spinner2.getSelectedItemPosition() == 1) {
                                int result = inputValue;
                                Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                            }
                            if (spinner2.getSelectedItemPosition() == 2) {
                                double result = inputValue * (0.264);
                                Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                            }
                        }
                        if (spinner1.getSelectedItemPosition() == 2) {
                            if (spinner2.getSelectedItemPosition() == 0) {
                                double result = inputValue * 3785.41;
                                Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                            }
                            if (spinner2.getSelectedItemPosition() == 1) {
                                double result = inputValue * 3.785;
                                Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                            }
                            if (spinner2.getSelectedItemPosition() == 2) {
                                double result = inputValue;
                                Toast.makeText(getApplicationContext(), (int) result, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }
            }
        });
    }
}


