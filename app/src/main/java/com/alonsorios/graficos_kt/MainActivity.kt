package com.alonsorios.graficos_kt

import android.R.attr
import android.R.attr.*
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet
import kotlinx.android.synthetic.main.activity_main.*

import android.graphics.Color


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main)

        setBarChart()
    }

    private fun setBarChart() {



        val entries = ArrayList<BarEntry>()

        /*  x -  координаты для обозначения кол-ва стран
        * у - длина графика страны */
        entries.add(BarEntry(1f, 128.932753f, "Mexico")) //Mexico
        entries.add(BarEntry(2f, 145.934462f, "Russia")) //Russia
        entries.add(BarEntry(3f, 164.689383f, "Bangladesh")) //Bangladesh
        entries.add(BarEntry(4f, 206.139589f, "Nigeria")) //Nigeria
        entries.add(BarEntry(5f, 212.559417f, "Brazil")) //Brazil
        entries.add(BarEntry(6f, 220.892000f)) //pakistan
        entries.add(BarEntry(7f, 273.523000f)) //indonesia
        entries.add(BarEntry(8f, 329.484000f))//us
        entries.add(BarEntry(9f, 1380.004000f)) //india
        entries.add(BarEntry(10f, 1402.112000f)) //china
        entries.add(BarEntry(11f, 7322.923012f)) //world


        val barDataSet = BarDataSet(entries, "млн чел")




        val data = BarData( barDataSet)
        barChart.data = data // set the data and list of lables into chart


        barDataSet.color = resources.getColor(R.color.colorAccent)


        barChart.animateY(5000)
    }


}
