package org.simlily.agent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.simlily.field.FieldCharacter;
import org.simlily.field.FieldConnectedPath;
import org.simlily.field.FieldLocation;
import org.simlily.field.FieldMap;
import org.simlily.field.FieldPath;
import org.simlily.field.FieldSymbol;

public class Creator {
	
	 private List<FieldMap> fieldMaps;
	 private List<FieldCharacter> characters;
	 
	 public Creator(){
		 this.fieldMaps = new ArrayList<FieldMap>();
		 this.characters = new ArrayList<FieldCharacter>();
	 }
	 
	/**
	 * 
	 * @param id
	 * @return
	 */
	 public FieldMap createMap(String id){
		 FieldMap map = new FieldMap(id);
		 this.fieldMaps.add(map);
		 return map;
	 }
	 /**
	  * 
	  * @param map
	  * @param id
	  * @param start
	  * @param end
	  * @return
	  */
	 public int createPath(FieldMap map, String id, FieldLocation start, FieldLocation end){
		 //パスを生成して追加
		 FieldPath newPath = new FieldPath(id, start, end);
		 map.addPath(newPath);
		 
		 //交点を計算して各パスにセット
		 map.calcConnection(newPath);
		 
		 return 0;
	 }
	 /**
	  * 
	  * @param map
	  * @param path
	  * @return
	  */
	 public int updatePath(FieldMap map, FieldPath path){
		 //TODO:IDが一致したpathをpathに更新する
		 return 0;
	 }
	 /**
	  * 
	  * @param id
	  * @return
	  */
	 public int deletePath(String id){
		 return 0;
	 }
	 /**
	  * 
	  * @param id
	  * @param name
	  * @return
	  */
	 public int createCharacter(String id, String name){
		 FieldCharacter character = new FieldCharacter(id, name);
		 boolean result = this.characters.add(character);
		 return 0;
	 }

	public void createSymbol(FieldMap map, String id, List<FieldConnectedPath> pathConnections) {
		FieldSymbol symbol = new FieldSymbol(id, pathConnections);
		map.addSymbol(symbol);
	}
}
