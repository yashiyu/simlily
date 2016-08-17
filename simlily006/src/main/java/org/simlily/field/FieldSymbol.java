package org.simlily.field;

import java.util.List;

public class FieldSymbol {
	private String id;
	private List<FieldConnectedPath> pathConnection;
	/**
	 * @param id
	 * @param pathConnection
	 */
	public FieldSymbol(String id, List<FieldConnectedPath> pathConnection) {
		super();
		this.id = id;
		this.pathConnection = pathConnection;
	}
}
