package org.simlily.field;
/**
 * パス接続情報
 * @author OWNER
 *
 */
public class FiledPathConnection {
	/**
	 * 接続元パス%
	 */
	private float pathLocationRatio;
	/**
	 * 接続パス
	 */
	private FieldPath connectedPath;
	/**
	 * @param pathLocationRatio
	 * @param connectedPath
	 */
	public FiledPathConnection(float pathLocationRatio, FieldPath connectedPath) {
		super();
		this.pathLocationRatio = pathLocationRatio;
		this.connectedPath = connectedPath;
	}
	
	
}
