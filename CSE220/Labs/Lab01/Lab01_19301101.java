public class Lab01_19301101{
  /*
  / Name: Sanjib Kumar Sen
  / ID : 19301101
  / Section: 01 (JNM)
  */
  public static void main(String [] args){
    int [] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    
    System.out.println("\n///// TEST 01: Copy Array example /////");
    int [] b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    
    System.out.println("\n///// TEST 02: Print Reverse example /////");
    printArray(a); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    printReverse(a); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    
    
    System.out.println("\n///// TEST 03: Reverse Array example /////");
    reverseArray(b);
    printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    
    
    System.out.println("\n///// TEST 04: Shift Left k cell example /////");
    b = copyArray(a, a.length);
    b=shiftLeft(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 } 
    
    System.out.println("\n///// TEST 05: Rotate Left k cell example /////");
    b = copyArray(a, a.length); 
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=rotateLeft(b,4);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
    
    System.out.println("\n///// TEST 06: Shift Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=shiftRight(b,3);
    printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 } 
    
    System.out.println("\n///// TEST 07: Rotate Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=rotateRight(b,2);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
    
    
    System.out.println("\n///// TEST 08: Insert example 1 /////");
    
    b = copyArray(a, a.length);
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    boolean bol=insert(b,6, 70, 2); // This Should Print: No space Left 
    System.out.println(bol); // This Should Print: false
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    
    System.out.println("\n///// TEST 09: Insert example 2 /////");
    int [] c = {10, 20, 30, 40, 50, 0, 0}; 
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }
    bol=insert(c,5, 70, 2);  // This Should Print: Number of elements after insertion: 6
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    
    System.out.println("\n///// TEST 10: Insert example 3 /////");
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    bol=insert(c,6, 70, 6); // This Should Print: Number of elements after insertion: 7 
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    
    System.out.println("\n///// TEST 11: Remove example 1 /////");
    
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,90);
    System.out.println(bol); // This Should Print: false
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    
    System.out.println("\n///// TEST 12: Remove example 2 /////");
    printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,70);
    System.out.println(bol); // This Should Print: true
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 } 
    
    
    
  }
  
  // Prints the contents of the source array
  public static void printArray(int [] source){
    for (int i = 0; i<source.length;i++){
        if(i!=source.length-1){
            System.out.print(source[i]+", ");
        }
        else{
            System.out.println(source[i]);
        }
    }
  }
  
  // Prints the contents of the source array in reverse order
  public static void printReverse(int [] source){
    for (int i =source.length-1;i>=0;i--){
        if(i!=0){
            System.out.print(source[i]+", ");
        }
        else{
            System.out.println(source[i]);
        }
    }
  }
  
  // creates a copy of the source array and returns the reference of the newly created copy array
  public static int [] copyArray(int [] source, int len){
    // TO DO
    int newarray[] = new int[source.length];
    for(int i =0; i<source.length;i++){
        newarray[i] = source[i];
    }
    return newarray; // remove this line    
  }
  
  // creates a reversed copy of the source array and returns the reference of the newly created reversed array
  public static void reverseArray(int [] source){
    // TO DO
    for (int i = 0; i<source.length/2;i++){
        int tmp = source[source.length-1-i];
        source[source.length-1-i] = source[i];
        source[i] = tmp;
    }
  }
  
  // Shifts all the elements of the source array to the left by 'k' positions
  // Returns the updated array
  public static int [] shiftLeft(int [] source, int k){
    int i = k;
    for(;i<source.length;i++){
        source[i-k] = source[i];
    }
    for (;i<source.length+k;i++){
        source[i-k] =0;
    }
    return source; // remove this line    
  }
  
  // Rotates all the elements of the source array to the left by 'k' positions
  // Returns the updated array
  public static int [] rotateLeft(int [] source, int k){
    // TO DO
    int tmparray[] = new int[source.length];
    int j =0;
    for(int i=k;i<source.length;i++,j++){
      tmparray[j] = source[i];
    }
    for (int i =0;j<tmparray.length;i++,j++){
      tmparray[j] = source[i];
    }
    return tmparray; // remove this line    
  }
  
  // Shifts all the elements of the source array to the right by 'k' positions
  // Returns the updated array
  public static int [] shiftRight(int [] source, int k){
    for (int i = source.length-1; i>=0;i--){
        if (i<k){
          source[i] =0;
          continue;
        }
        source[i] = source[i-k];

    }
    return source; // remove this line    
  }
  
  // Rotates all the elements of the source array to the right by 'k' positions
  // Returns the updated array
  public static int [] rotateRight(int [] source, int k){
    // TO DO
    int tmparray [] = new int [source.length];
    for (int i =0; i<source.length;i++){
        if (i<k){
          tmparray[i] = source[source.length+i-k];
          continue;
        }
        tmparray[i] = source[i-k];
    }
    return tmparray; // remove this line    
  }
  
  /** @return true if insertion is successful; @return false otherwise
    * @param arr the reference to the linear array
    * @param size the number of elements that exists in the array. size<=arr.length
    * @param elem the element that is to be inserted
    * @param index the index in which the element is required to be inserted
    * if insertion is not successful due to lack space, print "No space Left"
    * if given index is invalid, print "Invalid Index"
    * if insertion is successful, print the 'Number of elements after insertion' is completed
    */
  public static boolean insert(int [] arr, int size, int elem, int index){
    // TO DO
    int space = 0;
    if(index>=arr.length || index<0){
        System.out.println("Invalid Index");
        return false;
    }

    for(int i = 0;i<arr.length;i++){
        if (arr[i]==0){
            space++;
        }
    }

    if(space==0){
        System.out.println("No space Left");
        return false;
    }
    int tmp = arr[index];
    for (int i = index+1;i<arr.length;i++){
        int tmp2 = arr[i];
        arr[i] = tmp;
        tmp = tmp2;
    }

    arr[index] = elem;

    System.out.println("Number of elements after insertion: "+(size+1));
    return true; // remove this line    
  }
  
  /** 
   * removes all the occurences of the given element
   * @param arr the reference to the linear array
   * @param size the number of elements that exists in the array. size<=arr.length
   * @param elem the element to be removed
   * @return true if removal is successful; return false otherwise
   * if removal is successful, print the 'Number of elements after removal' is completed
   */  
  public static boolean removeAll(int [] arr, int size, int elem){
    /* 
    Sir, I know BinarySearch and some other algorithms
    will be much effective for this problem, and I know how to 
    implement those. But I am not sure if it is allowed or not 
    for this lab assignment.
    So I am sticking with the normal and easy method.
    */

    boolean check = false;
    int rem = size;
    for (int i =0; i<size-1;i++){
      if(arr[i] == elem || arr[i]==0){
        check =true;
        if (arr[i+1]==elem){
          rem--;
          arr[i+1] = 0;
        }
        if (arr[i] == elem){
          rem--;
        }
        arr[i] = arr[i+1];
        arr[i+1] = 0;

      }
    }

    if(check){
      System.out.println("Number of elements after removal is completed: "+rem);
      return true;
    }

    return false; // remove this line    
  }

}