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
    private String developer;
    private String publisher;
    private String name;
    private String desc;
    private String raw;
    private URL imgUrl = null;
    private Document wikiPage;
    Game(String n)
    {
        name = n;
        setAllInfo();
    }
    
    private void setAllInfo()
    {
        String queary = name.replace(' ', '_');
        //some video games have a wiki page with this addendum to distinguish them
        String firstQueary = "https://en.wikipedia.org/wiki/" + queary + "_(video_game)";
        String secondQueary = "https://en.wikipedia.org/wiki/" + queary;
        //we try the _(video game) link first as that will be the one we want in most cases
        try
        {
            wikiPage = Jsoup.connect(firstQueary).get();
            setRaw();
            setDesc();
            setDev();
            setPub();
            setImageUrl();
        }
        catch(IOException e)
        {
            try
            {
                wikiPage = Jsoup.connect(secondQueary).get();
                setRaw();
                setDesc();
                setDev();
                setPub();
                setImageUrl();            
            }
            catch(IOException i)
            {
                        
            }
        }
    }
    
    //sets the raw text we will grab from in most of our methods
    private void setRaw()
    {
        Element paragraph = wikiPage.getElementsByClass("mw-parser-output").first();
        raw = paragraph.text(); 
    }
    
    //grabs the description of the game from wiki
    private void setDesc()
    {
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
    private void setDev()
    {
        int startDex, endDex;
        String startWord = "Developer(s)";
        String endWord = "Publisher(s)";
        startDex = raw.indexOf(startWord);
        endDex = raw.indexOf(endWord);
        developer = raw.substring(startDex, endDex); 
    }
    
    //grabs publisher
    private void setPub()
    {
         int startDex, endDex;
        String startWord = "Publisher(s)";
        String endWord = "Director(s)";
        startDex = raw.indexOf(startWord);
        endDex = raw.indexOf(endWord);
        publisher = raw.substring(startDex, endDex);        
    }
     
    //sets image of covor art and gets its url
    private void setImageUrl()
    {
        Element imageInfo = wikiPage.select(".image").first();
        String imageHtml = imageInfo.html();
        int startDex, endDex;
        String startWord = "src=\"";
        String endWord = "decoding";
        startDex = imageHtml.indexOf(startWord);
        endDex = imageHtml.indexOf(endWord);
        String stringUrl = imageHtml.substring(startDex+7,endDex-2);
        stringUrl = "https://" + stringUrl;
        try{
           imgUrl = new URL(stringUrl);
        }
        catch(IOException e)
        {
           System.out.print(e);
        }
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public String getDev()
    {
        return developer;
    }
    
    public String getPub()
    {
        return publisher;
    }
    
    public URL getImageUrl()
    {
        return imgUrl;
    }
}
