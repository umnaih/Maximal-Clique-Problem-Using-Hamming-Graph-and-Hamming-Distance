# Maximal Clique Problem with Hamming Graph

## Introduction
This project focuses on efficiently computing the maximal clique in the Hamming graph, utilizing the concept of Hamming distance. The Hamming distance, introduced by Richard Hamming, measures the dissimilarity between two equal-length strings of symbols. It counts the positions where corresponding symbols differ. Hamming graphs, named after Richard Hamming, are utilized in computer science and mathematics. In these graphs, vertices represent set elements, and edges connect elements a certain Hamming distance apart. This project aims to solve the NP-hard maximal clique problem in Hamming graphs, using a brute-force algorithm with a time complexity of O(2^n * n).

## Implementation
The project is implemented in Java and features a brute-force algorithm. It comprises the following components:

1. **generateBinaryNumbers():** This method generates all possible binary strings of a specified length. It utilizes bit manipulation and has a time complexity of O(2^n).

2. **maximalClique(d, vertices[]):** This method finds the size of the maximal clique that can be created with binary strings of a specified digit, considering a minimum Hamming distance 'd'. It employs a brute-force approach, comparing each binary string with others to form cliques. The time complexity is O(2^n * n).

3. **hammingDistance(string1, string2):** This method calculates the Hamming distance between two strings. It iterates over the characters in both strings, counting the differing positions. The time complexity is O(length of the string).

4. **main():** The main method generates all possible 5-digit binary strings with a minimum Hamming distance of 4 and calculates the size of the maximal clique. It displays the clique size and the strings in the maximal clique.

This project serves as an educational example for solving the maximal clique problem using Hamming graphs and Hamming distance in Java.

## Better Implementations
While the current implementation uses a brute-force approach, more efficient algorithms are available for solving the maximal clique problem in graphs. Two such alternatives are:

1. **Branch and Bound Algorithm:** This exact solution technique divides the problem into smaller subproblems, solving them and combining the solutions to obtain the optimal solution. While it has a time complexity of O(b^d), where 'b' is the branching factor and 'd' is the depth of the search tree, it may not be suitable for large inputs.

2. **Bron-Kerbosch Algorithm:** This heuristic solution efficiently finds all cliques in an undirected graph. It employs pivoting to reduce recursive calls and has a time complexity of O(3^(n/3)), making it a better choice for large graphs.

## Comparison Between Implementations
A comparison of time complexities for different input sizes illustrates the advantages of the Bron-Kerbosch algorithm over brute-force. As input size ('n') increases, the Bron-Kerbosch algorithm's time complexity grows much slower compared to the exponential growth of the brute-force algorithm.

In summary, while the current implementation serves as a functional brute-force solution, more efficient algorithms like Bron-Kerbosch should be considered for practical applications with larger graphs. These alternatives offer improved time complexity and scalability.
