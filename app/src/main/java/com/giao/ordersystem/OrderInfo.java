package com.giao.ordersystem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Long on 5/13/2016.
 */
public class OrderInfo extends Activity{
    private TextView tableNameTextView;
    private EditText dateEditText;
    private EditText customerQuantityEditText;
    private EditText noteEditText;
    private EditText totalEditText;
    private String tableName;
    private Button homeButton;
    private Button orderInfoOK;
    private OrderInfo_Event event;
    private OrderDAO orderDAO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_info);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            tableName = extras.getString("tableName");
        }
        event= new OrderInfo_Event(this.getBaseContext());
        orderDAO= new OrderDAO(this.getBaseContext());
        //Declare controls
        tableNameTextView=(TextView)findViewById(R.id.tableNameTextView);
        dateEditText=(EditText)findViewById(R.id.dateEditText);
        customerQuantityEditText=(EditText)findViewById(R.id.customerQuantityEditText);
        noteEditText=(EditText)findViewById(R.id.noteEditText);
        totalEditText=(EditText)findViewById(R.id.totalEditText);
        homeButton=(Button)findViewById(R.id.homeButton);
        orderInfoOK=(Button)findViewById(R.id.orderInfoOK);
        tableNameTextView.setText(tableName);
        //homeButton event
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        //orderInforsOK Button Event
        orderInfoOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
