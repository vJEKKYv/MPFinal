package com.example.finaltest_ex

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.finaltest_ex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "기말고사"
        toggle = ActionBarDrawerToggle(this,binding.main,R.string.drawer_open, R.string.drawer_close)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toggle.syncState()
        binding.mainDrawer.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.contacts -> startActivity(Intent(this,ContactsActivity::class.java))
                R.id.stop_watch -> startActivity(Intent(this, StopwatchActivity::class.java))
                R.id.diary -> startActivity(Intent(this, DiaryActivity::class.java))
                R.id.view_pager -> startActivity(Intent(this, ViewpagerActivity::class.java))
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) return true
        return super.onOptionsItemSelected(item)
    }
}