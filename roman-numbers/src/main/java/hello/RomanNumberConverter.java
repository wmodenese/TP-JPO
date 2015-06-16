package hello;

public class RomanNumberConverter{
	
	public int convert(String romanNumber){
		int counter = 0;
		for(int i = 0; i < romanNumber.length(); i++){
			if(i!=romanNumber.length()-1){
				switch (romanNumber.charAt(i)){
					case 'M': 
						counter = counter+1000;
					break;
					
					case 'D':
						if(romanNumber.charAt(i+1) == 'M'){
							counter = counter-500;
						} else {
							counter = counter+500;
						}
					break;
					
					case 'C':
						if((romanNumber.charAt(i+1)=='M') || (romanNumber.charAt(i+1)=='D')){
							counter = counter-100;
						} else {
							counter = counter+100;
						}
					break;
					
					case 'L':
						if((romanNumber.charAt(i+1)=='M') || (romanNumber.charAt(i+1)=='D') || (romanNumber.charAt(i+1)=='C')){
							counter = counter-50;
						} else {
							counter = counter+50;
						}
					break;
					
					case 'X':
						if((romanNumber.charAt(i+1)=='M')
							||(romanNumber.charAt(i+1)=='D')
							||(romanNumber.charAt(i+1)=='C')
							||(romanNumber.charAt(i+1)=='L')){
							counter = counter-10;
						} else {
							counter = counter+10;
						}
					break;
					
					case 'V':
						if((romanNumber.charAt(i+1)=='M')
							||(romanNumber.charAt(i+1)=='D')
							||(romanNumber.charAt(i+1)=='C')
							||(romanNumber.charAt(i+1)=='L') 
							||(romanNumber.charAt(i+1)=='X')){
							counter = counter-5;
						} else {
							counter = counter+5;
						}
					break;
					
					case 'I':
						if((romanNumber.charAt(i+1) == 'M')
							||(romanNumber.charAt(i+1)=='D') 
							||(romanNumber.charAt(i+1)=='C')
							||(romanNumber.charAt(i+1)=='L')
							||(romanNumber.charAt(i+1)=='X')
							||(romanNumber.charAt(i+1)=='V')){
							counter = counter-1;
						} else {
							counter = counter+1;
						}
					break;
					default : 
						System.err.println("t'es con ou quoi?");
					break;
				}
			} else {
				switch (romanNumber.charAt((romanNumber.length()-1))){
					case 'M': 
						counter = counter+1000;
					break;
					
					case 'D':
						counter = counter+500;
					break;
					
					case 'C':
						counter = counter+100;
					break;
					
					case 'L':
						counter = counter+50;
					break;
					
					case 'X':
						counter = counter+10;
					break;
					
					case 'V':
						counter = counter+5;
					break;
					
					case 'I':
						counter = counter+1;
					break;
					default : 
						System.err.println("t'es con ou quoi?");
					break;
				}						
			}
		}
		return counter;
	}
	
	public String convert(int number){
		return "caca";
	}
}
