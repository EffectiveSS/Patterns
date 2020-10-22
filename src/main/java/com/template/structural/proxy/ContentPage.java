package com.template.structural.proxy;

public class ContentPage implements MainPage {

    @Override
    public void loadPage() {
        System.out.println("<body>\n\t<h1>\n\t\tHello\n\t</h1>\n</body>");
    }

}
