package item1;

public class NumToWordGenerator {
    public void convertToWords(int numberInput) {
        if(numberInput < 0) {
            throw new IllegalArgumentException("Number Input should be positive");
        }
        System.out.println("Converting");
    }
}
