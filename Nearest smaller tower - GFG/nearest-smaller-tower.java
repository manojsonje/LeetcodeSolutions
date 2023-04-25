//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int [] arr = new int[n];
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(str[i]);
			Solution ob = new Solution();
			int [] ans = ob.nearestSmallestTower(arr);
			for(int i = 0; i < n; i++)
				System.out.print(ans[i]+" ");
			System.out.println();
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution{
	int [] nearestSmallestTower(int [] arr){
	    int n = arr.length;
	 int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();

        left[0] = Integer.MAX_VALUE;
        st.push(0);
        for(int i=1; i<n; i++) {
            if(st.isEmpty()) {
                left[i] = Integer.MAX_VALUE;
            }
            else {
                int f = 0;
                while(!st.isEmpty()) {
                    if(arr[st.peek()] < arr[i]) {
                        left[i] = st.peek();
                        st.push(i);
                        f = 1;
                        break;
                    }
                    st.pop();
                }
                if(f == 0) {
                    left[i] = Integer.MAX_VALUE;
                    st.push(i);
                }
            }
        }

        right[n-1] = Integer.MAX_VALUE;
        st.push(n-1);
        for(int i=n-2; i>=0; i--) {
            if(st.isEmpty()) {
                right[i] = Integer.MAX_VALUE;
            }
            else {
                int f = 0;
                while(!st.isEmpty()) {
                    if(arr[st.peek()] < arr[i]) {
                        right[i] = st.peek();
                        st.push(i);
                        f = 1;
                        break;
                    }
                    st.pop();
                }
                if(f == 0) {
                    right[i] = Integer.MAX_VALUE;
                    st.push(i);
                }
            }
        }

        int[] ans = new int[n];
        for(int i=0; i<n; i++) {
            if(left[i] == Integer.MAX_VALUE && right[i] == Integer.MAX_VALUE) {
                ans[i] = -1;
            }
            else if(left[i] == Integer.MAX_VALUE && right[i] != Integer.MAX_VALUE) {
                ans[i] = right[i];
            }
            else if(right[i] == Integer.MAX_VALUE && left[i] != Integer.MAX_VALUE) {
                ans[i] = left[i];
            }
            else {
                if(arr[left[i]] == arr[right[i]] && Math.abs(i - left[i]) == Math.abs(i - right[i])) { //same height and same distance
                    ans[i] = Math.min(left[i], right[i]);
                }
                else if(arr[left[i]] == arr[right[i]]) { //same height
                    int x = Math.abs(i - left[i]);
                    int y = Math.abs(i - right[i]);
                    if(x < y) {
                        ans[i] = left[i];
                    }
                    else {
                        ans[i] = right[i];
                    }
                }
                else if(Math.abs(i - left[i]) == Math.abs(i - right[i])) { //same dist
                    if(arr[left[i]] <= arr[right[i]]) {
                        ans[i] = left[i];
                    }
                    else {
                        ans[i] = right[i];
                    }
                }
                else {
                    int x = Math.abs(i - left[i]);
                    int y = Math.abs(i - right[i]);
                    if(x < y) {
                        ans[i] = left[i];
                    }
                    else {
                        ans[i] = right[i];
                    }
                }
            }
        }
        return ans;
	}
}