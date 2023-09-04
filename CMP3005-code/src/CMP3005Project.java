import java.util.ArrayList;

public class CMP3005Project {
	
	/**
	 * Generates an array of binary numbers of length n.
	 *
	 * @param n the length of the binary numbers
	 * @return an array of binary numbers
	 */
	
	public static String[] generateBinaryNumbers(int n) {
	    String[] binaryNumbers = new String[1 << n];
	    char[] binaryNum = new char[n];

	    for (int i = 0; i < (1 << n); i++) {
	        for (int j = 0; j < n; j++) {
	            binaryNum[j] = (i & (1 << j)) == 0 ? '0' : '1';
	        }
	        binaryNumbers[i] = new String(binaryNum);
	    }
	    return binaryNumbers;
	}

	
	/**
	Finds the size of the maximal clique in the given array of vertices.
	@param d the maximum Hamming distance allowed between vertices in the clique
	@param vertices an array of strings representing the vertices in the graph
	@return an integer representing the size of the maximal clique found in the input array of vertices
	*/
	
	 public static int maximalClique( int d, String[] vertices) {
		 ArrayList<String> maximalClique = new ArrayList<>();// we do not know the size
		 maximalClique.add(vertices[0]); // initialize clique with the first vertex

	        for (int i = 1; i < vertices.length; i++) {
	            boolean isAdjacent = true;
	            for (int j = 0; j < maximalClique.size(); j++) {
	                if (hammingDistance(vertices[i], maximalClique.get(j)) < d) {
	                    isAdjacent = false;
	                    break;
	                }
	            }
	            if (isAdjacent) {
	            	maximalClique.add(vertices[i]);
	            }
	        }
	        System.out.println("Maximal Clique strings: "+maximalClique);
	        return maximalClique.size();
	    }
	 
	 
	 /**

	 Calculates the Hamming distance between two strings.
	 @param u a string
	 @param v a string
	 @return an integer representing the number of positions at which the two strings differ
	 */
	 private static int hammingDistance(String u, String v) {
	        int distance = 0;
	        for (int i = 0; i < u.length(); i++) {
	            if (u.charAt(i) != v.charAt(i)) {
	                distance++;
	            }
	        }
	        return distance;
	    }
	 
	 
	 public static void main(String[] args) {
			int n=5;
			int hammingDistance=4;
			String[] binaryNumbers =generateBinaryNumbers(n);
			System.out.println("All possible binary numbers ");
			for(int i=0; i<binaryNumbers.length; i++) {
				System.out.println(i+1 +"th: "+binaryNumbers[i]);	
			}
			System.out.println("Maximal Clique length is " +binaryNumbers.length);// here 
			int result= maximalClique(hammingDistance,binaryNumbers);
			System.out.println("The Maximal Clique for " + n + " bits binary Numbers with hamming Distance of "+hammingDistance+ " is "+result);	
			
		}

}
