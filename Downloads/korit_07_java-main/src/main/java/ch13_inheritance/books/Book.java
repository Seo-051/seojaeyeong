package ch13_inheritance.books;

public class Book {

private String title;
private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    void showInfo(){
        System.out.println("제목 : " + title);
        System.out.println("저자 : " + author);
    }



}
// ch14_abstraction -> abstarct_classes -> Factory