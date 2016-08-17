package org.simlily.field;

import java.util.ArrayList;
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
		this.paths = new ArrayList<FieldPath>();
		this.symbols= new ArrayList<FieldSymbol>();
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
			 
			 double s1 = ((p4x - p2x) * (p1y - p2y) - (p4y - p2y) * (p1x - p2x)) / 2;
			 double s2 = ((p4x - p2x) * (p2y - p3y) - (p4y - p2y) * (p2x - p3x)) / 2;
			 
			 if (s1 + s2 == 0) {
				 //直線が重なっている
				 return 0;
			 }
			 double c1x = p1x + (p3x - p1x) * s1 / (s1 + s2);
			 double c1y = p1y + (p3y - p1y) * s1 / (s1 + s2);
			 
			 //交差判定
			 if (
			    (((p1x <= c1x && c1x <= p3x) || (p3x <= c1x && c1x <= p1x)) &&
			     ((p1y <= c1y && c1y <= p3y) || (p3y <= c1y && c1y <= p1y)) )
			    &&
			    (((p2x <= c1x && c1x <= p4x) || (p4x <= c1x && c1x <= p2x)) &&
			     ((p2y <= c1y && c1y <= p4y) || (p4y <= c1y && c1y <= p2y)) )
			    )
			 {
     			 path.addConnectedPath(newPath, (int)c1x, (int)c1y);
			 }
		 }
		 return 0;
	 }
	 public List<FieldPath> getPaths() {
		 return paths;
	 }
	 public void setPaths(List<FieldPath> paths) {
		 this.paths = paths;
	 }

}
