package com.fangzhi.dafangzhi.activity.room.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.fangzhi.dafangzhi.activity.room.bean.StairTypeList;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

/**
 * Created by smacr on 2016/9/1.
 */
public class RoomHeandAdapter extends RecyclerArrayAdapter<StairTypeList> {
    public RoomHeandAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new RoomHeandViewHolder(parent);
    }
}
