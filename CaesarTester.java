/*
 * Name:  Luhao Wang <--- Replace with your name
 * Login: cs8bwajw <--- Use your cs8ba course-specific account name
 * Date:  January 13, 2018
 * File:  CaesarTester.java <-- Name of the file
 * Sources of Help: none 
 *
 * Tests Caesar.java using basic strings and rotation values. 
 *
 */


/*
 * Name:    CaesarTester
 * Purpose: To test Caesar.java for correct output.
 */
public class CaesarTester {

 /*
  * Name:       main
  * Purpose:    To call methods in Caesar and test them
  * Parameters: String[] args - command line arguments that are unused
  * Return:     void
  */
 public static void main(String[] args) {

  /** The main method. THIS IS WHERE YOU SHOULD ADD MORE TESTS
   * FOR encrypt and decrypt methods AND ANY OTHER METHOD
   * THAT YOU CREATE. BE SURE TO TEST YOUR CODE THOROUGHLY
   **/

  //The Caesar Cipher Tests
  int failCases = 0;

  //Test 1
  String message1 = "When in the course of human events it becomes necessary for one people to" + 
" dissolve the political bands which have connected them with another and to"+
" assume among the powers of the earth the separate and equal station to"+
" which the laws of nature and of nature's God entitle them a decent respect"+
" to the opinions of mankind requires that they should declare the causes"+
" which impel them to the separation.";
  String encryptedAnswer = "Nyve ze kyv tflijv fw yldre vmvekj zk svtfdvj evtvjjrip " +
  "wfi fev gvfgcv kf uzjjfcmv kyv gfczkztrc sreuj nyzty yrmv tfeevtkvu kyvd nzky refkyvi" + 
  " reu kf rjjldv rdfex kyv gfnvij fw kyv vriky kyv jvgrirkv reu vhlrc jkrkzfe kf nyzty " + 
  "kyv crnj fw erkliv reu fw erkliv'j Xfu vekzkcv kyvd r uvtvek ivjgvtk kf kyv fgzezfej fw" + 
  " drebzeu ivhlzivj kyrk kyvp jyflcu uvtcriv kyv trljvj nyzty zdgvc kyvd kf kyv jvgrirkzfe.";
  String encrypted1 = Caesar.encrypt(message1, 17);

  if (!encryptedAnswer.equals(encrypted1)) {
   System.out.println("Test 1 Failed(encryption for Part A)");
   System.out.println("Given message to encrypt is: " + message1);
   System.out.println("Your Answer is: " + encrypted1);
   System.out.println("The correct answer is: " + encryptedAnswer);
   failCases++;
  } else {
   System.out.println("Test 1 Passed!\n");
  }

  //Test 2
  String encrypted2 = "Byffi yhwlsjncih qilfx, byffi yhwlsjncih qilfx";
  String messageAnswer = "Hello encryption world, hello encryption world";
  String message2 = Caesar.decrypt(encrypted2, -58);

  if (!messageAnswer.equals(message2)) {
   System.out.println("Test 2 Failed(decryption for Part A)");
   System.out.println("Given message to decrypt is: " + encrypted2);
   System.out.println("Your Answer is: " + message2);
   System.out.println("The correct answer is: " + messageAnswer);
   failCases++;
  } else {
   System.out.println("Test 2 Passed!\n");
  }

  //Test 3
  encrypted1 = Caesar.encryptTwo(message1, 17);

  if (!encryptedAnswer.equals(encrypted1)) {
   System.out.println("Test 3 Failed(encryption for Part B)");
   System.out.println("Given message to encrypt is: " + message1);
   System.out.println("Your Answer is: " + encrypted1);
   System.out.println("The correct answer is: " + encryptedAnswer);
   failCases++;
  } else {
   System.out.println("Test 3 Passed!\n");
  }

  //Test 4
  message2 = Caesar.decryptTwo(encrypted2, -58);

  if (!messageAnswer.equals(message2)) {
   System.out.println("Test 4 Failed(decryption for Part B)");
   System.out.println("Given message to decrypt is: " + encrypted2);
   System.out.println("Your Answer is: " + message2);
   System.out.println("The correct answer is: " + messageAnswer);
   failCases++;
  } else {
   System.out.println("Test 4 Passed!\n");
  }
  
  //Test 5
  String message3= "This@message@will@test@the@functioning@of@condition@check";
  String answer1= "This@message@will@test@the@functioning@of@condition@check";
  String myAnswer2=Caesar.encryptTwo(message3,26);
  
  if (!answer1.equals(myAnswer2)) {
   System.out.println("Test 5 Failed(decryption for Part B)");
   System.out.println("Given message to decrypt is: " + message3);
   System.out.println("Your Answer is: " + myAnswer2);
   System.out.println("The correct answer is: " +answer1);
   failCases++;
  } else {
   System.out.println("Test 5 Passed!\n");
  }
  
  //Test 6
  String message4= null;
  System.out.println("Testing for NullPointerException...");
  try {
   String myAnswer=Caesar.encryptTwo(message4,26);
   System.out.println("Test 6 Passed!\n");
  }
  catch (NullPointerException e) {
   System.out.println("Program should exit if input is null!"+ e.toString());
   failCases++;
  }

  //Messages that print whether tests were successful or not
  if (failCases == 0) {
   System.out.println("All Tests Passed!");
  } else {
   System.out.println("Number of Failed Test Cases : " + failCases);
  }
 }
}
