package com.example.viewsviewgroupsnintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.example.viewsviewgroupsnintent.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private var binding:ActivityDetailBinding? = null
    private  var logo = 0
    private var name:String? = null
    private var detail:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)

        setContentView(binding?.root)

        val actionBar : ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)

        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRAS, 0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAS)
        detail = intent.getStringExtra(FactAdapter.FACT_EXTRAS)

        setUpFactDetail()
    }

    private fun  setUpFactDetail() {
        binding?.detailTextView?.text = detail
        binding?.logoImageView?.setImageResource(logo)
        title = name
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}