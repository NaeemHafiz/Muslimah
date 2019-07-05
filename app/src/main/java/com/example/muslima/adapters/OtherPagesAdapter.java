package com.example.muslima.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.muslima.R;
import com.example.muslima.interfaces.ItemClickListener;

import java.util.List;

public class OtherPagesAdapter extends RecyclerView.Adapter<OtherPagesAdapter.SettingsViewHolder> {

    private List<String> otherpagesList;
    private ItemClickListener onItemClickListener;


    public class SettingsViewHolder extends RecyclerView.ViewHolder {
        public TextView tvOtherpager ;

        public SettingsViewHolder(View view) {
            super(view);
            tvOtherpager = view.findViewById(R.id.tvOtherpagerid);
            view.setTag(this);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (onItemClickListener != null)
                        onItemClickListener.onItemClick(view, getAdapterPosition());
                }
            });
        }

    }

    public OtherPagesAdapter(List<String> settingsList) {
        this.otherpagesList = settingsList;
    }

    @NonNull
    @Override
    public SettingsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_otherpages, parent, false);
        return new SettingsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SettingsViewHolder holder, int position) {
        String settingName = otherpagesList.get(position);
        holder.tvOtherpager.setText(settingName);
    }

    @Override
    public int getItemCount() {
        return otherpagesList.size();
    }

    public void setItemClickListener(ItemClickListener clickListener) {
        onItemClickListener = clickListener;
    }
}