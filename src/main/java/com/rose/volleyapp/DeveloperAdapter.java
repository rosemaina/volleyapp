package com.rose.volleyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class DeveloperAdapter extends RecyclerView.Adapter<DeveloperAdapter.ViewHolder> {
    //to hold data
    private List<DeveloperList> developerList;
    private Context mContext;

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView devName;
        public ImageView avatarURL;
        public TextView githubURL;
        public LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            devName = itemView.findViewById(R.id.username);
            avatarURL = itemView.findViewById(R.id.imageView);
            githubURL = itemView.findViewById(R.id.githubUrl);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }

    @NonNull
    @Override
    public DeveloperAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new
                ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.developer_list, parent, false));
    }

    @Override
    // connects data with viewholder
    public void onBindViewHolder(@NonNull DeveloperAdapter.ViewHolder holder, int position) {
        // create a var to get current instance of dev in the list
        final DeveloperList currentDev = developerList.get(position);
        holder.devName.setText(currentDev.getDevName());
        holder.githubURL.setText(currentDev.getGitHubURL());

        // use picasso to load images
        Picasso.with(mContext).load(currentDev.getAvatarURL()).into(holder.avatarURL);
    }

    @Override
    public int getItemCount() {
        // returns the list of developers
        return developerList.size();
    }

    // Implement the constructor
    public DeveloperAdapter(List<DeveloperList> developerList, Context context) {
        this.developerList = developerList;
        this.mContext = context;
    }
}
