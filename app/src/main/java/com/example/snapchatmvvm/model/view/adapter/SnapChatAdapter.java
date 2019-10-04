package com.example.snapchatmvvm.model.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.snapchatmvvm.R;
import com.example.snapchatmvvm.model.model.SnapStory;

import java.util.List;

public class SnapChatAdapter extends RecyclerView.Adapter<SnapChatAdapter.SnapStoryViewHolder> {

    private List<SnapStory>snapStoryList;
    private Context context;



    public SnapChatAdapter(List<SnapStory> snapStoryList) { this.snapStoryList = snapStoryList;    }

    @NonNull
    @Override
    public SnapStoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.snap_story_item,
                parent,
                false);
        return new SnapStoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SnapStoryViewHolder holder, int position) {

        SnapStory snapStory = snapStoryList.get(position);

        String userName = snapStory.getUserName();
        holder.userName.setText(userName);


        Glide.with(context).load(snapStory.getImageUrl()).into(holder.imageURL);

    }

    @Override
    public int getItemCount() { return snapStoryList.size(); }

    class SnapStoryViewHolder extends RecyclerView.ViewHolder{

        TextView userName;
        ImageView imageURL;

        public SnapStoryViewHolder(@NonNull View itemView) {
            super(itemView);

            userName = itemView.findViewById(R.id.tv_name);
            imageURL = itemView.findViewById(R.id.iv_image);
        }
    }
}
