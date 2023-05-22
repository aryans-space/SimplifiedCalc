package com.example.simplifiedcal_c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button b_equal;
    private Button b_para1;
    private Button b_multi;
    private Button b_divide;
    private Button b_add;
    private Button b_sub;
    private Button b_clear;
    private Button b_dot;
    private Button sin;
    private Button cos;
    private Button tan ;
    private Button ln;
    private Button log;
    private Button pow;
    private TextView t1;
    private TextView t2;
    private double val1 = Double.NaN;
    private double val2;
    private final char ADD = '+';
    private final char SUB= '-';
    private final char MUL = '*';
    private final char DIV = '/';
    private final char EQU = '=';
    private final char EXTRA = '@';
    private final char SIN = 's';
    private final char COS= 'c';
    private final char TAN = 't';
    private final char LOG = 'l';
    private final char LN = 'L';
    private final char POW = '^';
    private final char MOD= '%';
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idfinder();
        t2.setText("");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LN||ACTION==LOG) {

                    t1.setText(t1.getText().toString() + "1");
                    t2.setText(t2.getText().toString() + "1");
                    return;
                }

                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "1");


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LN||ACTION==LOG) {

                    t1.setText(t1.getText().toString() + "2");
                    t2.setText(t2.getText().toString() + "2");
                    return;
                }
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LN||ACTION==LOG) {

                    t1.setText(t1.getText().toString() + "3");
                    t2.setText(t2.getText().toString() + "3");
                    return;
                }
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LN||ACTION==LOG) {

                    t1.setText(t1.getText().toString() + "4");
                    t2.setText(t2.getText().toString() + "4");
                    return;
                }
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LN||ACTION==LOG) {

                    t1.setText(t1.getText().toString() + "5");
                    t2.setText(t2.getText().toString() + "5");
                    return;
                }
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LN||ACTION==LOG) {

                    t1.setText(t1.getText().toString() + "6");
                    t2.setText(t2.getText().toString() + "6");
                    return;
                }
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LN||ACTION==LOG) {

                    t1.setText(t1.getText().toString() + "7");
                    t2.setText(t2.getText().toString() + "7");
                    return;
                }
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LN||ACTION==LOG) {

                    t1.setText(t1.getText().toString() + "8");
                    t2.setText(t2.getText().toString() + "8");
                    return;
                }
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LN||ACTION==LOG) {

                    t1.setText(t1.getText().toString() + "9");
                    t2.setText(t2.getText().toString() + "9");
                    return;
                }
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LN||ACTION==LOG) {

                    t1.setText(t1.getText().toString() + "0");
                    t2.setText(t2.getText().toString() + "0");
                    return;
                }
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "0");
            }
        });

        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1.getText().toString().contains(".")){
                    t1.setText(t1.getText());
                    return;
                }
                exceedLength();

                t1.setText(t1.getText().toString() + ".");
            }
        });
        b_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LN||ACTION==LOG){
                    calculations2();
                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "/");
                    } else {
                        t2.setText((int) val1 + "/");
                    }
                    t1.setText(null);
                    ACTION = DIV;
                }


               else if (t1.getText().length() > 0) {
                    ACTION = DIV;
                    calculations();
                    if (ifReallyDecimal()) {
                        t2.setText((int) val1 + "/");
                    } else {
                        t2.setText(val1 + "/");
                    }
                    t1.setText(null);
                }
                else if(t1.getText().length() ==0 &&t2.getText().length()>0) {
                    int l=t2.getText().toString().length()-1;
                    if(ACTION==ADD||ACTION==DIV||ACTION==SUB||ACTION==MUL||ACTION==MOD||ACTION==POW){
                        t2.setText(t2.getText().toString().substring(0,l)+"/");
                        ACTION=DIV;
                        return;
                    }
                    if(t2.getText().toString().charAt(l)=='^'||t2.getText().toString().charAt(l)=='+'||t2.getText().toString().charAt(l)=='/'||t2.getText().toString().charAt(l)=='*'||t2.getText().toString().charAt(l)=='%'){
                        t2.setText(t2.getText().toString());
                        return;
                    }
                    t2.setText(t2.getText().toString()+"/");

                }

                else if (t1.getText().length() ==0){
                    t2.setText("Error");
                }
                else if(ACTION!='0')
                {

                    calculations();
                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "/");
                    } else {
                        t2.setText((int) val1 + "/");
                    }
                    t1.setText(null);
                    ACTION = DIV;


                    return;
                }

            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                t2.setText("sin ");
                ACTION = SIN;
                if(t1.getText().toString().isEmpty())
                    return;




                calculations2();
                t2.setText(""+val1);
                ACTION='0';




            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText("cos ");
                ACTION = COS;
                if(t1.getText().toString().isEmpty())
                    return;
                calculations2();

                t2.setText(""+val1);
                ACTION='0';




            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText("tan ");
                ACTION = TAN;
                if(t1.getText().toString().isEmpty())
                    return;




                calculations2();
                if(t1.getText().toString().equals("0")){
                    ACTION='0';

                    return;

                }

                t2.setText(""+val1);
                ACTION='0';

            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText("log ");
                ACTION = LOG;
                if(t1.getText().toString().isEmpty())
                    return;




                calculations2();
                t2.setText(""+val1);
                ACTION='0';
            }
        });
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText("ln ");
                ACTION = LN;
                if(t1.getText().toString().isEmpty())
                    return;




                calculations2();
                t2.setText(""+val1);
                ACTION='0';
            }
        });
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LN||ACTION==LOG){
                    calculations2();
                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "^");
                    } else {
                        t2.setText((int) val1 + "^");
                    }
                    t1.setText(null);
                    ACTION = POW;
                }


                else if (t1.getText().length() > 0) {
                    ACTION = POW;
                    calculations();
                    if (ifReallyDecimal()) {
                        t2.setText((int) val1 + "^");
                    } else {
                        t2.setText(val1 + "^");
                    }
                    t1.setText(null);
                }
                else if(t1.getText().length() ==0 &&t2.getText().length()>0) {
                    int l=t2.getText().toString().length()-1;
                    if(ACTION==ADD||ACTION==DIV||ACTION==SUB||ACTION==MUL||ACTION==MOD||ACTION==POW){
                        t2.setText(t2.getText().toString().substring(0,l)+"^");
                        ACTION=POW;
                        return;
                    }
                    if(t2.getText().toString().charAt(l)=='^'||t2.getText().toString().charAt(l)=='+'||t2.getText().toString().charAt(l)=='/'||t2.getText().toString().charAt(l)=='*'||t2.getText().toString().charAt(l)=='%'){
                        t2.setText(t2.getText().toString());
                        return;
                    }
                    t2.setText(t2.getText().toString()+"^");

                }

                else if (t1.getText().length() ==0){
                    t2.setText("Error");
                }
                else if(ACTION!='0')
                {

                    calculations();
                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "^");
                    } else {
                        t2.setText((int) val1 + "^");
                    }
                    t1.setText(null);
                    ACTION = POW;


                    return;
                }

            }
        });
        b_para1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LN||ACTION==LOG){
                    calculations2();
                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "%");
                    } else {
                        t2.setText((int) val1 + "%");
                    }
                    t1.setText(null);
                    ACTION = MOD;
                }


                else if (t1.getText().length() > 0) {
                    ACTION = MOD;
                    calculations();
                    if (ifReallyDecimal()) {
                        t2.setText((int) val1 + "%");
                    } else {
                        t2.setText(val1 + "%");
                    }
                    t1.setText(null);
                }
                else if(t1.getText().length() ==0 &&t2.getText().length()>0) {
                    int l=t2.getText().toString().length()-1;
                    if(ACTION==ADD||ACTION==DIV||ACTION==SUB||ACTION==MUL||ACTION==MOD||ACTION==POW){
                        t2.setText(t2.getText().toString().substring(0,l)+"%");
                        ACTION=MOD;
                        return;
                    }
                    if(t2.getText().toString().charAt(l)=='^'||t2.getText().toString().charAt(l)=='+'||t2.getText().toString().charAt(l)=='/'||t2.getText().toString().charAt(l)=='*'||t2.getText().toString().charAt(l)=='%'){
                        t2.setText(t2.getText().toString());
                        return;
                    }
                    t2.setText(t2.getText().toString()+"%");

                }

                else if (t1.getText().length() ==0){
                    t2.setText("Error");
                }
                else if(ACTION!='0')
                {

                    calculations();
                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "%");
                    } else {
                        t2.setText((int) val1 + "%");
                    }
                    t1.setText(null);
                    ACTION = MOD;


                    return;
                }


            }
        });

        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LN||ACTION==LOG){
                    calculations2();
                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "+");
                    } else {
                        t2.setText((int) val1 + "+");
                    }
                    t1.setText(null);
                    ACTION = ADD;
                }

                else if (t1.getText().length() > 0) {
                    ACTION = ADD;
                    calculations();
                    if (ifReallyDecimal()) {
                        t2.setText((int) val1 + "+");
                    } else {
                        t2.setText(val1 + "+");
                    }
                    t1.setText(null);
                }
                else if(t1.getText().length() ==0 &&t2.getText().length()>0) {
                    int l=t2.getText().toString().length()-1;
                    if(ACTION==ADD||ACTION==DIV||ACTION==SUB||ACTION==MUL||ACTION==MOD||ACTION==POW){
                        t2.setText(t2.getText().toString().substring(0,l)+"+");
                        ACTION=ADD;
                        return;
                    }
                    if(t2.getText().toString().charAt(l)=='^'||t2.getText().toString().charAt(l)=='+'||t2.getText().toString().charAt(l)=='/'||t2.getText().toString().charAt(l)=='*'||t2.getText().toString().charAt(l)=='%'){
                        t2.setText(t2.getText().toString());
                        return;
                    }

                    t2.setText(t2.getText().toString()+"+");

                }

                else if (t1.getText().length() ==0){
                    t2.setText("Error");
                }
                else if(ACTION!='0')
                {

                    calculations();
                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "+");
                    } else {
                        t2.setText((int) val1 + "+");
                    }
                    t1.setText(null);
                    ACTION = ADD;


                    return;
                }

            }
        });

        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1.getText().length() >0 && (ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LOG||ACTION==LN)){
                    int l=t1.getText().length();
                    if(t1.getText().toString().charAt(l-1)=='-'){
                        t2.setText(t2.getText());
                        t1.setText(t1.getText());
                        return;
                    }

                    calculations2();
                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "-");
                    } else {
                        t2.setText((int) val1 + "-");
                    }
                    t1.setText(null);
                    ACTION = SUB;
                }

               else if(t1.getText().length() >0 && t1.getText().toString().charAt(0)=='-')
                    t1.setText(t1.getText());
                else if(t1.getText().length() ==0 && (ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LOG||ACTION==LN)) {
                    if(ACTION==SIN){
                        t2.setText("sin -");
                        t1.setText("-"+t1.getText().toString()+"");
                        return;
                    }
                    if(ACTION==COS){
                        t2.setText("cos -");
                        t1.setText("-"+t1.getText().toString()+"");
                        return;
                    }
                    if(ACTION==TAN){
                        t2.setText("tan -");
                        t1.setText("-"+t1.getText().toString()+"");
                        return;
                    }
                    if(ACTION==LOG){
                        t2.setText("log -");
                        t1.setText("-"+t1.getText().toString()+"");
                        return;
                    }
                    if(ACTION==LN){
                        t2.setText("ln -");
                        t1.setText("-"+t1.getText().toString());
                        return;
                    }

                }

                else if(t1.getText().length() ==0 &&t2.getText().length()>0) {
                    int l=t2.getText().toString().length()-1;
                    if(ACTION==ADD||ACTION==DIV||ACTION==MUL||ACTION==MOD||ACTION==POW){

                        t2.setText(t2.getText().toString().substring(0,l)+"-");
                        ACTION=SUB;
                        return;
                    }
                    if(t2.getText().toString().charAt(l)=='-') {
                            t1.setText("-" + t1.getText().toString());
                    }
                     else
                        t2.setText(t2.getText().toString()+"-");

                }
                else if(t1.getText().length() ==0){
                    ACTION = SUB;

                    t1.setText("-"+t1.getText().toString());

                }
                else if(ACTION!='0' )
                {

                    calculations();
                    if (t1.getText().length() > 0)
                        if (!ifReallyDecimal()) {
                            t2.setText(val1 + "-");
                        } else {
                            t2.setText((int) val1 + "-");
                        }
                    t1.setText(null);
                    ACTION = SUB;



                }
                else if (t1.getText().length() > 0) {
                    ACTION = SUB;
                    calculations();
                    if (t1.getText().length() > 0)
                        if (!ifReallyDecimal()) {
                            t2.setText(val1 + "-");
                        } else {
                            t2.setText((int) val1 + "-");
                        }
                    t1.setText(null);
                }

                else {
                    t2.setText("Error");
                }
            }
        });

        b_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ACTION==SIN||ACTION==COS||ACTION==TAN||ACTION==LN||ACTION==LOG){
                    calculations2();
                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "*");
                    } else {
                        t2.setText((int) val1 + "*");
                    }
                    t1.setText(null);
                    ACTION = MUL;
                }

                else if (t1.getText().length() > 0) {
                    ACTION = MUL;
                    calculations();
                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "*");
                    } else {
                        t2.setText((int) val1 + "*");
                    }
                    t1.setText(null);
                }
                else if(t1.getText().length() ==0 &&t2.getText().length()>0) {
                    int l=t2.getText().toString().length()-1;
                      if(ACTION==ADD||ACTION==DIV||ACTION==SUB||ACTION==MUL||ACTION==MOD||ACTION==POW){
                        t2.setText(t2.getText().toString().substring(0,l)+"*");
                        ACTION=MUL;
                        return;
                    }
                    if(t2.getText().toString().charAt(l)=='^'||t2.getText().toString().charAt(l)=='+'||t2.getText().toString().charAt(l)=='/'||t2.getText().toString().charAt(l)=='*'||t2.getText().toString().charAt(l)=='%'){
                        t2.setText(t2.getText().toString());
                        return;
                    }
                    t2.setText(t2.getText().toString()+"*");

                }
                else  if (t1.getText().length() ==0) {
                    t2.setText("Error");
                }
               else if(ACTION!='0')
                {

                    calculations();
                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "*");
                    } else {
                        t2.setText((int) val1 + "*");
                    }
                    t1.setText(null);
                    ACTION = MUL;


                    return;
                }

            }
        });

        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(t2.getText().length()!=0 && t1.getText().length()==0){
                        t2.setText(t2.getText());
                        return;
                    }
                    if (ACTION == SIN || ACTION == COS || ACTION == TAN || ACTION == LN || ACTION == LOG) {
                        calculations2();
                        t2.setText(String.valueOf(val1));
                        return;
                    }
                    if (t1.getText().length() > 0) {
                        calculations();
                        ACTION = EQU;
                        if (!ifReallyDecimal()) {
                            t2.setText(String.valueOf(val1));
                        } else {
                            t2.setText(String.valueOf((int) val1));
                        }
                        t1.setText(null);
                    } else if (t2.getText().length() > 0) {

                        calculations();
                        ACTION = EQU;
                        if (!ifReallyDecimal()) {
                            t2.setText(String.valueOf(val1));
                        } else {
                            t2.setText(String.valueOf((int) val1));
                        }
                        t1.setText(null);
                    } else if (t1.getText().length() == 0) {
                        t2.setText("Error");
                    }
                }
                catch(Exception e) {
                            if(!(t2.getText().toString().isEmpty())){
                                t2.setText(t2.getText().toString());
                            }
                    if(!(t1.getText().toString().isEmpty())){
                        t2.setText(t1.getText().toString());
                        return;
                    }



                }
            }
        });

        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    CharSequence name = t1.getText().toString();
                    t1.setText(name.subSequence(0, name.length() - 1));
                } else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    t1.setText("");
                    t2.setText("");
                }
            }
        });


        b_clear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                val1 = Double.NaN;
                val2 = Double.NaN;
                t1.setText("");
                t2.setText("");
                return true;
            }
        });

    }

    private void idfinder() {
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b0 = findViewById(R.id.button0);

        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        log = findViewById(R.id.log);
        ln = findViewById(R.id.ln);
        pow = findViewById(R.id.pow);
        b_equal = findViewById(R.id.button_equal);
        b_multi = findViewById(R.id.button_multi);
        b_divide = findViewById(R.id.button_divide);
        b_add = findViewById(R.id.button_add);
        b_sub = findViewById(R.id.button_sub);
        b_clear = findViewById(R.id.button_clear);
        b_dot = findViewById(R.id.button_dot);
        b_para1 = findViewById(R.id.button_para1);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);

    }

    private void calculations(){
        if(!Double.isNaN(val1)) {
            if(t1.getText().length() ==0 &&t2.getText().length()>0) {
                int l=t2.getText().toString().length()-1;
                val2 = Double.parseDouble(t2.getText().toString().substring(0,l));
            }
            else if(t1.getText().length() >0 &&t2.getText().length()>0){
                int l=t2.getText().toString().length()-1;
                val2 = Double.parseDouble(t2.getText().toString().substring(0,l));
                val1 = Double.parseDouble(t1.getText().toString());
                ACTION=t2.getText().toString().charAt(l);
            }
            else
                val2 = Double.parseDouble(t1.getText().toString());
            switch (ACTION) {
                case ADD:
                    val1 = val1 + val2;
                    break;
                case SUB:
                    val1 = val2 - val1;
                    break;
                case MUL:
                    val1 = val1 * val2;
                    break;
                case DIV:
                    val1 = val2 / val1;
                    break;
                case EXTRA:
                    val1 = (-1) * val1;
                    break;
                case MOD:
                    val1 = val2 % val1;
                    break;


                case POW:
                    val1 = Math.pow(val2,val1);
                    break;
                case EQU:
                    break;
            }
        }
        else {
            val1 = Double.parseDouble(t1.getText().toString());
        }
    }

    public void calculations2(){
        if(t1.getText().toString().equals(""))
            return;
        val2=Double.parseDouble(t1.getText().toString());
        if(ACTION==TAN && val2==90) {
            t2.setText("0");
            t1.setText("0");
            return;
        }
        double b = Math.toRadians(val2);
        int decimalpoint=4;
        switch(ACTION){
            case COS:
                val1 = Math.cos(b);
                val1 = val1 * Math.pow(10, decimalpoint);
                val1 = Math.floor(val1);
                val1 = val1 / Math.pow(10, decimalpoint);
                t1.setText("0");
                break;
            case SIN:
                val1 = Math.sin(b);
                val1 = val1 * Math.pow(10, decimalpoint);
                val1 = Math.floor(val1);
                val1 = val1 / Math.pow(10, decimalpoint);
                t1.setText("0");
                break;
            case TAN:
                val1 = Math.tan(b);
                val1 = val1 * Math.pow(10, decimalpoint);
                val1 = Math.floor(val1);
                val1 = val1 / Math.pow(10, decimalpoint);
                t1.setText("0");
                break;
            case LOG:
                val1 = Math.log10(val2);
                val1 = val1 * Math.pow(10, decimalpoint);
                val1 = Math.floor(val1);
                val1 = val1 / Math.pow(10, decimalpoint);

                t1.setText("0");
                break;
            case LN:
                val1 = Math.log(val2);
                val1 = val1 * Math.pow(10, decimalpoint);
                val1 = Math.floor(val1);
                val1 = val1 / Math.pow(10, decimalpoint);
                t1.setText("0");
                break;

        }
    }

        private void ifErrorOnOutput() {
            if (t2.getText().toString().equals("Error")) {
                t2.setText("");
            }
        }

        private void noOperation() {
            String inputExpression = t2.getText().toString();
            if (!inputExpression.isEmpty() && !inputExpression.equals("Error")) {
                if (inputExpression.contains("-")) {
                    inputExpression = inputExpression.replace("-", "");
                    t2.setText("");
                    val1 = Double.parseDouble(inputExpression);
                }
                if (inputExpression.contains("+")) {
                    inputExpression = inputExpression.replace("+", "");
                    t2.setText("");
                    val1 = Double.parseDouble(inputExpression);
                }
                if (inputExpression.contains("/")) {
                    inputExpression = inputExpression.replace("/", "");
                    t2.setText("");
                    val1 = Double.parseDouble(inputExpression);
                }
                if (inputExpression.contains("%")) {
                    inputExpression = inputExpression.replace("%", "");
                    t2.setText("");
                    val1 = Double.parseDouble(inputExpression);
                }
                if (inputExpression.contains("×")) {
                    inputExpression = inputExpression.replace("×", "");
                    t2.setText("");
                    val1 = Double.parseDouble(inputExpression);
                }
            }
        }
    private boolean ifReallyDecimal() {

        return val1 == (int) val1;
    }


        private void exceedLength() {
            if (t1.getText().toString().length() > 10) {
                t1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
            }
        }
}