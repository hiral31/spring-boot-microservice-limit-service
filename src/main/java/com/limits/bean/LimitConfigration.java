package com.limits.bean;

public class LimitConfigration {
	
	private int maximum;
	private int minimum;
	
	protected LimitConfigration(){
		
	}
	/**
	 * @param maximum
	 * @param minimum
	 */
	public LimitConfigration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	/**
	 * @return the maximum
	 */
	public int getMaximum() {
		return maximum;
	}
	/**
	 * @return the minimum
	 */
	public int getMinimum() {
		return minimum;
	}
	
	

}
