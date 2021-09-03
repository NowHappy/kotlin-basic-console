fun main() {
    val a1 = 10

    when(a1) {
        1 -> println("a1은 1입니다.")
        2 -> {
            println("수행되는 코드")
            println("a1은 2입니다.")
        }
        3 -> println("a1은 3입니다.")
        else -> println("a1은 1, 2, 3이 아닙니다.")
    }

    val a2 = 3

    when(a2) {
        1, 2 -> println("a2은 1이거나 2입니다.")
        3, 4 -> println("a2은 3이거나 4입니다.")
        5, 6 -> println("a2은 5이거나 6입니다.")
        else -> println("a2는 1, 2, 3, 4, 5, 6이 아닙니다.")
    }

    val a3 = 55.55
    when(a3) {
        33.33 -> println("a3 is 33.33")
        55.55 -> println("a3 is 55.55")
        77.77 -> println("a3 is 77.77")
        else -> println("a3 is not 33.33, 55.55, 77.77")
    }

    val a4 = "character2"
    when(a4) {
        "character1" -> println(" this is character1")
        "character2" -> println(" this is character2")
        "character3" -> println(" this is character3")
        else -> println("this is else character")
    }

    val a5 = 5
    when(a5) {
        in 1..3 -> println("a5 is a number between 1 ~ 3")
        in 4..6 -> println("a5 is a number between 4 ~ 6") // 먼저 만족하는 조건에만 해당한다.
        in 1..6 -> println("a5 is a number between 1 ~ 6")
        else -> println("a5 is not a number between 1 ~ 6")
    }

    val str1 = setValue(1)
    val str2 = setValue(2)
    val str3 = setValue(3)
    println("str1 : $str1")
    println("str2 : $str2")
    println("str3 : $str3")


}

fun setValue(a1: Int) = when(a1) {
    1 -> "char1"
    2 -> {
        println("#case2")
        "char2"
    }
    else -> "some char except char1, char2"
}