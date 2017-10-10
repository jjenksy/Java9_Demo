module demo.response {
   exports javamodularity.demo.response;
   //exports javamodularity.demo.response.internal;
   requires java.corba; //marked as deprecated
   requires jdk.incubator.httpclient;// experimental feature in its own module
}
