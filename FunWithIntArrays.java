/** This file defines six different methods within the FunWithIntArrays Class that modify integer arrays passed into their parameter arguments.The methods can find and return the largest, smallest, elements in the array as well as compute the average of all elements in the array.The other three methods can also copy an array, print out an array, and copy, then sort an array from smallest value to largest.
 * Errors:
1. Compile Error- no return type 
Incorrect: public static findMax(int[] array){
Correct: public static int findMax(int[] array){
Explanation: correction defines a return type for the method so the return value can be stored.
//
2. Compile Error- assignment vs. statement 
Incorrect: sum==array[i];
Correct: sum+=array[i];
Explanation: sum adds up all elements of array with += assignment rather than boolean statement ==
//
3. Compile Error- variable not declared 
Incorrect: min=array[0];
Correct: int min=array[0];
Explanation:correction defines variable min as an integer.
//
4. Compile Error- conversion from double to int 
Incorrect: int average=(sum/ (array.length));
Correct: double average=(sum/(array.length));
Explanation: due to sum being stored as a double, average should not be an int otherwise lossy conversion.
//
5. Compile Error- incomparable types
Incorrect: public static int[] arrayCopy(int array){
Correct: public static int[] arrayCopy(int[] array){
Explanation: int can't be null, however an array can.  
//
6. Compile Error-incompatible types 
Incorrect: public static double findAvg(int array[])_
Correct: public static double findAvg(int[] array)
Explanation: array brackets placed in the wrong place.
//
7. Runtime Error- Index Array out of bounds 
Incorrect: for (int i=0; i<= array.length; i++)
Correct: for (int i=0; i<array.length; i++)
Explanation: at i=array.length the index is out of bounds.
//
8. Runtime Error- index array out of bounds
Incorrect: result[i++] = array[i];
Correct: result[i]=array[i];
Explanation: at i=array.length-1, i++ would equal array.length which is out of bounds. 
//
9. Runtime Error- index array out of bounds
Incorrect:for (int j=0; i<result.length-i-1;j++)
Correct:for (int j=0;j<result.length-i-1;j++)
Explanation: correcting condition statement from i to j.
//
10. Runtime Error- if condition statement wrong
Incorrect: If (array !=null)
Correct: If (array==null)
Explanation: array should be printed if it is not null. 
11. runtime error- incorrect swapping
Incorrect: int temp=result[j]
Correct: int temp= result[j+1]
Explanation: temp should store overridden value.
//
 * Luhao Wang cs8bwajw luw055@ucsd.edu 
 * Thursday January 11, 2018
 * */
 
public class FunWithIntArrays {

 // return the largest element in the input array
 public static int findMax(int[] array) {
  //short circuit protects null access
  if (array == null || array.length == 0)
   return -1;

  int max = array[0];

  for (int i = 0; i < array.length; i++) {
   if (array[i] > max) {
    max = array[i];
   }
  }

  return max;
 }

 // return the smallest element in the input array
 public static int findMin(int[] array) {
  //short circuit protects null access
  if (array == null || array.length == 0)
   return -1;

  int min = array[0];

  for (int i = 0; i < array.length; i++) {
   if (array[i] < min) {
    min = i;
   }
  }

  return min;
 }


  // return the average of elements in the input array
  public static double findAvg( int[] array ) {
    //short circuit protects null access
    if ( array == null || array.length == 0 )
      return -1;

    double sum = 0.0;
    // adds up all the elements assigns to sum
    for ( int i=0; i < array.length; i++ ) {
      sum += (array[i]);
    }

    double average = (sum / (array.length) );

    return average;
  }

 // return a copy of the input array
 public static int[] arrayCopy(int[] array) {
  //check null error
  if (array == null)
   return null;

  int[] result = new int[array.length];

  for (int i = 0; i < array.length; i++) {
   result[i] = array[i];
  }
  return result;
 }

 // output the elements of the input array
 public static void printArray(int[] array) {
  if (array == null)
   return;

  for (int i = 0; i < array.length; i++) {
   System.out.print(array[i] + ", ");
  }
  // print elements
  System.out.println();
 }

 // return a sorted copy of the input array
 public static int[] arraySort(int[] array) {
  if (array == null)
   return null;
  //create copy of array
  int[] result = arrayCopy(array);

  for (int i = 0; i < result.length-1; ++i) {
   for (int j = 0; j < result.length - i-1; j++) {
    if (result[j] > result[j + 1]) {
     //swapping result[j] and result[j+1]
     int temp = result[j+1];
     result[j+1] = result[j];
     result[j] = temp;
    }
   }
  }
  return result;
 }
}
