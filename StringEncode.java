package practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.lang.Character;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class StringEncode {
	    /**
	     * This method is used to cipher the message (normal) by following steps.
	     * Swap the cases of String - UpperCase letters to LowerCase letters and viceversa.
	     * Reverse the String
	     * Replace the spaces of string with a star character("*")
	     * Replace the characters in the even positions of the string
	     * Append any integer at the last in that String
	     * 
	     * @param normal
	     * @return the ciphered message
	     */
	    public static String ciphering(String normal){
	        //Write your code here
	        char[] stringArray = normal.toCharArray();
	        StringBuffer caseChangeString = new StringBuffer();
	        for(int i=0; i<normal.length(); i++) {
	        	if(Character.isUpperCase(stringArray[i])) {
	        		caseChangeString.append(Character.toLowerCase(stringArray[i]));
	        	}else {
	        		caseChangeString.append(Character.toUpperCase(stringArray[i]));
	        	}
	        }
	        //System.out.println("After changing the case" + caseChangeString);
	        caseChangeString.reverse();
	        //System.out.println("After reverse of String" + caseChangeString);
	        for(int i=0; i<normal.length(); i++) {
	        	if (Character.isWhitespace(caseChangeString.charAt(i))) {
	        		caseChangeString.setCharAt(i, '*');
	        	}
	        }
	        //System.out.println("changing space character " + caseChangeString);
	        StringBuilder encodedString = new StringBuilder();
	        for(int i=0; i<normal.length(); i++) {
	        	if(i%2!=0) {
	        		int asciiChar = caseChangeString.charAt(i);
	        		encodedString.append(asciiChar);
	        	}else {
	        		encodedString.append(caseChangeString.charAt(i));
	        	}
	        }
	        encodedString.append(3);
	        //System.out.println("encoded string length :" + encodedString.length());
	        return encodedString.toString();
	    }
	    /**
	     * This method is used to get the normal text by the reverse process of ciphering.
	     * 
	     * @param ciphered
	     * @return the deciphered message
	     */
	    public static String deciphering(String ciphered){
	        //Write your code here
	    	StringBuffer dicipher1 = new StringBuffer();
	    	for(int i=0; i< ciphered.length()-1; i++) {
	    		if(ciphered.charAt(i)=='*') {
	    			dicipher1.append(" ");
	    		}
	    		else {
	    			dicipher1.append(ciphered.charAt(i));
	    			//System.out.println("adding char " + ciphered.charAt(i));
	    		}
	    		int num =0;
    			int count =0;
	    		for(int j=i+1;j<ciphered.length();j++) {
	    	       // System.out.println(ciphered.substring(i+1, i+3));
	    		   // System.out.println(Integer.parseInt(ciphered.substring(i+1, i+3)));
	    			num = num * 10 + (ciphered.charAt(j) - '0');
	    			count++;
	    			if(num>=32 && num<=122) {
	    				char c = (char)num;
	    		        if(c=='*') {
	    		    	     dicipher1.append(' ');
	    		        }else {
	    		    	     dicipher1.append(c);
	    		        }
	    		        i = i+count;
	    		    }
	    		}
	    	}
	    	//System.out.println("After 2 step decoding:"+dicipher1);
	    	StringBuffer reversed = dicipher1.reverse();
	    	StringBuffer original = new StringBuffer();
	    	for (int i=0; i<reversed.length(); i++) {
	    		if(Character.isUpperCase(reversed.charAt(i))) {
	    			original.append(Character.toLowerCase(reversed.charAt(i)));
	    		}else {
	    			original.append(Character.toUpperCase(reversed.charAt(i)));
	    		}
	    	}
	    	return original.toString();
	    }

	    public static void main(String[] args){
	        Scanner readInput = new Scanner(System.in);
	        final String normal=readInput.nextLine();
	        final String ciphered=readInput.nextLine();
	        System.out.println(ciphering(normal));
	        System.out.println(deciphering(ciphered));
	        
	    }        
}
