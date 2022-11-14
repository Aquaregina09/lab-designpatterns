package item1;

import item1.beans.IntNumber;
import item1.interfaces.NumToWordInterface;

public abstract class NumToWordAbstract {
    private NumToWordInterface numToWordGenerator;
    
    public void chain(NumToWordInterface numToWordInterface) {
        this.numToWordGenerator = numToWordInterface;
    }
    
    public void toWord(IntNumber intNumber) {
        if(intNumber.getNumLength() >= 3) {
            
        }
    }
}
