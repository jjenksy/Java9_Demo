package javamodularity.demo.cli;



//import javamodularity.demo.response.internal.HelloResponse;

import static javamodularity.demo.response.Hello.*;

public class Main {

   public static void main(String... args) {
      if (args.length == 0) {
         System.out.println("Welcome to the demo please provide your name");
         return;
      }

      System.out.println("Response: " + hello(args[0]));

     // System.out.println(HelloResponse.response("test"));
      
   }
     
}
