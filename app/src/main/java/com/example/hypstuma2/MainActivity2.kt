package com.example.hypstuma2

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.hypstuma2.fragments.AccFragment
import com.example.hypstuma2.fragments.ChatFragment
import com.example.hypstuma2.fragments.HomeFragment
import com.example.hypstuma2.fragments.SettingFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity2 : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerlayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


          val homeFragment= HomeFragment()
          val accFragment= AccFragment()
         val chatFragment= ChatFragment()
          val settingsFragment= SettingFragment()
         val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_bar)

         replaceFragment(homeFragment)

         bottomNav.setOnItemSelectedListener {
             when(it.itemId){
                 R.id.ic_home -> replaceFragment(homeFragment)
                 R.id.ic_chat -> replaceFragment(chatFragment)
                 R.id.ic_acc -> replaceFragment(accFragment)
                 R.id.ic_setting -> replaceFragment(settingsFragment)
             }
             true
         }

         val drawerLayout: DrawerLayout =findViewById(R.id.drawerLayout)
         val navView: NavigationView = findViewById(R.id.nav_view)

         toggle= ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
         drawerLayout.addDrawerListener(toggle)
         toggle.syncState()

         supportActionBar?.setDisplayHomeAsUpEnabled(true)

         navView.setNavigationItemSelectedListener {
             it.isChecked=true
             when(it.itemId){
                 R.id.nav_aboutUs -> replaceFragment(AboutUsFragment(),it.title.toString())
                 R.id.nav_contactUs -> replaceFragment(ContactUsFragment(),it.title.toString())
                 R.id.nav_rateUs -> Toast.makeText(applicationContext,"Clicked Rate Us",Toast.LENGTH_SHORT).show()
             }
             true
         }

    }

    private fun replaceFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment,fragment)
        transaction.commit()
    }

    private fun replaceFragment(fragment: Fragment,title: String)
    {
        drawerlayout =findViewById(R.id.drawerLayout)
        val fragmentManager= supportFragmentManager
        val fragmentTransaction= fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment,fragment)
        fragmentTransaction.commit()
        drawerlayout.closeDrawers()
        setTitle(title)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}