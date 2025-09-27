package com.ims.app.client;

import java.util.Scanner;

import com.ims.app.serviceimpl.Karvenagar;

public class Test {

	public static void main(String[] args) {
		
		Karvenagar k = new Karvenagar();
		do {
			Scanner sc =new Scanner(System.in);
			System.out.println("-----select-----"+"1. Add course \n"+"2. View Course \n"+"3. Add Faculty \n"
							+"4. View Faculty \n"+"5. Add Batch \n"+"6. View Batch \n"+"7. Add Student \n"+"8. View Student \n");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1: 
					k.addCourse();
					break;
			case 2:
					k.viewCourse();
					break;
			case 3: 
					k.addFaculty();;
					break;
			case 4:
					k.viewFaculty();;
					break;
			case 5: 
					k.addBatch();;
					break;
			case 6:
					k.viewBatch();;
					break;
			case 7: 
					k.addStudent();;
					break;
			case 8:
					k.viewStudent();;
					break;
				default:
					System.out.println("Enter valid choice");
			}
			
		}while(true);
	}
}
