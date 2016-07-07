package com.dzzchao.multitemlistviewdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.dzzchao.multitemlistviewdemo.R;
import com.dzzchao.multitemlistviewdemo.bean.DataBean;

import java.util.List;

/**
 * adapter
 * <p/>
 * Created by zhang on 7/6/2016.
 */
public class MyAdapter extends BaseAdapter {

    private List<DataBean> mList;
    private Context mContext;

    private final int TYPE_ONE = 0;
    private final int TYPE_TWO = 1;

    public MyAdapter(Context Context, List list) {
        mContext = Context;
        mList = list;
    }


    @Override
    public int getItemViewType(int position) {
        if (TYPE_ONE == mList.get(position).getType()) {
            return TYPE_ONE;
        } else if (TYPE_TWO == mList.get(position).getType()) {
            return TYPE_TWO;
        } else {
            return -1;
        }
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

//    MyViewHolder viewHolder = null;
//    if (view == null) {
//        view = LayoutInflater.from(mContext).inflate(R.layout.item_list, null);
//        viewHolder = new MyViewHolder();
//        viewHolder.textView = (TextView) view.findViewById(R.id.tv_list);
//        view.setTag(viewHolder);
//    } else {
//        viewHolder = (MyViewHolder) view.getTag();
//    }
//
//    viewHolder.textView.setText(getItem(i).toString());
//    return view;

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder1 viewHolder1 = null;
        ViewHolder2 viewHolder2 = null;

        int type = getItemViewType(position);
        if (convertView == null) {
            switch (type) {
                case TYPE_ONE:
                    convertView = LayoutInflater.from(mContext).inflate(R.layout.listitem_one,null);
                    viewHolder1 = new ViewHolder1();
                    viewHolder1.tvName = (TextView) convertView.findViewById(R.id.tv_name);
                    viewHolder1.tvAge = (TextView) convertView.findViewById(R.id.tv_age);
                    convertView.setTag(viewHolder1);
                    break;
                case TYPE_TWO:
                    convertView = LayoutInflater.from(mContext).inflate(R.layout.listitem_two,null);
                    viewHolder2 = new ViewHolder2();
                    viewHolder2.tvName = (TextView) convertView.findViewById(R.id.tv_name);
                    viewHolder2.tvAge = (TextView) convertView.findViewById(R.id.tv_age);
                    convertView.setTag(viewHolder2);
                    break;
            }
        } else {
            switch (type)
            {
                case TYPE_ONE:
                    viewHolder1 = (ViewHolder1) convertView.getTag();
                    break;
                case TYPE_TWO:
                    viewHolder2 = (ViewHolder2) convertView.getTag();
                    break;
            }
        }

        switch (type)
        {
            case TYPE_ONE:
                viewHolder1.tvName.setText(mList.get(position).getName());
                viewHolder1.tvAge.setText(mList.get(position).getAge());
                break;
            case TYPE_TWO:
                viewHolder2.tvName.setText(mList.get(position).getName());
                viewHolder2.tvAge.setText(mList.get(position).getAge());
                break;
        }

        return convertView;
    }

    class ViewHolder1 {
        TextView tvName;
        TextView tvAge;
    }

    class ViewHolder2 {
        TextView tvName;
        TextView tvAge;
    }
}