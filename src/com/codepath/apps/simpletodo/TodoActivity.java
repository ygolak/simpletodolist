package com.codepath.apps.simpletodo;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TodoActivity extends Activity {
	ArrayList<String> items;
	ArrayAdapter<String> itemsAdapter;
	ListView lvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        lvItems = (ListView) findViewById(R.id.lvItems);
        items = new ArrayList<String>();
        itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        lvItems.setAdapter(itemsAdapter);
        items.add("First Item");
        items.add("Second Item");
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	return false;
    	//getMenuInflater().inflate(R.menu.todo, menu);
    }
}
