package Ornek2;

public class Book {
    public String name;
    public int pageNumber;

    public Book(String name, int pageNumber){
        this.name = name;
        this.pageNumber = pageNumber;
    }
/*
    getter
    public int showPageNumber(){
        return this.pageNumber;
    }
    setter
    public void changePageNumber(int pageNumber){
        if(pageNumber<0){
            pageNumber = 0;
        }
        this.pageNumber = pageNumber;
    }
    getter
    public String showName(){
        return this.name;
    }
    setter
    public void changeName(String name){
        this.name = name;
    }
*/
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPageNumber(){
        return  this.pageNumber;
    }

    public void setPageNumber(int pageNumber){
        if(pageNumber<0){
            pageNumber = 0;
        }
        this.pageNumber = pageNumber;
    }
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 150);
        Book lordOfTheRings = new Book("Lord Of The Rings", -100);

        lordOfTheRings.setName("adf");
        lordOfTheRings.setPageNumber(124);

        System.out.println(lordOfTheRings.pageNumber);
    }
}
