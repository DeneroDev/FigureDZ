package com.example.denero.figure.fragments

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.denero.figure.R
import com.example.denero.figure.model.Circle

/**
 * Created by DENERO on 03.12.2017.
 */
class CircleFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view:View = inflater!!.inflate(R.layout.circle_fragment,container,false)
        var edtRadius = view.findViewById<EditText>(R.id.circle_radius_edt)
        edtRadius.hint = activity.getString(R.string.input_radius)
        var btnCalculate = view.findViewById<Button>(R.id.rect_calculate)
        var tvResult = view.findViewById<TextView>(R.id.result_rect)
        btnCalculate.setOnClickListener(View.OnClickListener {
            if(edtRadius.text.toString()!=""){
                var figure = Circle(edtRadius.text.toString().toDouble())
                tvResult.text = "\nP="+figure.perimetr+"\nS="+figure.space
            }
            else
                Toast.makeText(activity.applicationContext, R.string.error_input, Toast.LENGTH_SHORT).show()
        })
        return view
    }

}