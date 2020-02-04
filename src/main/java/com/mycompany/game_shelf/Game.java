package com.mycompany.game_shelf;

import java.io.IOException;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;

/**
 *
 * @author GGulk
 */
public class Game {

    //holds all the info needed for frames and methods
    private String developer;
    private String publisher;
    private String genre;
    private String mode;
    private String name;
    private String desc;
    private String raw;
    private boolean own;
    private String status;
    private URL imgUrl = null;
    private Document wikiPage;

    Game(String n) {
        name = n;
        setAllInfo();
    }

    //sets the games info from webscrape
    private void setAllInfo() {
        //game url words seperated by _
        String queary = name.replace(' ', '_');
        //some video games have a wiki page with this addendum to distinguish them
        String firstQueary = "https://en.wikipedia.org/wiki/" + queary + "_(video_game)";
        String secondQueary = "https://en.wikipedia.org/wiki/" + queary;
        //we try the _(video game) link first as that will be the one we want in most cases
        try {
            wikiPage = Jsoup.connect(firstQueary).get();
            setRaw();
            setDesc();
            setDev();
            setPub();
            setMode();
            setGenre();
            setImageUrl();
        } catch (IOException e) {
            //attempting other type of url
            try {
                wikiPage = Jsoup.connect(secondQueary).get();
                setRaw();
                setDesc();
                setDev();
                setPub();
                setMode();
                setGenre();
                setImageUrl();
            } //all cases failed error is true
            catch (IOException i) {

            }
        }
    }

    //sets the raw text we will grab from in most of our methods
    private void setRaw() {
        Element paragraph = wikiPage.getElementsByClass("mw-parser-output").first();
        raw = paragraph.text();
    }

    //method we use to grab most info from raw
    private String retrieveInfoFromRaw(String start, String end) {
        int startDex, endDex;
        startDex = raw.indexOf(start);
        endDex = raw.indexOf(end);
        return raw.substring(startDex, endDex);
    }

    //grabs the description of the game from raw
    private void setDesc() {
        int introDex, startDex, endDex;

        String introWord = "Mode(s)";
        introDex = raw.indexOf(introWord);
        desc = raw.substring(introDex);

        String startWord = name;
        String endWord = "Contents";
        startDex = desc.indexOf(startWord);
        endDex = desc.indexOf(endWord);
        desc = desc.substring(startDex, endDex);
        desc = desc.replace("[a]", " ");
    }

    //grabs developers name
    private void setDev() {
        String startWord = "Developer(s)";
        String endWord = "Publisher(s)";
        developer = retrieveInfoFromRaw(startWord, endWord);
        developer = developer.replace("Developer(s)", "");
    }

    //grabs publisher
    private void setPub() {
        String startWord = "Publisher(s)";
        String endWord = "Director(s)";
        publisher = retrieveInfoFromRaw(startWord, endWord);
        publisher = publisher.replace("Publisher(s)", "");
    }

    //sets image of covor art and gets its url
    private void setImageUrl() {
        Element imageInfo = wikiPage.select(".image").first();
        String imageHtml = imageInfo.html();
        int startDex, endDex;
        String startWord = "src=\"";
        String endWord = "decoding";
        startDex = imageHtml.indexOf(startWord);
        endDex = imageHtml.indexOf(endWord);
        String stringUrl = imageHtml.substring(startDex + 7, endDex - 2);
        stringUrl = "https://" + stringUrl;
        try {
            imgUrl = new URL(stringUrl);
        } catch (IOException e) {
            System.out.print(e);
        }
    }

    private void setGenre() {
        String startWord = "Genre(s)";
        String endWord = "Mode(s)";
        genre = retrieveInfoFromRaw(startWord, endWord);
        genre = genre.replace("Genre(s)", "");
    }

    private void setMode() {
        String startWord = "Mode(s)";
        String endWord = name;
        int startDex = raw.indexOf(startWord);
        mode = raw.substring(startDex);
        int endDex = mode.indexOf(endWord);
        mode = mode.substring(8, endDex);
    }

    public void setOwn(boolean input) {
        own = input;
    }

    public void setStatus(String input) {
        status = input;
    }

    public String getStatus() {
        return status;
    }

    public boolean getOwn() {
        return own;
    }

    public String getDesc() {
        return desc;
    }

    public String getDev() {
        return developer;
    }

    public String getPub() {
        return publisher;
    }

    public String getMode() {
        return mode;
    }

    public String getGenre() {
        return genre;
    }

    public URL getImageUrl() {
        return imgUrl;
    }

    public String getName() {
        return name;
    }
}
