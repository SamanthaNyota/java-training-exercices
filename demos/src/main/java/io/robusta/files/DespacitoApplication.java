package io.robusta.files;

import io.robusta.annotations.Fast;
import io.robusta.annotations.Slow;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class DespacitoApplication {

    public static void main(String[] args) throws IOException {
        DespacitoApplication despacitoApplication = new DespacitoApplication();
        String content = despacitoApplication.readFromInternet("despacito.pw");
        content = despacitoApplication.clean("http://despacito.pw");
        DespacitoApplication.writeInFile(content,"despacito.txt" );
    }

    @Slow

    public String readFromInternet(String myUrl) throws IOException {

        URL url;
        try {
            url= new URL(myUrl);
        } catch (MalformedURLException e) {
            try {
                url = new URL("http://"  +myUrl);
            } catch (MalformedURLException e1) {
                System.out.println("sniffff");
                url = null;
            }
           // e.printStackTrace();
        }

        URLConnection connection = url.openConnection();
        InputStream stream = connection.getInputStream();

        InputStreamReader reader = new InputStreamReader(stream);

        BufferedReader bufferedReader = new BufferedReader(reader);

        String result = "";
        String s;

        while ((s = bufferedReader.readLine()) !=null){
            //System.out.println(s);
            result = result + s + "\r\n";

        }
        return result;


    }

    @Slow (expectedTime = 800)
    public  String clean(String url) throws IOException {

        Document doc = Jsoup.connect(url).get();
        String cleanContent = "";
        Elements bio = doc.select("body");
        for (Element element: bio){
            cleanContent = cleanContent + element.text()+ "\r\n";
        }

        return cleanContent;
    }

    @Fast(40)


    public static void writeInFile(String text, String fileName) throws IOException {

        java.io.File file = new File(fileName);
        if (!file.exists()) ;
        file.createNewFile();


        FileWriter writer = new FileWriter(file);
        writer.append(text);
        writer.flush();
        writer.close();
    }



}
