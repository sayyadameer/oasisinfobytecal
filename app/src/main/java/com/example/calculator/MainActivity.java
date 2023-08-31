package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Pattern;
public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix;
    Button btnSeven, btnEight, btnNine, btnZero;
    Button add, sub, mul, div;
    Button btnClear, btnEqual, btnDot;
    EditText txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOne = (Button) findViewById(R.id.btn_one);
        btnOne.setOnClickListener(this);
        btnTwo = (Button) findViewById(R.id.btn_two);
        btnTwo.setOnClickListener(this);
        btnThree = (Button) findViewById(R.id.button_three);
        btnThree.setOnClickListener(this);
        btnFour = (Button) findViewById(R.id.button_four);
        btnFour.setOnClickListener(this);
        btnFive = (Button) findViewById(R.id.button_five);
        btnFive.setOnClickListener(this);
        btnSix = (Button) findViewById(R.id.button_six);
        btnSix.setOnClickListener(this);
        btnSeven = (Button) findViewById(R.id.btn_seven);
        btnSeven.setOnClickListener(this);
        btnEight = (Button) findViewById(R.id.btn_eight);
        btnEight.setOnClickListener(this);
        btnNine = (Button) findViewById(R.id.button_nine);
        btnNine.setOnClickListener(this);
        add = (Button) findViewById(R.id.btn_add);
        add.setOnClickListener(this);
        sub = (Button) findViewById(R.id.btn_sub);
        sub.setOnClickListener(this);
        mul = (Button) findViewById(R.id.btn_mul);
        mul.setOnClickListener(this);
        div = (Button) findViewById(R.id.btn_div);
        div.setOnClickListener(this);
        btnClear = (Button) findViewById(R.id.btn_clear);
        btnClear.setOnClickListener(this);
        btnEqual = (Button) findViewById(R.id.button_equal);
        btnEqual.setOnClickListener(this);
        btnDot = (Button) findViewById(R.id.button_dot);
        btnDot.setOnClickListener(this);
        txtResult = (EditText) findViewById(R.id.txt_result);
        txtResult.setText("");
    }

    public void onClick(View v) {
        if (v.equals(btnOne)) {
            txtResult.append("1");
        }
        if (v.equals(btnTwo)) {
            txtResult.append("2");
        }
        if (v.equals(btnThree)) {
            txtResult.append("3");
        }
        if (v.equals(btnFour)) {
            txtResult.append("4");
        }
        if (v.equals(btnFive)) {
            txtResult.append("5");
        }
        if (v.equals(btnSix)) {
            txtResult.append("6");
        }
        if (v.equals(btnSeven)) {
            txtResult.append("7");
        }
        if (v.equals(btnEight)) {
            txtResult.append("8");
        }
        if (v.equals(btnNine)) {
            txtResult.append("9");
        }
        if (v.equals(btnZero)) {
            txtResult.append("0");
        }
        if (v.equals(btnClear)) {
            txtResult.setText("");
        }
        if (v.equals(btnEqual)) {
            try {
                String data = txtResult.getText().toString();
                if (data.contains("/")) {
                    String[] operands = data.split("/");
                    if (operands.length == 2) {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        double result = operand1 / operand2;
                        txtResult.setText(String.valueOf(result));
                    } else {
                        Toast.makeText(getBaseContext(),
                                "Invalid Input",
                                Toast.LENGTH_LONG).show();
                    }
                } else if (data.contains("*")) {
                    String[] operands = data.split(Pattern.quote("*"));
                    if (operands.length == 2) {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        double result = operand1 * operand2;
                        txtResult.setText(String.valueOf(result));
                    } else {
                        Toast.makeText(getBaseContext(),
                                "Invalid Input",
                                Toast.LENGTH_LONG).show();
                    }
                } else if (data.contains("+")) {
                    String[] operands = data.split(Pattern.quote("+"));
                    if (operands.length == 2) {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        double result = operand1 + operand2;
                        txtResult.setText(String.valueOf(result));
                    } else {
                        Toast.makeText(getBaseContext(),
                                "Invalid Input",
                                Toast.LENGTH_LONG).show();
                    }
                } else if (data.contains("-")) {
                    String[] operands = data.split("-");
                    if (operands.length == 2) {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        double result = operand1 - operand2;
                        txtResult.setText(String.valueOf(result));
                    } else {
                        Toast.makeText(getBaseContext(),
                                "Invalid Input",
                                Toast.LENGTH_LONG).show();
                    }
                }
            } catch (Exception e) {
                Toast.makeText(getBaseContext(),
                        "Invalid Input",
                        Toast.LENGTH_LONG).show();
            }
        }
        if (v.equals(add)) {
            txtResult.append("+");
        }
        if (v.equals(sub)) {
            txtResult.append("-");
        }
        if (v.equals(mul)) {
            txtResult.append("*");
        }
        if (v.equals(div)) {
            txtResult.append("/");
        }
    }
}