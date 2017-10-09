package javamodularity.demo.response;


import static javamodularity.demo.response.internal.HelloResponse.*;

public class Hello {

    private String name;
   public Hello() {
   }

   public static String hello(String name){
        return response(name);
   }
}
