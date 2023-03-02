package org.howard.edu.lsp.assignment4;
import java.util.*;
public class IntegerSet { //making integerset class
    private List<Integer> my_set;
    
    /*
     * creates a public set
     * 
     */
    public IntegerSet(){ //creating public set
        my_set = new ArrayList<Integer>();
    }
    
    /*
     * 

     * //integer exception for largest and smallest function
     */
    public class IntegerSetException extends Exception { 
        public IntegerSetException(String error) {
            super(error);
        }
    }
    /*
     * returns the set
     */

    public List<Integer> get_set() {
        return my_set;
    }
    /*
     * makes a new set
     */

    public void set_set(List<Integer> new_set){
        my_set = new_set;
    }
    /*
     * clears the set
     */

    public void clear(){ //clear array
        my_set.clear();
    }
    /*
     * returns the length of the set 
     */

    public int length() { //return length of array(set)
        return my_set.size();
    }
    
    /*
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.
     */

    public boolean equals(IntegerSet set) { 
        if(my_set.size() != set.length()) {//check if size are the same
            return false;
        }else {
            return my_set.containsAll(set.my_set); //check if values are the same, return true or false
        }
    }
    /*
     * checks to find the largest value in the set
     */

    public int largest() throws IntegerSetException {
        int maxValue = Integer.MIN_VALUE; //set value to min
        if (my_set.isEmpty()) {
                throw new IntegerSetException("Set is Empty");
            }
            else {
                for (Integer integer : my_set) {
                    if (integer > maxValue) { //check if integer is grater than maxValue, update if so
                        maxValue = integer;
                    }
                }
            }
        return maxValue;
    }
    /*
     * checks to find the smallest value in the set=
     */
   
    public int smallest() throws IntegerSetException { //does the same thing as largest just for smallest
        int minValue = Integer.MAX_VALUE;
        if (my_set.isEmpty()) {
                throw new IntegerSetException("Set is Empty");
            }
            else {
                for (Integer integer : my_set) {
                    if (integer < minValue) {
                        minValue = integer;
                    }
                }
            }
        return minValue;
    }
    /*
     * adds a value into the set
     */

    public void add(int item) {
        if (my_set.contains(item) == false) { //checks is element is already in set, adds if not
        my_set.add(item);
        }
    }
    /*
     * removes an item from the set
     */

    public void remove(int item) {
        if (my_set.contains(item) == true) { //checks if element is in set then removes if it is
            my_set.remove(item);
        }
    }
    /*
     * takes both sets and adds whatever elements aren't the sets and vice versa
     */

    public void union(IntegerSet intsetb) {
        for(int i = 0; i < intsetb.my_set.size(); i++) {
            if(my_set.contains(intsetb.my_set.get(i)) == false){ //checks if element is already in set, if not adds element
                my_set.add(intsetb.my_set.get(i));
            }
        }
    }
    /*
     * removes all integers except the ones that are the same in both sets
     */

    public void intersection(IntegerSet intsetb) {
        my_set.retainAll(intsetb.my_set); //keeps only values that both sets share
    }
    /*
     * if elements are in both sets then they get deleted and everything else stays
     */

    public void difference(IntegerSet intsetb) {
        for(int i = 0; i < intsetb.length();i++) {
            if(my_set.contains(intsetb.my_set.get(i)) == true){//verify if element is in both sets, then removes element
                my_set.remove(intsetb.my_set.get(i));
            }
        }
    }
    /*
     *checks if a set is empty
     */

    public boolean isEmpty() {//checks if set is empty then returns true or false
        if(my_set.isEmpty() == true){
            return true;
        }
        else {
            return false;
        }
    }
    /*
     * prints the values of the set
     */

    public String ToString() { //iterates over set and adds each element to a string that is returned. 
        String setString = "";
        for(int i = 0; i < my_set.size(); i++) {
            setString += my_set.get(i).toString() + ' ';
        }
        return setString;
    }
}