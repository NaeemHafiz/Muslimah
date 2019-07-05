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

public class SettingsAdapter extends RecyclerView.Adapter<SettingsAdapter.SettingsViewHolder> {

    private List<String> settingsList;
    private ItemClickListener onItemClickListener;


    public class SettingsViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSettingName;

        public SettingsViewHolder(View view) {
            super(view);
            tvSettingName = view.findViewById(R.id.tvSettingName);
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
    public SettingsAdapter(List<String> settingsList) {
        this.settingsList = settingsList;
    }
    @NonNull
    @Override
    public SettingsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_setting, parent, false);
        return new SettingsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SettingsViewHolder holder, int position) {
        String settingName = settingsList.get(position);
        holder.tvSettingName.setText(settingName);
    }

    @Override
    public int getItemCount() {
        return settingsList.size();
    }

    public void setItemClickListener(ItemClickListener clickListener) {
        onItemClickListener = clickListener;
    }
}