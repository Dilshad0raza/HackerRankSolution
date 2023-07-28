////Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.
//
//You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.
//
//Take your input from System.in.
//
//Input Format
//The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .
//
//Constraints
//
//Each number will fit in signed integer.
//Total number of integers in  lines will not cross .
//
//Output Format
//In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"
//
//Sample Input
//
//5
//5 41 77 74 22 44
//1 12
//4 37 34 36 52
//0
//3 20 22 33
//5
//1 3
//3 4
//3 1
//4 3
//5 5
//Sample Output
//
//74
//52
//37
//ERROR!
////ERROR!



package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		Scanner s=new Scanner (System.in);
		int rowlinenum=s.nextInt();


		//Initilization 
		for(int i=0;i<rowlinenum;i++) {
			a.add(new ArrayList<>());
		}


		///Add Element
		for(int i=0;i<rowlinenum;i++) {
			int cnum=s.nextInt();
			for(int j=0;j<cnum;j++) {
				a.get(i).add(s.nextInt());
			}
		}
		//this is used to how many time call a method.

		int m=s.nextInt();

		// create new object type ArrayList because return type both int and String.
		ArrayList<Object>res=new ArrayList<>();

		for(int i=0;i<m;i++) {
			res.add(isChecked(s.nextInt(),s.nextInt(),a));
		}
		//for Iterate the data.
		for(Object i:res) {
			System.out.println(i);
		}
	}

	private static Object isChecked(int r, int c, ArrayList<ArrayList<Integer>> a) {
		try {
			int re=a.get((r-1)).get((c-1));
			return re;
		}catch(IndexOutOfBoundsException e) {
			return "ERROR!!";
		}
	}
}



