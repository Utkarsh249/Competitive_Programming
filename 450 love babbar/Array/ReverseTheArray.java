/*Given an array A of size N, print the reverse of it.
Input:
First line contains an integer denoting the test cases 'T'. T testcases follow. Each testcase contains two lines of input. First line contains N the size of the array A. The second line contains the elements of the array.
Output:
For each testcase, in a new line, print the array in reverse order.
Constraints:
1 <= T <= 100
1 <= N <=100
0 <= Ai <= 100
Example:
Input:
1
4
1 2 3 4
Output:
4 3 2 1*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
		    int N=sc.nextInt();
		    int A[]=new int[N];
		    for(int j=0;j<N;j++){
		        A[j]=sc.nextInt();
		    }
		    for(int i1 =0;i1<N;i1++)
            System.out.print(A[N-1-i1]+" ");		    
		    System.out.println();
		}
	}
}
