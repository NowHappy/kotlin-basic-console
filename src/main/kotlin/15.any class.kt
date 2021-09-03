// Any 클래스
// Kotlin에서 사용하는 모든 클래스의 부모 클래스이다.
// Kotlin은 클래스를 작성할 때 상속받기 않는다면 자동으로 Any 클래스를 상속받는다. # 즉 코틀린에서 모든 클래스는 직,간접적으로 Any를 상속받고 있다.
// Any 클래스에는 모든 객체가 가지고 있어야할 메서드가 제공되고 있으며 이 메서드들을 overriding하여 각 클래스의 성격에 맞게 재 구현하여 사용할 수 있다.
fun main() {
    val obj1 = TestClass10()
    println("obj1 : $obj1")

    val obj2 = TestClass11()
    val obj3 = TestClass12()

    testFun3(obj1)
    testFun3(obj2)
    testFun3(obj3)
}

class TestClass10 {
    override fun toString(): String {
        return "This is instance of TestClass10"
    }
}

class TestClass11 {
    override fun toString(): String {
        return "This is instance of TestClass11"
    }
}

class TestClass12 {
    override fun toString(): String {
        return "This is instance of TestClass12"
    }
}

fun testFun3(a1:Any) {
    println("a1 : $a1") // TesgClass10, 11, 12 각각의 클래스가 Any의 toString을 overriding 했으므로 Any의 toString을 호출 했지만 자식 클래스의 overriding한 toString을 호출한다.
}

// 학습 정리
// Any클래스는 모든 클래스의 부모 클래스이다. # 즉 내가 선언한 변수에 모든 클래스를 다 받을 수 있게 선언하겠다! 할때 Any 사용 가능