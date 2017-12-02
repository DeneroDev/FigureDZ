package com.example.denero.figure

import android.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView
import com.example.denero.figure.fragments.CircleFragment
import com.example.denero.figure.fragments.RectangleFragment
import com.example.denero.figure.fragments.TriangleFragment


class MainActivity : AppCompatActivity() {
    lateinit var spinner:Spinner
    lateinit var fragTrans:FragmentManager
    lateinit var rectFr: RectangleFragment
    lateinit var circleFr: CircleFragment
    lateinit var triangleFr: TriangleFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinner = findViewById(R.id.spinner_change_figure)
        circleFr = CircleFragment()
        rectFr = RectangleFragment()
        triangleFr = TriangleFragment()



        spinner.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                fragTrans = fragmentManager
               when(p2){
                   0 -> {
                       fragTrans.beginTransaction().replace(R.id.frgmCont,rectFr).commit()
                   }
                   1 -> {
                       fragTrans.beginTransaction().replace(R.id.frgmCont,circleFr).commit()
                   }
                   2->{
                     fragTrans.beginTransaction().replace(R.id.frgmCont,triangleFr).commit()
                   }
               }
            }
        }

    }


}
