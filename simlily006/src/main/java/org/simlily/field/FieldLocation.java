package org.simlily.field;

public class FieldLocation {
	/**
	 * X,Y座標
	 */
	private int x,y;
	
	/**
	 * コンストラクタ
	 * @param x
	 * @param y
	 */
	public FieldLocation(int x, int y){
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
