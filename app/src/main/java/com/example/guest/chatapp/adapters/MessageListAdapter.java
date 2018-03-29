package com.example.guest.chatapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.guest.chatapp.R;
import com.example.guest.chatapp.models.Messages;
import com.example.guest.chatapp.models.Users;
import com.example.guest.chatapp.ui.SendMessageActivity;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

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
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.message_list_item, parent, false);

        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MessageListAdapter.MessageViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MessageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.userNameTextView)
        TextView mUserNameTextView;

        private Context mContext;

        public MessageViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
            itemView.setOnClickListener(this);
        }

        public void bindUser(Users user) {
            mUserNameTextView.setText(user.getName());
        }

        @Override
        public void onClick(View v) {
            int itemPosition = getLayoutPosition();
            Intent intent = new Intent(mContext, SendMessageActivity.class);
            intent.putExtra("position", itemPosition + "");
            intent.putExtra("messages", Parcels.wrap(mMessages));
            mContext.startActivity(intent);
        }
    }
}
