package q10;

public class Monster {

	String name;
	int hp;
	int maxhp;
	int attack;
	String race;
	
	Monster(String name,int hp,int maxhp,int attack,String race){
		
		this.name = name;
		this.hp = hp;
		this.maxhp = maxhp;
		this.attack = attack;
		this.race = race;
		
		System.out.println(this.name +"가 등장!");
	}
	
	void info() {
		System.out.println("이름:"+this.name+"[("+this.hp+"/"+this.maxhp +")]"
				+" 공격력:"+this.attack);
	}
	
}
