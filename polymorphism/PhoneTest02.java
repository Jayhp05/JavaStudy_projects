package com.javastudy.ch05.polymorphism;

import com.javastudy.ch05.inheritance.HandPhone;
import com.javastudy.ch05.inheritance.Phone;

// 업 캐스팅과 다운 캐스팅
/* 자바에서 객체를 생성하고 사용하는데 있어서 융통성을 부여하기 위해서 다형성이라는 
 * 개념이 사용된다. 다형성은 다양한 형식과 기능을 가진다는 의미로 해석될 수 있으며
 * 객체지향에서 다형성을 구현하는 방법은 상속과 추상화를 통해 다양하게 구현될 수 있다.
 * 예를 들면 하나의 부모 클래스 타입으로 다양한 자식 클래스 타입의 인스턴스를 참조할
 * 수 있는 것도 다형성이라 할 수 있으며 생성자 오버로딩을 통해서 하나의 생성자 이름으로
 * 객체를 초기화 할 수 있는 여러 방법을 제공하는 것도 다형성이라고 말 할 수 있다.
 * 물론 메서드 오버로딩도 하나의 이름으로 서로 다른 기능을 제공할 수 있으므로 이 또한
 * 다형성이라고 할 수 있으며 아래와 같이 play() 메서드에서 부모타입 매개변수로 자식
 * 타입의 여러 객체를 받아들여 작업할 수 있도록 구현하는 것도 다형성이라고 할 수 있다.
 * 
 * 상속과 추상화를 이용해 오버라이딩 기법과 업캐스팅을 활용하면 자식의 객체를 참조하는
 * 부모 타입의 참조 변수를 통해서 자식의 오버라이딩된 메서드를 호출할 수 있게 된다.
 * 이는 부모 타입으로 업캐스팅된 참조 변수를 통해서 실제 자식 클래스에서 재정의한
 * 메서드를 호출할 수 있게 되므로 하나의 부모타입의 참조 변수로 각각의 기능을 제공하는 
 * 여러 자식 클래스에서 재정의한 메서드를 동일한 방식으로 호출할 수 있다는 장점이 있다.
 *  
 * 이와 같이 상속을 통해서 하나의 객체가 상속 관계에 있는 여러 상위 타입의 자료형을
 * 가질 수 있어서 아래와 같이 여러 객체가 하나의(동일한) 타입이나 방식으로 동작하거나
 * 또는 하나의 이름을 통해서 다양한 기능을 구현할 수 있는 성질을 다형성이라고 말한다.    
 **/
public class PhoneTest02 {	

	public static void main(String[] args) {		
		
		/* 부모 클래스타입 참조 변수에 자식타입의 인스턴스를 생성하여 아래와 같이
		 * 할당하면 자동으로 형 변환되어 자식타입의 레퍼런스가 저장된다. 이 때 실제
		 * 인스턴스에는 아무런 영향을 주지 않고 참조 변수만 부모타입으로 바뀌는 것 이다.   
		 **/
		Phone p1 = new HandPhone("HandPhone1", true);		
		
		/* 부모 클래스타입의 참조 변수에 자식타입의 레퍼런스를 대입하고 있다.
		 * 부모타입으로 형 변환되는 것을 업 캐스팅이라 하며 자동으로 형 변환 된다.
		 **/
		HandPhone hp = new HandPhone("HandPhone2", true);	
		Phone p2 = hp;
		
		p1.receivePhone();
	
		/* 오버라이딩된 메소드가 아니면 부모타입 참조 변수로는 접근이 불가능 하다.
		 * 그 이유는 참조변수의 형 변환은 인스턴스에 아무런 영향을 미치지 않고 단지 참조
		 * 변수만 부모타입의 변수로 바뀌며 이 때 부모가 정의한 멤버에만 접근할 수 있다.
		 **/
		// p2.game();
		p2.receivePhone();
		
		/* 업 캐스팅된 참조 변수를 본래의 자신타입 참조변수에 대입하고 있다.
		 * 부모타입으로 업 캐스팅 되었던 참조변수의 타입이 본래의 자기 타입으로
		 * 돌아오는 것을 다운 캐스팅이라 하며 명시적(강제)으로 형 변환해야 한다. 
		 * 
		 * 참조변수의 형 변환은 인스턴스에 아무런 영향을 미치지 않고 단지 참조변수의
		 * 타입만 변환되는 것으로 그 참조변수가 접근할 수 있는 멤버의 개수를 제한하게 된다.
		 * 부모의 멤버는 항상 자식의 멤버 개수와 같거나 적으므로 부모타입으로 형 변환된
		 * 참조변수가 접근할 수 있는 멤버는 부모 클래스에 정의된 멤버에 국한된다. 상속받은
		 * 멤버가 아닌 자신의 멤버에 접근하려면 업캐스팅 상태에서는 접근이 불가능하고
		 * 본래의 자기타입으로 다시 되돌려야 접근할 수 있다. 이렇게 부모타입으로 업캐스팅
		 * 되었다가 다시 본래의 자기타입으로 되돌아오는 것을 다운 캐스팅이라고 한다.  
		 **/
		HandPhone hp2 = (HandPhone) p2;		
		hp2.game();		
		
		/* 업 캐스팅 되지 않은 참조 변수를 자식 타입으로 형 변환 시 컴파일은
		 * 제대로 되지만 실행 타임에서 ClassCastException이 발생한다.
		 * 아래 코드를 주석을 풀고 실행하면 ClassCastException이 발생한다.
		 **/
		// p2 = (HandPhone) p;
	}
}
