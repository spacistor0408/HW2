public class CatUtility extends MyUtility {

  private boolean typeCheck( Object o1, Object o2 ) {
    if ( o1 instanceof Cat && o2 instanceof Cat ) {
      return true ;
    } // if
    return false ;
  } // typeCheck()

  @Override
  int compare( Object o1, Object o2 ) {

    try {
      
      // Check the type of o1 and o2
      if ( typeCheck( o1, o2 ) ) {
        Cat cat1 = (Cat) o1 ;
        Cat cat2 = (Cat) o2 ;
      
        if ( cat1.weight > cat2.weight ) {
          return 1 ;
        } // if bigger than
        else if ( cat1.weight == cat2.weight ) {
          return 0 ;
        } // if equal to
        else {
          return -1 ;
        } // else less than
      } // if
      throw new Exception("Type Error") ;

    } catch (Exception e) {
      System.err.println(e) ;
    }

    return 0 ;
  }
}
