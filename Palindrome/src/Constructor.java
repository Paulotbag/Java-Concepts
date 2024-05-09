import java.util.Scanner;


public class Constructor {

private int numero = 0;
	
	public Constructor () {
		this(0);
	}
	public Constructor (int numero) {
		this.numero = numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero(){
		return this.numero;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void checkPalindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide a positive integer number: ");
		numero = sc.nextInt();
		String size = Integer.toString(numero);
		int[] aControl = new int[size.length()];
		sc.close();
		int i = 0;
		boolean checker = false;
		
		do{
			aControl[i] = Character.getNumericValue((size.charAt(i)));
			i++;
			
		}while (i<size.length());
		
		
		for (int y=0; y<size.length(); y++) {
			
				if (aControl[y] == aControl[(size.length()-1-y)]) {
				checker = true;
			}
		}
		if (checker) {
			System.out.println("Your number is a palindrome");
		}
		}
}
	
	//this can be used with the other cases bellow
	/*
	private String numero = null;
	
	public Constructor () {
		this("Waiting for inputs");
	}
	public Constructor (String numero) {
		this.numero = numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero(){
		return this.numero;
	}
	*/
	
	
	
	
		
		
		
		
		
		//TO USE THIS PART, I HAD TO PUT THE SCANNER INSIDE THIS METHOD
		/*
		Scanner s1 = new Scanner(System.in);
		int counter = 1;
		while (counter !=0) {
			
			System.out.println("Enter your 5 digits number: ");
			this.numero= s1.next();
			
			if (this.numero.length()==5) {
				if ((this.numero.charAt(0)==this.numero.charAt(4)) && (this.numero.charAt(1)==this.numero.charAt(3))) {
					System.out.println(numero + " is a palindrome!!!");
					counter=0;
				}
				else {
					System.out.println(numero + " is not a palindrome.");
					System.out.println("TRY AGAIN!!!");
					counter+=1;
				}
			}
			else {
				System.out.println("Number must has 5 digits!!!");
				System.out.println("Try again.");
				counter=+1;
		}
	}
	s1.close();
		*/
		
		/*
		String message;
		message = (this.numero.length() == 5) ? "top" : "deu ruim";
		System.out.println(message);
		
		
		if (this.numero.length() == 5){
			if ((this.numero.charAt(0) == this.numero.charAt(4)) && (this.numero.charAt(1) == this.numero.charAt(3))){
				System.out.println(this.numero + " is a palindrome!!!");
			}
			else {
				System.out.println(this.numero + " is not a palindrome");
			}
		}
		else {
			System.out.println("Number must has 5 digits");
		}
		*/
		
		
		
		
		
		
		/*
		switch (this.numero.length()) {
		case 5: 
			if ((this.numero.charAt(0) == this.numero.charAt(4)) && (this.numero.charAt(1) == numero.charAt(3))) {
			System.out.printf("%-1s is a palindrome!!!", this.numero);
			}
			else{
			System.out.printf("%-1s is not a palindrome!!!", this.numero);
			}
			break;
		default:
			System.out.println("Number must has 5 digits");
			break;
		}
		*/
	
	
	
	
	
	
	
	

