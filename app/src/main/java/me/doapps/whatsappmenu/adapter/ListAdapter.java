package me.doapps.whatsappmenu.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import me.doapps.whatsappmenu.R;

/**
 * Created by doapps on 9/17/16.
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.UserViewHolder> {
    private Context context;
    private List<String> names;
    private LayoutInflater inflater;

    public ListAdapter(Context context, List<String> names) {
        this.context = context;
        this.names = names;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_list, parent, false);
        UserViewHolder holder = new UserViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.text_name.setText(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    /**
     * Holder Class
     **/
    class UserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView text_name;

        public UserViewHolder(View itemView) {
            super(itemView);
            text_name = (TextView) itemView.findViewById(R.id.text_name);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
