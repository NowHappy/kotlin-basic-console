fun main() {

    // for 문
    val a1 = 1..10 // 1부터 10까지 (1 포함, 10 포함)

    for (item in a1) {
        println("a1 : $item")
    }

    println("--------------------------------")

    val a2 = 1..10 step 2
    for (item in a2) {
        println("a2 : $item")
    }

    println("--------------------------------")

    //val a3 = 10..1 // ..은 증가, 감소하려면? downTo
    val a3 = 10 downTo 1
    for (item in a3) {
        println("a3 :$item")
    }

    for (a in 100..1) {
        println(a) // 아무것도 안찍힘 https://blog.jetbrains.com/kotlin/2013/02/ranges-reloaded/
    }

    println("--------------------------------")

    val a4 = 10 downTo 1 step 2
    for (item in a4) {
        println("a4 : $item")
    }

    // while 문
    println("--------------------------------")

    var a5 = 0
    //var a5 = 100

    while (a5 < 10) {
        println("a5 : $a5")
        a5++
    }

    // do while 문
    println("--------------------------------")

    var a6 = 0
    //var a6 = 100

    do {
        println("a6 : $a6")
        a6++
    } while (a6 < 10)


}