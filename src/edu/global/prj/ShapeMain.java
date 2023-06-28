package edu.global.prj;

import edu.global.prj.shape.Circle;
import edu.global.prj.shape.Shape;
import edu.global.prj.shape.Rectangle;

public class ShapeMain {

	public static void main(String[] args) {
		Shape[] shape = { new Circle(10), new Rectangle(10, 20) };

		double area = 0;

		for (Shape s : shape) {
			area += s.getArea();
		}
		System.out.println(area);

	}

}
