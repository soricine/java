
package model.turn;
import model.player.*;
/**
 * Represents who's turn is in the game.
 * @author Zack csd4602
 */
public abstract class turn implements player{
    /**
     * Constructor for the Turn class.
     * 
     * @pre None.
     * @post A new instance of the Turn class is created.
     */
    public turn(){
        
    }
    
    public void setID(){
       
    }
    
    public int  getID(){
        return 0; //for now   
    }
    
    /**
     * Checks if a player has finished their turn.
     * 
     * @param p The player to check.
     * @return true if the player has finished their turn, false otherwise.
     * @pre The provided player is not null.
     * @post None.
     */
    public boolean checkIfPlayerFinished(player p){
        return true; //for now
        
    }
    
    
    public void Set_last_player(){
       
    }
    
    
    public int Get_last_player(){
        return 0;//for now
    }

    
    public void getWinner() {
       
    }
     
    
}
