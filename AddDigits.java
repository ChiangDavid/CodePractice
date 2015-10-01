package Leetcode;

/*	
 * Given a non-negative integer num, 
 * repeatedly add all its digits until the result has only one digit.
 *
 *	For example:
 *	Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. 
 *	Since 2 has only one digit, return it.
 */

/* 
 * 	Created by David Chiang on 10/1/15
 *	Email: davidchiang0721@gmail.com
 */

public class AddDigits {
	public int addDigits(int num) {
		//it will keep looping if number is greater or equal to 10
		 while (num >= 10) {
	            int sum = 0;
	            while (num > 0) {
	                sum += num % 10;
	                num /= 10;
	            }
	            num = sum;
	        }
	        return num;
		}
	}