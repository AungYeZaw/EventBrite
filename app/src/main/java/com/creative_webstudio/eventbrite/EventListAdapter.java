package com.creative_webstudio.eventbrite;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.ViewHolderEvent> {

    Context context;

    public EventListAdapter(Context context) {
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolderEvent onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.view_holder,viewGroup,false);
        ViewHolderEvent vH = new ViewHolderEvent(v);
        return vH;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderEvent viewHolderEvent, int i) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolderEvent extends RecyclerView.ViewHolder {
        public ViewHolderEvent(@NonNull View itemView) {
            super(itemView);
        }

    }
}
