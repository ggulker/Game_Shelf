package com.mycompany.game_shelf;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
/**
 *
 * @author GGulk
 */
public class WikiController {
    Document doc;
    String desc;
    WikiController(String queary)
    {
        String searchQueary = "https://en.wikipedia.org/wiki/" + queary;
        try
        {
            doc = Jsoup.connect(searchQueary).get();
            Elements paragraphs = doc.getElementsByClass("mw-parser-output");
            for(Element info: paragraphs)
            {
                desc = info.text();
            }
        }
        catch(IOException e)
        {
            
        }
    }
}
