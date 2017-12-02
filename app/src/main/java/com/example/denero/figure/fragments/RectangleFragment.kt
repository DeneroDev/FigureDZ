package com.example.denero.figure.fragments

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.denero.figure.R
import com.example.denero.figure.model.Rectangle


class RectangleFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view:View = inflater!!.inflate(R.layout.rectangle_fragment,container,false)
        var edtWidth = view.findViewById<EditText>(R.id.rect_width)
        var edtHeight = view.findViewById<EditText>(R.id.rect_height)
        var edtX = view.findViewById<EditText>(R.id.rect_x)
        var edtY = view.findViewById<EditText>(R.id.rect_y)
        edtX.visibility = View.INVISIBLE
        edtY.visibility = View.INVISIBLE
        var chkTwoSide = view.findViewById<CheckBox>(R.id.chk_side)
        var btnCalculate = view.findViewById<Button>(R.id.rect_calculate)
        var tvResult = view.findViewById<TextView>(R.id.result_rect)

        edtWidth.hint = activity.getString(R.string.input_width)
        edtHeight.hint = activity.getString(R.string.input_height)
        chkTwoSide.setOnClickListener(View.OnClickListener {
            if(chkTwoSide.isChecked)
            {
                edtX.visibility = View.INVISIBLE
                edtY.visibility = View.INVISIBLE
                edtWidth.hint = activity.getString(R.string.input_width)
                edtHeight.hint = activity.getString(R.string.input_height)
            }
            else
            {   edtX.visibility = View.VISIBLE
                edtY.visibility = View.VISIBLE
                edtWidth.hint = "X1"
                edtHeight.hint = "Y1"
                edtX.hint = "X2"
                edtY.hint = "Y2"
            }
        })
        btnCalculate.setOnClickListener(View.OnClickListener {
            btnCalculate.setOnClickListener(View.OnClickListener {
                if(chkTwoSide.isChecked){
                    if(edtWidth.text.toString()!="" && edtHeight.text.toString()!=""){
                        val figure = Rectangle(edtWidth.text.toString().toFloat(),edtHeight.text.toString().toFloat())
                        tvResult.text = "\nP="+figure.perimetr+"\nS="+figure.space
                    }
                    else
                        Toast.makeText(activity.applicationContext, R.string.error_input, Toast.LENGTH_SHORT).show()
                }
                else
                {
                    if(edtWidth.text.toString()!="" && edtHeight.text.toString()!=""){
                        val figure = Rectangle(edtWidth.text.toString().toFloat(),edtHeight.text.toString().toFloat(),edtX.text.toString().toFloat(),edtY.text.toString().toFloat())
                        tvResult.text = "\nP="+figure.perimetr+"\nS="+figure.space
                    }
                    else
                        Toast.makeText(activity.applicationContext, R.string.error_input, Toast.LENGTH_SHORT).show()
                }
                }
               )
        })
        return view
    }
}