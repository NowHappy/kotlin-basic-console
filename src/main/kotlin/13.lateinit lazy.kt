// 지연 초기화
// kotlin은 변수를 선언할 때 값을 무조건 설정해야 하는데 이를 지연 시키는 것을 지연 초기화라고 한다.
fun main() {
    var obj1 = TestClass8()
    println("obj1.a1 : ${obj1.a1}")

    // println("obj1.a3 : ${obj1.a3}") # 변수 a3를 초기화 하기 이전에 사용했기 때문에 에러 발생
    obj1.testMethod1() // a3 초기

    var obj2 = TestClass9()

    println("obj2.a4: ${obj2.a4}")
}

// lateinit
class TestClass8 {
    var a1 = 100
    var a2:Int // 변수의 값을 바로 setting 하지 않기 때문에 형을 추론할 수 없음. 자료형 명시 필수!
    // lateinit var a3:Int # 'lateinit' modifier is not allowed on properties of primitive types
    lateinit var a3:String

    init{
        a2 = 200
    }

    fun testMethod1() {
        if(::a3.isInitialized == false) { // :: (reflection) 객체의 class를 파악
            a3 = "문자열" // a3 변수가 초기화 된적이 없으면 초기화.
        }
        println("a3 : $a3") // 초기화 후 사용했기 때문에 정상 실행
   }
}
// var 로 선언된 변수의 초기화를 뒤로 미룰 수 있다.
// 변수의 값을 사용하기 전에 반드시 초기화가 이루어져야 한다.
// val로 선언된 변수는 오류가 발생한다. # val은 setter 메서드가 추가되지 않기때문에 나중에 set을 통해 변수 초기화를 할 수 없음


// lazy
// val로 선언된 변수는 lateinit으로 지연 초기화 하는 것이 불가능 하다.
// val로 선언된 변수는 lazy 코드 블록을 이용하면 되는데 이는 나중에 프로퍼티의 값을 셋팅해준다는 의미가 아닌 사용할 때 값을 초기화 한다는 의미를 가지고 있다.
// lazy 로 선언한 변수가 사용되지 않으면 생성되지 않으므로(메모리에 할당되지 않으므로) 메모리를 절약할 수 있다는 장정이 있다.
class TestClass9 {
    val a4:String by lazy {
        println("a4 init")
        "문자열2"
    }
}

// 학습 정리
// 프로퍼티의 값을 나중에 셋팅할 때 지연 초기화를 사용한다.
// var 변수는 lateinit을 사용한다.
// val 변수는 lazy 코드 블록을 사용한다.