// 기본적으로 코틀린에서 java로 코드 변환될 때 자바의 접근제한자는 모두 private 으로 선언되고 코들린의 접근제한자는 getter 메서드 추가 여부를 결정한다.

// 사용가능한 접근제한자는 4가지 ( private, public, protected, internal ) 존재

// 클래스의 경우와 변수, 메서드의 경우 사용가능한 접근제한자가 달라진다

// 1. class 에서 접근제한자

// private : 외부에서 객채 생성 불가능

// public : 외부에서 객체 생성 가능 (기본)

// protected : 클래스에 지정할 수 없다. (사용 자체가 불가능)

// internal : 같은 모듈인 경우에만 객체 생성 가능

// 2. 변수, 메서드의 접근제한자

// private : 외부에서 접근할 수 없다.

// public : 외부에서 접근이 자유롭다. (기본)

// protected : 상속관계일 경우에만 접근이 가능하다.

// internal : 같은 모듈인 경우에만 접근이 가능하다.