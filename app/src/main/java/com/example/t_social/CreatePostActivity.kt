package com.example.t_social

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.t_social.daos.PostDao
import kotlinx.android.synthetic.main.activity_create_post.*

class CreatePostActivity : AppCompatActivity() {
    private lateinit var postDao: PostDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        postDao = PostDao()
        postButton.setOnClickListener {
            val input0=titleInput.text.toString().trim()
            val input=postInput.text.toString().trim()
            if (input.isNotEmpty() && input0.isNotEmpty()){
                postDao.addPost(input0,input)
                finish()
            }

        }
    }
}