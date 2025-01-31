import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class FindDuplicates {

    public static List<Integer> findDuplicatesNestedLoops(List<Integer> l) {
      	List<Integer> unique = new ArrayList<Integer>();
    	
    	for (int i = 0; i < (l.size() - 1); i++) {
    		for (int j = i + 1; j < l.size(); j++) {
    			if (l.get(i).equals(l.get(j)) && !unique.contains(l.get(i))) {
    	        	   unique.add(l.get(i));
    			}
    		}
    	}

        return unique;
    }

    public static List<Integer> findDuplicatesSet(List<Integer> l) {
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> set = new HashSet<Integer>();
    	
		for (int num: l) {
			if (set.add(num) == false)
				unique.add(num);
		}
    	
    	return List.copyOf(unique);
    	
    }

    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findDuplicatesNestedLoops(sample1));
        System.out.println("Sample 2: " + findDuplicatesNestedLoops(sample2));
        System.out.println("Sample 3: " + findDuplicatesNestedLoops(sample3));
        System.out.println("Sample 4: " + findDuplicatesNestedLoops(sample4));

        System.out.println();
        System.out.println("Sample 1: " + findDuplicatesSet(sample1));
        System.out.println("Sample 2: " + findDuplicatesSet(sample2));
        System.out.println("Sample 3: " + findDuplicatesSet(sample3));
        System.out.println("Sample 4: " + findDuplicatesSet(sample4));
    }

}
