public class routines {

  /*
  this function implements the quick sort algorithm to sort an array of integers. sorts in-place.
  paramaters:
    int[] arr - the array of integers to be sorted
    int left - the leftmost index of the portion of the array we are sorting. for the first call, it is 0.
    int right - the rightmost index of the portion of the array we are sorting. for the first call, it is arr.length-1.
  complexity:
    average time - o(nlogn)
    worst time - o(n^2)
    space - o(1)
  */
  public static void quickSort(int[] arr, int left, int right) {

    //base case
    if (left>=right) return;

    //partition
    int pivot = arr[right];
    int wall = left;
    int temp = 0;

    //start on the left and scan the array from left to right
    for (int i = left; i < right; i++) {

      /* if, when scanning, an element is found such that it is less than or equal
      to the pivot, we swap it before the wall and increment the wall index. */
      if (arr[i] <= pivot) {

          temp = arr[i];
          arr[i] = arr[wall];
          arr[wall] = temp;

          wall++;
      }
    }

    /* at this point, the wall is the divider between elements greater than the
    pivot and elements less than the pivot. since the pivot is the divider, we
    must place the pivot there. swap pivot and wall. */
    temp = arr[wall];
    arr[wall] = arr[right];
    arr[right] = temp;

    //sort left, before the wall
    quickSort(arr, left, wall-1);

    //sort right, after the wall
    quickSort(arr, wall+1, right);

  }

  /*
  this function implements the merge sort algorithm to sort an array of integers.
  paramaters:
    int[] arr - the array of integers to be sorted
  complexity:
    average time - o(nlogn)
    worst time - o(nlogn)
    space - o(n)
  */
  public static int[] mergeSort(int[] arr) {

    //abstract the length and check to see if we need to merge the lists together
    int length = arr.length;
    if (length < 2) return arr;

    //create the right and the left arrays
    int mid = length/2;
    int[] left = new int[mid];
    int[] right = new int[length-mid];

    //copy the elements inorder from arr into the left and right arrays
    for (int i = 0; i < mid; i++) left[i] = arr[i];
    for (int i = mid, j = 0; i < length; i++, j++) right[j] = arr[i];

    //recursively call mergeSort to sort left and right seperately
    mergeSort(left);
    mergeSort(right);

    //merge the left and the right together
    int i = 0, j = 0, k = 0;
    while (i < left.length && j < right.length) {

      if (left[i] < right[j]) {

        arr[k++] = left[i++];
      }
      else if (left[i] > right[j]) {

        arr[k++] = right[j++];
      }
      else if (left[i] == right[j]) {

        arr[k++] = left[i++];
        arr[k++] = right[j++];
      }
    }

    //these loops add any additional elements present in either the left or the right
    while (i < left.length) arr[k++] = left[i++];
    while (j < right.length) arr[k++] = right[j++];

    //return the sorted array
    return arr;
  }
}
