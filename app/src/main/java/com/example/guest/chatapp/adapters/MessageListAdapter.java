package com.example.guest.chatapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.guest.chatapp.models.Messages;
import com.example.guest.chatapp.models.Users;

import java.util.ArrayList;

/**
 * Created by Guest on 3/29/18.
 */

public class MessageListAdapter extends RecyclerView.Adapter<MessageListAdapter.MessageViewHolder> {
    private ArrayList<Messages> mMessages = new ArrayList<>();
    private Context mContext;


    public MessageListAdapter(Context context, ArrayList<Messages> messages) {
        mContext = context;
        mMessages = messages;
    }

    @Override
    public MessageListAdapter.MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MessageListAdapter.MessageViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
