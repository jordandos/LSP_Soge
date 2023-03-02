package org.howard.edu.lsp.assignment4;
import org.howard.edu.lsp.assignment4.IntegerSet.IntegerSetException;

public class Driver{
public static void main(String[] args) throws IntegerSetException {
IntegerSet set1 = new IntegerSet();
set1.add(1);
set1.add(2);
set1.add(3);

System.out.println("Value of Set1 is:" + set1.toString());
System.out.println("Smallest value in Set1 is:" + set1.smallest());
System.out.println("Largest value in Set1 is:" + set1.largest());

IntegerSet set2 = new IntegerSet();
set2.add(4);
set2.add(5);
set2.add(8);
set2.add(20);

System.out.println("Union of Set1 and Set2");
System.out.println("Value of Set1 is:" + set1.toString());
System.out.println("Value of Set2 is:" + set2.toString());
set1.union(set2);	// union of set1 and set2
System.out.println("Result of union of Set1 and Set2");
set1.toString();	// result of union of set1 and set2

System.out.println("Smallest value in Set2 is:" + set2.smallest());
System.out.println("Largest value in Set2 is:" + set2.largest());
System.out.println("Are the sets equal:" + set2.equals(set1));
System.out.println("Largest value in Set2 is:" + set2.largest());


System.out.println("Is set 2 empty:" + set2.isEmpty());
System.out.println("Is set 1 empty:" + set1.isEmpty());
System.out.println("Removing from set 2:");
set2.remove(1);
System.out.println(set2.get_set());
System.out.println("Removing from set 1:");
set2.remove(1);
System.out.println(set1.get_set());

System.out.println("intersection of Set1 and Set2");
System.out.println("Value of Set1 is:" + set1.toString());
System.out.println("Value of Set2 is:" + set2.toString());
set1.intersection(set2);	// union of set1 and set2
System.out.println("Result of union of Set1 and Set2");
set1.toString();	// result of union of set1 and set2

System.out.println("difference of Set1 and Set2");
System.out.println("Value of Set1 is:" + set1.toString());
System.out.println("Value of Set2 is:" + set2.toString());
set1.difference(set2);	// union of set1 and set2
System.out.println("Result of union of Set1 and Set2");
set1.toString();	// result of union of set1 and set2






}
}