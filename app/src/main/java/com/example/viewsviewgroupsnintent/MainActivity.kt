package com.example.viewsviewgroupsnintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewsviewgroupsnintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding:ActivityMainBinding? = null
    var adapter: FactAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        title = "Fun Facts: Did You Know?"

        setUpFact()
    }

    private fun  setUpFact() {
        adapter = FactAdapter(this, DummyData.facts)
        binding?.factListView?.adapter = adapter
    }

    override fun  onDestroy() {
        super.onDestroy()
        binding = null
    }
}