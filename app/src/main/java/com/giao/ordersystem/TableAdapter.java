package com.giao.ordersystem;

/**
 * Created by Long on 2/12/2016.
 */

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TableAdapter extends BaseAdapter{
    Context context;
    List<TableBO> data;
    private static LayoutInflater inflater = null;

    public TableAdapter(Context context, List<TableBO> data) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.size();
    }

    @Override
    public TableBO getItem(int position) {
        // TODO Auto-generated method stub
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
     /*   View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.row, null);
        TextView category = (TextView) vi.findViewById(R.id.category);
        TextView amount=(TextView) vi.findViewById(R.id.amount);
        TextView note=(TextView) vi.findViewById(R.id.note);
        TableBO temp=(TableBO)data.get(position);
        category.setText(temp.getCategory());
        amount.setText("$"+temp.getAmount());
        note.setText(temp.getNote());
        return vi;*/
        return null;
    }

}
