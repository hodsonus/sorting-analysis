import java.io.PrintWriter;

public class randomNums {

  public static void main(String[] args) {

    generateAscendingOrder("5000_Asc.txt",5000);
    generateDescendingOrder("5000_Desc.txt",5000);
    generateRandomOrder("5000_Rand.txt",5000);

    generateAscendingOrder("10000_Asc.txt",10000);
    generateDescendingOrder("10000_Desc.txt",10000);
    generateRandomOrder("10000_Rand.txt",10000);

    generateAscendingOrder("20000_Asc.txt",20000);
    generateDescendingOrder("20000_Desc.txt",20000);
    generateRandomOrder("20000_Rand.txt",20000);

    generateAscendingOrder("50000_Asc.txt",50000);
    generateDescendingOrder("50000_Desc.txt",50000);
    generateRandomOrder("50000_Rand.txt",50000);
  }

  public static void generateRandomOrder(String fileName, int num) {

    PrintWriter writer;

    try {
      writer = new PrintWriter(fileName, "UTF-8");
    }
    catch (Exception e) {

      System.out.print("Error.");
      return;
    }

    for (int i = 0; i < num; i++) {

      writer.print( (int)(Math.random()*num)+1 );
      if (i != num-1) writer.println();
    }

    writer.close();
  }

  public static void generateAscendingOrder(String fileName, int num) {

    PrintWriter writer;

    try {
      writer = new PrintWriter(fileName, "UTF-8");
    }
    catch (Exception e) {

      System.out.print("Error.");
      return;
    }

    for (int i = 1; i <= num; i++) {

      writer.print( i );
      if (i != num) writer.println();
    }

    writer.close();
  }

  public static void generateDescendingOrder(String fileName, int num) {

    PrintWriter writer;

    try {
      writer = new PrintWriter(fileName, "UTF-8");
    }
    catch (Exception e) {

      System.out.print("Error.");
      return;
    }

    for (int i = num; i > 0; i--) {

      writer.print( i );
      if (i != 1) writer.println();
    }

    writer.close();
  }
}
