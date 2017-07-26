//here we are creating the another package
package Package_two;
//here we importing the 1st package
//this Function is use to access the one package from another package
import Package_one.*;
//here we are creating the class
public class PalindromeTest {
//here we are creating the main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here we are creating the obj of palindrome
		Palindrome objPalindrome=new Palindrome();
		//here we are calling the display method
		objPalindrome.display();

	}

}
