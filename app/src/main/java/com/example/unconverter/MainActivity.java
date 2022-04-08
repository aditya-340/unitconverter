package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.unconvert.R;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView2;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2= findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {      /* when button is pressed what will happen*/
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Submitted", Toast.LENGTH_SHORT).show();    /* way of adding a new message in the app*/
                String s =editText.getText().toString();     /* value of edit text is taken as a string */
                int i = Integer.parseInt(s);       /* and it is stored in a int form in a new variable */
                double pound = i*2.20462;
                textView2.setText("The corresponding value is" +pound);    /*the value is  punched in the textvied 2*/
            }
        });

    }
}