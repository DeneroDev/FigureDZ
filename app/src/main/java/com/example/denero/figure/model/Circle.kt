package com.example.denero.figure.model

/**
 * Created by DENERO on 27.11.2017.
 */
class Circle(var radius:Double): Figure() {
    companion object {
        val p:Double = 3.14
    }
    init {
        perimetr = (2* p *radius).toFloat()
        space = (Math.pow(radius,2.0)* p).toFloat()
    }
}