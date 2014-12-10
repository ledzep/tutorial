package com.confluxsys.riskcalc;

public class App {
	public static void main(String[] args) {
		
		Entity childEntity = new Entity(0, 2);
		
		Entity grandChildEntity1 = new Entity(0, 1);
		Entity grandChildEntity2 = new Entity(0, 2);
		Entity grandChildEntity3 = new Entity(0, 3);
		
		childEntity.addChildEntity(grandChildEntity1);
		childEntity.addChildEntity(grandChildEntity2);
		childEntity.addChildEntity(grandChildEntity3);
		
		Entity parentEntity = new Entity(3, 3);
		
		parentEntity.addChildEntity(childEntity);
		
		RiskCalculator calc = new RiskCalculator();
		System.out.println(calc.calculateEffectiveRisk(parentEntity));
		
		

	}

}
