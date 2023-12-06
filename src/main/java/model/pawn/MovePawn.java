
package model.pawn;
import model.card.*;
import model.deck.*;
/**
 * Represents the movement of pawns in the game.
 * 
 * @author Zack csd4602
 */
public class MovePawn {
    
    private deck gameDeck;
    /**
     * Constructor for MovePawn class.
     * 
     * @param gameDeck The game deck where pawns are moving.
     * @pre The provided game deck is not null.
     * @post The MovePawn instance is initialized with the specified game deck.
     */
    public MovePawn(deck gameDeck) { //used for initialize of pawns beafore game startt
        
    }

    /**
     * Moves a pawn according to the provided card.
     * 
     * @param card The card determining the movement.
     * @param pawn The pawn to be moved.
     * @pre The provided card and pawn are not null.
     * @post The pawn is moved according to the rules of the provided card.
     */
    public void movePawnAccordingToCard(card card, pawn pawn){
    
    }
    
}
