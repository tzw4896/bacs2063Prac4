/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.*;

/**
 *
 * @author TARUC
 */
public class NewMain {
    
    public static void main(String[] args){
        setInterface<Integer> setA = new ArraySet<>();
        setA.add(10);
        setA.add(20);
        setA.add(30);
        setA.add(40);
        setA.add(50);
        System.out.println("setA: " + setA + " ");
        
        System.out.println("setA.remove(20): " + setA.remove(20) + " ");
        System.out.println("\nsetA: " + setA + " ");
        
        setInterface<Integer> setb = new ArraySet<>();
        setb.add(20);
        setb.add(40);
        System.out.println("setb: " + setb);
        System.out.println("setA.checkSubset(setb): " + setA.checkSubset(setb) + " ");
        
        setInterface<Integer> setC = new ArraySet<>();
        setC.add(15);
        setC.add(30);
        System.out.println("\nsetC: " + setC);
        System.out.println("setA.checkSubset(setC): " + setC.checkSubset(setb) + " ");
        
        setb.union(setC);
        System.out.println("\nsetb after union : "+setb);
        
        setA.intersection(setC);
        System.out.println("\nafter : " + setA);
       
        System.out.println("\nsetA.remove(50): " + setA.remove(50) + " ");
        System.out.println("\nsetA: " + setA + " ");
                        
        System.out.println("setA.add(20): "+setA.add(20));
        System.out.println("setA.add(50): "+setA.add(50));
        System.out.println("setA: " + setA + " ");
        
    }
    
}
