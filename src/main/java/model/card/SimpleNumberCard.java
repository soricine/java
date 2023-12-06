
package model.card;

/**
 * SimpleNumberCard class extends NumberCard class
 *is being extend by othe classes that represent the abilities of each simple number card
 * @author Zack csd4602
 */
public class SimpleNumberCard extends NumberCard {
    
    public SimpleNumberCard(int num) {   
        super(num, false, false, num != 12 ? true : false, num == 8 || num==12 ? true : false);
         
            
    }
    
}
