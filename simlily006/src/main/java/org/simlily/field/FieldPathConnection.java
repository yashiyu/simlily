package org.simlily.field;
/**
 * パス接続情報
 * @author OWNER
 *
 */
public class FieldPathConnection {
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
	public FieldPathConnection(float pathLocationRatio, FieldPath connectedPath) {
		super();
		this.pathLocationRatio = pathLocationRatio;
		this.connectedPath = connectedPath;
	}
	public float getPathLocationRatio() {
		return pathLocationRatio;
	}
	public void setPathLocationRatio(float pathLocationRatio) {
		this.pathLocationRatio = pathLocationRatio;
	}
	public FieldPath getConnectedPath() {
		return connectedPath;
	}
	public void setConnectedPath(FieldPath connectedPath) {
		this.connectedPath = connectedPath;
	}
	
	
}
