package com.example.denero.figure.model

/**
 * Created by DENERO on 27.11.2017.
 */
open class Figure {
    var x:Float= 0f
    var y:Float = 0f
    var perimetr:Float = 0f
        protected set(value) {
            if(value>=0)
                field = value
        }

    var space:Float = 0f
        protected set(value) {
            if (value >= 0)
                field = value
        }

}