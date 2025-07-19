package basicsprogram;
	import java.util.ArrayList;
	public class Assignment29 {
	    public static void main(String[] args) {
	      
	        ArrayList<String> list1 = new ArrayList<>();
	        list1.add("Apple");
	        list1.add("Banana");

	        ArrayList<String> list2 = new ArrayList<>();
	        list2.add("Cherry");
	        list2.add("Date");
	        
	        ArrayList<Object> addExample = new ArrayList<>();
	        addExample.addAll(list1);
	        addExample.add(list2);

	        System.out.println("Using add():");
	        System.out.println(addExample); 
	        ArrayList<String> addAllExample = new ArrayList<>();
	        addAllExample.addAll(list1);
	        addAllExample.addAll(list2);

	        System.out.println("\nUsing addAll():");
	        System.out.println(addAllExample); 
	    }
	}

