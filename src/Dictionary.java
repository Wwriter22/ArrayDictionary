import java.util.Collection;

public class Dictionary <T, E>{

    /*  A Java dictionary should use generics for the
     *  types of both key and value. E and T here.
     */

    int count = 0;
    //add an key-value pair to the dictionary
    void put(E key, T value){

    }

    //get the value associated with a given key
    T get(E key){

    }

    //remove a key-value pair and return its value
    T remove(E key){

    }

    //returns true if the given key has an associated value
    boolean contains(E key){

    }

    //returns true if the dictionary is empty
    boolean isEmpty(){

        if(){

            return true;
        }else{

            return false;
        }

    }

    //returns the number of key-value pairs in the dictionary
    int size(){
        return count;
    }

    //returns a Collection¹ of keys
    Collection<E> keys(){
        
    }

    //returns a Collection of values
    Collection<T>  values(){

    }
}