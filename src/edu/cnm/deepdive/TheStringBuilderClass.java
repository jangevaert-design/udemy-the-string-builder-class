package edu.cnm.deepdive;

public class TheStringBuilderClass {

  public static void main(String[] args) {

    String myString = "";

    for (char c = 'a'; c <= 'z'; c++) {
      myString += c;// this line will create a new String object with every iteration.
    }
    System.out.println(myString);//prints abcdefghijklmnopqrstuvwxyz

    // better with StringBuilder because StringBuilder is not immutable.
    StringBuilder sb = new StringBuilder();

    for (char c = 'a'; c <= 'z'; c++) {
      sb.append(c);//adds a char to the StringBuilder without creating a new String each time.
    }
    System.out.println();
    System.out.println(sb);//prints abcdefghijklmnopqrstuvwxyz
    System.out.println();

    StringBuilder builder = new StringBuilder("start");
    builder.append("-middle");//start-middle
    StringBuilder anotherBuilder = builder.append("-end");

    System.out.println(builder);//prints start-middle-end
    System.out.println(anotherBuilder);//prints start-middle-end
    System.out.println(builder == anotherBuilder);//prints true
    System.out.println(builder.equals(anotherBuilder));//prints true
    System.out.println(System.identityHashCode(builder));// prints 14236464
    System.out.println(System.identityHashCode(anotherBuilder));// prints 14236464

  }
}
