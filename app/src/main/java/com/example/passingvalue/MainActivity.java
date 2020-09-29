package com.example.passingvalue;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DatePickerDialog picker;
    EditText nama;
    EditText nim;
    EditText tanggal;
    RadioButton radioButton;
    Spinner jurusan;
    Button submit;
    RadioGroup sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText)findViewById(R.id.edtName);
        nim = (EditText)findViewById(R.id.edtNim);
        tanggal = (EditText)findViewById(R.id.edtTanggalLahir);
        jurusan = (Spinner)findViewById(R.id.spinnerJurusan);
        submit = (Button)findViewById(R.id.saveButton);
        sex = (RadioGroup)findViewById((R.id.sex))

        jurusan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                int month = calendar.get(Calendar.MONTH);
                int year = calendar.get(Calendar.YEAR);
                picker = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                tanggal.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nama.getText().toString();
                String no = nim.getText().toString();
                String date = tanggal.getText().toString();
                String sex = radioButton.getText().toString();

            }
        });
    }

    public void checkButton(View v){
        int radioId = sex.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
    }
}