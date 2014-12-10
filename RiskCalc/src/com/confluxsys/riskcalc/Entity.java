package com.confluxsys.riskcalc;

import java.util.ArrayList;
import java.util.List;

public class Entity {
	private int defaultRisk;
	private int assignedRisk;
	List<Entity> childEntities;
	
	public Entity(int defaultRisk, int assigned_risk) {
		this.assignedRisk = assigned_risk;
		this.defaultRisk = defaultRisk;
	}
	
	public List<Entity> getChildEntities() {
		return childEntities;
	}
	
	public void setChildEntities(List<Entity> childEntities) {
		this.childEntities = childEntities;
	}

	public int getAssignedRisk() {
		return assignedRisk;
	}
	
	public int getDefaultRisk() {
		return defaultRisk;
	}
	
	public void addChildEntity(Entity childEntity){
		if(childEntities == null){
			childEntities = new ArrayList<Entity>(1);
		}
		childEntities.add(childEntity);		
	}
	
}
