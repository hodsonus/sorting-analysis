public class main {

  public static void main(String[] args) {

    int[] arr = {6, 4, 5, 9, 12, 8, 11, 12, 13 ,7, 6};

    routines.mergeSort(arr);

    // System.out.println(toString(arr));
  }

  public static String toString(int[] arr) {

    String theString = "";

    for (int i = 0; i < arr.length; i++) {

      theString += arr[i] + "\t";

      if (i != 0 && i%5 == 0) {

        theString = theString.substring(0,theString.length()-1);
        theString += "\n";
      }
    }

    return theString.substring(0,theString.length()-1);
  }
}
