package com.example.chelsea.listview;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chelsea.R;

public class MyListAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyListAdapter(Context context) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder {
        public ImageView ivIcon;
        public TextView tvTitle, tvTime, tvContent;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder mViewHolder = null;
        if (view == null) {
            view = mLayoutInflater.inflate(R.layout.layout_list_item, null);
            mViewHolder = new ViewHolder();
            mViewHolder.ivIcon = (ImageView)view.findViewById(R.id.iv_icon);
            mViewHolder.tvTitle = (TextView)view.findViewById(R.id.tv_title);
            view.setTag(mViewHolder);
        } else {
            mViewHolder = (ViewHolder)view.getTag();
        }

        mViewHolder.tvTitle.setText("啦啦啦啦啦");
//        mViewHolder.ivIcon.setImageURI(Uri.parse("111"));
        return view;
    }
}
