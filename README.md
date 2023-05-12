### OOP ASSIGNMENT 2
##### Update Date: 2023/ 5/ 12
1. `class MyUtility`的`mySort()`定義了排序基本方式
2. `swap()`因為不會受到傳進來的類別影響，所以方法固定
3. `compare()`定義為abstract，因為每個類別的比較方式都不同，但可以確定的是此method會回傳誰比較大 
4. 接續第3點，因為不知道會`compare()`誰，所以宣告為抽象類別，要使用就得先實作怎麼compare

---
### MyUtility
**mySort**
Sort的步驟是固定的，所以可以直接寫final避免別人亂動；傳入的類別為Object，因為不知道使用的人要排序甚麼
```java
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
```
**swap**
交換的方法都一樣，所以可以直接使用private的方式封裝在MyUtility內
```java
private void swap( Object[] arr, int i, int j ) {
  Object temp = arr[i] ;
  arr[i] = arr[j] ;
  arr[j] = temp ;
} // swap ()
```
**compare**
要排序之前要先實作compare方法
```java
abstract int compare( Object a, Object b ) ;
```
### CatUtility
因為要比較幫Cat做排序，於是利用繼承MyUtility的方式實作專屬於貓的比較方法
**compare**
因為想要比較的是貓的重量，所以在這裡Override compare方法去比較貓的重量，比較重的話回傳1、相等回傳0、較小就回傳-1
```java
public final void prepare() {
 
  if ( cat1.weight > cat2.weight ) {
    return 1 ;
  } // if bigger than
  else if ( cat1.weight == cat2.weight ) {
    return 0 ;
  } // if equal to
  else {
    return -1 ;
  } // else less than

} // prepare()
```
**typeCheck**
由於不確定傳進來的會不會是Cat，所以多做了一層typeCheck，確保類別是正確的
```java
private boolean typeCheck( Object o1, Object o2 ) {
  if ( o1 instanceof Cat && o2 instanceof Cat ) {
    return true ;
  } // if
  return false ;
} // typeCheck()
```