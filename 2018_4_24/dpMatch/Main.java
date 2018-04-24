
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int[][] dp = new int[s.length()+2][t.length()+2];
		for(int i=0;i<s.length()+2;i++){
			Arrays.fill(dp[i], 0);
		}
		for(int i=1;i<s.length()+1;i++){
			for(int j=1;j<t.length()+1;j++){
				if((int)s.charAt(i-1)==(int)t.charAt(j-1)){
					dp[i][j] = (int)Math.max(dp[i-1][j-1]+1,(int)Math.max(dp[i][j-1],dp[i-1][j]));
				}
				else{
					dp[i][j] = (int)Math.max(dp[i-1][j-1],(int)Math.max(dp[i][j-1],dp[i-1][j]));
				}
			}
		}

		System.out.println(dp[s.length()][t.length()]);
	}
}


