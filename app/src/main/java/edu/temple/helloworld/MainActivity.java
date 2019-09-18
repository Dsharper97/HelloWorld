package edu.temple.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add button to change text
        //get the button and text view
        txt = findViewById(R.id.textView);
        Button btn = findViewById(R.id.btnChangeTxt);

        //set what the button does.
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("You have clicked the button");
            }
        });

    }
}
