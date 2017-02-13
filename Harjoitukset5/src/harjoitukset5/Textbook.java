/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitukset;

/**
 *
 * @author Admin
 */
public class Textbook extends Database{
    private String title;
    private String author;
    private String language;
    private int numberPages;
    private boolean available;
    private String comment;

    public Textbook(String title, String author, String language, int numberPages) {
        this.title = title;
        this.author = author;
        this.language = language;
        this.numberPages = numberPages;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean getAvailable() {
        return available;
    }
    
    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + author);
        System.out.println("Language: " + language);
        System.out.println("Playtime: " + numberPages);
        System.out.println("Comment: " + comment);
    }
}
