package com.example.json_kotlin.exoKotlin

import java.lang.Math
import kotlin.math.max
data class UserBean(var name:String, var note:Int)



fun main() {
exo4()
}

fun exo4() {
    val users = arrayListOf(
        UserBean ("toto", 16),
        UserBean ("Bobby", 20),
        UserBean ("Charles", 14),
        UserBean ("Pascal", 5))



//    Afficher la list triée par nom
//        println(users.sortedBy { it.name.lowercase() }.map { it.name })
val oo = { it: UserBean -> it.name.equals("toto", true) }
    val moyenne = users.map { it.note }.average()
    println(users.count { oo(it) && it.note >= moyenne })
//    println(users.count(oo))
    println(users.count { oo(it) && it.note >= 10 })

    val addMo = { users.filter { it.note < 10 }.forEach {it.note++}}
    addMo()
    println(users)

//    println(users.sortedBy { it.name })
//    println(users.filter { it.note > 10 })

//    val minNote = users.minOfOrNull { it.note }
//    users.removeIf { it.note == minNote }
//
//    print("--------------\n\n[Nom croissant de ceux ayant 10et +] : ")
//    print(users.filter { it.note >= 10 }.map { it.name }.sortedBy { it })
//    //V2
//    users.filter { it.note >= 10 }.map { it.name }.sortedBy { it }.forEach(::println)
}



fun exo2(){
    val comparUserByNote = { u1: UserBean, u2: UserBean -> if (u1.note >= u2.note) u1 else u2 }
    val compareUsersByName = { u1: UserBean, u2: UserBean -> if (u1.name < u2.name) u1 else u2 }

    val u1 = UserBean ("Bob", 19)
    val u2 = UserBean ("Toto", 45)
    val u3 = UserBean ("Charles", 26)

    println(compareUser(comparUserByNote, u1, u2, u3)) // Toto 45
    println(compareUser(compareUsersByName, u1, u2, u3)) // Bob 19

}



inline fun compareUser(compare: (UserBean, UserBean) -> UserBean, u1: UserBean, u2 : UserBean, u3:UserBean)= compare(compare(u1, u2), u3)

//u1 me permet de garntir au moins 1 utilisateur
inline fun compareUser(compare: (UserBean, UserBean) -> UserBean, u1: UserBean, vararg list: UserBean): UserBean {
    var selectUser = u1
    for (u in list) {
        selectUser = compare(u, selectUser)
    }
    return selectUser
}
inline fun name(operation: (Int,Int) -> Int, a:Int, b:Int) = operation(a,b)


fun hdfuehf() {
    val lower: (String) -> Unit = { s: String ->    println(s.lowercase()) }
    val lowerV2: (String) -> Unit = { s -> println(s.lowercase()) }
    val lowerV3: (String) -> Unit = { println(it.lowercase()) }
    val lowerV4 = { s: String -> println(s.lowercase()) }

    val heure: (Int) -> Int = { it / 60 }

    val max = { a: Int, b: Int ->  max(a, b) }
    val maxV2 = { a: Int, b: Int -> if(a>b) a else b }

    val reverse: (String) -> String = { it.reversed() }

    val minToMinHour: (Int) -> Pair<Int, Int> = { Pair(it / 60, it % 60) }
    val minToMinHourV2 = { it:Int -> Pair(it / 60, it % 60) }
    //to que l'on verra dans le cours Infix
    val minToMinHourV3: (Int) -> Pair<Int, Int> = { it / 60 to it % 60 }

    lower("Une phrase avec Des MaJuscules")
    println("heure : " + heure(62))
    println("max : " + max(62, 18))
    println("reverse : " + reverse("Une phrase avec des e"))
    println("minToMinHour : " + minToMinHour(124))
}