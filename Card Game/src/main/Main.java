package main;

import java.util.Scanner;

import entities.Phase;
import entities.Player;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean gameLoop = true;
		
		Player duelist = new Player();
		Player duelist2 = new Player();
		
		Phase phase = new Phase();
		
		while(gameLoop) {
			
			System.out.println("Digite o nome do Jogador 1: ");
			String player = scanner.next();
			duelist.setName(player);
			scanner.nextLine();
			
			System.out.println("Digite o nome do Jogador 2: ");
			String player2 = scanner.next();
			duelist2.setName(player2);
			scanner.nextLine();
			
			System.out.println(player + " digite o número do arquétipo que você deseja escolher: 1-Mago, 2-Dragão, 3-Guerreiro");
			int archetype = scanner.nextInt();
			duelist.setArchetype(archetype);
			
			duelist.createDeck();
			duelist.chooseDeck();
			
			System.out.println(player2 + " digite o número do arquétipo que você deseja escolher: 1-Mago, 2-Dragão, 3-Guerreiro");
			int archetype2 = scanner.nextInt();
			duelist2.setArchetype(archetype2);
			
			duelist2.createDeck();
			duelist2.chooseDeck();
			
			duelist.createMonsterZone();
			duelist.addMonsterZone();
			duelist.createSpellTrapZone();
			duelist.addSpellTrapZone();
			duelist.createHandPlayer();
			duelist.deckToHand();
			duelist.createCardAtackPosition();
			duelist.createCardAtack();
			duelist.createCardDefensePosition();
			duelist.addCardAtack();
			
			duelist2.createMonsterZone();
			duelist2.addMonsterZone();
			duelist2.createSpellTrapZone();
			duelist2.addSpellTrapZone();
			duelist2.createHandPlayer();
			duelist2.deckToHand();
			duelist2.createCardAtackPosition();
			duelist2.createCardAtack();
			duelist2.createCardDefensePosition();
			duelist2.addCardAtack();
			
			int round = 0;
			while(round <= 11) {
				switch(round) {
				case 0:
					System.out.println(phase.getTurn());
					phase.isDrawPhase(duelist);
					round++;
					break;
				case 1:
					phase.isStandByPhase(duelist);
					round++;
					break;
				case 2:
					phase.isMainPhase1(duelist);
					round++;
					break;
				case 3:
					phase.isBattlePhase(duelist, duelist2);
					round++;
					break;
				case 4:
					phase.isMainPhase2(duelist);
					round++;
					break;
				case 5:
					phase.isEndPhase(duelist);
					round++;
					break;
				case 6:
					System.out.println(phase.getTurn());
					phase.isDrawPhase(duelist2);
					round++;
					break;
				case 7:
					phase.isStandByPhase(duelist2);
					round++;
					break;
				case 8:
					phase.isMainPhase1(duelist2);
					round++;
					break;
				case 9:
					phase.isBattlePhase(duelist2, duelist);
					round++;
					break;
				case 10:
					phase.isMainPhase2(duelist2);
					round++;
					break;
				case 11:
					phase.isEndPhase(duelist2);
					round = 0;
					break;
				}
				
			}
			
			if(duelist.getLifePoints() == 0) {
				System.out.println(duelist2.getName()+" venceu!");
				gameLoop = false;
			}else if(duelist2.getLifePoints() == 0) {
				System.out.println(duelist.getName()+" venceu!");
				gameLoop = false;
			}
			
		}
		
		
		scanner.close();
	}
	
}
