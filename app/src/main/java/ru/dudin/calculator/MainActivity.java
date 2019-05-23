package ru.dudin.calculator;

/**
 * Simple calculator for JUnit and Ui testing.
 *
 * @created 23.05.2019
 * @author Andrey Dudin <programmer1973@mail.ru>
 * @version 0.1.0.2019.05.23
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextA;
    private EditText mEditTextB;
    private TextView mTextViewResult;

    private Button mButtonAdd;
    private Button mButtonSub;
    private Button mButtonMul;
    private Button mButtonDiv;

    private SimpleCalculator simpleCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleCalculator = new SimpleCalculator();

        mEditTextA = findViewById(R.id.edit_text_number_a);
        mEditTextB = findViewById(R.id.edit_text_number_b);
        mTextViewResult = findViewById(R.id.text_view_result);

        mButtonAdd = findViewById(R.id.button_add);
        mButtonSub = findViewById(R.id.button_sub);
        mButtonMul = findViewById(R.id.button_mul);
        mButtonDiv = findViewById(R.id.button_div);

        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewResult.setText(String.format("%d", simpleCalculator.getAdd(getFirstArgument(), getSecondArgument())));
            }
        });

        mButtonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewResult.setText(String.format("%d", simpleCalculator.getSub(getFirstArgument(), getSecondArgument())));
            }
        });

        mButtonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewResult.setText(String.format("%d", simpleCalculator.getMul(getFirstArgument(), getSecondArgument())));
            }
        });

        mButtonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewResult.setText(String.format("%f", simpleCalculator.getDiv(getFirstArgument(), getSecondArgument())));
            }
        });
    }

    private int getFirstArgument() {
        return Integer.parseInt(mEditTextA.getText().toString());
    }

    private int getSecondArgument() {
        return Integer.parseInt(mEditTextB.getText().toString());
    }
}