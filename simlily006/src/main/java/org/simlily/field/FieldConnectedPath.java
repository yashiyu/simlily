package org.simlily.field;
/**
 * 接続パス
 * @author OWNER
 *
 */
public class FieldConnectedPath {
	
	
	
	/**
	 * @param connectingPathId
	 * @param connectionPathLocationRatio
	 * @param isLeft
	 */
	public FieldConnectedPath(String connectingPathId, float connectionPathLocationRatio, boolean isLeft) {
		super();
		this.connectingPathId = connectingPathId;
		this.connectionPathLocationRatio = connectionPathLocationRatio;
		this.isLeft = isLeft;
	}
	/**
	 * 接続先パスID
	 */
	private String connectingPathId;
	/**
	 * 接続先パス％
	 */
	private float connectionPathLocationRatio;
	/**
	 * 接続位置左右
	 */
	private boolean isLeft;
}
