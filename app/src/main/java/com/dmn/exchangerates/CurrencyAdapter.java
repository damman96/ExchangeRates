package com.dmn.exchangerates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CurrencyAdapter extends BaseAdapter {

private Context context;
private List<Currency> currencyList;
private Integer[] imgid;
private String[] names;

public CurrencyAdapter(Context context, List<Currency> currencyList, Integer[] imgid, String[] shortcut) {
        this.context = context;
        this.currencyList = currencyList;
        this.imgid = imgid;
        this.names = shortcut;
}

@Override
public int getCount() {
        return currencyList.size();
}

@Override
public Object getItem(int position) {
        return currencyList.get(position);
}

@Override
public long getItemId(int position) {
        return position;
}

@Override
public View getView(int position, View convertView, ViewGroup parent) {

        View view = View.inflate(context, R.layout.list_item, null);
        TextView tvShortcut = (TextView)view.findViewById(R.id.shortcut);
        TextView tvValue = (TextView)view.findViewById(R.id.value);
        TextView tvName = (TextView)view.findViewById(R.id.name);
        TextView tvUserValue = (TextView)view.findViewById(R.id.userValue);
        ImageView imgView = (ImageView)view.findViewById(R.id.imageView);

        tvShortcut.setText(currencyList.get(position).getShortcut());
        tvValue.setText(currencyList.get(position).getValue());
        tvName.setText(names[position]);
        tvUserValue.setText(DataHolder.getInstance().getUserValue());
        imgView.setImageResource(imgid[position]);

        return view;
}
}
