package com.rimba.mains;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rimba.config.HeroesConfig;
import com.rimba.heroes.CasterHeroes;
import com.rimba.heroes.Heroes;
import com.rimba.heroes.RangedHeroes;
import com.rimba.heroes.TankHeroes;

public class AppJavaClassConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HeroesConfig.class);
		
		Heroes hero1 = context.getBean("tankHeroes",Heroes.class);
		Heroes hero2 = context.getBean("rangedHeroes", Heroes.class);
		Heroes hero3 = context.getBean("casterHeroes",Heroes.class);
		
		System.out.println("1st Hero");
		System.out.println("Name: "+ ((TankHeroes)hero1).getName());
		System.out.println("Type: "+ ((TankHeroes)hero1).getType());
		System.out.println("Desc: "+ ((TankHeroes)hero1).getHeroesInfo());
		System.out.println("Weapon: "+ ((TankHeroes)hero1).getWeapon().getWeaponInfo());
		System.out.println("-------------------------------------------------");
		System.out.println("2nd Hero");
		System.out.println("Name: "+ ((RangedHeroes)hero2).getName());
		System.out.println("Type: "+ ((RangedHeroes)hero2).getType());
		System.out.println("Desc: "+ ((RangedHeroes)hero2).getHeroesInfo());
		System.out.println("Weapon: "+ ((RangedHeroes)hero2).getWeapon().getWeaponInfo());
		System.out.println("-------------------------------------------------");
		System.out.println("3rd Hero");
		System.out.println("Name: "+ ((CasterHeroes)hero3).getName());
		System.out.println("Type: "+ ((CasterHeroes)hero3).getType());
		System.out.println("Desc: "+ ((CasterHeroes)hero3).getHeroesInfo());
		System.out.println("Weapon: "+ ((CasterHeroes)hero3).getWeapon().getWeaponInfo());
		System.out.println("-------------------------------------------------");
		
		context.close();

	}

}
