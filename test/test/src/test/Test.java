package test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
      BufferedReader objReader = null;
      try
      {
          String commandLinetxt;
          objReader = new BufferedReader(new FileReader("src/toolForRent.txt"));

          while ((commandLinetxt = objReader.readLine()) != null) {
          System.out.println(commandLinetxt);
          }

    } catch (IOException e) {
        e.printStackTrace();
    }
  }
}
