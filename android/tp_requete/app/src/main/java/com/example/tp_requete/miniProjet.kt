package com.example.tp_requete

fun main() {
    //Lazy loading + une seule instanciation
    var html = RequestUtils.sendGet("https://www.google.fr")
    println("----------------RESULTAT :$html")
}