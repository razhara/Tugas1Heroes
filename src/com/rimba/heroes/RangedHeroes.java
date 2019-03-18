package com.rimba.heroes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.rimba.weapons.Weapons;

@Component
@Scope("prototype")
public class RangedHeroes implements Heroes {
	
	@Value("Billy the Kid")
	private String name;
	@Value("Rogue")
	private String type;
	
	
	private Weapons weapon;
	
	
	
	public RangedHeroes() {
		super();
	}



	public RangedHeroes(String name, String type, Weapons weapon) {
		super();
		this.name = name;
		this.type = type;
		this.weapon = weapon;
	}



	@Override
	public String getHeroesInfo() {
		// TODO Auto-generated method stub
		return "A hero that attacking from far distances";
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
	@Qualifier("gun")
	public void setWeapon(Weapons weapon) {
		this.weapon = weapon;
	}



	@Override
	public String toString() {
		return "RangedHeroes [name=" + name + ", type=" + type + ", weapon=" + weapon + "]";
	}

}
