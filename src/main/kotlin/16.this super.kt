// this
// 객체 자기 자신을 지칭한다.
// 멤버 변수와 메서드 내부의 변수를 구분할 때 사용한다.
// 멤버 메서드와 메서드 내부의 메서드를 구분할 때 사용한다.
// 생성자에서 다른 생성자를 호출할 때 사용한다.
fun main() {
    var obj1 = TestClass13()
    obj1.testMethod1()

    var obj2 = SubClass6()
    obj2.subMethod1()
}

class TestClass13 {
    var a1 = 100

    fun testMethod1() {

        var a1 = 200

        // 그냥 사용하면 자신 것을 우선한다!
        println("a1 : $a1") // method's a1
        println("this.a1 : ${this.a1}") // class's a1

        fun testMethod2() {
            println("testMethod2 in testMethod1")
        }

        testMethod2()
        this.testMethod2()
    }

    fun testMethod2() {
        println("testMethod2")
    }
}

class TestClass14 (var a1:Int) {
    var a2 = 200

    // constructor() # 주 생성자가 있을 때는 보조 생성자에서 반듯이 주 생성자를 호출해 주어야 함. 그냥 이렇게 선언하면 에러
    constructor() : this(100) { // 보조 생성자에서 주 생성자를 호출할때 this를 사용하여 호출함.
        a2 = 300
    }

}

// super
// 상속 관계에서 부모 영역을 지칭한다.
// 멤버 변수와 상속 받은 멤버 변수를 구분할 때 사용한다.
// overriding한 메서드와 부모의 메서드를 구분할 때 사용한다.
// 보모의 생성자를 호출할 때 사용한다.

open class SuperClass6(var a2:Int) {
    open var a1 = 100

    open fun superMethod1() {
        println("superMethod1 in superClass6")
    }
}

class SubClass6 : SuperClass6(100) {
    override var a1 = 1000

    fun subMethod1() {
        println("a1: $a1")
        println("super.a1 : ${super.a1}")

        superMethod1()
        super.superMethod1()
    }

    override fun superMethod1() {
        super.superMethod1() // 부모의 메소드를 오버라이딩할 경우 부모 메소드를 한 번 호출하는 것을 권장. 만약 동작이 이상하다면 생략하면 됨.
        println("superMethod1 in SubClass6")
    }
}

class SubClass7 : SuperClass6 {

    constructor(a1:Int) : super(a1) {

    }

    constructor(a1:Int, a2:Int) : super(a1) {

    }

}

// 학습 정리
// this : 객체 자신을 지칭한다.
// super : 부모를 지칭한다.