import java.util.Random;

public class Test {

  public static void Print( Cat[] cats ) {
    int size = cats.length ;
    for ( int i = 0 ; i < size ; i++ ) {
      System.out.println( "Cat " + (i+1) + " weight: " + cats[i].getWeight() ) ;
    }
  } // Print()

  public static void main( String[] args ) {
    MyUtility utility = new CatUtility() ;
    Cat[] cats = new Cat[10] ; 

    Random random = new Random() ;

    for ( int i = 0 ; i < 10 ; i++ ) {
      cats[i] = new Cat( random.nextInt( 10, 100 ) ) ;
    } // create

    System.out.println( "Before Sort:" ) ;
    Print( cats ) ;
    
    utility.mySort( cats ) ;
    
    System.out.println( "After Sort:" ) ;
    Print( cats ) ;
    
  }
  
}
