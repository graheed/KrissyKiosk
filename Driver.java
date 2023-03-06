package MainCode2;
import MainCode2.*;
import java.util.ArrayList;

import java.util.Scanner;



public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //test Employee
		Inventory inventory = new Inventory();
        Employee employee1 = new Employee("EMP1", "Zaria TryTalk Patois", "ZahRia55@gmail.com", "password123", "Clerk");
        Customer customer1 = new Customer("CUS1", "John Dont Know", "JJ681@gmail.com", "","3 Mile Dung a Town", "876-666-5544");
        User CurrentUser;
		ProductDescription prodDesc = new ProductDescription("001","Juicy Patty",350.50);
		Product patty = new Product("Patty",20,prodDesc);
		inventory.addNewProduct(patty);
        CurrentUser = employee1;
        String accountType = "";
        ArrayList<String> Options = new ArrayList<>();
        
        if (CurrentUser.checkPrivilege() == true) {
        	accountType = "Employee";
        }
        else {
        	accountType = "Customer";
        }
		System.out.println("Welcome to your " + accountType+ " account " +CurrentUser.getName());
    	
		
		//Adding options for user to select based on privilege.
		Options.add("[V]iew Products\n");
		Options.add("[S]hopping Cart\n");
		if (CurrentUser.checkPrivilege() == true) {
        	Options.add("[A]dd Product\n");
        }
		Options.add("[E]xit");
		
		String answer = "";
		
		while (!answer.toUpperCase().equals("E")){
			answer = "";
			System.out.println("Please select an option");
			for (String option: Options) {
				System.out.print(option);
			}
			System.out.println("\n> ");

			answer = scanner.nextLine();
			if(answer.toUpperCase().equals("V")){
				System.out.flush();
				System.out.println("====================Products====================");
				inventory.displayProducts();
				System.out.println("");

				String vAnswer = "";
				while (!vAnswer.toUpperCase().equals("B")) {
					System.out.println("[V]iew Item?" + "\n" + "[B]ack");
					System.out.println("");
					vAnswer = scanner.nextLine();
					if(vAnswer.toUpperCase().equals("V")){
						System.out.println("Enter the product name");
						String prodName = scanner.nextLine();
						Product prod = inventory.findProduct(prodName);
						//Only works for words where the first letter is capital. Needs to change
						if (prod==null){
							System.out.println("Product Not Found");
						}
						else {
							System.out.println(prod);
							System.out.println("");
							System.out.println("");
							}

						}

					}

				}
			else if(answer.toUpperCase().equals("A")){
				System.out.flush();
				System.out.println("====================Add Product====================");
				System.out.println("");
				if (CurrentUser.checkPrivilege() == true) {

			        // Prompt the user to enter the product details
			        System.out.print("Enter product ID: ");
			        String id = scanner.nextLine();
			
			        System.out.print("Enter product name: ");
			        String name = scanner.nextLine();
			        
			        System.out.print("Enter product description: ");
			        String pdescription = scanner.nextLine();
			
			        System.out.print("Enter product price: ");
			        double price = scanner.nextDouble();
			
			        System.out.print("Enter product quantity: ");
			        int quantity = scanner.nextInt();
			        scanner.nextLine();

			
			        // Create a new product
			        ProductDescription description = new ProductDescription(id, pdescription, price);
			        Product product = new Product(name, quantity,description);
			        
			        
			        // Add new Product
			        inventory.addNewProduct(product);
			        System.out.println("");
					System.out.println("");
			

			        
		        }
		        
		        else {
		        	System.out.println("Sorry, you seem to lack authorization.");
		        	System.out.println("");
					System.out.println("");
		        	
		        }

					}
			

				}
		
		scanner.close();
		

        
		
			}
    
        	
    }







