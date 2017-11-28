/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

import java.util.Iterator;

/**
 *
 * @author TARUC
 */
public class testIterator {
    
    public static void main(String[] args) {
        
        setInterface<Integer> setA = new ArraySet<>();

        setA.add(10);
        setA.add(20);
        setA.add(30);
        setA.add(40);
        setA.add(50);

        int total = 0;
        Iterator<Integer> it = setA.getIterator();
        while (it.hasNext()) {
            total += it.next();
        }
        System.out.println("Total = " + total);
    }

}
