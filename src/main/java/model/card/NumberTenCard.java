
package model.card;

/**
 * Represents a Number Ten Card in the game.
 * Extends the NumberCard class.
 * 
 * @author Zack csd4602
 */
public class NumberTenCard extends NumberCard{
    /**
     * Constructs a Number Ten Card.
     * 
     * @param ch An integer parameter (typically 0 or 1) used to determine the player's choice
     *           If ch is 0, the move value is set to 10; otherwise, it is set to -1.
     * @pre None.
     * @post A new instance of NumberTenCard is created with the specified move value.
     */
    public NumberTenCard(int ch) { 
        super(ch == 0 ? 10 : -1, false, false, false, false);

    }
    
}
