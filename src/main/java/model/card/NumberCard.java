
package model.card;

/**
 * NumberCard class extends card and 
 *is being extend by othe classes that represent the abilities of each number card
 * @author Zack csd4602
 */
public class NumberCard extends card {
    private int moveValue;
    private boolean StartOpt,Replay,MultiMove,NewCard;

    /**Constructor.
     * 
     */
    public NumberCard(int moveValue,boolean StartOpt,boolean Replay,boolean MultiMove,boolean NewCard) 
    {
        this.moveValue=moveValue;
        this.MultiMove=MultiMove;
        this.StartOpt=StartOpt;
        this.Replay=Replay;
        this.NewCard=NewCard;
    }

    
}
