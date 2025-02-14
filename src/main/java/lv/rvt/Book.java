package lv.rvt;
public class Book implements Packable{
    private String author;
    private String title;
    private double weight;
    public Book(String title, String author, double weight){
        this.title = title;
        this.author = author;
        this.weight=weight;
    }
    public double weight(){
        return this.weight;
    }
    @Override
    public String toString(){
        return this.author + ", wrote " + this.title;
    }
}