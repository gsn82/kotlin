package `277`

import kotlin.math.PI

fun main() {
    var name = "Sergey"
    var age: Int = 37;

    age += 4;
    age -= 2;
    age /= 3;

    println("My mane is $name, I'm age= $age year old")

    var r = 7
    var cirle = PI * r * r;
    println(cirle);
    /// array   list
    // не изменяемые
    var myArray = arrayOf(1, 5, 8, 9, true, "Hello")
    var myList = listOf(1, 4, 6)

    // изменяемый
    var mutableList = mutableListOf(1, 5, 3.5, "hey there")
    mutableList.add(45)
    println(mutableList)


    var rainbowColor: Array<String>
    rainbowColor = arrayOf("red", "orange", "yellow", "green", "blue", "indigo", "violet")

    var colors = mutableListOf<String>("deep purple ", "light orange", "dark blue")

    colors.add("red")
    val addAll = colors.addAll(arrayOf("blue", "green"))

    for (i in 0..rainbowColor.size-1) {
        print(rainbowColor[i] + " ")
    }

    println(colors)
}