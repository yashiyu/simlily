package org.simlily.field;

import java.util.Date;

public class FieldSchedule {

	private Date time;
	private FieldSymbol targetSymbol;
	private float possibilityLimit;
	/**
	 * @param time
	 * @param targetSymbol
	 */
	public FieldSchedule(Date time, FieldSymbol targetSymbol, float possibilityLimit) {
		super();
		this.time = time;
		this.targetSymbol = targetSymbol;
		this.possibilityLimit = possibilityLimit;
	}
}
