package com.example.tabtoolbarapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var vlVistaTabla:TabLayout
    private lateinit var vpVistaPager:ViewPager2

    private val adaptador by lazy{
        vpAdaptador(this)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vlVistaTabla = findViewById(R.id.tl_VistaTablero)
        vpVistaPager = findViewById(R.id.vp_VistaPager)

        vpVistaPager.adapter = adaptador
/*
        val mediadorTabla:TabLayoutMediator = TabLayoutMediator(vlVistaTabla,vpVistaPager,
            TabLayoutMediator.TabConfigurationStrategy{
            tab, position ->
                when(position){
                    0->{
                        tab.text = "Opcion 1"
                        tab.setIcon(R.drawable.ic_img1)
                        //val badge:BadgeDrawable = tab.orCreateBadge
                       // badge.backgroundColor = ContextCompat.getColor(applicationContext,R.color.miColor)
                        //badge.isVisible = true

                    }
                    1->{
                        tab.text = "Opcion 2"
                    }
                    2->{
                        tab.text = "Opcion 3"
                    }
                }
        })
        mediadorTabla.attach()*/
    }
}