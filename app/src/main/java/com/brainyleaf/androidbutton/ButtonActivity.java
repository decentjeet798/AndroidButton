package com.brainyleaf.androidbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity implements View.OnClickListener {
    // declaring Button view
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        // initialising button view  using findViewById Method.
        button = findViewById(R.id.usingId);
        // Using OnClickListener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement your logic here which you want to perform on button click.
                Toast.makeText(getApplicationContext(), "Button OnClickListener is Clicked", Toast.LENGTH_LONG).show();
            }
        });

        // for btn1 , btn2, btn3 and btn4 using Implementation View.OnClickListener
        Button one = (Button) findViewById(R.id.btn1);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.btn2);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.btn3);
        three.setOnClickListener(this);
        Button four = (Button) findViewById(R.id.btn4);
        four.setOnClickListener(this);

    }

    /**
     * Called when the user touches the button
     */
    public void myMethod(View view) {
        // Implement your logic here which you want to perform on button click.
        Toast.makeText(getApplicationContext(), "Button is Clicked", Toast.LENGTH_LONG).show();
    }

    // Using Implementation override Method.
    @Override
    public void onClick(View view) {
        // default method for handling onClick Events..
        Button b = (Button) view;
        String buttonText = b.getText().toString();
        switch (view.getId()) {

            case R.id.btn1:
                // do your code
                Toast.makeText(getApplicationContext(), "Button " + buttonText + " is Clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn2:
                // do your code
                Toast.makeText(getApplicationContext(), "Button " + buttonText + " is Clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn3:
                // do your code
                Toast.makeText(getApplicationContext(), "Button " + buttonText + " is Clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn4:
                // do your code
                Toast.makeText(getApplicationContext(), "Button " + buttonText + " is Clicked", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }

    }
}
