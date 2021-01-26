package net.greg;
 
import java.text.*;
import java.time.*;
import java.util.*;


public class Zeta {

	public static void main(String ... any) {

    System.err.println("\n\n\u001B[32mOk\u001B[0m\n\n");

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println("Hello " + formatter.format(new Date()));
  }

	public static final String OK = "\u001B[32m";
  public static final String RED = "\u001B[31m";
  public static final String NC = "\u001B[0m";
}
