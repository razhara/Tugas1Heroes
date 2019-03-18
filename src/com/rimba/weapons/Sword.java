package com.rimba.weapons;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Sword implements Weapons {

	@Override
	public String getWeaponInfo() {
		// TODO Auto-generated method stub
		return "A strong sword that can slash enemies";
	}

}
