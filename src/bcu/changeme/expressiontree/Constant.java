package bcu.changeme.expressiontree;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Constant extends Expression {
	double constant;
	public Constant(double constant) {
		this.constant = constant;
	}

	
	@Override
	public double evaluate(Map<String, Double> variables) {
		return constant;
	}

	/**
	 * Constant has no free variables sofreeVariables method returns (unmodifiable) empty set.
	 */
	@Override
	public Set<String> freeVariables() {
		return Collections.unmodifiableSet(new HashSet());
	}

	@Override
	public String toString() {
		return Double.toString(constant);
	}
}