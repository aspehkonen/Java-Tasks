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
public class Video extends Database{
    private String title;
    private String director;
    private String language;
    private int playingTime;
    private boolean available;
    private String comment;

    public Video(String title, String director, String language, int playingTime) {
        this.title = title;
        this.director = director;
        this.language = language;
        this.playingTime = playingTime;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean getAvaible() {
        return available;
    }
    
    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + director);
        System.out.println("Language: " + language);
        System.out.println("Playtime: " + playingTime + "min");
        System.out.println("Comment: " + comment);
    }
}
