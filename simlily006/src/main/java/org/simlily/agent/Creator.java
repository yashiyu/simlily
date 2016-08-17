package org.simlily.agent;

import java.util.Date;
import java.util.List;

import org.simlily.field.FieldCharacter;
import org.simlily.field.FieldLocation;
import org.simlily.field.FieldMap;
import org.simlily.field.FieldPath;

public class Creator {
	
	 private List<FieldMap> fieldMaps;
	 private List<FieldCharacter> characters;
	
	 public FieldMap createMap(String id){
		 FieldMap map = new FieldMap(id);
		 this.fieldMaps.add(map);
		 return map;
	 }
	 public int createPath(FieldMap map, String id, FieldLocation start, FieldLocation end){
		 //パスを生成して追加
		 FieldPath newPath = new FieldPath(id, start, end);
		 map.addPath(newPath);
		 
		 //交点を計算して各パスにセット
		 map.calcConnection(newPath);
		 
		 return 0;
	 }
	 public int updatePath(FieldMap map, FieldPath path){
		 //TODO:IDが一致したpathをpathに更新する
		 return 0;
	 }
	 public int deletePath(String id){
		 return 0;
	 }
	 public int createCharacter(){
		 FieldCharacter character = new FieldCharacter(null, null, null);
		 return 0;
	 }
}
