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
public interface setInterface <T> {
    
    boolean add (T newElement);
    boolean remove (T anElement);
    boolean checkSubset (setInterface anotherSet);
    void union (setInterface anotherSet);
    setInterface intersection(setInterface anotherSet);
    
    Iterator <T> getIterator();
}
