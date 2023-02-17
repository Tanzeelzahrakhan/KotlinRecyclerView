package com.example.recyclerviewinkotline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var  newsRecyclerView: RecyclerView
    private lateinit var newsArrayList: ArrayList<News>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageId= arrayOf(
            R.drawable.d,
            R.drawable.ee,
            R.drawable.f,
            R.drawable.k,
            R.drawable.girl,
            R.drawable.girlbaby,
            R.drawable.h,
            R.drawable.n,
            R.drawable.o,
            R.drawable.c,
            R.drawable.j
        )
        heading= arrayOf(
            "Vestibulum ante ipsum primis in faucibus",
            "Vestibulum ante ipsum primis in faucibus ",
            "orci luctus et ultrices posuere cubilia curae",
            "Aenean sed tortor non felis ornare molestie vitae",
            "Vivamus consequat hendrerit nunc eu fermentum",
            "Nullam vel nunc id odio lobortis molestie. Nulla",
            "Suspendisse tempor euismod mauris sed pretium.",
            "Suspendisse tempor euismod mauris sed pretium.",
            "Suspendisse tempor euismod mauris sed pretium.",
            "Suspendisse tempor euismod mauris sed pretium.",
            "Suspendisse tempor euismod mauris sed pretium.",

        )
        newsRecyclerView=findViewById(R.id.recyclerview)
        newsRecyclerView.layoutManager= LinearLayoutManager(this)
        newsRecyclerView.setHasFixedSize(true)

        newsArrayList= arrayListOf<News>()
        getUserdata()

    }

    private fun getUserdata() {
        for (i in imageId.indices){
            val news=News(imageId[i],heading[i])
            newsArrayList.add(news)
        }
        newsRecyclerView.adapter=MyAdapter(newsArrayList)
    }
}