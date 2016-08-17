package org.simlily.field;

public class FieldCharacter {
	
	private String id;
	private String name;
	private FieldObjectLocation location;
	private FieldSchedule[] schedule;
	private FieldVelocity velocity;
	/**
	 * @param location
	 * @param schedule
	 * @param velocity
	 */
	public FieldCharacter(String id, String name, FieldObjectLocation location, FieldSchedule[] schedule, FieldVelocity velocity) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.schedule = schedule;
		this.velocity = velocity;
	}
	public FieldCharacter(String id, String name) {
		this.id = id;
		this.name = name;
		//TODO:初期位置のマップ・シンボルを設定する
	}
}
