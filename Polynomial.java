/* Kathrina Czarny
 * CSC 143
 * Oct 3, 2016
 * WS 1: Polynomial class
 */

public class Polynomial {

	// creating field
	private double [] coeff;
	private int degr;
	
	
	//creating a constructor 
	public Polynomial(int degree)
	{
		degr = degree;
		coeff = new double[degr]; //creates an array with the size given in the parameter (contingent on the highest degree in the polynomial)
	}
	
	//constructor--takes into parameter the coefficient array inserted by user when called ...Polynomial(double[]{0.0....})
	public Polynomial(double [] coeff){
		this.coeff = coeff;
		this.degr = coeff.length; //however long the coefficient array is, is how many (max) degrees the polynomial has. (array length 4=degree 4)
	}
	
	//method for adding polynomials together
	public static Polynomial add(Polynomial a, Polynomial b){
		int maxdegr = Math.max(a.degr, b.degr); // the max degree is based on how long the array is (because more numbers means that there are higher degrees)
		//whatever the larger array between the two will be used in the array-addition loop.
		Polynomial result = new Polynomial(maxdegr); // so the larger degree is used...and thus sets up the length of the array that is used in the loop
		
		for (int i=0; i < maxdegr; i++) { //initialized at 0; iterates as many times as degrees; increases iteration every loop (as degrees get larger)
			//it is good to note that the user must type the polynomial with the degrees/coefficient from lowest degree to highest for this to work properly
			
			double acoeff = 0.0; // array values set to zero, unless there is a coefficient with corresponding degree there
			double bcoeff = 0.0; 
			
			if (i < a.degr) //using the constructor (this) as a conditional 
				acoeff = a.coeff[i]; // create a NEW ARRAY based on the highest degree in poly a ..for ex: [0.0, 1,0, 4.0, .... etc...]
			
			if (i < b.degr)
				bcoeff = b.coeff[i]; // create a NEW ARRAY based on highest degree in poly b
			
			result.coeff[i] = acoeff + bcoeff;
		}
		
		return result;
	}
		
	
	
	public static Polynomial Multiply(Polynomial a, Polynomial b){
		Polynomial result = new Polynomial(a.degr+b.degr); //when multiplying polynomial exponents/degrees, you will add the degrees together
		//for this loop to work, you have to go through all the iterations of adding the available degrees together
		for (int i=0; i < a.degr; i++){
			double acoeff = 0.0;
			if (i < a.degr)
				acoeff = a.coeff[i]; // create a NEW ARRAY based on the highest degree in poly a
			
			for (int j=0; j < b.degr; j++){ //creating a nested loop within so creates matrix
				double bcoeff = 0.0;
				if (j < b.degr)
					bcoeff = b.coeff[j]; // create a NEW ARRAY based on highest degree in poly b
				result.coeff[i+j] += acoeff * bcoeff; //summing up all of the multiplication of the coefficients (it's i + j, so it's large)
			}
		}
		return result;
	}

	public double Evaluate(double x) //user inserts whatever the x value is so it can evaluated in the polynomial
	{
		double result = 0.0; 
		double xi = 1.0; //x to the power of i
		
		for (int i = 0; i < degr; i++) // for loop..
		{
			result += coeff[i]*xi; //adds previous result
			xi = xi * x; //then x^i needs to be multiplied by the x value
		}
		return result;
	}
	
	//string representation
	public String toString(){
		String polynomial = "";
		
		//tinkered around for the pretty printing results
		for (int i = degr-1; i >= 0; i--){
			if (coeff[i] != 0.0){ 
				
			
			if (i == 0)
			{
				polynomial += coeff[i];
			}
			else if (i == 1)
			{
				if (coeff[i] != 1.0)
					polynomial += coeff[i] + "x";
				else
					polynomial += "x";
			}
			else
			{
				if (coeff[i] != 1.0)
					polynomial += coeff[i] + "x^" + i;
				else
					polynomial += "x^" + i;					
			}
			if (i > 0)
			{
					polynomial += " + ";
			}
		}
		}
	
		return polynomial;
	}
	
}
	
	


