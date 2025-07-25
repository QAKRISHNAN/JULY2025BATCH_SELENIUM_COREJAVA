package Looping_Statements;

public class Nested_ForLoop 
{

	public static void main(String[] args) 
	{
		/*	1	2	3	4	5
		 *  1	2	3	4	5
		 *  1	2	3	4	5
		 *  1	2	3	4	5
		 *  1	2	3	4	5
		 *  
		 *  ------------
		 *  1	1	1	1	1
		 *  2	2	2	2	2
		 *  3	3	3	3	3
		 *  4	4	4	4	4
		 *  5	5	5	5	5
		 */
		/*
		for(int i=1;i<=15;i++) //Outer 1 2 3 4 5=5
		{
			for(int j=1;j<=5;j++) //Inner 5 5 5 5 5=25
			{
				System.out.print(i+"  ");
			}
			System.out.println();
		}
		*/
		
		/*
		for(int i=1;i<=5;i++) //Outer 
		{
			for(int j=1;j<=5;j++) //Inner
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		*/

		/*Outer Loop
		 * i=1;1<=5 T 
		 * 
		 * Inner Loop
		 * j=1;1<=5 T
		 *j++ j=2;2<=5 T
		 * j=3;3<=5 T
		 * ---------
		 * j=6;6<=5 F 
		 * 
		 * Outer Loop
		 * i++;i=2;2<=5 T
		 * Inner Loop
		 * j=1;1<=5 T
		 * ---------
		 * j=6;6<=5 F 
		 * 
		 * Outer Loop
		 * i++;i=3;3<=5 T
		 * Inner Loop
		 * j=1;1<=5 T
		 *j++ j=2;2<=5 T
		 * j=3;3<=5 T
		 * ---------
		 * j=6;6<=5 F 
		 * Outer Loop
		 * i++;i=6;6<=5 F
		 * 
		 * 1   2    3    4   5   
		 * 
		 * 1   2    3    4   5
		 * 
		 * 1   2    3    4   5
		 * 
		 * 1   2    3    4   5
		 * 
		 * 1   2    3    4   5
		 * 
		 */
		
		/*	1
		 * 	1	2
		 *  1	2	3
		 *  1	2	3	4
		 *  1	2	3	4	5 
		 */
		
		for(int i=1;i<=20;i++) //Outer 
		{
			for(int j=1;j<=i;j++) //Inner
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}

}
