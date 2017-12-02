package com.example.denero.figure.model

/**
 * Created by DENERO on 27.11.2017.
 */
class Rectangle(): Figure() {
    var width = 0f
    var height = 0f

   constructor(width:Float,height:Float) : this() {
       this.width = width
       this.height = height
       perimetr = (width*2+height*2)
       space = (width*height)
   }
    constructor(x1:Float,y1:Float,x2:Float,y2:Float):this(){
        this.width = Math.sqrt(Math.pow((x2-x1).toDouble(),2.0)+Math.pow((y1-y1).toDouble(),2.0)).toFloat()
        this.height = Math.sqrt(Math.pow((x1-x1).toDouble(),2.0)+Math.pow((y2-y1).toDouble(),2.0)).toFloat()
        perimetr = (width*2+height*2)
        space = (width*height)
    }


}