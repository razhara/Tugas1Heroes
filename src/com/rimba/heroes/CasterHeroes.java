package com.rimba.heroes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.rimba.weapons.Weapons;
@Component
@Scope("prototype")
public class CasterHeroes implements Heroes {

	@Value("Harpot")
	private String name;
	@Value("Wizard")
	private String type;
	private Weapons weapon;
	
	
	
	public CasterHeroes() {
		super();
	}

	

	public CasterHeroes(String name, String type, Weapons weapon) {
		super();
		this.name = name;
		this.type = type;
		this.weapon = weapon;
	}



	@Override
	public String getHeroesInfo() {
		// TODO Auto-generated method stub
		return "A hero that uses many spells";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public Weapons getWeapon() {
		return weapon;
	}


	@Autowired
	@Qualifier("magicStaff")
	public void setWeapon(Weapons weapon) {
		this.weapon = weapon;
	}



	@Override
	public String toString() {
		return "CasterHeroes [name=" + name + ", type=" + type + ", weapon=" + weapon + "]";
	}

}
