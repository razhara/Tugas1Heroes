package com.rimba.weapons;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Gun implements Weapons {

	@Override
	public String getWeaponInfo() {
		// TODO Auto-generated method stub
		return "Modern enemies need modern solutions";
	}

}
