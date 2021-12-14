package com.example.week03day03exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var ListView1: ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        connectViews()
        prepareListView()
    }
    private fun connectViews(){ ListView1=findViewById(R.id.ListView1) }
    private fun prepareListView(){
        var array:ArrayList<String> = ArrayList()
        array.add("Faisal")
        array.add("Omar")
        array.add("Ali")
        array.add("Salam")
        var arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,array)
        ListView1?.adapter =arrayAdapter

        ListView1?.setOnItemClickListener { parent, view, position, id ->
            Log.e("Test","${array.get(position)}")
            array.removeAt(position);arrayAdapter.notifyDataSetChanged() }

    }
}