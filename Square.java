package one.closedcurve.good;

import one.closedcurve.good.exception.IllegalClosedCurveException;

public class Square extends ClosedCurve {
	double side;

	public Square(Double side) throws IllegalClosedCurveException {
		this(side.doubleValue());
	}

	public Square(double side) throws IllegalClosedCurveException {
		if (side <= 0) {
			throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a Square instance");
		}
		this.side = side;
	}

	double computeArea() {
		return (side * side);
	}

}
