/* Kathrina Czarny
 * CSC 143
 * Oct 3, 2016
 * WS 1: PolynomialDriver Class
 */
public class PolynomialDriver {

	public static void assignment_a()
	{
		Polynomial p = new Polynomial(new double[] {10.0, -1.0, 2.0});
		Polynomial r = new Polynomial(new double[] {9.0, 0.0, -1.0});
		Polynomial result = Polynomial.add(p, r);
		System.out.println(result);
	}
	
	public static void assignment_b()
	{
		Polynomial p = new Polynomial(new double[] {-12.0, 14.0, -21.0, 8.0});
		Polynomial r = new Polynomial(new double[] {0.0, -1.0, 8.0, 0.0, -2.0});
		Polynomial result = Polynomial.add(p, r);
		System.out.println(result);
	}	
	
	
	public static void assignment_c()
	{
		Polynomial p = new Polynomial(new double[] {0.0, 12.0, -7.0, 1.0});
		Polynomial r1 = new Polynomial(new double[] {-1.0, 0.0, 4.0});
		Polynomial r2 = new Polynomial(new double [] {1.0, 8.0});
		Polynomial r = Polynomial.Multiply(r1, r2);
		Polynomial result = Polynomial.add(p, r);
		System.out.println(result);
	}
	
	
	public static void assignment_d()
	{
		Polynomial p = new Polynomial(new double[] {-1.0, 2.0});
		Polynomial r = new Polynomial(new double[] {0.0, 0.0, 0.0, 1.0});
		Polynomial result = Polynomial.add(p, r);
		System.out.println(result);
	}
	
	public static void assignment_e(){
		Polynomial p = new Polynomial(new double[] {0.0, -1.0, 1.0});
		Polynomial r = new Polynomial(new double[] {12.0, 9.0});
		Polynomial result = Polynomial.add(p, r);
		System.out.println(result);
	}
	
		public static void  assignment_f(){
		Polynomial p = new Polynomial(new double[] {1.0, -2.0, 1.0});
		double result = p.Evaluate(4.0);
		System.out.println(result);
	}
	
		public static void  assignment_g(){
		Polynomial p = new Polynomial(new double[] {0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0});
		double result = p.Evaluate(2.0);
		System.out.println(result);
		}
		
		public static void  assignment_h(){
			Polynomial p = new Polynomial(new double[] {0.0, -4.0, 1.0, -4.0, 1.0});
			double result = p.Evaluate(4.0);
			System.out.println(result);
			}
		
		public static void  assignment_i(){
			Polynomial p = new Polynomial(new double[] {0.0, 10.0, 8.0});
			double result = p.Evaluate(-7.0);
			System.out.println(result);
			}
	
		public static void  assignment_j(){
			Polynomial p = new Polynomial(new double[] {0.0, 0.0, 1.0});
			double result = p.Evaluate(9.0);
			System.out.println(result);
			}
	
	
	public static void main(String[] args) {
		assignment_a();
		assignment_b();
		assignment_c();
		assignment_d();
		assignment_e();
		
		assignment_f();
		assignment_g();
		assignment_h();
		assignment_i();
		assignment_j();
	
			
		
	}

}
