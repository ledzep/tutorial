package com.confluxsys.riskcalc;

public class RiskCalculator {
		
	// Returns effective risk for an entity object
	public int calculateEffectiveRisk(Entity e) {
		//
		// Step 1: Calculate derived risk from children.
		//
		// Derived risk is largest risk among all children if they exists
		int derived_risk = 0;
		if (e.getChildEntities() == null || e.getChildEntities().isEmpty()) {
			// No children. So derived_risk is default risk of the system.
			derived_risk =  e.getDefaultRisk();
		} else {
			// There are children. Calculate maximum among all.
			for(Entity childEntity: e.getChildEntities()) {
				int child_risk = calculateEffectiveRisk(childEntity);
				if(child_risk > derived_risk) {
					derived_risk = child_risk;
				} // end if
			} // end for
		} // end else
		
		//
		// Step 2: Calculate effective risk
		//
		if(e.getAssignedRisk() > derived_risk) {
//			e.effective_risk = e.assigned_risk;
			return e.getAssignedRisk();
 		} else {
 			return derived_risk;
 		}
		
	}
	
}
