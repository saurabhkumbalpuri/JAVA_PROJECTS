import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
public class Main {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		//FILL YOUR CODE//main
		do {
			System.out.println("Menu\n1.Add item\n2.Change item\n3.Display items\n4.Exit\nEnter choice");
			switch(Integer.parseInt(br.readLine())) {
			case 1:
				//FILL YOUR CODE
				System.out.println("Enter item id");
				//FILL YOUR CODE
				System.out.println("Enter name");
				//FILL YOUR CODE
				System.out.println("Enter category");
				//FILL YOUR CODE
				System.out.println("Enter number");
				//FILL YOUR CODE
				System.out.println("Enter price");
				//FILL YOUR CODE
				System.out.println("Added to the list successfully");
				break;
			case 2:
				System.out.println("Enter item id");
				//FILL YOUR CODE
				if//FILL YOUR CODE
					System.out.println("Item not found");
				else {
					System.out.println("Enter name");
					//FILL YOUR CODE
					System.out.println("Enter category");
					//FILL YOUR CODE
					System.out.println("Enter number");
					//FILL YOUR CODE
					System.out.println("Enter price");
					//FILL YOUR CODE
					System.out.println("Changes are updated successfully");
				}
				break;
			
			case 3:
				//FILL YOUR CODE
				if//FILL YOUR CODE
				{
					System.out.println("Empty list");
				}
				else
				{
				System.out.printf("%-15s %-15s %-15s %-15s %s\n","Id","Name","Category","Number","Price");
				for(Item i:itemList) {
					System.out.printf("%-15s %-15s %-15s %-15s %s\n", i.getId(),i.getName(),i.getCategory(),i.getNumber(),i.getPrice());
				}
				}
				break;
			case 4:
				System.out.println("Bye");
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		}while(true);
	}
}
