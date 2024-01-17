/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package et.com.inhousetraining.L12.util;

import java.io.*;
import java.util.List;

/**
 *
 * @author eyu
 */
public class FileData {

    public static void main(String[] args) {

        try {
            ReadFile rf = new ReadFile("/Users/eyu/Documents/test.txt");
            List<String> textData = rf.readFile();
            
            for(String s: textData){
                System.out.println(s);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Error reading from file");
        }

    }
}