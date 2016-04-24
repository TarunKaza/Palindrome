package com.example.tarunkaza.palindrome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e;
    String s;
    int i=0,l,flag=0;
    char a,z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        e=(EditText)findViewById(R.id.editText);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                s=e.getText().toString().trim();
                s.toLowerCase();
                l=s.length();
                --l;
                if(s.equals("")){
                    e.requestFocus();
                    Toast.makeText(getApplicationContext(), "Enter something", Toast.LENGTH_SHORT).show();
                }
                else {
                    while (i < l) {
                        a = s.charAt(i);
                        z = s.charAt(l);
                        if (a != z) {
                            Toast.makeText(getApplicationContext(), "Not Palindrome", Toast.LENGTH_SHORT).show();
                            flag = 1;
                            break;
                        }
                        i++;
                        l--;
                    }
                    if (flag == 0) {
                        Toast.makeText(getApplicationContext(), "Palindrome", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
