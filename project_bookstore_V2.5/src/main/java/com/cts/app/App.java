package com.cts.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.app.exceptions.ClassNotFoundException;
import com.cts.app.exceptions.SystemException;
import com.cts.app.model.User;
import com.cts.app.service.UserService;
import com.cts.app.service.ProductService;
import com.cts.app.service.GenreService;



public class App {
	public static void main(String[] args) throws SystemException, IOException {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/cts/app/model/spring-configuration.xml");

		UserService userService = (UserService) context.getBean("userService");
		ProductService productService = (ProductService) context.getBean("productService");
		GenreService genreService = (GenreService) context.getBean("genreService");

		
		System.out.println("Hello...\nWelcome to Book Store");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while (true) {
			System.out.println("\n**************************************************************************\n");
			System.out.println("Press 0 to Exit.");
			System.out.println("Press 1 to ADD User.");
			System.out.println("Press 2 to Show all the Users.");
			System.out.println("Press 3 to Search User using ID.");
			System.out.println("Press 4 to Show all Books.");
			System.out.println("Press 5 to Search Book By Name.");
			System.out.println("Press 6 to Search Book By Category/Genre.");
			
			// Yet to Implement this part
			System.out.println("Press 7 to Add book to Order table from Books catalog.");
			System.out.println("Press 8 to Show Books in order Section.");
			System.out.println("Press 9 Add book to Bill Section.");
			System.out.println("Press 10 Generate Bill / Show All items in Bill Section.");

			// To get the input Number from user to perform required operation
			int input = Integer.parseInt(br.readLine());
			
			// ADD User
			if (input == 1) {
				System.out.println("Enter User Name: ");
				String name = br.readLine();

				System.out.println("Enter your Phone No: ");
				String phno = br.readLine();

				System.out.println("Enter your Mail Id: ");
				String mail = br.readLine();

				System.out.println("Enter your Address: ");
				String addr = br.readLine();

				System.out.println("Enter Password: ");
				String psw = br.readLine();

				User user = new User(name, phno, mail, addr, psw);
				userService.createUser(user);

			} 
			
			// Show All Users 
			else if (input == 2) {
				System.out.println("User List:");
				System.out.println("~~~~~~~~~~");
				userService.getAllUser().forEach(System.out::println);
			} 
			
			// Searching User by ID
			else if (input == 3) {
				System.out.println("Enter User Id to be searched : ");
				int UserId = Integer.parseInt(br.readLine());
				try {
					System.out.println(userService.getUserById(UserId));

				} catch (ClassNotFoundException e) {
					System.err.println(e.getMessage());
				}
			} 
			
			// Show All Books 
			else if (input == 4) {
				System.out.println("Books List:");
				System.out.println("~~~~~~~~~~~");
				productService.getAllProduct().forEach(System.out::println);
			}
			
			// Searching Product by Name
			else if (input == 5) {
				System.out.println("Enter Book Name to be searched :");
				String productName = br.readLine();
				try {
					System.out.println(productService.getProductByName(productName));

				} catch (ClassNotFoundException e) {
					System.err.println(e.getMessage());
				}
			} 
			
			// Searching Genre or Category by Name
			else if (input == 6) {
				// Show all available Genre
				System.out.println("Genre List:");
				System.out.println("~~~~~~~~~~");
				genreService.getAllGenre().forEach(System.out::println);
				
				// Searching Genre by Name
				System.out.println("Enter Genre of Book :");
				String genreName = br.readLine();
				try {
					System.out.println(genreService.getBookByGenre(genreName));

				} catch (ClassNotFoundException e) {
					System.err.println(e.getMessage());
				}
			} 
			
			// Exit the loop
			else if (input == 0) {
				System.out.println("Thanks for using app have a great day...");
				break;
			}
		}
		
	}
}
