package com.example.raddiobutton1;
//A111222032
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView lblOutput;
    private RadioGroup rgGender, rgType;
    private EditText editTextNumber;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblOutput = findViewById(R.id.lblOutput);
        rgGender = findViewById(R.id.rgGender);
        rgType = findViewById(R.id.rgType);
        editTextNumber = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateAndDisplay();
            }
        });
    }

    private void calculateAndDisplay() {
        int genderId = rgGender.getCheckedRadioButtonId();
        int typeId = rgType.getCheckedRadioButtonId();
        int ticketPrice = 0;

        if (genderId == -1 || typeId == -1) {
            lblOutput.setText("請選擇性別和票種");
            return;
        }

        RadioButton genderRadioButton = findViewById(genderId);
        RadioButton typeRadioButton = findViewById(typeId);
        String gender = genderRadioButton.getText().toString();
        String ticketType = typeRadioButton.getText().toString();
        int ticketCount = Integer.parseInt(editTextNumber.getText().toString());

        switch (ticketType) {
            case "全票":
                ticketPrice = 500;
                break;
            case "學生票":
                ticketPrice = 400;
                break;
            case "兒童票":
                ticketPrice = 250;
                break;
        }

        int totalAmount = ticketCount * ticketPrice;
        lblOutput.setText("性別：" + gender + "\n票種：" + ticketType + "\n總金額：" + totalAmount);
    }
}
