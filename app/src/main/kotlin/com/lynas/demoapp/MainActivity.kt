package com.lynas.demoapp
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            Toast.makeText(this@MainActivity, "Hello", Toast.LENGTH_SHORT).show()
        }


        var items = ArrayList<String>()
        items.add("item 1")
        items.add("item 2")
        items.add("item 3")
        items.add("item 4")

        listView.adapter = ArrayAdapter<String>(this@MainActivity, android.R.layout.simple_list_item_1, items)

    }
}
