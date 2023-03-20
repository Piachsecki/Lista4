package pl.pmajewski.htmlremover;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class StringHtmlCleaner {
    public static void htmlCleaner(String url){
        String textToClean = PageDownloadingUtility.download(url);
        Document document = Jsoup.parse(textToClean);
        String textWithoutHtml = document.text();

        System.out.println(textWithoutHtml);

    }


}
