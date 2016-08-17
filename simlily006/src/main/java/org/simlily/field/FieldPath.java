package org.simlily.field;

import java.util.List;

public class FieldPath {

	private String id;
	private FieldLocation start;
	private FieldLocation end;
	private List<FiledPathConnection> connectedPaths;
	/**
	 * @param id
	 * @param start
	 * @param end
	 * @param connectedPaths
	 */
	public FieldPath(String id, FieldLocation start, FieldLocation end, List<FiledPathConnection> connectedPaths) {
		super();
		this.id = id;
		this.setStart(start);
		this.setEnd(end);
		this.setConnectedPaths(connectedPaths);
	}
	public FieldPath(String id, FieldLocation start, FieldLocation end) {
		super();
		this.id = id;
		this.setStart(start);
		this.setEnd(end);
		this.setConnectedPaths(null);
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
	public List<FiledPathConnection> getConnectedPaths() {
		return connectedPaths;
	}
	public void setConnectedPaths(List<FiledPathConnection> connectedPaths) {
		this.connectedPaths = connectedPaths;
	}
	public void addConnectedPath(FieldPath newPath, int c1x, int c1y) {
		int startX = newPath.getStart().getX();
		int startY = newPath.getStart().getY();
		int endX = newPath.getEnd().getX();
		int endY = newPath.getEnd().getY();
		
		float longA = Math.abs(startY - endY);
		float longB = Math.abs(startX - endX);
		float shortA = Math.abs(startY - c1y);
		float shortB = Math.abs(startX - c1x);
		double ratio = Math.pow(
				      ( Math.pow(longA, 2) + Math.pow(longB, 2) )/ 
	                  ( Math.pow(shortA, 2) + Math.pow(shortB, 2) )
	                  , 0.5);
		
		FiledPathConnection newConnection = new FiledPathConnection((float)ratio, newPath);
		this.connectedPaths.add(newConnection);
	}
	
	
}
