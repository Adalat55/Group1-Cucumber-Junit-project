package com.example.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private Driver(){}

     protected static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver==null){

            String browserType=  ConfigurationReader.getProperty("browser");


            switch (browserType){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();
                    driver.manage().window().maximize();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver();
                    driver.manage().window().maximize();
                    break;

                default:
                    System.out.println("invalid browser type");


            }
             return  driver;

        }else{

            return driver;

        }

    }
    public static void closeDriver(){

        driver.close();
        driver.quit();
    }

}
