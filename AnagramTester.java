/**
 * Luhao Wang cs8bwajw luw055@ucsd.edu
 * Friday January 12, 2018
 * File header: This file contains the AnagramTester class which allows you to test 8 different error-ridden methods hidden in AnagramFinder.class. The methods essentially take a word and tries to find a matching anagram of that word (same letters, different arrangement) within a set of words. The class itself contains methods which can be used to test the anagramfinder methods and see if they produce the right results! The main method is also in this file, which means you can test directly!
 */

public class AnagramTester {
    
     /**
     *This method takes no arguments and returns nothing. It tests the p1 method, and tries to identify if 
      any of the parameters are null. If they are, an error message is printed.*/	
    public static void testP1() {
        System.out.println("--- Testing p1() ---");
       
        String word = "hello";
        
        //Creates string of words to be compared to word
        String[] possibleAnagrams = new String[3];
        possibleAnagrams[0] = "cse8b";
        possibleAnagrams[1] = "rocks";
        possibleAnagrams[2] = "elloh";
        
        // We can use a try/catch statement to keep the program running even
        // when an exception is thrown.
        try {
            // This is how to call p1. p2 through p8 are called with the same
            // parameters.
            AnagramFinder.p1(possibleAnagrams, word);
            
        } catch (NullPointerException e) {
            // This code will execute if p1 throws a NullPointerException.
            System.out.println("An exception occurred! " + e.toString());
        }
        
        // This code will occur if try block executes successfully, or if the
        // exception is caught.
        System.out.println("-- Done testing p1() ---");
        }
    
   /**
     *This method takes no arguments and returns nothing. It tests the p2 method, and tries to identify if 
      any of the parameters are null. If they are, an error message is printed.*/ 
    public static void testP2() {
        System.out.println("--- Testing p2() ---");
        // tests for null error in word
        String word=null;
        String[] possibleAnagrams = { "cse8b", "rocks", "elloh" };
         
	try {
            // This is how to call p1. p2 through p8 are called with the same
            // parameters.
            AnagramFinder.p2(possibleAnagrams, word);
            
        } catch (NullPointerException e) {
            // This code will execute if p2 throws a NullPointerException.
            System.out.println("Program should exit if input is null!" + e.toString());
        }
        // This code will occur if try block executes successfully, or if the
        // exception is caught.
        System.out.println("-- Done testing p2() ---");
        }

    /**
     *This method takes no arguments and returns nothing. It tests the p3 method, and tries to identify if 
      any of the parameters are null. If they are, an error message is printed.*/	  
    public static void testP3() {
        System.out.println("--- Testing p3() ---");
        //tests for letter count
        String word="ro";
	String[] possibleAnagrams = {"cse8b","rocks","elloh"};
	AnagramFinder.p3(possibleAnagrams, word);
        // This code will occur if try block executes successfully, or if the
        // exception is caught.
        System.out.println("-- Done testing p3() Correct output should be 0 anagrams found!!---\n");
	}

  /**
     *This method takes no arguments and returns nothing. It tests the p4 method, and tries to identify if 
      any of the parameters are null. If they are, an error message is printed.*/
    public static void testP4() {
        System.out.println("--- Testing p4() ---");
        
        String word="hello";
	//tests for null in elements
	String[] possibleAnagrams = {null,"rocks","elloh"};
	//if p4 method throws null exception, program will print message
	try {
	    
	     AnagramFinder.p4(possibleAnagrams, word);
        
	} catch (NullPointerException e) {

	     System.out.println("Program should exit if input is null!" + e.toString());
	}
	// This code will occur if try block executes successfully, or if the
        // exception is caught.
        System.out.println("-- Done testing p4() Correct output should be: element in s is null, anagram not found.---");
	}

   /**
     *This method takes no arguments and returns nothing. It tests the p5 method, and tries to identify if 
     any of the parameters are null. If they are, an error message is printed.*/	    
    public static void testP5() {
        System.out.println("--- Testing p5() ---");
        //tests repeated letters
        String word="helo";
	String[] possibleAnagrams = {"cse8b","rocks","elloh"};
	AnagramFinder.p5(possibleAnagrams, word);
        // This code will occur if try block executes successfully, or if the
        // exception is caught.
        System.out.println("-- Done testing p5() Correct output should be 0 anagrams found!!!---");
	}
 
    /**
     *This method takes no arguments and returns nothing. It tests the p6 method, and tries to identify if 
     any of the parameters are null. If they are, an error message is printed.*/
    public static void testP6() {
        System.out.println("--- Testing p6() ---");
        
        String word="hello";
	//tests what happens if string array is length zero
	String[] possibleAnagrams = new String[0];
	AnagramFinder.p6(possibleAnagrams, word);
        // This code will occur if try block executes successfully, or if the
        // exception is caught.
        System.out.println("-- Done testing p6() Correct output should be no anagrams found, s has nothing in it !!!---");
	}

   /**
     *This method takes no arguments and returns nothing. It tests the p7 method, and tries to identify if 
      any of the parameters are null. If they are, an error message is printed.*/
	 
    public static void testP7() {
        System.out.println("--- Testing p7() ---");
        //tests spaces between letters in string
        String word="cse 8b";
	String[] possibleAnagrams = {"cse8b","rocks","elloh"};
	AnagramFinder.p7(possibleAnagrams, word);
        // This code will occur if try block executes successfully, or if the
        // exception is caught.
        System.out.println("-- Done testing p7() Correct output should be 0 anagrams found!!!---");
	}

   /**
     *This method takes no arguments and returns nothing. It tests the p8 method, and tries to identify if 
     any of the parameters are null. If they are, an error message is printed.*/	
    public static void testP8() {
        System.out.println("--- Testing p8() ---");
        
        String word="hello";
	String[] possibleAnagrams = {"cse8b","rocks","elloh"};
	AnagramFinder.p8(possibleAnagrams, word);
        // This code will occur if try block executes successfully, or if the
        // exception is caught.
        System.out.println("-- Done testing p8() Correct anagram does not appear in lower box!!!---");
	}

// The main method used to run all the methods in AnagramTester
public static void main(String[] args) {
        testP1();
	testP2();
	testP3();
	testP4();
	testP5();
	testP6();
	testP7();
	testP8();
    }
}
