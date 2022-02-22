import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/**
 * Dictionary Array
 * To create a dictionary that utilizes arraylists
 * Author: William Writer

 * Date: 2/22/22
 * On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: WW
 **/

public class Dictionary <T, E>{

    /*  A Java dictionary should use generics for the
     *  types of both key and value. E and T here.
     */
    //arraylists for the key and data
    private ArrayList<T> values;
    private ArrayList<E> keys; //I wanted to use arraylists instead of arrays because they are much easier to work with

    public Dictionary(){ // default constructor to initialize the values and keys
        values = new ArrayList<>();
        keys = new ArrayList<>();
    }


    //add an key-value pair to the dictionary
    void put(E key, T value){
        keys.add(key);
        values.add(value);

    }

    //get the value associated with a given key
    public T get(E key){
       int keyIndex = keys.indexOf(key);//have to create an indexOf so that the return type is an int instead of an E
        return values.get(keyIndex);


    }

    //remove a key-value pair and return its value
    public T remove(E key){
        int keyIndex2 = keys.indexOf(key);//have to create an indexOf so that the return type is an int instead of an E
        keys.remove(keyIndex2);
        return values.remove(keyIndex2);
    }

    //returns true if the given key has an associated value
    boolean contains(E key){
        int keyIndex = keys.indexOf(key);//have to create an indexOf so that the return type is an int instead of an E
        return keyIndex >= 0; // should return a true or false value
    }

    //returns true if the dictionary is empty
    boolean isEmpty(){
        return values.size() <= 0;
    }

    //returns the number of key-value pairs in the dictionary
    int size(){
        return values.size();
    }

    //returns a Collection¹ of keys
    Collection<E> keys(){
        Collection C = this.keys;
        return C;
    }

    //returns a Collection of values
    Collection<T>  values(){
        Collection C2 = this.values;
        return C2;
    }
}
