package entities;

import entities.enums.Colors;

public class Circle extends Shape {
	private Double radius;
	
	public Circle() {
		super();
	}

	public Circle(Colors color, Double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public Double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}
