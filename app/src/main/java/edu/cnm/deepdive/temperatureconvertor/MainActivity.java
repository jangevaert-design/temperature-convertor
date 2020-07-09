package edu.cnm.deepdive.temperatureconvertor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import edu.cnm.deepdive.temperatureconvertor.R;


public class MainActivity extends AppCompatActivity {

  private Button cToF, fToC, cToK, fToK, kToF, kToC;
  private TextView result;
  private EditText enterTemp;
  double result0;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    cToF = findViewById(R.id.cToF);
    fToC = findViewById(R.id.fToC);
    kToF = findViewById(R.id.kToF);
    kToC = findViewById(R.id.kToC);
    cToK = findViewById(R.id.cToK);
    fToK = findViewById(R.id.fToK);

    result = findViewById(R.id.result);
    enterTemp = findViewById(R.id.enterTemp);

    cToF.setOnClickListener((new View.OnClickListener() {
      @Override
      public void onClick(View v) {

        double temp = Double.parseDouble(enterTemp.getText().toString());
        result0 = (temp * 1.8) + 32;
        result.setText(String.valueOf(result0));

      }

    }));

    fToC.setOnClickListener((new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        double temp = Double.parseDouble(enterTemp.getText().toString());
        result0 = (temp - 32) / 1.8;
        result.setText(String.valueOf(result0));

      }

    }));

    kToC.setOnClickListener((new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        double temp = Double.parseDouble(enterTemp.getText().toString());
        result0 = (temp - 273.15);
        result.setText(String.valueOf(result0));

      }

    }));

    kToF.setOnClickListener((new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        double temp = Double.parseDouble(enterTemp.getText().toString());
        result0 = (temp * 9 / 5) - 459.67;
        result.setText(String.valueOf(result0));

      }

    }));

    cToK.setOnClickListener((new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        double temp = Double.parseDouble(enterTemp.getText().toString());
        result0 = (temp + 273.15);
        result.setText(String.valueOf(result0));

      }

    }));

    fToK.setOnClickListener((new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        double temp = Double.parseDouble(enterTemp.getText().toString());
        result0 = (temp + 459.67) * 5 / 9;
        result.setText(String.valueOf(result0));

      }

    }));
  }
}