abstract class MyUtility {

  /**
   * need to implement the method
   * comapre instance variable of a and b
   * 
   * @param a first object need to compare
   * @param b second object need to compare
   * 
   * @return 1 if (a > b) ; 0 if (a == b) ; -1 if (a < b)
   * 
   */
  abstract int compare( Object a, Object b ) ;

  /**
   * swap two elements in array
   * @param arr array of object
   * @param i index of the array
   * @param j index of the array
   */
  private void swap( Object[] arr, int i, int j ) {
    Object temp = arr[i] ;
    arr[i] = arr[j] ;
    arr[j] = temp ;
  } // swap ()

  /**
   * To sort elements of the array
   * @param arr
   */
  public final void mySort( Object[] arr ) {

    int n = arr.length;
  
    // sort the array in ascending order
    for ( int i = 0; i < n; i++ ) {
      for ( int j = i; j < n; j++ ) {

        if ( compare( arr[i], arr[j] ) > 0 ) {
          swap( arr, i, j ) ; 
        } // if

      } // for
    } // for

  } // MySort()

} // MyUtility