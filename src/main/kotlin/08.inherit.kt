fun main() {

    val s1 = SubClass()
    println("This is subClass member ${s1.subMember}")
    s1.subMethod()


}

open class SuperClass {
    var superMember = 100

    fun superMethod() {
        println("This is method in SuperClass")
    }

}

class SubClass : SuperClass() {

    // constructor() : super()  # 상속 선언부에서 생성자 정의하지 않으면(SueprClass 뒤에 가로 없음)

    var subMember = 200

    fun subMethod() {
        println("This is method in SubClass")
    }

}

open class SuperClass2(val a1:Int)
// 상속 받은 자식 클래스는 반듯이 부모 클래스의 생성자를 호출해야 하는데
// 빈 생성자의 경우에는 자바와 마찬가지로 자동으로 호출
// 빈 생성자가 아닌 경우에는 반듯이 주 또는 부 생성자에서 부모 클래스의 생성자 호출해야 함.

class SubClass2 : SuperClass2(100) {

    // constructor() : super(100) # 부 생성자에서 호출


}

