package com.mycompany.game_shelf;

import java.io.IOException;
import javax.swing.JOptionPane;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
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
    
    Game(String n)
    {
        name = n;
        setRaw();
        setDesc();
        setDev();
        setPub();
    }
    
    private void setRaw()
    {
        Document doc;
        String queary = name.replace(' ', '_');
        String searchQueary = "https://en.wikipedia.org/wiki/" + queary;
        
        try
        {
            doc = Jsoup.connect(searchQueary).get();
            Elements paragraphs = doc.getElementsByClass("mw-parser-output");
            for(Element info: paragraphs)
            {
                raw = info.text();         
            }
            
        }
        catch(IOException e)
        {
            System.out.print(e.toString());   
        }
        
    }
    
    private void setDesc()
    {
        int startDex, endDex;
        String startWord = name + "[a]";
        String endWord = "Contents";
        startDex = raw.indexOf(startWord);
        endDex = raw.indexOf(endWord);
        desc = raw.substring(startDex, endDex);
        desc = desc.replace("[a]", " ");
    }
    
    private void setDev()
    {
        int startDex, endDex;
        String startWord = "Developer(s)";
        String endWord = "Publisher(s)";
        startDex = raw.indexOf(startWord);
        endDex = raw.indexOf(endWord);
        developer = raw.substring(startDex, endDex); 
    }
    
    private void setPub()
    {
         int startDex, endDex;
        String startWord = "Publisher(s)";
        String endWord = "Director(s)";
        startDex = raw.indexOf(startWord);
        endDex = raw.indexOf(endWord);
        publisher = raw.substring(startDex, endDex);        
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
}
