package com.example.json_kotlin

fun forWithoutE(texte: String): String {
    var result = "";

    for (c in texte) {
        if (c != 'e' && c != 'E') {
            result += c
        }
    }
    return result
}

fun returnNumberOfA(texte: String): Int {
    var nbA = 0;

    for (c in texte) {
        if (c == 'a' || c == 'A') {
            nbA++
        }
    }
    return nbA
}

fun reverseChain(texte: String): String {
    var result = "";

    for (c in texte) {
        result = c + result
    }
    return result
}

fun nbMaj(texte: String): Int {
    var result = 0;

    for (c in texte) {
        if (c in 'A'..'Z') {
            result++
        }
    }
    return result
}

fun noVoyelle(texte: String): String {
    var result = "";
    val voyelle: CharArray = charArrayOf('a', 'e', 'i', 'o', 'u', 'y')
    for (c in texte) {
        if (c !in voyelle && c !in voyelle.toString().uppercase()) {
            result += c
        }
    }
    return result
}

fun noMaj(texte: String): String {
    var result = "";
    for (c in texte) {
        if (c !in c.uppercase()) {
            result += c
        }
    }
    return result
}

fun underscore(texte: String): String {
    var result = "";
    for (c in texte) {
        if (' ' == c) {
            result += '_'
        }else{

            result+=c
        }
    }
    return result
}

