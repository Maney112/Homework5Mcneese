package com.mcneese.selenium.homework5mcneese;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Homework5McNeese {
    public static void main(String[] args) {
        // Automatically sets up the correct ChromeDriver
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.mcneese.edu/");

        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());

        try {
            WebElement meta = driver.findElement(By.cssSelector("meta[name='description']"));
            System.out.println("Meta Description: " + meta.getAttribute("content"));
        } catch (Exception e) {
            System.out.println("Meta Description not found.");
        }

        driver.quit();
    }
}
