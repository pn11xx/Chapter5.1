package com.example.pngo.chapter512;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button powersButton = (Button) findViewById(R.id.powers);
        Button additionButton = (Button) findViewById(R.id.addition);
        Button squareRootButton = (Button) findViewById(R.id.squareRoot);

        final EditText xInput = (EditText) findViewById(R.id.xInput);
        final EditText yInput = (EditText) findViewById(R.id.yInput);
        final EditText zInput = (EditText) findViewById(R.id.zInput);
        final TextView display = (TextView) findViewById(R.id.textView);
        final String[] outs = {""};
        final String[] sum = {" "};

        powersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = xInput.getText().toString();
                int x = Integer.parseInt(input);
                int b = Integer.parseInt(input);

                for (int i = 1; i < 10; i++) {
                    x *= b;
                }
                outs[0] = String.valueOf(x);
                display.setText(outs[0]);
            }
        });


        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = xInput.getText().toString();
                String input2 = yInput.getText().toString();
                int x = Integer.parseInt(input);
                int y = Integer.parseInt(input2);

                int sum = x + y;
                outs[0] = String.valueOf(sum);
                display.setText(outs[0]);

            }
        });


        squareRootButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String input1 = xInput.getText().toString();
                int x = Integer.parseInt(input1);
                int i;
                int b=1;
                for (i=1; x>=i+(i+2); i +=2){
                    ++b;
                }

                String input2 = yInput.getText().toString();
                int yInput = Integer.parseInt(input2);
                int y = (yInput < 0) ? - yInput : yInput;

                String input3 = zInput.getText().toString();
                int z = Integer.parseInt(input3);

                int t = 1;
                for(int c = 1;c <= y; c++)
                {
                    t=t*z;
                }

                int add = b + y + t;
                sum[0] = String.valueOf(add);
                display.setText(sum[0]);
            }
        });

    }
}

