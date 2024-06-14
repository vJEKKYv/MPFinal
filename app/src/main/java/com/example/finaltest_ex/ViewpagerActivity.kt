package com.example.finaltest_ex

import android.app.LauncherActivity.ListItem
import android.os.Binder
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finaltest_ex.databinding.ActivityViewpagerBinding
import com.example.finaltest_ex.databinding.ItemPagerBinding
import com.example.finaltest_ex.databinding.ListItemBinding
import com.google.android.material.tabs.TabLayoutMediator

class ViewpagerActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewpagerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewpagerBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_viewpager)
        title = "뷰 페이저"
        val datas = listOf("갤러리", "카메라", "웹", "배터리량", "뷰 설정")
        binding.viewpager.adapter = MyPagerAdapter(datas)
        TabLayoutMediator(binding.tabs, binding.viewpager) { tab, position ->
            tab.text = "${datas[position].toString()}"
        }.attach()

    }
}
class MyPagerViewHolder(val binding: ItemPagerBinding): RecyclerView.ViewHolder(binding.root)

class MyPagerAdapter(val datas: List<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int = datas.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        MyPagerViewHolder(ItemPagerBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as MyPagerViewHolder).binding
    }
}