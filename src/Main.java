public class Main {
	
	public static void main ( String args[] ) {
		
		int array[] = new int[100000];
		for ( int i : array ) array[i] = (int)( 1 + Math.random ( ) * 99 );
		
		ThreadVetor t1 = new ThreadVetor ( 1, array );
		ThreadVetor t2 = new ThreadVetor ( 2, array );
		
		t1.start ( );
		t2.start ( );
	}
}