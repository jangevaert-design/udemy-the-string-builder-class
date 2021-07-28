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
    System.out.println(builder.equals(anotherBuilder));//prints true and proves that StringBuilder
    //works further on only one String.
    System.out.println(System.identityHashCode(builder));// prints 14236464
    System.out.println(System.identityHashCode(anotherBuilder));// prints 14236464

    //capacity is by default 16 but Java will automatically increase capacity if needed.

    StringBuilder myBuilder = new StringBuilder();
    System.out.println();
    System.out.println("size = " + myBuilder.length());//size = 0
    System.out.println("capacity = " + myBuilder.capacity());//capacity = 16

    myBuilder = new StringBuilder(100);
    System.out.println("size = " + myBuilder.length());//size = 0
    System.out.println("capacity = " + myBuilder.capacity());//capacity = 100

    myBuilder.append("My New Test");
    System.out.println("size = " + myBuilder.length());//size = 11
    System.out.println("capacity = " + myBuilder.capacity());//capacity = 100

    StringBuilder a = new StringBuilder("This ");
    StringBuilder b = a.append("Java ");
    b = b.append("is").append(" so ").append("cool.");
    System.out.println();
    System.out.println(a);
    System.out.println(b);// they will print both the same because we only have one StringBuilder
    //object here.

  }
}
