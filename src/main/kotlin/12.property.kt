// 캡슐화
// 객체가 가지고 있는 변수는 메서드에 구현한 코드가 정상적으로 동작하기 위한 데이터를 담고 있다.
// 만약 변수에 엉뚱한 데이터가 담김다면 구현한 코드가 정상적으로 동작한다고 하더라도 정상적인 결과가 나올 수 없게 된다.
// 이에 변수의 직접적인 접근을 차단하여 외부에서 값을 변경하지 못하도록 막는 것을 캡슐화라고 부른다.

// Property
// 캡슐화가 적용된 변수는 외부에서의 접근이 차단된다.
// 캡슐화가 적용된 변수에 대해 메서드를 통해 값을 설정하거나 가져다 사용할 수 있도록 구성한 것을 Property라고 부른다.
// 변수에 값을 넣는 메서드를 setter라고 부른다.
// 변수가 가지고 있는 값을 반환하는 메서드를 getter라고 부른다.

// Property 작성 방법
// private 키워드를 변수에 설정하여 외부에서 접근하지 못하도록 막는다.
// 변수들 중에 외부에 공개하고자 하는 변수에 대해 setter와 getter를 지정한다.

// 자바는 property를 개발자가 직접 구현해야 하지만 코틀린에는 property를 구현하는 여러 편이 방법 존재.

// 주 생성자 사용하기
// 주 생성자의 매개 변수를 정의할 때 var, val를 지정하면 Property로 작성된다. # var, val 키워드는 보조 생성자에서는 사용할 수 없다.
// var운 getter, setter 모두 작성된다. # 인텔리제이에서 변수에 _ 언더바가 표시되면 getter,setter가 존재하는 변수를 의미함.
// val는 getter 만 작성된다.

// 클래스의 멤버 변수
// 클래스의 변수를 선언할 때 var와 val에 따라 Property가 작성된다.
// var의 경우 setter와 getter가 모두 작성된다.
// val의 경우 getter만 작성된다.

// getter, setter 를 custom 하는 방법
// 멤버 변수 아래 get(), set() 선언, field는 해당 변수를 의미함.
// default get() { return field }
// default set(value) { field = value }

class TestClass7 {
    var v1 = 0
    val v2 = 0
    var v3 = 100
        get() {
            println("get 호출")
            return field
        }
        set(value) {
            println("set 호출")
            field = value
        }
}

// 학습 정리
// 외부에서 변수에 대해 직접적인 접근을 차단하는 것을 캡슐화라고 부른다.
// 캡슐화를 적용한 변수에 값을 넣거나 가져다 사용할 수 있도록 setter/getter룰 설정한 것을 Property라고 부른다.