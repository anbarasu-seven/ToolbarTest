package com.example.toolbartest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private var textlabel: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textlabel = findViewById<TextView>(R.id.textLabel)

        val toolbar = findViewById<Toolbar>(R.id.my_toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 ->{
                textlabel?.text = "Item 1"
            }

            R.id.item2 ->{
                textlabel?.text = "Item 2"
            }

            R.id.item3 ->{
                textlabel?.text = "Item 3"
            }

            R.id.item4 ->{
                textlabel?.text = "Item 4"
            }

            R.id.item5 ->{
                textlabel?.text = "Item 5"
            }

        }

        return super.onOptionsItemSelected(item)
    }




    fun showToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}