package entities;

import java.util.ArrayList;

public class Player {

	private String name;
	private int archetype;
	private ArrayList<String> deck;
	private ArrayList<String> monsterZone;
	private ArrayList<String> spellTrapZone;
	private ArrayList<String> handPlayer;
	private boolean atackPosition;
	private ArrayList<String> cardAtackPosition;
	private ArrayList<Boolean> cardAtack;
	private ArrayList<String> cardDefensePosition;
	private ArrayList<String> graveyard;
	
	protected int lifePoints = 5000;
	
	public String getName() {
		return name;
	}
	
	public int getArchetype() {
		return archetype;
	}
	
	public ArrayList<String> getDeck(){
		return deck;
	}
	
	public ArrayList<String> getMonsterZone(){
		return monsterZone;
	}
	
	public ArrayList<String> getSpellTrapZone(){
		return spellTrapZone;
	}
	
	public ArrayList<String> getHandPlayer(){
		return handPlayer;
	}
	
	public boolean getAtackPosition() {
		return atackPosition;
	}
	
	public ArrayList<String> getCardAtackPosition(){
		return cardAtackPosition;
	}
	
	public ArrayList<Boolean> getCardAtack(){
		return cardAtack;
	}
	
	public ArrayList<String> getCardDefensePosition(){
		return cardDefensePosition;
	}
	
	public ArrayList<String> getGraveyard(){
		return graveyard;
	}
	
	public int getLifePoints() {
		return lifePoints;
	}
	
	public int getDeckSize() {
		return deck.size();
	}
	
	public int getHandPlayerSize() {
		return handPlayer.size();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setArchetype(int archetype) {
		this.archetype = archetype;
	}
	
	public void chooseDeck() {
		getArchetype();
		if(archetype == 1) {
			deck.add("Mago Negro");
			deck.add("Mago Negro");
			deck.add("Mago Negro");
			deck.add("Neo Aqua Mador");
			deck.add("Neo Aqua Mador");
			deck.add("Neo Aqua Mador");
			deck.add("Aqua Mador");
			deck.add("Aqua Mador");
			deck.add("Aqua Mador");
			deck.add("Neo, o Espadachim Mágico");
			deck.add("Neo, o Espadachim Mágico");
			deck.add("Neo, o Espadachim Mágico");
			deck.add("Elfa Mística");
			deck.add("Elfa Mística");
			deck.add("Elfa Mística");
			deck.add("Elfos Gêmeos");
			deck.add("Elfos Gêmeos");
			deck.add("Elfos Gêmeos");
			deck.add("Rainha Cosmos");
			deck.add("Rainha Cosmos");
			deck.add("Rainha Cosmos");
			deck.add("Fada-Madrinha");
			deck.add("Fada-Madrinha");
			deck.add("Fada-Madrinha");
			deck.add("Ilusionista Sem Rosto");
			deck.add("Ilusionista Sem Rosto");
			deck.add("Ilusionista Sem Rosto");
			deck.add("Elfo Ancião");
			deck.add("Elfo Ancião");
			deck.add("Elfo Ancião");
		}else if(archetype == 2) {
			deck.add("Dragão Branco de Olhos Azuis");
			deck.add("Dragão Branco de Olhos Azuis");
			deck.add("Dragão Branco de Olhos Azuis");
			deck.add("Dragão Negro de Olhos Vermelhos");
			deck.add("Dragão Negro de Olhos Vermelhos");
			deck.add("Dragão Negro de Olhos Vermelhos");
			deck.add("Maldição do Dragão");
			deck.add("Maldição do Dragão");
			deck.add("Maldição do Dragão");
			deck.add("Dragão Kumori");
			deck.add("Dragão Kumori");
			deck.add("Dragão Kumori");
			deck.add("Dragão Inferior");
			deck.add("Dragão Inferior");
			deck.add("Dragão Inferior");
			deck.add("Dragão Filhote");
			deck.add("Dragão Filhote");
			deck.add("Dragão Filhote");
			deck.add("Dragão do Brilho");
			deck.add("Dragão do Brilho");
			deck.add("Dragão do Brilho");
			deck.add("Soldado Lagarto");
			deck.add("Soldado Lagarto");
			deck.add("Soldado Lagarto");
			deck.add("Dragão Papagaio");
			deck.add("Dragão Papagaio");
			deck.add("Dragão Papagaio");
			deck.add("Dragão Fada");
			deck.add("Dragão Fada");
			deck.add("Dragão Fada");
		}else if(archetype == 3) {
			deck.add("O Juiz");
			deck.add("O Juiz");
			deck.add("O Juiz");
			deck.add("Guardião Celta");
			deck.add("Guardião Celta");
			deck.add("Guardião Celta");
			deck.add("Predador com Machado");
			deck.add("Predador com Machado");
			deck.add("Predador com Machado");
			deck.add("Espadachim Sorrateiro");
			deck.add("Espadachim Sorrateiro");
			deck.add("Espadachim Sorrateiro");
			deck.add("Zanki");
			deck.add("Zanki");
			deck.add("Zanki");
			deck.add("Ansatsu");
			deck.add("Ansatsu");
			deck.add("Ansatsu");
			deck.add("Domador de Monstros");
			deck.add("Domador de Monstros");
			deck.add("Domador de Monstros");
			deck.add("O Cavaleiro Valete");
			deck.add("O Cavaleiro Valete");
			deck.add("O Cavaleiro Valete");
			deck.add("O Cavaleiro da Rainha");
			deck.add("O Cavaleiro da Rainha");
			deck.add("O Cavaleiro da Rainha");
			deck.add("Lâmina Sombria");
			deck.add("Lâmina Sombria");
			deck.add("Lâmina Sombria");
		}else {
			System.out.println("Arquétipo inválido!");
		}
	}
	
	public void createDeck() {
		deck = new ArrayList<>();
	}
	
	public void createMonsterZone() {
		monsterZone = new ArrayList<>();
	}
	
	public void createSpellTrapZone() {
		spellTrapZone = new ArrayList<>();
	}
	
	public void createHandPlayer() {
		handPlayer = new ArrayList<>();
	}
	
	public void createCardAtackPosition() {
		cardAtackPosition = new ArrayList<>();
	}
	
	public void createCardAtack() {
		cardAtack = new ArrayList<>();
	}
	
	public void createCardDefensePosition() {
		cardDefensePosition = new ArrayList<>();
	}
	
	public void createGraveyard() {
		graveyard = new ArrayList<>();
	}
	
	public void addMonsterZone() {
		for(int i = 0; i <= 4; i++) {
			monsterZone.add(null);
		}
	}
	
	public void addSpellTrapZone() {
		for(int i = 0; i <= 4; i++) {
			spellTrapZone.add(null);
		}
	}
	
	public void addCardAtack() {
		for(int i = 0; i <= 4; i++) {
			cardAtack.add(null);
		}
	}
	
	public void addCardAtackPosition() {
		for(int i = 0; i <= 4; i++) {
			cardAtackPosition.add(null);
		}
	}
	
	public void addCardDefensePosition() {
		for(int i = 0; i <= 4; i++) {
			cardDefensePosition.add(null);
		}
	}
	
	public void deckToHand() {
		for(int i = 0; i <= deck.size(); i++) {
			if(i < 5) {
				handPlayer.add(deck.remove(i));
			}
		}
	}
	
	public void drawCard() {
		String drawedCard = deck.remove(0);
		handPlayer.add(drawedCard);
		
		System.out.println("Nova mão do jogador: " + getName() + " " + getHandPlayer());
	}
	
	public void removeMonsterFromhandToField(int cardRemoved, int index, int position) {
		String removedCard = getHandPlayer().remove(cardRemoved);
		
		monsterZone.remove(index);
		monsterZone.add(index,removedCard);
		
		if(position == 0) {
			atackPosition = true;
			
			cardAtackPosition.remove(index);
			cardAtackPosition.add(index,removedCard);
			
			cardAtack.remove(index);
			cardAtack.add(index,atackPosition);
		
		}else if(position == 1) {
			atackPosition = false;
			
			cardDefensePosition.remove(index);
			cardDefensePosition.add(removedCard);
			
			cardAtack.remove(index);
			cardAtack.add(index,atackPosition);
		}else {
			System.out.println("Posição inválida");
		}
		
		System.out.println("Monstros do jogador: " + getMonsterZone());

		System.out.println("Carta em ataque: " + getCardAtackPosition());
		System.out.println("Carta em defesa: " + getCardDefensePosition());
	}
	
	public void removeSpellTrapFromhandToField(int cardRemoved, int index, int position) {
		String removedCard = getHandPlayer().remove(cardRemoved);
		
		spellTrapZone.remove(index);
		spellTrapZone.add(index,removedCard);
		
		System.out.println("Magias e Armadilhas do jogador: " + getSpellTrapZone());
		
	}
	
	public void monsterInTheFieldToTheGraveyard(int cardRemoved, int index) {
		String removedCard = getMonsterZone().remove(cardRemoved);
		if(cardAtack.get(index) == true) {
			cardAtack.remove(index);
			cardAtack.add(index,null);
			
			cardAtackPosition.remove(index);
			cardAtackPosition.add(index,null);
			
			monsterZone.remove(index);
			monsterZone.add(index,null);
			
			graveyard.add(removedCard);
		}else if(cardAtack.get(index) == false) {
			cardAtack.remove(index);
			cardAtack.add(index,null);
			
			cardDefensePosition.remove(index);
			cardDefensePosition.add(index,null);
			
			graveyard.add(removedCard);
		}
	}
	
	public void spellTrapInTheFieldToTheGraveyard(int cardRemoved, int index) {
		String removedCard = getSpellTrapZone().remove(cardRemoved);
		
		spellTrapZone.remove(index);
		spellTrapZone.add(index,null);
		
		graveyard.add(removedCard);
	}
	
}
