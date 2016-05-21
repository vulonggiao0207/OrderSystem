package com.giao.ordersystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Long on 5/9/2016.
 */
public class Order_View_Adapter extends BaseAdapter {
    private Context context;
    private ArrayList<Order_View> data;
    private static LayoutInflater inflater = null;
    private TextView quantityTextView;
    private TextView dishNameTextView;
    private TextView subtotalTextView;
    private TextView noteTextView;
    private Button OrderViewDeleteButton;

    public Order_View_Adapter(Context context, ArrayList<Order_View> data) {
        // TODO Auto-generated constructor stub

        this.context = context;
        this.data= new ArrayList<Order_View>(data);

    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.size();
    }

    @Override
    public Order_View getItem(int position) {
        // TODO Auto-generated method stub
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;
        if (vi == null) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            vi = inflater.inflate(R.layout.order_view_layout, null, true);
        }
        Order_View temp = (Order_View) data.get(position);
        quantityTextView=(TextView)vi.findViewById(R.id.quantityTextView);
        dishNameTextView=(TextView)vi.findViewById(R.id.dishNameTextView);
        subtotalTextView=(TextView)vi.findViewById(R.id.subtotalTextView);
        noteTextView=(TextView)vi.findViewById(R.id.noteTextView);
        OrderViewDeleteButton=(Button)vi.findViewById(R.id.OrderViewDeleteButton);
        //set data
        quantityTextView.setText(Integer.toString(temp.getQuantity()));
        dishNameTextView.setText(temp.getdishName());
        subtotalTextView.setText("$"+Float.toString(temp.getSubtotal()));
        noteTextView.setText(temp.getNote());
        OrderViewDeleteButton.setTag(position);
        OrderViewDeleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = (Integer) v.getTag();
                Order_View order_view = data.get(index);
                data.remove(order_view);
                notifyDataSetChanged();
            }
        });

        return vi;
    }

}