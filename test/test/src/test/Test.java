/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Suhyeok Bang
 */
public class Test {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      BufferedReader objReader = null;
  try
  {
   String commandLinetxt;
   objReader = new BufferedReader(new FileReader("D:\\fileToRead.txt));

   while ((commandLinetxt = objReader.readLine()) != null) {

    System.out.println(commandLinetxt);
   }
  }

  } catch (IOException e) {

   e.printStackTrace();

      }

  }
