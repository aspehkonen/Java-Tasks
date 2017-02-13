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
public class CD extends Database{
    private String title;
    private String artist;
    private String language;
    private int playingTime;
    private boolean available;
    private String comment;

    public CD(String title, String artist, String language, int playingTime) {
        this.title = title;
        this.artist = artist;
        this.language = language;
        this.playingTime = playingTime;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean getAvailable() {
        return available;
    }
    
    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Language: " + language);
        System.out.println("Playtime: " + playingTime + "min");
        System.out.println("Comment: " + comment);
    }
}
