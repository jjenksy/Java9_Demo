package javamodularity.demo.cli;

import javamodularity.demo.response.Hello;

public class Main {

   public static void main(String... args) throws IOException {
      if (args.length == 0) {
         System.out.println("Welcome to the demo please provide your name");
         return;
      }

      
      System.out.println("Response: " + new Hello(args[0]);
      
   }
     
}
