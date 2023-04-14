package com.kshitij.project;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import com.kshitij.project.model.User;
import com.kshitij.project.dao.UserDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello...\nWelcome to Book Store");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("My Program started......... ");
		// spring jdbc=> JdbcTemplate
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/springconfig.xml");
		
		
		while(true) {
			System.out.println("Press 1 to ADD User.");
			System.out.println("Press 2 to Show User");
			System.out.println("Press 3 to Show Products");
			System.out.println("Press 4 to Exit");
			//System.out.println("Press 5 to Update");
			
			// To get the input from user to perform required operation 
			int input = Integer.parseInt(br.readLine());
			
			if(input == 1) {
				// ADD User data operations
				System.out.println("Enter User Name: ");
				String name = br.readLine();
				
				System.out.println("Enter your Phone No [** Only 10 digits]: ");
				String phno = br.readLine();
				
				System.out.println("Enter your Mail Id: ");
				String mail = br.readLine();
				
				System.out.println("Enter your Address: ");
				String addr = br.readLine();
				
				System.out.println("Enter Password: ");
				String psw = br.readLine();
				
				
				UserDao userDao = context.getBean("userDao", UserDao.class);
				User user=new User ();
		
				user.setuName(name);
				user.setuPh(phno);
				user.setuMail(mail);
				user.setuAddr(addr);
				user.setuPass(psw);
				boolean result = userDao.createUser(user);
				
//				// Now creating User object to store users data
//				User user = new User(name, phno, mail, addr, psw);
//				boolean ans = UserDao.insertUserToDB(user);
				if(result)
					System.out.println("New user successfully added!!!");
				else
					System.out.println("Something went wrong. Sorry no user data is added.");
				System.out.println(user);
			}
				
//			}else if(input == 2){
//				// Show User data
//				UserDaoOld.showAllUser();
//			}
//			else if(input == 3){
//				// Show Products Data
//				ProductDaoOld.showAllProducts();
//			}
//			else if(input == 4){
//				// Exit
//				break;
//			}
////			else if(input == 5) {
////				
////			}
//			else {
//				
//			}
//			
			System.out.println("Thanks for using app have a great day...");
		}
		
	}

}