fun main() {

    val r1 = testFun1(100)
    println("r1 : $r1")

    val r2 = testFun2(2)
    println("r2 : $r2")

    val r3 = testFun2(0)
    println("r2: $r3")

    testFun3(100)
    testFun3(0)

    println("-------------------------------")

    // break : 가장 가까운 반복문을 종료
    for(item in 1..10) {
        if(item > 5) {
            break
        }
        println("item : $item")
    }

    println("-------------------------------")

    // continue : 이후에 코드가 더 있더라도 다음 반복으로 넘어감
    for(item in 1..10) {
        if(item % 2 == 0) {
            continue
        }

        println("item : $item")
    }

}

// return
fun testFun1(a1: Int) : Int {
    println("testFun1")
    return a1 + 100
}

fun testFun2(a1: Int) : Int {
    println("testFun2")

    if(a1 == 0) {
        return -1
    }

    println("will this line execute?")

    return 100 / a1
}

fun testFun3(a1: Int) {
    if(a1== 0) {
        return // 나를 호출한 쪽으로 되돌아 가겠다는 의미
    }

    println("a1 is not zero")
}