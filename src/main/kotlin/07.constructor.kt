fun main() {

    val obj1 = TestClass()
    println("obj1 :  $obj1")

    println("-------------------------")

    val obj2 = TestClass4()
    println("obj2 : $obj2")
    println("obj2.v1 : ${obj2.v1}")
    println("obj2.v2 : ${obj2.v2}")

    val obj3 = TestClass4(100, 200)
    println("obj3 : $obj3")
    println("obj3.v1 : ${obj3.v1}")
    println("obj3.v2 : ${obj3.v2}")

    println("-------------------------")

    val obj4= TestClass5(100, 200) // TestClass5() 로 생성하려고 하면 에러 발생! 기본 생성자만 정의되어 있으므로 기본 생성자에 맞게 매개 변수를 전달 해야함.
    val obj5= TestClass5(1000, 2000)

    println("obj4.a1 : ${obj4.a1}")
    println("obj4.a2 : ${obj4.a2}")

    println("obj5.a1 : ${obj5.a1}")
    println("obj5.a2 : ${obj5.a2}")

    println("-------------------------")

    // obj6의 a1, a2 값이 0으로 나오면 init 이 먼저 동작하고 기본 생성자가 불린 것
    // obj6의 a1, a2 값이 매개 변수 값으로 잘 나오면 기본 생성자가 먼저 동작하고 init이 불린 것
    val obj6 = TestClass6(100, 200)
    println("obj6.a1 : ${obj6.a1}")
    println("obj6.a2 : ${obj6.a2}")
    // 실행 결과 값이 잘 나오므로 기본 생성자가 먼저 불리고 init이 동작하는 것을 알 수 있음

    println("-------------------------")
    // 실행 순서 : 주 생성자 -> 부 생성자 -> init 블럭
    TestClass6(100)

}

class TestClass {

    init {
        println("객체가 생성되면 자동으로 동작되는 부분입니다.")
    }

}

class TestClass4 {
    var v1 = 0
    var v2 = 0

    constructor() {
        println("매개 변수가 없는 생성자")
    }

    constructor(a1: Int, a2: Int) {
        println("매개 변수가 두 개인 생성자")
        v1 = a1
        v2 = a2
    }

}

// 기본 생성자 : class 선언부에 함께 선언한 생성자
// (a1: Int, a2: Int) 선언한 경우 : decompile 해보면 생성자만 생성됨
// (var a1: Int, val a2: Int) : 이렇게 선언하면 decompile 코드 확인해보면 멤버 변수, get, set(var 일 경우) 함수, 생성자까지 모두 생성됨
// class TestClass5 constructor (var a1: Int, val a2: Int) // constructor 생략 가능
class TestClass5 (var a1: Int, val a2: Int) {

}

class TestClass6 (var a1: Int, val a2: Int) {

    init{
        println("execute init code")
        println("a1 : $a1")
        println("a2 : $a2")
    }

    // 부 생성자, 보조 생성자
    // 부 생성자에는 var, val 사용 불가
    // : this() 와 같은 형태로 무조건 기본 생성자를 호출해야함. -> 주 생성자가 먼저 호출됨
    constructor(a1: Int) : this(a1, 100){
        println("보조 생성자 호출")
    }

}