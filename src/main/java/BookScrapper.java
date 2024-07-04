import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class BookScrapper {

    public static void main(String[] args) {
//        String url = "https://books.toscrape.com/";
        String url = "https://www.bilibili.com/video/BV17F411T7Ao/?p=163&spm_id_from=333.1007.top_right_bar_window_history.content.click&vd_source=780094b8224bc661a4423363ffb655b8/";

        try {
            Document document = Jsoup.connect(url).get();
//            Elements books = document.select(".product_pod");
            Elements title = document.select("title");
            System.out.println("==========================");
//            System.out.println("Books available in the store");
            System.out.println("Title: " + title.text());

//            for (Element bk: books){
//                String title = bk.select("h3 a").attr("title");
//                String price = bk.select(".price_color").text();
//                String actual_price = price.substring(1);

                //get books within $20
//                if (Double.parseDouble(actual_price) < 20.00){
//                    System.out.println("Title: " + title);
//                    System.out.println("Price: " + price);
//                    System.out.println("--------------------------");
//                }
//            }
            System.out.println("==========================");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
