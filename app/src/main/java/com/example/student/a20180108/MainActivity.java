package com.example.student.a20180108;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        act=findViewById(R.id.autoCompleteTextView);
        String str[]={"aa","ab","ac","bb","cc"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (MainActivity.this,android.R.layout.simple_list_item_1,str);
        act.setThreshold(1);//這裡的數字代表輸入1個字就會跳出相關文字可選擇
        act.setAdapter(adapter);
        
    }
}
