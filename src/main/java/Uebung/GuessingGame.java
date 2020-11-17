package Uebung;

public class GuessingGame {
    
    Player p1;
    Player p2;
    
public void startgame(){
    
    p1= new Player();
    p2= new Player();
    
    int guessp1=0;
    int guessp2=0;
    
    boolean p1isRight= false;
    boolean p2isRight=false;
    
    int targetNumber=(int) (Math.random()*10);
    System.out.println("Ich denke über eine Zahl zwischen 0 und 9 nach");
    
}

}
