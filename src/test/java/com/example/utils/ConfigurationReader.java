package com.example.utils;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

public class ConfigurationReader {


    protected static Properties properties = new Properties();

    static {

       try {
           FileInputStream inputStream = new FileInputStream("configuration.properties");
           properties.load(inputStream);
           inputStream.close();

       }catch (Exception e){

           e.printStackTrace();
           System.out.println("file was not found");
       }
    }

    public static String getProperty(String key){

       return  properties.getProperty(key);

    }


}
