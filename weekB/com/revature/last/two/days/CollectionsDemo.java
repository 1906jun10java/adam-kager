package com.revature.last.two.days;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;

import com.revature.datastructures.User;

// importing all classes/ interfaces in package to save from writing fully qualified signatures

public class CollectionsDemo {

	public static void main(String[] args) {
		
//		funWithLists();
//		funWithSets();
//		funWithQueues();
//		funWithMaps(); //a data structure not with-in Collection
//		funWithIterator();
		funWithArrays();
		

		
		// best practices:  within the scope of what you are working with, try not to use conflicting terms
		// however:  In coding and in life, conflicts will happen... use good self documenting
	}
	
	public static void funWithArrays() {
		
	}
	
	
	public static void funWithIterator() {
		
		/*
		 * Iterable is an interface which is extened by Collection
		 * -Iterable provides methods for easy traversal of any concrete subtipe
		 * 		-defines iterator() method, which return an Iterator
		 * 		
		 * iterator() has:  .next(), .hasNext(), .remove()
		 * -using the Iterator allows us to safely remove elements in place and traverse mutiple Collections at once
		 * 
		 * https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
		 * 
		 */
		
		//TODO check github for the right object to put in here
		Set<User> userSet = new HashSet<>();
				
				
		userSet.add(new User("Gandalf", "Gray", "mithradir", "you_shall_not"));
		userSet.add(new User("Gandalf", "Gray", "mithradir", "you_shall_not"));
		userSet.add(new User("Gandalf", "Gray", "mithradir", "you_shall_not"));
		
		Iterator<User> userIterator = userSet.iterator();
		
		
		//use the hasNext as the condition thus when there is no next, it stops
		while(userIterator.hasNext()) {
			User u = userIterator.next();  // next() returns the next element, and steps forward the position of the iterator
			// could remove() to remove elements from the Collection aka "filtering a Collection"
			System.out.println(u);
		}
		
		
	}
	
	public static void funWithMaps() {
		
		/*
		 * Map:
		 * 
		 * -object which maps keys to values
		 * -every key may map to at most one value
		 * -no duplicate keys
		 * -most implementations allow keys to be null
		 * 
		 * https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
		 * 
		 */
		
		Map<String, String> credentialsMap = new HashMap<>();
		credentialsMap.put("mithrandir", "you_shal_not");
		credentialsMap.put(null, "");
		credentialsMap.put("bono", null);
		credentialsMap.put("bono2", null);
		credentialsMap.put("doc", "tardis");
		
		// retrieve objects by their keys
		System.out.println(credentialsMap.get("doc10"));
		
		// iterate through the map -  vvv | this is a big deal here | vvv
		for (Map.Entry<String, String> entry : credentialsMap.entrySet()) {
			System.out.println("Key:  " + entry.getKey() + ", Value: " + entry.getValue());
		}
		
	}
	
	public static void funWithQueues() {
		
		/*
		 * Queue:
		 * 
		 * -provide methods for adding, removing, and inspecting elements
		 * -two versions for each of these behaviors
		 * 		one that throws exceptions if operation fails
		 * 		one that does not
		 * -FIFO (First-In, First-Out
		 * 		PriorityQueue uses a Comparator or elements' natural ordering
		 *  
		 * 
		 * 
		 * https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
		 */
		
		//using upcasting (I think)
		Queue<User> userQueue = new LinkedList<>();
		
		
		User u1 = new User("Gandalf", "Gray", "mithradir", "you_shall_not");
		User u2 = new User("Paul", "Hewson", "bono", "u2RuleZ");
		User u3 = new User("David", "Tenant", "doc10", "tardis");
		User u4 = new User("David", "Tenant", "doc10", "tardis");
		
		userQueue.add(u1);
		userQueue.add(u2);
		userQueue.add(u3);
		userQueue.add(u1);
		userQueue.add(u4);
		
		
		
		System.out.println("Plane Queue to Comic-con");
		while(userQueue.size() != 0) {
			System.out.println("Queue size:  " + userQueue.size());
			System.out.println("Processing:  " + userQueue.poll()); //removes and returns head of queue
		}
		
		
		
	}
	
	
	
	public static void funWithSets() {
		/*
		 * Set:
		 * 
		 * -Sets are not ordered
		 * -No Duplicate elements
		 * -Sets are equal if they have the same elements (enforced by equals() and hashcode() implementations)
		 * 
		 * https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
		 * 
		 */
		User u1 = new User("Gandalf", "Gray", "mithradir", "you_shall_not");
		User u2 = new User("Paul", "Hewson", "bono", "u2RuleZ");
		User u3 = new User("David", "Tenant", "doc10", "tardis");
		User u4 = new User("David", "Tenant", "doc10", "tardis");
		
		
		Set<User> userSet = new HashSet<>();  		
//		Set<User> userSet = new HashSet<User>();  will also work too, but explicit un-needed
		userSet.add(u1);
		userSet.add(u2);
		userSet.add(u3);

		
		//insertion order is ignored
		System.out.println("Insertion order is ignored");
		for (User user : userSet) {
			System.out.println(user);
		}
		
		
		//duplicates are ignored
		System.out.println("Duplicates are ignored");
		userSet.add(u1);
		for (User user : userSet) {
			System.out.println(user);
		}
		
		
		//it is checking with equality, not identity  -this this is also ignored
		System.out.println("");
		userSet.add(u4);
		for (User user : userSet) {
			System.out.println(user);
		}
		
	}
	
	public static void funWithLists() {
		
		/*
		 * list:
		 * 
		 * -lists are ordered Collecitons
		 * -Duplicate elements are allowed
		 * 
		 * Some additional list features (beyond methods defined in Colleciton):
		 * -Positional access:  access/manipulate elements based on  position in list
		 * -Search:
		 * -Iteration: listIterator() that expands on capiblities of the Iterator
		 * -Range-view:  access/manipulate subsets of the list
		 * 
		 * https://docs.oracle.com/javase/8/docs/api/java/util/List.html
		 * 
		 */
		
		List<User> users = new ArrayList<>();  
		// generally want to use the super type of whatever Collection
		// User is the type of each element in the List, replaces the generic type 
		
		User u1 = new User("Gandalf", "Gray", "mithradir", "you_shall_not");
		User u2 = new User("Paul", "Hewson", "bono", "u2RuleZ");
		User u3 = new User("David", "Tenant", "doc10", "tardis");
		
		// addAll will not work here as it is not a Collection already
		users.add(u1);
		users.add(u2);
		users.add(u3);
		
		// duplicates are allowed
		users.add(u1);
		
		// Do for each
		for (User user : users) {
			System.out.println(user);
		}
		
		System.out.println("Size of current list:  " + users.size());
		
		//list of Intergers
		//Must use the wrapper class to use primitive types - a datatype that wraps around a primitive value
		List<Integer> integerList = new Vector<>();
		
		integerList.add(10);  //auto-Boxing converts a primitive value to its corresponding wrapper
		integerList.add(-255);
		integerList.add(new Integer(9)); //Explicit
		integerList.add(75);
		integerList.add(-12);
		
		System.out.println("Size of current list:  " + integerList.size());
		
		for (Integer integer : integerList) {
			System.out.println(integer);
		}
		
		/*
		 * Collections utility class has static methods for operating on a Collection object
		 * 
		 * sort() method;
		 * must be used with a Collection of Comparable elements
		 * 
		 * TODO Learn how to set up natural orderings for non-comparable using a Comparator 
		 * with an overloaded version of the sort method
		 */
		
		Collections.sort(integerList);
		for (Integer integer : integerList) {
			System.out.println(integer);
		}
		
	}

}


