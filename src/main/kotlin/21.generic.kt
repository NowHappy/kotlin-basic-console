// Generic
// 클래스를 설계할 때 변수의 타입을 유동적으로 하고 싶을 때가 있을 수도 있다.
// 이 때 Generic 개념을 활용하면 클래스 작성시가 아닌 객체 생성시에 변수의 타입을 설정할 수 있다.


fun main() {
    val t1 = TestClass21<Int>()
    t1.testMethod(100)

    val t2 = TestClass21<String>()
    t2.testMethod("string")

    println("---------------------------------------")

    val t3 = TestClass22<Int>(100)
    t3.testMethod(200)

    val t4 = TestClass22<String>("string")
    t4.testMethod("문자열2")

    println("---------------------------------------")

    val t5 = TestClass23<Int, String>()
    t5.testMethod(100, "string")

    val t6 = TestClass24<Int, Double, String, Boolean>(100, 11.11)
    t6.testMethod("string", true)

    println("---------------------------------------")

    // 불변성
    val t7:TestClass25<SubClass8> = TestClass25<SubClass8>() // 자기 자신의 제너릭 타입을 무조건 가능
    // val t8:TestClass25<SubClass9> = TestClass25<SubClass8>() // 상속 관계에 있어도 타입이 다르면 무조건 오류
    // val t9:TestClass25<SuperClass8> = TestClass25<SubClass8>() // 상속 관계에 있어도 타입이 다르면 무조건 오류

    // 공변성
    val t10: TestClass26<SubClass8> = TestClass26<SubClass8>() // 자기 자신의 제너릭 타입을 무조건 가능
    // val t11: TestClass26<SubClass9> = TestClass26<SubClass8>() // 자식 타입이여도 무조건 오류
    val t12: TestClass26<SuperClass8> = TestClass26<SubClass8>() // 제네릭 변수 선언 앞에 out을 붙이면 부모 타입의 변수에도 담을 수 있음.

    // 반 공변성
    val t13: TestClass27<SubClass8> = TestClass27<SubClass8>() // 자기 자신의 제너릭 타입을 무조건 가능
    val t14: TestClass27<SubClass9> = TestClass27<SubClass8>() // 제네릭 변수 선언 앞에 in을 붙이면 자식 클래스 타입에도 담을 수 있다.
    // val t15: TestClass27<SuperClass8> = TestClass27<SubClass8>() // 부모 타입이여도 무조건 오류
}

class TestClass21<T>{
    fun testMethod(a1: T) {
        println("a1 : $a1")
    }
}

class TestClass22<T>(var a1: T) {
    fun testMethod(a2 : T) {
        println("a1 : $a1")
        println("a2 : $a2")
    }
}

class TestClass23<A,B> {
    fun testMethod(a1: A, a2: B) {
        println("a1 : $a1")
        println("a2 : $a2")
    }
}

class TestClass24<A,B,C,D>(var a1:A, var a2:B){
    fun testMethod(a3:C, a4:D) {
        println("a1 : $a1")
        println("a2 : $a2")
        println("a3 : $a3")
        println("a4 : $a4")
    }
}

// 가변성
// 불변성 : 제네릭이 설정된 객체의 주소 값을 같은 타입의 제네릭이 설정된 변수에만 담을 수 있다.
// 공변성 : 제네릭이 설정된 객체의 주소 값을 부모 클래스 타입의 제네릭이 설정된 변수에도 담을 수 있다.(out)
// 반 공변성 : 제네릭이 설정된 객체의 주소 값을 자식 클래스 타입의 제네릭이 설정된 변수에도 담을 수 있다.(in)

open class SuperClass8

open class SubClass8 : SuperClass8()

class SubClass9 : SubClass8()

// 불변성
class TestClass25<A>()

// 공변성 : 얘는 많이 사용함
class TestClass26<out A>()

// 반 공변성 : 위험하기 때문에 잘 사용하지는 않음.
class TestClass27<in A>()


// 학습 정리
// 객체를 생성할 때 타입을 결정하는 개념을 Generic이라고 부른다.