package com.example.json_kotlin.exoKotlin
class Math

fun String.kids() : String {
    var res = ""
    var jump = 0
    for(c in this ){
        if(jump % 2 == 0 || jump == 0){
            res += c.uppercase()
        }else{

            res += c
        }
        jump++
    }
    return res
}

fun Int.sqrt() : Int {
    return kotlin.math.sqrt(this.toDouble()).toInt()
}