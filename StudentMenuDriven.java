package com.Dec26;
 
import java.util.Scanner;
 
public class StudentMenuDriven {
 
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Student rollNo:");

		int rno=sc.nextInt();

		System.out.println("Enter Student Name:");

		String sname=sc.next();

		System.out.println("Enter Student age:");

		String age=sc.next();

		System.out.println("Enter marks for m1:");

		int m1=sc.nextInt();

		System.out.println("Enter marks for m2:");

		int m2=sc.nextInt();

		System.out.println("Enter marks for m3:");

		int m3=sc.nextInt();

		int total=m1+m2+m3;

		double per=total/3;

		int ch;

		do {

			System.out.println("Press 1:To display roll no,name and age");

			System.out.println("Press 2:To display Total Marks for 3 subjects");

			System.out.println("Press 3:To display percentage and grade");

			System.out.println("Press 4:Exit");

			System.out.println("Enter choice:");

			ch=sc.nextInt();

			switch(ch) {

			case 1:

				System.out.println("Student Roll Number:"+rno+"\nStudent Name:"+sname+"\nStudent age:"+age);

			break;

			case 2:

				System.out.println("Total Marks:"+total);

			break;

			case 3:

				System.out.println("Percentage:"+per);

				if(per>=90) {

					System.out.println("A Grade");

				}

				else if(per>=75) {

					System.out.println("B Grade");

				}

				else if(per>=55) {

					System.out.println("C Grade");

				}

				else if(per>=35) {

					System.out.println("D Grade");

				}

				else {

					System.out.println("fail...");

				}

			break;

			case 4:

				System.out.println("Exit");

			break;

			default:

				System.out.println("wrong choice");

			}

		}while(ch!=4);

		}

	}
 
 
 