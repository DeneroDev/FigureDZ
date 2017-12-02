package com.example.denero.figure.model

import android.widget.Toast

/**
 * Created by DENERO on 27.11.2017.
 */
class Triangle(var a:Float,var b:Float,var c:Float): Figure() {
    init {
        if(a+b>c&&a+c>b&&c+b>a){
            perimetr = a+b+c
            space = Math.sqrt(perimetr/2*(perimetr/2 - a)*(perimetr/2 - b)*(perimetr/2 - c).toDouble()).toFloat()
        }
    }
}