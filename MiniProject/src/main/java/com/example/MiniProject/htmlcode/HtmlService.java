package com.example.MiniProject.htmlcode;

import com.pdfcrowd.Pdfcrowd;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class HtmlService {
    @Autowired
    Html html;

    HtmlService(Html html) {
        this.html = html;
    }

    /**
    * 
    * */
    public void manipulateHtml(Html html, String type) throws IOException {
        Document doc = Jsoup.parse(html.getHtmlCode());
        String htmlString = doc.toString();
        System.out.println(htmlString);

        htmlString = htmlString.replace("{{feature_homedelivery_panel_title}}", "HOME DELIVERY");
        htmlString = htmlString.replace("{{feature1_label}}", "Crossdock");
        htmlString = htmlString.replace("{{feature1}}", html.getFeature1());
        htmlString = htmlString.replace("{{feature2_label}}", "service node:");
        htmlString = htmlString.replace("{{feature2}}", html.getFeature2());
        htmlString = htmlString.replace("{{feature3_label}}", "One since:");
        htmlString = htmlString.replace("{{feature3}}", html.getFeature3());
        htmlString = htmlString.replace("{{feature4_label}}", "Deliver:");
        htmlString = htmlString.replace("{{feature4}}", html.getFeature4());
        htmlString = htmlString.replace("{{feature5_label}}", "Delivery time:");
        htmlString = htmlString.replace("{{feature5}}", html.getFeature5());
        htmlString = htmlString.replace("{{feature6_label}}", "Recipient:");
        htmlString = htmlString.replace("{{feature6}}", html.getFeature6());
        htmlString = htmlString.replace("{{feature7_label}}", "Deliver:");
        htmlString = htmlString.replace("{{feature7}}", html.getFeature7());
        htmlString = htmlString.replace("{{feature8_label}}", "Shipper:");
        htmlString = htmlString.replace("{{feature8}}", html.getFeature8());
        htmlString = htmlString.replace("{{feature9_label}}", "Return at:");
        htmlString = htmlString.replace("{{feature9}}", html.getFeature9());

        doc = Jsoup.parse(htmlString);

        if(type.equals("PDF")) {
            try {
                // create the API client instance
                Pdfcrowd.HtmlToPdfClient client =
                        new Pdfcrowd.HtmlToPdfClient("Harshitabaloji", "f5b47e4757f30e0b17b4518f0b0451f2");

                // run the conversion and write the result to a file
                client.convertStringToFile(doc.html(), "StringLayout.pdf");
            }
            catch(Pdfcrowd.Error why) {
                // report the error
                System.err.println("Pdfcrowd Error: " + why);

                // rethrow or handle the exception
                throw why;
            }
            catch(IOException why) {
                // report the error
                System.err.println("IO Error: " + why);

                // rethrow or handle the exception
                throw why;
            }
        }
        else {
            try {
                Pdfcrowd.HtmlToImageClient client =
                        new Pdfcrowd.HtmlToImageClient("demo", "ce544b6ea52a5621fb9d55f8b542d14d");

                // configure the conversion
                client.setOutputFormat("png");

                // run the conversion and write the result to a file
                client.convertFileToFile("/Users/vinayakbhandage/Downloads/MiniProject/src/main/java/com/example/MiniProject/htmlcode/index.html", "MyLayout.png");
            }
            catch(Pdfcrowd.Error why) {
                // report the error
                System.err.println("Pdfcrowd Error: " + why);

                // rethrow or handle the exception
                throw why;
            }
            catch(IOException why) {
                // report the error
                System.err.println("IO Error: " + why);

                // rethrow or handle the exception
                throw why;
            }
        }

    }

}
