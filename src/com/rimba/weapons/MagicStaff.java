package com.rimba.weapons;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MagicStaff implements Weapons {

	@Override
	public String getWeaponInfo() {
		// TODO Auto-generated method stub
		return "A staff imbued with magical power";
	}

}
