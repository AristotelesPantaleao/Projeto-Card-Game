package entities;

public class Monster extends Card {

	private int level;
	private String typeOfMonster;
	private String atribute;
	private int atack;
	private int defense;
	private boolean hasEffect;
	private String description;
	
	public int getLevel() {
		return level;
	}
	
	public String getTypeOfMonster() {
		return typeOfMonster;
	}
	
	public String getAtribute() {
		return atribute;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	
	public int getAtack() {
		return atack;
	}
	
	public int getDefense() {
		return defense;
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}
	
	public boolean getHasEffect() {
		return hasEffect;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void setTypeOfMonster(String typeOfMonster) {
		this.typeOfMonster = typeOfMonster;
	}
	
	public void setAtribute(String atribute) {
		this.atribute = atribute;
	}
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	
	public void setAtack(int atack) {
		this.atack = atack;
	}
	
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		super.setType(type);
	}
	
	public void setHasEffect(boolean hasEffect) {
		this.hasEffect = hasEffect;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void listOfMonsters() {
		if(getName().equals("Mago Negro")) {
			setType("Monster");
			setLevel(7);
			setAtribute("Dark");
			setTypeOfMonster("Mage");
			setAtack(2500);
			setDefense(2100);
			setHasEffect(false);
		}else if(getName().equals("Neo Aqua Mador")){
			setType("Monster");
			setLevel(6);
			setAtribute("Water");
			setTypeOfMonster("Mage");
			setAtack(1200);
			setDefense(3000);
			setHasEffect(false);
		}else if(getName().equals("Aqua Mador")) {
			setType("Monster");
			setLevel(4);
			setAtribute("Water");
			setTypeOfMonster("Mage");
			setAtack(1200);
			setDefense(2000);
			setHasEffect(false);
		}else if(getName().equals("Neo, o Espadachim Mágico")) {
			setType("Monster");
			setLevel(4);
			setAtribute("Light");
			setTypeOfMonster("Mage");
			setAtack(1700);
			setDefense(1000);
			setHasEffect(false);
		}else if(getName().equals("Elfa Mística")) {
			setType("Monster");
			setLevel(4);
			setAtribute("Light");
			setTypeOfMonster("Mage");
			setAtack(800);
			setDefense(2000);
			setHasEffect(false);
		}else if(getName().equals("Elfos Gêmeos")) {
			setType("Monster");
			setLevel(4);
			setAtribute("Earth");
			setTypeOfMonster("Mage");
			setAtack(1900);
			setDefense(900);
			setHasEffect(false);
		}else if(getName().equals("Rainha Cosmos")) {
			setType("Monster");
			setLevel(8);
			setAtribute("Dark");
			setTypeOfMonster("Mage");
			setAtack(2900);
			setDefense(2400);
			setHasEffect(false);
		}else if(getName().equals("Fada-Madrinha")) {
			setType("Monster");
			setLevel(4);
			setAtribute("Light");
			setTypeOfMonster("Mage");
			setAtack(1400);
			setDefense(1000);
			setHasEffect(false);
		}else if(getName().equals("Ilusionista Sem Rosto")) {
			setType("Monster");
			setLevel(5);
			setAtribute("Dark");
			setTypeOfMonster("Mage");
			setAtack(1200);
			setDefense(2200);
			setHasEffect(false);
		}else if(getName().equals("Elfo Ancião")) {
			setType("Monster");
			setLevel(4);
			setAtribute("Light");
			setTypeOfMonster("Mage");
			setAtack(1400);
			setDefense(1200);
			setHasEffect(false);
		}else if(getName().equals("Dragão Branco de Olhos Azuis")) {
			setType("Monster");
			setLevel(8);
			setAtribute("Light");
			setTypeOfMonster("Dragon");
			setAtack(3000);
			setDefense(2500);
			setHasEffect(false);
		}else if(getName().equals("Dragão Negro de Olhos Vermelhos")) {
			setType("Monster");
			setLevel(7);
			setAtribute("Dark");
			setTypeOfMonster("Dragon");
			setAtack(2400);
			setDefense(2000);
			setHasEffect(false);
		}else if(getName().equals("Maldição do Dragão")) {
			setType("Monster");
			setLevel(5);
			setAtribute("Dark");
			setTypeOfMonster("Dragon");
			setAtack(2000);
			setDefense(1500);
			setHasEffect(false);
		}else if(getName().equals("Dragão Kumori")) {
			setType("Monster");
			setLevel(4);
			setAtribute("Dark");
			setTypeOfMonster("Dragon");
			setAtack(1500);
			setDefense(1200);
			setHasEffect(false);
		}else if(getName().equals("Dragão Inferior")) {
			setType("Monster");
			setLevel(4);
			setAtribute("Wind");
			setTypeOfMonster("Dragon");
			setAtack(1200);
			setDefense(1000);
			setHasEffect(false);
		}else if(getName().equals("Dragão Filhote")) {
			setType("Monster");
			setLevel(3);
			setAtribute("Wind");
			setTypeOfMonster("Dragon");
			setAtack(1200);
			setDefense(700);
			setHasEffect(false);
		}else if(getName().equals("Dragão do Brilho")) {
			setType("Monster");
			setLevel(4);
			setAtribute("Wind");
			setTypeOfMonster("Dragon");
			setAtack(1900);
			setDefense(1600);
			setHasEffect(false);
		}else if(getName().equals("Soldado Lagarto")) {
			setType("Monster");
			setLevel(3);
			setAtribute("Wind");
			setTypeOfMonster("Dragon");
			setAtack(1100);
			setDefense(800);
			setHasEffect(false);
			setHasEffect(false);
		}else if(getName().equals("Dragão Papagaio")) {
			setType("Monster");
			setLevel(5);
			setAtribute("Wind");
			setTypeOfMonster("Dragon");
			setAtack(2000);
			setDefense(1300);
			setHasEffect(false);
		}else if(getName().equals("Dragão Fada")) {
			setType("Monster");
			setLevel(4);
			setAtribute("Wind");
			setTypeOfMonster("Dragon");
			setAtack(1100);
			setDefense(1200);
			setHasEffect(false);
		}else if(getName().equals("O Juiz")) {
			setType("Monster");
			setLevel(6);
			setAtribute("Earth");
			setTypeOfMonster("Warrior");
			setAtack(2200);
			setDefense(1500);
			setHasEffect(false);
		}else if(getName().equals("Guardião Celta")) {
			setType("Monster");
			setLevel(4);
			setAtribute("Earth");
			setTypeOfMonster("Warrior");
			setAtack(1400);
			setDefense(1200);
			setHasEffect(false);
		}else if(getName().equals("Predador com Machado")) {
			setType("Monster");
			setLevel(4);
			setAtribute("Earth");
			setTypeOfMonster("Warrior");
			setAtack(1700);
			setDefense(1100);
			setHasEffect(false);
		}else if(getName().equals("Espadachim Sorrateiro")) {
			setType("Monster");
			setLevel(6);
			setAtribute("Dark");
			setTypeOfMonster("Warrior");
			setAtack(2000);
			setDefense(1600);
			setHasEffect(false);
		}else if(getName().equals("Zanki")) {
			setType("Monster");
			setLevel(5);
			setAtribute("Earth");
			setTypeOfMonster("Warrior");
			setAtack(1500);
			setDefense(1700);
			setHasEffect(false);
		}else if(getName().equals("Ansatsu")) {
			setType("Monster");
			setLevel(5);
			setAtribute("Earth");
			setTypeOfMonster("Warrior");
			setAtack(1700);
			setDefense(1200);
			setHasEffect(false);
		}else if(getName().equals("Domador de Monstros")) {
			setType("Monster");
			setLevel(5);
			setAtribute("Earth");
			setTypeOfMonster("Warrior");
			setAtack(1800);
			setDefense(1600);
			setHasEffect(false);
		}else if(getName().equals("O Cavaleiro Valete")) {
			setType("Monster");
			setLevel(5);
			setAtribute("Light");
			setTypeOfMonster("Warrior");
			setAtack(1900);
			setDefense(1000);
			setHasEffect(false);
		}else if(getName().equals("O Cavaleiro da Rainha")) {
			setType("Monster");
			setLevel(4);
			setAtribute("Light");
			setTypeOfMonster("Warrior");
			setAtack(1500);
			setDefense(1600);
			setHasEffect(false);
		}else if(getName().equals("Lâmina Sombria")) {
			setType("Monster");
			setLevel(4);
			setAtribute("Dark");
			setTypeOfMonster("Warrior");
			setAtack(1800);
			setDefense(1500);
			setHasEffect(false);
		}else if(getName().equals("Emperor Magician")) {
			setType("Monster");
			setLevel(8);
			setAtribute("Light");
			setTypeOfMonster("Mage");
			setAtack(2100);
			setDefense(2500);
			setHasEffect(true);
			setDescription("Efeito: Pode ser invocado por invocação especial ao descartar um card da sua mão. "
					+ "Se esta carta for invocada por normal ou especial aumente o ataque de todos os monstros magos em 400 pontos.");
		}
	}
	
	
}
