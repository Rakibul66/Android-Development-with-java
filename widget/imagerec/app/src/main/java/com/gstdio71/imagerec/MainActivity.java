package com.gstdio71.imagerec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements MyAdapter.ItemClickListener{
    private RecyclerView mRecyclerView;
    private MyAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
// use this setting to improve performance if you know that changes
// in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);
        List<Itemlistobject> rowListItem = getAllItemList();
// use a linear layout manager
        mLayoutManager = new LinearLayoutManager(MainActivity.this);
        mRecyclerView.setLayoutManager(mLayoutManager);
// specify an adapter (see also next example)
        mAdapter =new MyAdapter(MainActivity.this,rowListItem);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setClickListener(this);
    }
    private List<Itemlistobject> getAllItemList() {

        List<Itemlistobject> allItems = new ArrayList<Itemlistobject>();

        allItems.add(new Itemlistobject("Apple","25 Nov", R.drawable.i));
        allItems.add(new Itemlistobject("Apple2","26 Nov",R.drawable.a));
        allItems.add(new Itemlistobject("Apple3","27 Nov", R.drawable.s));
        allItems.add(new Itemlistobject("Apple4","28 Nov", R.drawable.a));
        allItems.add(new Itemlistobject("Apple5","29 Nov",R.drawable.s));
        allItems.add(new Itemlistobject("Apple6","30 Nov",R.drawable.a));
        allItems.add(new Itemlistobject("Apple7","1 Dec",R.drawable.a));
        allItems.add(new Itemlistobject("Apple8","2 Dec",R.drawable.a));
        allItems.add(new Itemlistobject("Apple9","3 Dec", R.drawable.i));

        return allItems;
    }
    @Override
    public void itemClick(View view, int position) {

        switch(view.getId()){
            case R.id.imageView:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }
}
