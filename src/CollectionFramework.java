import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Circle {
	private static double radius;

	public Circle(double rad) {
		radius = rad;
	}

	public static double getRadius() {
		return radius;
	}

	public static void setRadius(double radius) {
		Circle.radius = radius;
	}

	// @Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

}

public class CollectionFramework {

	public static void main(String[] args) {
		List<Integer> numList = new LinkedList<>();
		for (int i = 1; i <= 10; i++) {
			numList.add(i);
		}

		int sum = 0;

		for (int i = 0; i <= numList.size(); i++) {
			sum += i;
		}
		System.out.println(numList);
		System.out.println(sum);

		List<String> season = new ArrayList<>();

		season.add("Spring");
		season.add("Summer");
		season.add("Fall");
		season.add("Winter");

		int charSum = 0;
		for (int i = 0; i < season.size(); i++) {
			String character;
			character = season.get(i);
			charSum += character.length();

		}
		System.out.println(charSum);

		List<Circle> circles = new LinkedList<>();
		for (int i = 1; i <= 10; i++) {
			circles.add(new Circle(i));
		}
		double getSum = 0;
		for (Circle circle : circles) {
			getSum = circle.getArea();
		}
		System.out.println(getSum);
	}

}
