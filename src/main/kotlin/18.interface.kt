// 인터페이스
// Kotlin은 다중 상속을 지원하지 않는다.
// 이 때문에 자기 타입의 변수나 부모형 타입의 변수에만 담을 수 있다.
// 만약 생성된 객체의 주소 값을 다양한 타입의 변수에 담을 수 있도록 한다면
// 인터페이스를 활용하면 된다.
fun main() {
    val obj1 = TestClass15()
    testFun1(obj1)

    val obj2 = TestClass16()
    testFun2(obj2)

    val obj3 = TestClass17()
    testFun3(obj3)

    val obj4 = TestClass18()
    testFun4(obj4)

    val obj5 = TestClass19()
    testFun3(obj5)
    testFun4(obj5)
}

open abstract class AbstractClass1 {
    open abstract fun abstractMethod1()
}

open abstract class AbstractClass2 {
    open abstract fun abstractMethod2()
}

fun testFun1(obj1: AbstractClass1) {
    obj1.abstractMethod1()
}

fun testFun2(obj2: AbstractClass2) {
    obj2.abstractMethod2()
}

class TestClass15: AbstractClass1() {
    override fun abstractMethod1() {
        println("This is abstractMethod1 of testClass15")
    }
}

class TestClass16: AbstractClass2() {
    override fun abstractMethod2() {
        println("This is abstractMethod2 of testClass16")
    }
}

// 인터페이스는 클래스가 아니므로 객체를 생성할때 사용할 수 없다.
// 단, 클래스는 한 개 이상의 인터페이스를 구현할 수 있으며 생성된 객체는
// 구현한 인터페이스형 참조 변수에 담을 수 있다.
// 인터페이스에는 추상 메서드와 일반 메서드 모두를 구현해서 사용할 수 있다.
// 인터페이스는 추상 클래스와 목적이 비슷하지만 하나의 클래스에 여러 인터페이스를 구현할 수 있는 장점을 가지고 있다.

interface Inter1 {
    fun inter1Method1() {
        println("This is interMethod1 of Inter1")
    }
    fun inter1Method2()
}

interface Inter2 {
    fun inter2Method1() {
        println("This is interMethod1 of Inter2")
    }
    fun inter2Method2()
}

fun testFun3(obj1: Inter1) {
    obj1.inter1Method1()
    obj1.inter1Method2()
}

fun testFun4(obj1: Inter2) {
    obj1.inter2Method1()
    obj1.inter2Method2()
}

class TestClass17: Inter1 {
    override fun inter1Method2() {
        println("This is interMethod2 of TestClass17")
    }
}

class TestClass18: Inter2 {
    override fun inter2Method2() {
        println("This is interMethod2 of TestClass18")
    }
}

class TestClass19: Inter1, Inter2 {
    override fun inter1Method2() {
        println("This is inter1Method2 of TestClass19")
    }

    override fun inter2Method2() {
        println("This is inter2Method2 of TestClass19")
    }
}

// 학습 정리
// 인터페이스를 사용하여 다양한 참조변수에 담을 수 있는 클래스를 만들 수 있다.