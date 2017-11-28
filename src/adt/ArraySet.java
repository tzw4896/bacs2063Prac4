/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author TARUC
 */
public class ArraySet <T> implements setInterface <T> {

    private T[] array;
    private int size;
    private final static int MAX_SIZE = 100;
    
    public ArraySet(){
        array = (T[]) new Object[MAX_SIZE];
    }
    
    public String toString(){
        String str = "";
        for(int i = 0; i<size;++i){
            str += array[i] + " ";
        }
        return str;
    }
    
    
    @Override
    public boolean add(T newElement) {
        if (contains(newElement)) {
            return false;
        }
        array[size++] = newElement;
        return true;
    }

    private boolean contains(T newElement) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i<size; ++i) {
            if (array[i].equals(newElement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(T anElement) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(contains(anElement)){
            for (int i = 0; i < size;++i){
                if(array[i].equals(anElement)){
                   for(int j = i; j<size-1;j++){
                       array[j] = array[j=1];
                       return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean checkSubset(setInterface anotherSet) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArraySet<T> otherSet = (ArraySet<T>)anotherSet;
        for (int i = 0; i < otherSet.size;++i){
            if(!contains(otherSet.array[i]))
                return false;
        }
        return true;    
    }

    @Override
    public void union(setInterface anotherSet) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArraySet<T> otherSet = (ArraySet<T>)anotherSet;
        for (int i = 0; i < otherSet.size;++i){
           add(otherSet.array[i]);
        }      
    }

    @Override
    public setInterface intersection(setInterface anotherSet) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         ArraySet<T> otherSet = (ArraySet<T>)anotherSet;
         ArraySet<T> resultSet = new ArraySet<>();
         for (int i = 0; i < otherSet.size;++i){
          if(contains(otherSet.array[i]))
              resultSet.add(array[i]);
        }      
         return resultSet;
    }
}
