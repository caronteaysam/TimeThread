
public class ThreadVetor extends Thread {
	
	private int number;
	private int array[];
	
	public ThreadVetor ( int number, int array[] ) {
		
		this.number = number;
		this.array  =  array;
	}
	
	@Override
	public void run ( ) {
		
		boolean isPair = this.number % 2 == 0;
		double delta;
		
		if ( isPair ) {
			
			delta = System.nanoTime ( );
			for ( int i = 0; i < this.array.length; i++ ) { }
			delta = System.nanoTime ( ) - delta;
			
		} else {
			
			delta = System.nanoTime ( );
			for ( int i : this.array ) { }
			delta = System.nanoTime ( ) - delta;
		}
		
		System.out.printf ( "Thread-%d - Time elapse: %.8f sec.\n", this.number, ( delta / 1000000000 ));
	}
}
