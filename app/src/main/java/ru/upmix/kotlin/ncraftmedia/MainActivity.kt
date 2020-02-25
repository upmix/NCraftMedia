package ru.upmix.kotlin.ncraftmedia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import ru.upmix.kotlin.ncraftmedia.dto.Post

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val post = Post(
            1,
            "Alex",
            "23 february 2020",
            "First post in our network",
            10,
            0,
            25,
            isSelfLiked = true,
            isSelfCommented = false,
            isSelfShared = true
        )
        postDate.text = post.date
        nicname.text = post.login
        postTitle.text = post.text
        if (post.isSelfLiked) {
            likeButton.setImageResource(R.drawable.ic_favorite_active_24dp)
        }
        if (post.isSelfCommented) {
            commentButton.setImageResource(R.drawable.ic_mode_comment_active_24dp)
        }
        if (post.isSelfShared) {
            shareButton.setImageResource(R.drawable.ic_share_active_24dp)
        }
        if (post.likesCount!! >0) {
            likeCount.text = post.likesCount.toString()
        }
        if (post.commentsCount!! >0) {
            commentCount.text = post.commentsCount.toString()
        }
        if (post.sharesCount!! >0) {
            shareCount.text = post.sharesCount.toString()
        }

    }


}
