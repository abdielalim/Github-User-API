package com.abdielalim.githubuserapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdielalim.githubuserapi.adapter.PagerAdapter
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    private var name: String? = null
    private  var url: String? = null
    private  var urlimg: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        name =  intent.getStringExtra("name")
        url = intent.getStringExtra("url")
        urlimg = intent.getStringExtra("urlimg")


        detailLogin.setText(name)
        detailUrl.setText(url)

        Picasso.get()
            .load(urlimg)
            .into(detailAvatar)

        supportActionBar?.apply {
            elevation = 0f
            title = ""
        }

        detailPager.adapter = PagerAdapter(supportFragmentManager)
        detailTab.setupWithViewPager(detailPager)
    }
}