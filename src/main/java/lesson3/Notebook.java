package lesson3;

public class Notebook {
    String color;
    int pages;
    boolean isNew = true;
    String category;

    static String companyName= "NotebookMark";


    public Notebook() {
    }

    public Notebook(String color, int pages) {
        this.color = color;
        this.pages = pages;
    }

    void novelty(){
        this.isNew=isNew;
    }

    void setCategory(){
        this.category=category;
    }

    void setPages(int pages){

        this.pages =pages;
    };

    String getColor() {

        return color;
    }

    static void sayMark() {
        System.out.println(companyName);
    }

}
