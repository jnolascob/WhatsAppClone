package me.doapps.whatsappmenu.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import me.doapps.whatsappmenu.R;
import me.doapps.whatsappmenu.adapter.ListAdapter;
import me.doapps.whatsappmenu.listener.RecyclerItemClickListener;

/**
 * Created by doapps on 9/17/16.
 */
public class ListActivity extends AppCompatActivity {
    private RecyclerView recycler_users;
    private ListAdapter listAdapter;
    private List<String> names;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        loadData();

        recycler_users = (RecyclerView) findViewById(R.id.recycler_users);
        listAdapter = new ListAdapter(this, names);
        recycler_users.setAdapter(listAdapter);
        recycler_users.setLayoutManager(new LinearLayoutManager(this));

        recycler_users.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                startActivity(new Intent(ListActivity.this, MainActivity.class));
            }
        }));
    }

    private void loadData() {
        names = new ArrayList<>();
        names.add("Jorgezno Ramirez");
        names.add("Toby Gonzales");
        names.add("Jorgezno Ramirez");
        names.add("Toby Gonzales");
        names.add("Jorgezno Ramirez");
        names.add("Toby Gonzales");
        names.add("Jorgezno Ramirez");
        names.add("Toby Gonzales");
        names.add("Jorgezno Ramirez");
        names.add("Toby Gonzales");
    }
}
