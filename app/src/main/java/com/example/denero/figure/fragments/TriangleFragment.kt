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
import com.example.denero.figure.model.Triangle

/**
 * Created by DENERO on 03.12.2017.
 */
class TriangleFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view:View = inflater!!.inflate(R.layout.triangle_fragment,container,false)
        var edtOneSide = view.findViewById<EditText>(R.id.edt_triangle_one_side)
        var edtTwoSide = view.findViewById<EditText>(R.id.edt_triangle_two_side)
        var edtThreeSide = view.findViewById<EditText>(R.id.edt_triangle_three_side)
        var btnCalculate = view.findViewById<Button>(R.id.rect_calculate)
        var tvResult = view.findViewById<TextView>(R.id.result_rect)
        edtOneSide.hint = activity.getString(R.string.input_one_side)
        edtTwoSide.hint = getString(R.string.input_two_side)
        edtThreeSide.hint = getString(R.string.input_three_side)
        btnCalculate.setOnClickListener(View.OnClickListener {
            if(edtOneSide.text.toString()!="" && edtTwoSide.text.toString()!="" && edtThreeSide.text.toString()!=""){
                var figure = Triangle(edtOneSide.text.toString().toFloat()
                        ,edtTwoSide.text.toString().toFloat()
                        ,edtThreeSide.text.toString().toFloat())
                if(figure.perimetr!=0f&&figure.space!=0f)
                    tvResult.text = "\nP="+figure.perimetr+"\nS="+figure.space
                else
                    Toast.makeText(activity.applicationContext,getString(R.string.eror_create), Toast.LENGTH_SHORT).show()
            }
            else
                Toast.makeText(activity.applicationContext, R.string.error_input, Toast.LENGTH_SHORT).show()
        })
        return view
    }
}