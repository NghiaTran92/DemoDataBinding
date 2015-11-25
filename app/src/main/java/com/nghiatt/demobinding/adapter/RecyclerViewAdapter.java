package com.nghiatt.demobinding.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nghiatt.demobinding.BR;
import com.nghiatt.demobinding.R;
import com.nghiatt.demobinding.model.User;

import java.util.List;

/**
 * Created by Ngh on 11/26/2015.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.BindingHolder> {
    private List<User> mList;

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;

        public BindingHolder(View v) {
            super(v);
            binding = DataBindingUtil.bind(v);
        }

        public ViewDataBinding getBinding() {
            return binding;
        }
    }

    public RecyclerViewAdapter(List<User> recyclerUsers) {
        this.mList = recyclerUsers;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int type) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false);
        BindingHolder holder = new BindingHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        final User user = mList.get(position);
        holder.getBinding().setVariable(BR.user, user);
        holder.getBinding().setVariable(BR.index,position+"");
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}