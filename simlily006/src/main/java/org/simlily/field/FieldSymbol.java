package org.simlily.field;

public class FieldSymbol {
	private String id;
	private FieldConnectedPath[] pathConnection;
	/**
	 * @param id
	 * @param pathConnection
	 */
	public FieldSymbol(String id, FieldConnectedPath[] pathConnection) {
		super();
		this.id = id;
		this.pathConnection = pathConnection;
	}
}
