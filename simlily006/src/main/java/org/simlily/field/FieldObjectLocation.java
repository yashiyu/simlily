package org.simlily.field;
/**
 * 所在
 * @author OWNER
 *
 */
public class FieldObjectLocation {
	private FieldMap map;
	private FieldPath path;
	private float pathLocationRatio;
	private FieldSymbol symbol;
	/**
	 * @param map
	 * @param path
	 * @param pathLocationRatio
	 * @param symbol
	 */
	public FieldObjectLocation(FieldMap map, FieldPath path, float pathLocationRatio, FieldSymbol symbol) {
		super();
		this.map = map;
		this.path = path;
		this.pathLocationRatio = pathLocationRatio;
		this.symbol = symbol;
	}
	
}
