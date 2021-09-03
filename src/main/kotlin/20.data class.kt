// Data Class
// DataClass는 매개체의 데이터를 관리하는 용도로 사용하는 클래스이다.
// abstract, open, sealed, inner 클래스로 정의할 수 없다.
// 반드시 주 생성자를 가지고 있어야 한다.

// Data Class의 메서드
// Data Class 는 개발자의 개발 편리성을 위해 몇 가지 메서드가 자동으로 구현된다.
//   equals : 객체가 가지고 있는 변수를 모두 비교하는 메서드
//   hashCode : 객체를 구분하기 위한 고유한 정수값
//   copy : 객체를 복제하는 메서드
//   toString : 객체가 가지고 있는 변수의 값을 출력
//   componentN : 객체 분해
// 모든 메서드는 Data class의 주 생성자에 선언된 변수들은 모두 사용한다.
// 주 생성자에서 선언되지 않은 변수들은 위 메서드들에서 사용되지 않는다.

// 학습 정리
// Data를 담을 변수만 가지고 있는 클래스를 Data Class라고 부른다.