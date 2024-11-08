package com.example.mycafee

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        fetch recycler view by id

        val  recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
//        define layout mananger
//        sete layout mananger to appeare in vertical format

        val layoutmanager = LinearLayoutManager(applicationContext)

//        put the layout mananger inside the recycler to make items appear vertical

        recyclerView.layoutManager = layoutmanager
//        get an instance of the recycler adapter >?
//        the recycler adapter contains all the arrays  which include , images titles, decsription and cost
        val adapter = RecyclerAdapter(applicationContext)

//        load the datat to recycler view
        recyclerView.adapter = adapter

    }
}