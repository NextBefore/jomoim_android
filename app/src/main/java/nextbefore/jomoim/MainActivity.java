package nextbefore.jomoim;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import nextbefore.jomoim.chatting.view.ChattingActivity;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    LinearLayout button1;
    LinearLayout button2;
    LinearLayout button3;
    LinearLayout button4;
    LinearLayout button5;
    LinearLayout button6;
    LinearLayout button7;
    LinearLayout button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (LinearLayout)findViewById(R.id.button1);
        button2 = (LinearLayout)findViewById(R.id.button2);
        button3 = (LinearLayout)findViewById(R.id.button3);
        button4 = (LinearLayout)findViewById(R.id.button4);
        button5 = (LinearLayout)findViewById(R.id.button5);
        button6 = (LinearLayout)findViewById(R.id.button6);
        button7 = (LinearLayout)findViewById(R.id.button7);
        button8 = (LinearLayout)findViewById(R.id.button8);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1 :
                break;
            case R.id.button2 :
                break;
            case R.id.button3 :
                break;
            case R.id.button4 :
                break;
            case R.id.button5 :
                break;
            case R.id.button6 :
                Intent intent = new Intent(this, ChattingActivity.class);
                break;
            case R.id.button7 :
                break;
            case R.id.button8 :
                break;
        }
    }
}
