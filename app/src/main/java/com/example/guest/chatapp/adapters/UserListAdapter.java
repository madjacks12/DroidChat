package com.example.guest.chatapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.guest.chatapp.R;
import com.example.guest.chatapp.models.Users;
import com.example.guest.chatapp.ui.SendMessageActivity;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;
import org.w3c.dom.Text;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Guest on 3/28/18.
 */

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserViewHolder> {
    private ArrayList<Users> mUsers = new ArrayList<>();
    private Context mContext;

    public UserListAdapter(Context context, ArrayList<Users> users) {
        mContext = context;
        mUsers = users;
    }


    @Override
    public UserListAdapter.UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list_item, parent, false);
        UserViewHolder viewHolder = new UserViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(UserListAdapter.UserViewHolder holder, int position) {
        holder.bindUser(mUsers.get(position));
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.userNameTextView)
        TextView mUserNameTextView;

        private Context mContext;

        public UserViewHolder(View itemView) {
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
            intent.putExtra("restaurants", Parcels.wrap(mUsers));
            mContext.startActivity(intent);
        }
    }
}