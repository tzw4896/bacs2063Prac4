/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author TARUC
 */
import adt.*;

public class TestPalindrome {
    public static boolean isPalindrome(String str){
        StackInterface<Character> stack = new ArrayStack<>();
        QueueInterface<Character> queue = new ArrayQueue<>();
        
        for (int i = 0; i < str.length(); ++i){
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                ch = Character.toUpperCase(ch);
                stack.push(ch);
                queue.enqueue(ch);
            }
        }
            while(!stack.isEmpty()){
                if(!stack.pop().equals(queue.dequeue())){
                    return false;
                }
        }
            return true;
    }
    
    public static void main (String[] args){
        String s1 = "Race car";
        String s2 = "A man, a plan, a canal: Panama!";
        String s3 = "madam";
        String s4 = "modem";
        System.out.println(s1+": "+isPalindrome(s1));
        System.out.println(s2+": "+isPalindrome(s2));
        System.out.println(s3+": "+isPalindrome(s3));
        System.out.println(s4+": "+isPalindrome(s4));
    }
    
}
