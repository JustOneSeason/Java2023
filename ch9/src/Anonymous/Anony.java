package Anonymous;

public class Anony {
	int field = 1;
	
	public void method(final int arg1, final int arg2) {
		final int var1 = 2;
		final int var2 = 3;
		
		
		
		Calculatable c = new Calculatable() {
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
	
		System.out.println(c.sum());
		
	}
}
