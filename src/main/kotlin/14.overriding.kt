fun main() {

    val obj1 = SubClass3()
    println("ohj1.subA1 : ${obj1.subA1}")
    obj1.subMethod1()

    println("obj1.superA1 : ${obj1.superA1}")
    obj1.superMethod1()

    println("-------------------------------------")

    // 부모 클래스 타입의 변수
    val obj2:SuperClass3 = obj1 // Kotlin의 모든 객체는 부모 클래스형 참조 변수에 담을 수 있다.

    // 부모 클래스형 참조 변수를 사용하면 부모 클래스에 정의되어 있는 멤버만 사용 가능하다.
    println("obj2.superA1 : ${obj2.superA1}")
    obj2.superMethod1()

    // println("obj2.subA1 : ${obj2.subA1}") # 에러 발생, 부모 클래스에 정의된 멤버가 아니므로 사용 불가
    // obj2.subMethod1() # 에러 발생, 부모 클래스에 정의된 멤버가 아니므로 사용 불가

    println("-------------------------------------")
    // Overriding
    var obj3 = SubClass4()
    obj3.superMethod2()

    val obj4:SuperClass4 = obj3
    obj4.superMethod2()

    println("-------------------------------------")
    // Overriding의 효과
    val obj5 = SuperClass5()
    overridingTest(obj5)

    val obj6 = SubClass5()
    overridingTest(obj6)

}

open class SuperClass3 {
    var superA1 = 100

    fun superMethod1(){
        println("This is SuperMethod1 in SuperClass3")
    }
}

class SubClass3:SuperClass3() {
    var subA1 = 200

    fun subMethod1() {
        println("This is subMethod1 in SubClass3")
    }
}

// Overriding
// 부모 클래스가 가지고 있는 메서드를 자식 클래스에서 재 정의하는 개념이다.
// 부모가 가지고 있는 메서드의 이름, 매개 변수 형태 모두 동일 해야 한다.
open class SuperClass4 {
    open fun superMethod2() { // fun앞에 open을 붙이면 자식 클래스에서 overriding 할 수 있음.
        println("This is superMethod2 in SuperClass4")
    }
}

class SubClass4:SuperClass4() {
    override fun superMethod2() {
        println("This is superMethod2 in SubClass4")
    }
}

// Overriding의 효과
// 만약 객체가 부모형 참조변수에 담겨 있다면 부모 영역에 정의한 멤버만 사용할 수 있다.
// 만약 부모의 메서드를 자식에서 overriding을 했다면 부모형 참조 변수를 통해 자식의 메서드를 호출 할 수 있다.
// 이는 이벤트 처리 방식에서 사건이 발생했을 경우 개발자가 만든 메서드를 호출하기 위해 사용하는 매우 중요한 개념이다.

open class SuperClass5 {
    open fun superMethod5() {
        println("superMethod5 in SuperClass5")
    }
}

class SubClass5 : SuperClass5() {
    override fun superMethod5() {
        println("superMethod5 in SubClass5")
        super.superMethod5() // 자식 클래스에서 부모 클래스 메서드 호출도 가능하다.
    }
}

fun overridingTest(obj1:SuperClass5) {
    obj1.superMethod5()
}

// 학습 정리
// 부모형 참조변수에 객체의 주소 값을 담으면 부모 클래스 영역에 정의한 멤버에 접근할 수 있다.
// 만약 자식에서 메서드를 overriding 했다면 부모형 참조 변수에서 자식의 메서드를 호출 할 수 있다.