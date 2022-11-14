package item1.interfaces;

import item1.beans.IntNumber;

public interface NumToWordInterface {
    void chain(NumToWordInterface numToWordGenerator);
    void toWord(IntNumber number);
}
