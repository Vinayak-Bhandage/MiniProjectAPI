package com.example.MiniProject.htmlcode;

import org.springframework.stereotype.Component;

@Component
public class Html {
    private String htmlCode;

    private String feature1;
    private String feature2;
    private String feature3;
    private String feature4;
    private String feature5;
    private String feature6;
    private String feature7;
    private String feature8;
    private String feature9;
    public Html() {
    }

    public Html(String htmlCode) {
        this.htmlCode = htmlCode;
    }

    public String getHtmlCode() {
        return htmlCode;
    }

    public void setHtmlCode(String htmlCode) {
        this.htmlCode = htmlCode;
    }

    public String getFeature1() {
        return feature1;
    }

    public String getFeature2() {
        return feature2;
    }

    public String getFeature3() {
        return feature3;
    }

    public String getFeature4() {
        return feature4;
    }

    public String getFeature6() {
        return feature6;
    }

    public String getFeature7() {
        return feature7;
    }

    public String getFeature8() {
        return feature8;
    }

    public String getFeature9() {
        return feature9;
    }

    public String getFeature5() {
        return feature5;
    }

    @Override
    public String toString() {
        return "Html{" +
                "htmlCode='" + htmlCode + '\'' +
                '}';
    }
}
