package org.simlily.field;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author OWNER
 *
 */
public class FieldMap {

	private String id;
	private Date time;
	private List<FieldPath> paths;
	private List<FieldSymbol> symbols;
	
	/**
	 * 
	 */
	public FieldMap(String id) {
		super();
		this.id = id;
		this.time = new Date();
	}
	/**
	 * 
	 * @param path
	 */
	public void addPath(FieldPath path) {
		this.paths.add(path);
	}	
	/**
	 * 
	 * @param symbol
	 */
	public void addSymbol(FieldSymbol symbol) {
		this.symbols.add(symbol);
	}	
	/**
	 * 
	 * @return
	 */
	public Date getTime() {
		return time;
	}
	/**
	 * 
	 * @param time
	 */
	public void setTime(Date time) {
		this.time = time;
	}
	 /**
	  * 交点計算
	  * @param newPath
	  * @return
	  */
	 public int calcConnection(FieldPath newPath){
		 for ( FieldPath path : this.paths) {
			 int p1x = newPath.getStart().getX();
			 int p1y = newPath.getStart().getY();
			 int p3x = newPath.getEnd().getX();
			 int p3y = newPath.getEnd().getY();
			 int p2x = path.getStart().getX();
			 int p2y = path.getStart().getY();
			 int p4x = path.getEnd().getX();
			 int p4y = path.getEnd().getY();
			 
			 int s1 = ((p4x - p2x) * (p1y - p2y) - (p4y - p2y) * (p1x - p2x)) / 2;
			 int s2 = ((p4x - p2x) * (p2y - p3y) - (p4y - p2y) * (p2x - p3x)) / 2;
			 
			 int c1x = p1x + (p3x - p1x) * s1 / (s1 + s2);
			 int c1y = p1x + (p3x - p1x) * s1 / (s1 + s2);
			 
			 //交差判定
			 if ((p1x <= c1x && c1x <= p3x) || (p3x <= c1x && c1x <= p1x)) {
				 if ((p1y <= c1y && c1y <= p3y) || (p3y <= c1y && c1y <= p1y)) {
					 path.addConnectedPath(newPath, c1x, c1y);
				 }
			 }
		 }
		 return 0;
	 }
	
}
