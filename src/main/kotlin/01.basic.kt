fun main() {
    print("안녕하세요.")
    println("세미콜론은 선택사항이야"); println("근데 한 줄에 여러개 쓸거면 세미콜론;있어줘야 함")
    println("Hello World!")

    // 정수 리터럴
    println(100)
    println(10000000000000) //21억이 넘어가는 숫자는 자동으로 L이 붙어 long으로 처리됨
    println(937_587_2387_23876) // 세자리수마다 쉼표 찍어서 알아보기 슆게 쓰듯이 이렇게 언더바로 구분해서 숫자 표시 할 수 잇음

    // 실수 리터럴
    println(11.11) //default Double type
    println(22.22F) // Float 쓰고 싶으면 뒤에 F

    // 문자 리터럴
    println('A')
    println('가')

    // 문자열 리터럴
    println("문자열")

    // 논리 리터럴
    println(true)
    println(false)

    // Raw string """ """
    println("동해물과 백두산이\n마르고 닳도록\n하느님이 보우하사\n우리나라 만세")
    println(
        """
        동해물과 백두산이
        마르고 닳도록
        하느님이 보우하사
        우리나라 만
    """.trimIndent()
    )

    println("--------------------------------")

    var a1: Int = 100
    println("a1 : $a1")

    // 변수 선언시 자료형을 생략하면 자동으로 결정된다.
    val a2 = 100
    println("a2 : $a2")

    a1 = 200
    println("a1: $a1")

    // val 변수는 값을 변형하지 못한다.
//    a2 = 200

    println("--------------------------------")

    // ? 없으면 null 허용하지 않음
    var a3: Int = 100
    // ? 는 null 허용(자료형 필수)
    var a4: Int? = null

    var a5: Int? = a3 // null을 허용하지 않는 변수는 null 허용 가능한 변수에 할당 가능
    println("a5 : $a5")
    //var a6:Int = a4 // null 허용하지 않는 변수에는 null을 허용하는 변수를 할당할 수 없다.
    //var a6:Int = a4!! // !! 를 붙이면 null 허용하지 않는 변수로 변, 문법적으로 가능하지만 런타임에서 null을 할당하려 한다면 런타임 에러 발생함.
    a4 = 200
    var a6: Int = a4!! // 문법적으로도 허용되고 런타임 에러도 발생하지 않음
    println("a6 : $a6")

    println("----------------------------------")
    test1()
    test2(100, 55.55)

    val k1 = 50
    val k2 = 11.11
    test2(k1, k2)
    test2(a2 = 66.66, a1 = 600)

    // 기본 값이 설정된 매개변수
    test3(100, 11.11)
    test3(100)
    test3(a2 = 22.22)
    test3()

    // 반환 타입
    val r1 = test4(100, 200)
    val r2 = test4(1000, 2000)
    println("r1 : $r1")
    println("r2 : $r2")
    println("----------------------------------")

    // 반환 값이 없는 함수 명시 Unit( 그냥 생략하면 Unit)
    test5()

    // 함수 오버로딩: 똑같은 이름으로 여러개 부를 수 있는거
    test6()
    test6(10)
    test6(11.11)
    test6(100, 200)

    // 지역함수
    test7()
    //test8() // 사용 불가. 함수를 정의한 안에서만 사용 가능

    // 단항 연산자 : 항이 하나인 연산자

    // + : 양수 -> 양수, 음수 -> 음수 (완.벽.하.게. 의미가 없.는 연산자)
    val a7 = 10
    val a8 = -10

    val r3 = +a7
    val r4 = +a8
    println("a7 : $a7, r3 : $r3")
    println("a8 : $a8, r4 : $r4")
    println("----------------------------------")

    // - : 양수 -> 음수, 음수 -> 양수
    val a9 = 10
    val a10 = -10

    val r5 = -a9
    val r6 = -a10
    println("a9 : $a9, r5 : $r5")
    println("a10: $a10, r6: $r6")
    println("----------------------------------")

    // ! : true -> false, false -> true
    val a11 = true
    val a12 = false

    val r7 = !a11
    val r8 = !a12
    println("a11 : $a11, r7 : $r7")
    println("a12 : $a12, r8 : $r8")
    println("----------------------------------")

    // 증감 연산자 : ++, --

    //val a13 = 10 // val로 선언한 변수에는 증감 연사자를 사용할 수 없다.
    // ++a13; //--a13; // ++a13 == (a13 = a13 + 1)
    // 증감 연산자는 사용 위치에 따라 변수 앞에 사용하면 연산 수행 후 할당. 변수 뒤에 사용하면 할당 후 연산함.

    var a13 = 10
    var a14 = 10
    val r9 = a13++
    val r10 = a14--
    println("a13 : $a13, r9 : $r9")
    println("a14 : $a14, r10 : $r10")

    var a15 = 10
    var a16 = 10
    val r11 = ++a15
    val r12 = --a16
    println("a15 : $a15, r11 : $r11")
    println("a16 : $a16, r12 : $r12")
    println("----------------------------------")

    // 산술 연산자 : + , -, /, *, %, ..
    val r13 = 10 + 3
    val r14 = 10 - 3
    val r15 = 10 * 3
    val r16 = 10 / 3
    val r17 = 10 % 3
    println("$r13, $r14, $r15, $r16, $r17")

    val r18: IntRange = 10..20 // IntRange 타입은 선언 안해도 됨.
    println("r18 : $r18")
    println("----------------------------------")

    // 대입 연산자 : +=, -=, *=, /=, %=

    var a17 = 10
    var a18 = 10
    var a19 = 10
    var a20 = 10
    var a21 = 10
    a17 += 3
    a18 -= 3
    a19 *= 3
    a20 /= 3
    a21 %= 3
    println("$a17, $a18, $a19, $a20, $a21")
    println("----------------------------------")

    // 비교 연산자 : ==, !=
    val a22 = 10
    val r19 = a22 == 10
    val r20 = a22 != 10
    println("$r19, $r20")

    val r21 = a22 == 20
    val r22 = a22 != 20

    println("$r21, $r22")
    println("----------------------------------")


    // 비교 연산자 : >, <, >=, <=
    val r23 = a22 > 20
    val r24 = a22 < 20
    val r25 = a22 >= 10
    val r26 = a22 <= 10
    println("$r23, $r24, $r25, $r26")
    println("----------------------------------")

}





fun test1() {
    println("test1 호출")
    println("----------------------------------")
}

fun test2(a1:Int, a2:Double) {
    println("test2 호출")
    println("a1 : $a1")
    println("a2: $a2")
    println("----------------------------------")
}

fun test3(a1: Int=0, a2: Double=0.0) {
    println("test3 호출")
    println("a1 : $a1")
    println("a2 : $a2")
    println("----------------------------------")
}

fun test4(a1: Int, a2: Int): Int {
    return a1 + a2
}

// 반환 값이 없는 함수 명시 Unit( 그냥 생략하면 Unit)
fun test5() : Unit{
    println("test5 호출")
    println("----------------------------------")
}

fun test6() {
    println("test6 호출 - 매개변수 없음")
    println("----------------------------------")
}

fun test6(a1: Int) {
    println("test6 호출 - 매개변수 한 개(Int)")
   println("----------------------------------")
}

fun test6(a1: Double) {
    println("test6 호출 - 매개변수 한 개(Double)")
    println("----------------------------------")
}

fun test6(a1: Int, a2: Int) {
    println("test6 호출 - 매개변수 두 개(Int, Int)")
    println("----------------------------------")
}

// 지역 함수 :  함수 내에 정의한 함수
// 함수를 정의한 함수 안에서만 호출이 가능하다.
fun test7() {
    println("test7 호출")

    fun test8() {
        println("test8 호출")
        println("----------------------------------")
    }

    test8()
}