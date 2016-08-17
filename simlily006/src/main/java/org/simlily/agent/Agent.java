package org.simlily.agent;

import java.util.ArrayList;
import java.util.List;

import org.simlily.field.FieldConnectedPath;
import org.simlily.field.FieldLocation;
import org.simlily.field.FieldMap;
import org.simlily.field.FieldPath;
import org.simlily.field.FieldPathConnection;

public class Agent {
	/**
	 * テスト実行
	 */
	public void test(){
		//クリエイター作成
		Creator creator = new Creator();
		
		//マップ作成
		FieldMap map = creator.createMap("test");
		//パス作成
		creator.createPath(map, "path1", new FieldLocation(470, 203), new FieldLocation(78,205));
		creator.createPath(map, "path2", new FieldLocation(346, 420), new FieldLocation(369,106));
		creator.createPath(map, "path3", new FieldLocation(613, 326), new FieldLocation(286,268));
		creator.createPath(map, "path4", new FieldLocation(446, 242), new FieldLocation(394,573));
		creator.createPath(map, "path5", new FieldLocation(968, 464), new FieldLocation(277,335));
		creator.createPath(map, "path6", new FieldLocation(462, 411), new FieldLocation(585,145));
		//シンボル作成
		List<FieldConnectedPath> connections1 = new ArrayList<FieldConnectedPath>();
		connections1.add(new FieldConnectedPath("path1", 0.8f, true));
		creator.createSymbol(map, "school", connections1);
		
		List<FieldConnectedPath> connections2 = new ArrayList<FieldConnectedPath>();
		connections2.add(new FieldConnectedPath("path4", 0.95f, true));
		creator.createSymbol(map, "park", connections2);

		List<FieldConnectedPath> connections3 = new ArrayList<FieldConnectedPath>();
		connections3.add(new FieldConnectedPath("path5", 0.7f, true));
		creator.createSymbol(map, "shop", connections3);
		
		List<FieldConnectedPath> connections4 = new ArrayList<FieldConnectedPath>();
		connections4.add(new FieldConnectedPath("path6", 0.1f, true));
		creator.createSymbol(map, "home", connections4);
		
		//キャラクター作成
		creator.createCharacter("chara1", "charaName1");
		creator.createCharacter("chara2", "charaName2");
		creator.createCharacter("chara3", "charaName3");
		
		//接点出力
		for (FieldPath path : map.getPaths()){
			System.out.printf("===========checking path: %s \n", path.getId());
			List<FieldPathConnection> connections = path.getConnectedPaths();
			if (connections != null) {
				for (FieldPathConnection connection: connections) {
					float ratio = connection.getPathLocationRatio();
					System.out.printf("connectedPathId: %s ", connection.getConnectedPath().getId());
					System.out.printf("ratio: %.2f \n", ratio);
				}
			}
		}
		
	}

}
