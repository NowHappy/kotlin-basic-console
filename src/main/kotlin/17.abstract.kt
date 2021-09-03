// 추상 메서드와 추상 클래스
// 추상 메서드는 구현되지 않은 메서드를 의미한다.
// 추상 클래스는 추상 메서드를 가지고 있는 클래스를 의미한다.
// 추상 클래스는 구현되지 않은 추상 메서드를 가지고 있기 때문에 완벽한 설계도라고 할 수 없다.
// 이 때문에 추상 클래스를 통해서는 객체를 생성할 수 없다.

// 추상 클래스의 상속
// 추상 클래스는 완벽한 클래스가 아니기 때문에 객체를 생성할 수 없다.
// 객체를 생성하려면 추상 클래스를 상속받은 클래스를 만들고 추상 메서드를 구현하여
// 자식 클래스를 통해 객체를 생성해야 한다.
// 추상 클래스의 목적은 자식 클래스에서 메서드를 Overriding을 하게 하기 위한
// 강제성을 부여하기 위함이다.

fun main() {
    val obj1 = Super1()
    testFun1(obj1)

    val obj2 = Sub1()
    testFun1(obj2)

    val obj3 = Sub2()
    testFun2(obj3)
}

open class Super1 {
    fun method1() {
        println("This is method1 of Super1")
    }
    open fun method2() {
        println("This is method2 of Super1")
    }
}

class Sub1 : Super1() {
    override fun method2() {
        println("This is method2 of Sub1")
    }
}

fun testFun1(obj1: Super1) {
    obj1.method1()
    obj1.method2()
}

open abstract class Super2 {
    fun method1() {
        println("This is method1 of Super1")
    }
    open abstract fun method2()
}

class Sub2 : Super2() {
    override fun method2() {
        println("This is method2 of Super2")
    }
}

fun testFun2(obj1: Super2) {
    obj1.method1()
    obj1.method2()
}

// 학습 정리
// 구현되지 않은 메서드를 추상 메서드라고 부르며 추상 메서드를 가지고 있는 클래스를
// 추상 클래스라고 부른다.
// 추상 클래스는 자식 클래스에서 메서드를 Overriding 하게 하기 위함이다.
