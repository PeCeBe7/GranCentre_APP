package com.example.grancentreapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MovieActivity : AppCompatActivity() {


    val APIservice by lazy {
        com.example.grancentreapp.ApiService.create()
    }
    var disposable: Disposable? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)
        getData()
    }

    private fun getData() {
        disposable =
                APIservice.getMovie()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe { result ->
                            val list_movies: RecyclerView
                            list_movies = findViewById(R.id.list_movies)
                            list_movies.layoutManager = LinearLayoutManager(this)
                            list_movies.adapter = RecyclerAdapter(result.movies)
                        }
    }
}