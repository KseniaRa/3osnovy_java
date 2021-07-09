package lesson3;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args){
        Notebook notebook = new Notebook();
        Notebook first = new Notebook();
        Notebook second= new Notebook("black",96);


        Notebook.sayMark();
        System.out.println(second.getColor());

    }
}
