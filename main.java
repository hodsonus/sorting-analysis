import java.io.FileReader;
import java.util.Scanner;

public class main {

  public static void main(String[] args) throws Exception {

    //generate random integer files
    randomNums.main(args);

    //create scanner to read from integer files
    Scanner stream;

    /* this block of code will initialize arrays of the appropriate size and name
    corresponding to their appropriate integer file */

    int temp = 0;

    //5000 ascending
    stream = new Scanner(new FileReader("5000_Asc.txt"));
    int[] SSAsc5000 = new int[5000], MSAsc5000 = new int[5000];
    for (int i = 0; i < 5000; i++) {
      temp = Integer.parseInt(stream.next());
      SSAsc5000[i] = temp;
      MSAsc5000[i] = temp;
    }
    //5000 descending
    stream = new Scanner(new FileReader("5000_Desc.txt"));
    int[] SSDesc5000 = new int[5000], MSDesc5000 = new int[5000];
    for (int i = 0; i < 5000; i++) {
      temp = Integer.parseInt(stream.next());
      SSDesc5000[i] = temp;
      MSDesc5000[i] = temp;
    }
    //5000 random
    stream = new Scanner(new FileReader("5000_Rand.txt"));
    int[] SSRand5000 = new int[5000], MSRand5000 = new int[5000];
    for (int i = 0; i < 5000; i++) {
      temp = Integer.parseInt(stream.next());
      SSRand5000[i] = temp;
      MSRand5000[i] = temp;
    }


    //10000 ascending
    stream = new Scanner(new FileReader("10000_Asc.txt"));
    int[] SSAsc10000 = new int[10000], MSAsc10000 = new int[10000];
    for (int i = 0; i < 10000; i++) {
      temp = Integer.parseInt(stream.next());
      SSAsc10000[i] = temp;
      MSAsc10000[i] = temp;
    }
    //10000 descending
    stream = new Scanner(new FileReader("10000_Desc.txt"));
    int[] SSDesc10000 = new int[10000], MSDesc10000 = new int[10000];
    for (int i = 0; i < 10000; i++) {
      temp = Integer.parseInt(stream.next());
      SSDesc10000[i] = temp;
      MSDesc10000[i] = temp;
    }
    //10000 random
    stream = new Scanner(new FileReader("10000_Rand.txt"));
    int[] SSRand10000 = new int[10000], MSRand10000 = new int[10000];
    for (int i = 0; i < 10000; i++) {
      temp = Integer.parseInt(stream.next());
      SSRand10000[i] = temp;
      MSRand10000[i] = temp;
    }


    //20000 ascending
    stream = new Scanner(new FileReader("20000_Asc.txt"));
    int[] SSAsc20000 = new int[20000], MSAsc20000 = new int[20000];
    for (int i = 0; i < 20000; i++) {
      temp = Integer.parseInt(stream.next());
      SSAsc20000[i] = temp;
      MSAsc20000[i] = temp;
    }
    //20000 descending
    stream = new Scanner(new FileReader("20000_Desc.txt"));
    int[] SSDesc20000 = new int[20000], MSDesc20000 = new int[20000];
    for (int i = 0; i < 20000; i++) {
      temp = Integer.parseInt(stream.next());
      SSDesc20000[i] = temp;
      MSDesc20000[i] = temp;
    }
    //20000 random
    stream = new Scanner(new FileReader("20000_Rand.txt"));
    int[] SSRand20000 = new int[20000], MSRand20000 = new int[20000];
    for (int i = 0; i < 20000; i++) {
      temp = Integer.parseInt(stream.next());
      SSRand20000[i] = temp;
      MSRand20000[i] = temp;
    }


    //50000 ascending
    stream = new Scanner(new FileReader("50000_Asc.txt"));
    int[] SSAsc50000 = new int[50000], MSAsc50000 = new int[50000];
    for (int i = 0; i < 50000; i++) {
      temp = Integer.parseInt(stream.next());
      SSAsc50000[i] = temp;
      MSAsc50000[i] = temp;
    }
    //50000 descending
    stream = new Scanner(new FileReader("50000_Desc.txt"));
    int[] SSDesc50000 = new int[50000], MSDesc50000 = new int[50000];
    for (int i = 0; i < 50000; i++) {
      temp = Integer.parseInt(stream.next());
      SSDesc50000[i] = temp;
      MSDesc50000[i] = temp;
    }
    //50000 random
    stream = new Scanner(new FileReader("50000_Rand.txt"));
    int[] SSRand50000 = new int[50000], MSRand50000 = new int[50000];
    for (int i = 0; i < 50000; i++) {
      temp = Integer.parseInt(stream.next());
      SSRand50000[i] = temp;
      MSRand50000[i] = temp;
    }













    //sort and print to the console the corresponding time associated with sorting the file.

    long startTime, stopTime;


    //selectionSort algorithm
    //5000 ascending
    startTime = System.currentTimeMillis();
    routines.selectionSort(SSAsc5000);
    stopTime = System.currentTimeMillis();
    System.out.println("SS 5000 Ascending: " + (stopTime - startTime) + " miliseconds.");
    //10000 ascending
    startTime = System.currentTimeMillis();
    routines.selectionSort(SSAsc10000);
    stopTime = System.currentTimeMillis();
    System.out.println("SS 10000 Ascending: " + (stopTime - startTime) + " miliseconds.");
    //20000 ascending
    startTime = System.currentTimeMillis();
    routines.selectionSort(SSAsc20000);
    stopTime = System.currentTimeMillis();
    System.out.println("SS 20000 Ascending: " + (stopTime - startTime) + " miliseconds.");
    //50000 ascending
    startTime = System.currentTimeMillis();
    routines.selectionSort(SSAsc50000);
    stopTime = System.currentTimeMillis();
    System.out.println("SS 50000 Ascending: " + (stopTime - startTime) + " miliseconds.");

    System.out.println();

    //5000 descending
    startTime = System.currentTimeMillis();
    routines.selectionSort(SSDesc5000);
    stopTime = System.currentTimeMillis();
    System.out.println("SS 5000 Descending: " + (stopTime - startTime) + " miliseconds.");
    //10000 descending
    startTime = System.currentTimeMillis();
    routines.selectionSort(SSDesc10000);
    stopTime = System.currentTimeMillis();
    System.out.println("SS 10000 Descending: " + (stopTime - startTime) + " miliseconds.");
    //20000 descending
    startTime = System.currentTimeMillis();
    routines.selectionSort(SSDesc20000);
    stopTime = System.currentTimeMillis();
    System.out.println("SS 20000 Descending: " + (stopTime - startTime) + " miliseconds.");
    //50000 descending
    startTime = System.currentTimeMillis();
    routines.selectionSort(SSDesc50000);
    stopTime = System.currentTimeMillis();
    System.out.println("SS 50000 Descending: " + (stopTime - startTime) + " miliseconds.");

    System.out.println();

    //5000 random
    startTime = System.currentTimeMillis();
    routines.selectionSort(SSRand5000);
    stopTime = System.currentTimeMillis();
    System.out.println("SS 5000 Random: " + (stopTime - startTime) + " miliseconds.");
    //10000 random
    startTime = System.currentTimeMillis();
    routines.selectionSort(SSRand10000);
    stopTime = System.currentTimeMillis();
    System.out.println("SS 10000 Random: " + (stopTime - startTime) + " miliseconds.");
    //20000 random
    startTime = System.currentTimeMillis();
    routines.selectionSort(SSRand20000);
    stopTime = System.currentTimeMillis();
    System.out.println("SS 20000 Random: " + (stopTime - startTime) + " miliseconds.");
    //50000 random
    startTime = System.currentTimeMillis();
    routines.selectionSort(SSRand50000);
    stopTime = System.currentTimeMillis();
    System.out.println("SS 50000 Random: " + (stopTime - startTime) + " miliseconds.");






    for (int j = 0; j < 5; j++) System.out.println();











    //mergeSort algorithm
    //5000 ascending
    startTime = System.currentTimeMillis();
    routines.mergeSort(MSAsc5000);
    stopTime = System.currentTimeMillis();
    System.out.println("MS 5000 Ascending: " + (stopTime - startTime) + " miliseconds.");
    //10000 ascending
    startTime = System.currentTimeMillis();
    routines.mergeSort(MSAsc10000);
    stopTime = System.currentTimeMillis();
    System.out.println("MS 10000 Ascending: " + (stopTime - startTime) + " miliseconds.");
    //20000 ascending
    startTime = System.currentTimeMillis();
    routines.mergeSort(MSAsc20000);
    stopTime = System.currentTimeMillis();
    System.out.println("MS 20000 Ascending: " + (stopTime - startTime) + " miliseconds.");
    //50000 ascending
    startTime = System.currentTimeMillis();
    routines.mergeSort(MSAsc50000);
    stopTime = System.currentTimeMillis();
    System.out.println("MS 50000 Ascending: " + (stopTime - startTime) + " miliseconds.");

    System.out.println();

    //5000 descending
    startTime = System.currentTimeMillis();
    routines.mergeSort(MSDesc5000);
    stopTime = System.currentTimeMillis();
    System.out.println("MS 5000 Descending: " + (stopTime - startTime) + " miliseconds.");
    //10000 descending
    startTime = System.currentTimeMillis();
    routines.mergeSort(MSDesc10000);
    stopTime = System.currentTimeMillis();
    System.out.println("MS 10000 Descending: " + (stopTime - startTime) + " miliseconds.");
    //20000 descending
    startTime = System.currentTimeMillis();
    routines.mergeSort(MSDesc20000);
    stopTime = System.currentTimeMillis();
    System.out.println("MS 20000 Descending: " + (stopTime - startTime) + " miliseconds.");
    //50000 descending
    startTime = System.currentTimeMillis();
    routines.mergeSort(MSDesc50000);
    stopTime = System.currentTimeMillis();
    System.out.println("MS 50000 Descending: " + (stopTime - startTime) + " miliseconds.");

    System.out.println();

    //5000 random
    startTime = System.currentTimeMillis();
    routines.mergeSort(MSRand5000);
    stopTime = System.currentTimeMillis();
    System.out.println("MS 5000 Random: " + (stopTime - startTime) + " miliseconds.");
    //10000 random
    startTime = System.currentTimeMillis();
    routines.mergeSort(MSRand10000);
    stopTime = System.currentTimeMillis();
    System.out.println("MS 10000 Random: " + (stopTime - startTime) + " miliseconds.");
    //20000 random
    startTime = System.currentTimeMillis();
    routines.mergeSort(MSRand20000);
    stopTime = System.currentTimeMillis();
    System.out.println("MS 20000 Random: " + (stopTime - startTime) + " miliseconds.");
    //50000 random
    startTime = System.currentTimeMillis();
    routines.mergeSort(MSRand50000);
    stopTime = System.currentTimeMillis();
    System.out.println("MS 50000 Random: " + (stopTime - startTime) + " miliseconds.");
  }
}
