package com.example.finaltest_ex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finaltest_ex.databinding.ActivityContactsBinding
import com.example.finaltest_ex.databinding.ListItemBinding

class ContactsActivity : AppCompatActivity() {
    lateinit var binding: ActivityContactsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "전화번호부"
        val datas = mutableListOf<String>()
        for(i in 1 .. 50){
            datas.add("Item $i")
        }
        /*
        binding.listView.layoutManager = LinearLayoutManager(this)
        binding.listView.adapter = MyAdapter(datas)
        binding.listView.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
         */

    }
}
class MyViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root)

class MyAdapter(val datas:MutableList<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun getItemCount(): Int =datas.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        MyViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as MyViewHolder).binding
        binding.itemData.text = datas[position]
    }
}