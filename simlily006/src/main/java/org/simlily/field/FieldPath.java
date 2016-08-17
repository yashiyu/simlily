package org.simlily.field;

import java.util.ArrayList;
import java.util.List;

public class FieldPath {

	private String id;
	private FieldLocation start;
	private FieldLocation end;
	private List<FieldPathConnection> connectedPaths;
	/**
	 * @param id
	 * @param start
	 * @param end
	 * @param connectedPaths
	 */
	public FieldPath(String id, FieldLocation start, FieldLocation end, List<FieldPathConnection> connectedPaths) {
		super();
		this.id = id;
		this.start = start;
		this.end = end;
		this.connectedPaths = connectedPaths;
	}
	public FieldPath(String id, FieldLocation start, FieldLocation end) {
		super();
		this.id = id;
		this.start = start;
		this.end = end;
		this.connectedPaths = new ArrayList<FieldPathConnection>();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public FieldLocation getStart() {
		return start;
	}
	public void setStart(FieldLocation start) {
		this.start = start;
	}
	public FieldLocation getEnd() {
		return end;
	}
	public void setEnd(FieldLocation end) {
		this.end = end;
	}
	public List<FieldPathConnection> getConnectedPaths() {
		return connectedPaths;
	}
	public void setConnectedPaths(List<FieldPathConnection> connectedPaths) {
		this.connectedPaths = connectedPaths;
	}
	public void addConnectedPath(FieldPath newPath, int c1x, int c1y) {
		//前提：c1x,c1yがこのpathとnewPathの両方にあること

		//このパスに接続情報を追加
		FieldPathConnection newConnection = new FieldPathConnection(
				(float)this.calcRatio(this, c1x, c1y), newPath
				);
		this.connectedPaths.add(newConnection);
		
		//新たなパスに接続情報を追加
		List<FieldPathConnection> newPathConnectedPaths = newPath.getConnectedPaths();
		newPathConnectedPaths.add(new FieldPathConnection(
				(float)this.calcRatio(newPath, c1x, c1y), this)
				);
	}
	private double calcRatio(FieldPath path, int c1x, int c1y) {
		int startX = path.getStart().getX();
		int startY = path.getStart().getY();
		int endX = path.getEnd().getX();
		int endY = path.getEnd().getY();
		
		float longA = Math.abs(endY - startY);
		float longB = Math.abs(endX - startX);
		float shortA = Math.abs(c1y - startY);
		float shortB = Math.abs(c1x - startX);
		double ratio = Math.pow(
                      ( Math.pow(shortA, 2) + Math.pow(shortB, 2) ) /
				      ( Math.pow(longA, 2) + Math.pow(longB, 2) )
	                  , 0.5);
		return ratio;

	}
	
	
}
