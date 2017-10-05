package io.robusta.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadApplication {

    public static void main (String[]args) throws IOException {

        ReadApplication app = new ReadApplication();
        app.readChars();


    }

    public void readChars() throws IOException {

        String fileName= "text.md";
        File file = new File(fileName);

        System.out.println(file.exists());

        // user.dir is a property to say when we are launching

        System.out.println("We are : " +System.getProperty("user.dir") );

        String workingDir = System.getProperty("user.dir");
        String path = "/demos/src/main/java/io/robusta/files/";

        String filePath = workingDir+path+fileName;

        file = new File(filePath);
        System.out.println("complex path exists? " +file.exists());

        FileReader reader = new FileReader(file);

        int c;
        while ((c = reader.read()) >0){
            System.out.print((char)c);
        }

    }


}
