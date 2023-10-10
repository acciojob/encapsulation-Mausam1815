package com.driver;

public class Main {
  RWOnly rwonlyObj = new RWOnly();
  
  // rwonlyObj.name = "Mausam";
  // System.out.println(rwonlyObj.name);
  
  // ERROR : Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
  // The field RWOnly.name is not visible
  // The field RWOnly.name is not visible
  
  rwonlyObj.setName("Mausam");
  System.out.println(rwonlyObj.getName());
}
