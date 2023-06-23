package edu_global.one;

class Circle3 {
	private double radius; // 변수선언 > 게터세터 넣기
	
	public Circle3() {}
	
	public Circle3(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius; // 원의 넓이를 가져오는 함수
	}
	
	public void setRadius(double radius) { // 외부값받아서 원의넓이를 변경하는 함수
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI; // 원의 넓이 곱하는 함수만듦
	}
	
}
class Circle {
	public Circle() {
	}
}
