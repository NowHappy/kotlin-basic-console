// 정적 멤버
// 클래스를 정의할 때 변수나 메서드를 정적 멤버로 정의하면 객체를 생성하지 않고 사용할 수 있다.
// java에서는 Static을 사용하는데 kotlin은 companion 객체를 사용한다.

fun main() {
    val obj1 = TestClass20()
    println("obj1.a1 : ${obj1.a1}") // 100
    obj1.testFun1()

    val obj2 = TestClass20()
    println("obj2.a1 : ${obj2.a1}") // 100
    obj2.testFun1()

    obj1.a1 = 200
    println("obj1.a1 : ${obj1.a1}") // 200
    println("obj2.a1 : ${obj2.a1}") // 100

    println("TestClass20.a2 : ${TestClass20.a2}")
    TestClass20.testFun2()
}

class TestClass20{
    var a1 = 100

    companion object{
        var a2 = 1000

        fun testFun2(){
            println("testFun2")
            // println("a1 : $a1") companion 객체에서 클래스의 멤버 변수는 접근 불가(인스턴스 생성하기 전에는 생성되지 않음)
            println("a2 : $a2")
        }
    }

    fun testFun1(){
        println("testFun1")
        println("a1 : $a1")
        println("a2 : $a2") // 멤버 함수에서는 companion 객체에 선언된 정적 변수에 접근 가능(미리 생성되어 있음)
        testFun2() // 멤버 함수에서는 companion 객체에 선언된 정적 메서드에 접근 가능(미리 생성되어 있음)
    }
}

// companion 멤버 사용하기
// companion 멤버는 객체 생성 없이 클래스의 이름으로 접근해서 사용한다.

// Kotlin와 Java 사이에서 사용하기
// - kotlin에서 java의 Static 멤버 사용은 다른 점이 없다.
// println("JavaMain.java2 : ${JavaMain.java2}")
// JavaMain.javaTest2()

// - 만약 Kotlin에서 정의한 Companion 멤버 중 Java에서 사용할 수 있도록 하기 위해서는
// @JavaStatic으로 정의해야 한다.
// companion object {
//    @JvmStatic val a2:Int = 200
//    @JvmStatic fun test2() {
//        println("test2")
//    }
// }

// 학습정리
// companion 멤버는 객체 생성 없이 클래스의 이름을 통해 접근해 사용한다.
