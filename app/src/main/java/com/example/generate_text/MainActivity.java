package com.example.generate_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
EditText editText1,Edit3;
TextView textView1;
Spinner   EditText2;
    public String Amount;
 Button done;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        List<String> items;
        super.onCreate (savedInstanceState);

        setContentView (R.layout.activity_main);
         editText1=findViewById (R.id.Textfield);
       EditText2=findViewById (R.id.Textfield1);
        Edit3=findViewById (R.id.Textfield2);
       textView1=findViewById (R.id.view);
        done=findViewById (R.id.Done);

        items = new ArrayList<> ();


        items.add ("5");
        items.add ("10");
        items.add ("30");
        items.add ("50");


        items.add ("100");


        items.add ("500");


        items.add ("1000");


        items.add ("1500");



        EditText2.setAdapter (new ArrayAdapter<> (this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, items));
 EditText2.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener () {
     @Override
     public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
         Amount=items.get (position);
     }

     @Override
     public void onNothingSelected(AdapterView<?> parent) {

     }
 });








          editText1.addTextChangedListener (new TextWatcher () {
              @Override
              public void beforeTextChanged(CharSequence s, int start, int count, int after) {

              }

              @Override
              public void onTextChanged(CharSequence s, int start, int before, int count) {
                  String txtp = editText1.getText ().toString ();
                  txtp = txtp.replace ("\n", " ");
                  String[] textarray = txtp.split (" ");
                 textView1.setText ("Total Words " + textarray.length);


              }

              @Override
              public void afterTextChanged(Editable s) {

              }
          });
           done.setOnClickListener (new View.OnClickListener () {
               @Override
               public void onClick(View v) {

                   if(Amount.equals ("5")){
                       String input1= String.valueOf (editText1.getText ());
                        String name=input1+input1+input1+input1+input1;
                    Edit3.setText (name);
                   }
                  else if(Amount.equals ("10")){
                       String input1= String.valueOf (editText1.getText ());
                       String name=input1+input1+input1+input1+input1+input1+input1+input1+input1+input1;
                       Edit3.setText (name);
                   }
                   else if(Amount.equals ("30")){
                       String input1= String.valueOf (editText1.getText ());
                       String name=input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1;
                       Edit3.setText (name);
                   }
                   else if(Amount.equals ("50")){
                       String input1= String.valueOf (editText1.getText ());
                       String name=input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1;
                       Edit3.setText (name);
                   }
                   else if(Amount.equals ("100")){
                       String input1= String.valueOf (editText1.getText ());
                       String name=input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1;
                       Edit3.setText (name);
                   }
                   else if(Amount.equals ("500")){
                       String input1= String.valueOf (editText1.getText ());
                       String name=input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                       +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                                +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                        +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1;
                       Edit3.setText (name);
                   }
                   else if(Amount.equals ("1000")){
                       String input1= String.valueOf (editText1.getText ());
                       String name=input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                                +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1;
                       Edit3.setText (name);
                   }
                   else if(Amount.equals ("1500")){
                       String input1= String.valueOf (editText1.getText ());
                       String name=input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                               +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1
                                +input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1+input1;
                       Edit3.setText (name);
                   }
               }
           });



    }

}