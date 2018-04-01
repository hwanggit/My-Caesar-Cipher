// Keep these two lines.  They are what tell Java to include the
// classes you need for working with files.
// You might get warnings about them at first.  That's OK, just
// ignore the warnings.  They should go away as you complete your code.
import java.io.*;
import java.util.*;

/** This file contains methods which manipulate strings and characters by the following ways: cha    replace all the letters in a word with a new letter that is exactly n positions in front of o    r behind it in the alphabet, or replace a letter of the alphabet with a new letter that is ex    exactly n positions in front of or behind it in the alphabet, where n is a chosen constant nu    mber. 
 * Luhao Wang cs8bwajw luw055@ucsd.edu
 * Saturday January 13 2018 
 * */
public class Caesar {
 // Complete the methods below.  Be sure to add header
 // comments for each. You may (and should) also write additional
 // helper methods.  Be sure to make the helper methods private and include
 // header comments for each.

 // Although you will not be graded on style this week, you should follow
 // these basic style guidelines nonetheless.   You will be graded on this
 // in weeks to come, so start to practice now.

 // Use proper indenting: Indent each block of code (e.g., method body,
 //   loop body.  Line up the lines in the block so that they are all
 //   indented to the same degree.  See examples of this in the book
 //   and in the code below.
 // Use descriptive variable names: The names of your variables should
 //   describe the data they hold.  Almost always, your variable names
 //   should be words (or abbreviations), not single letters.
 // Write short methods: Break your methods up into submethods if they
 //   are getting too complicated or long.  Generally your methods
 //   shouldn't get too much longer than about 20 lines of code (give or take)
 // Write short lines: Each line of code should be no longer than 80
 //   characters, so it can fit in a reasonable size window.  There's a
 //   column number in both vim and emacs.
 //
 // We'll start with these, as these are the most important.  We may add
 // to this list later in the term, but if you do all of the above you're
 // in good shape.

 /**This method shifts the ascii numbers of the characters of an input string by an inputted rotational value, then prints out the shifted characters in a new string that is encrypted message.
 * The parameters of this method are a string s and a rotational/shift value.
 * The return type is a string
 */
 public static String encrypt(String s, int rotation) { 
  if (s==null){
     return null;
    }
  //create an empty string to concatenate
  String empty="";
  // loop through the characters of the ciphertext
  for(int i =0; i<s.length();i++){
     char Ptextchar=s.charAt(i);
      //shift the letter by the negative value of rotation
     Ptextchar=Caesar.letterOperation(Ptextchar,rotation);
      // concatenate the empty string by adding the new decrypted string 
     empty+=Ptextchar;
    }
   // return the decrypted string
  return empty;
 }
 
 /**This method shifts the ascii numbers of the characters of an input string by the negative value of an inputted rotational value, then it prints out the shifted characters in a new string that is the decrypted message.
 * The parameters of this method are a string s and a rotational/shift value.
 * The return type is a string
 */ 
 public static String decrypt(String s, int rotation) {
  if (s==null){
     return null;
    }
  //create an empty string to concatenate
  String empty="";
  // loop through the characters of the ciphertext
  for(int i =0; i<s.length();i++){
     char Ctextchar=s.charAt(i);
      //shift the letter by the negative value of rotation
     Ctextchar=Caesar.letterOperation(Ctextchar,-rotation);
      // concatenate the empty string by adding the new decrypted string 
     empty+=Ctextchar;
    }
   // return the decrypted string
  return empty;
 }
 
 /*This method takes a character as an input, creates a copy and performs a shift in position of cgaracter within alphabet if the character is an alphabetical one, or else it will return the character itself. 
 * The parameters are the character to be shifted and the amount to be shifted
 * The return type is a character.
 */
 private static char letterOperation(char a, int rotation) {
  //create copy of character
  char b=a;
  // convert character to ascii number
  int ascii= (int)b;
  // integer to store encrypted/decrypted ascii number
  int ascii2=0;
  //shift if characters are alphabetical
  if (ascii<=90&&ascii>=65){
     // if letters are capital
     ascii2=(65+(ascii-65+rotation)%26);
     b=(char)ascii2;
    }

  else if(ascii<=122&ascii>=97){
     //if letters are lowercase
     ascii2=(97+(ascii-97+rotation)%26);
     //convert the shifted ascii value back to a character
     b=(char)ascii2;
     }

  else{
       return b;
     }
  return b; 
 }

 /**This method uses the StringBuilder class to encrypt a parameter string s by iterating through the sequence of characters in the StringBuilder string and replacing each alphabet character wit h the shifted character. 
 * The parameters of this method are a string to be encrypted, and a shift amount. 
 * The return type is a string (StringBuilder is converted into a string, then returned)
 */
 public static String encryptTwo(String s, int rotation) {
  if (s==null){
      return null;
    }
  // create a new StringBuilder object that contains the string s
  StringBuilder ptext=new StringBuilder(s);
  // iterate through the character sequence
  for (int i=0;i<ptext.length();i++){
      char ptextchar=ptext.charAt(i);
      // if the character is an alphabet character, shift it by rotation
      char ctextchar=Caesar.letterOperation(ptextchar,rotation); 
      //replace the plaintext character with the encrypted character
      ptext.insert(i+1, ctextchar);
      ptext.deleteCharAt(i);
     }
  // convert the new character sequence into a string and return it. 
  String ctext=ptext.toString();
  return ctext;
 }

 /**This method uses the StringBuilder class to decrypt a parameter string s by iterating through the sequence of characters in the StringBuilder string and replacing each alphabet character wit h the shifted character. 
 * The parameters of this method are a string to be decrypted, and a shift amount. 
 * The return type is a string (StringBuilder is converted into a string, then returned)
 */
 public static String decryptTwo(String s, int rotation) {
  if (s==null){
      return null;
    }
  // create a new StringBuilder object that contains the string s
  StringBuilder ctext=new StringBuilder(s);
  // iterate through the character sequence
  for (int i=0;i<ctext.length();i++){
      char ctextchar=ctext.charAt(i);
      // if the character is an alphabet character, shift it by rotation
      char ptextchar=Caesar.letterOperation(ctextchar,-rotation);
       //replace the ciphertext character with the decrypted character
      ctext.insert(i+1, ptextchar);
      ctext.deleteCharAt(i); 
     }
  // convert the new character sequence into a string and return it. 
  String ptext=ctext.toString();
  return ptext;
 }
}
