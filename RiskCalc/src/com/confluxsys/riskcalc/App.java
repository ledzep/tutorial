package com.confluxsys.riskcalc;

public class App {
	public static void main(String[] args) {
		
		/*Entity child1 = new Entity(0, 1);
		Entity grandchild1 = new Entity(0, 1);
		Entity grandchild2 = new Entity(0, 2);
		child1.addChildEntity(grandchild1);
		child1.addChildEntity(grandchild2);
		
		Entity child2 = new Entity(0, 2);
		Entity child3 = new Entity(0, 2);
		Entity child4 = new Entity(0, 3);
		
		
		
		
		Entity parent = new Entity(0, 2);
		parent.addChildEntity(child1);
		parent.addChildEntity(child2);
		parent.addChildEntity(child3);
		parent.addChildEntity(child4);*/
		
		Entity childEntity = new Entity(0, 2);
		
		/*Entity grandChildEntity1 = new Entity(0, 1);
		Entity grandChildEntity2 = new Entity(0, 2);
		Entity grandChildEntity3 = new Entity(0, 3);
		
		childEntity.addChildEntity(grandChildEntity1);
		childEntity.addChildEntity(grandChildEntity2);
		childEntity.addChildEntity(grandChildEntity3);*/
		
		Entity parentEntity = new Entity(3, 3);
		
		parentEntity.addChildEntity(childEntity);
		
		RiskCalculator calc = new RiskCalculator();
		System.out.println(calc.calculateEffectiveRisk(parentEntity));
		
		

	}

}
