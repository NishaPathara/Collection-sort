import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Product_sort {

	public static void main(String[] args) {
		int option = 0;
		// TODO Auto-generated method stub
		ArrayList<Product> product_list=new ArrayList<Product>();
		product_list.add(new Product(1,"product1",50,100));
		product_list.add(new Product(2,"product2",250,300));
		product_list.add(new Product(3,"product3",30,106));
		product_list.add(new Product(4,"product4",10,4));
		product_list.add(new Product(5,"product5",650,17));
		System.out.println("Unsorted List\n");
		for (Product pdt : product_list) {
            System.out.println(pdt);
        }
		while(option!=1 || option!=2) {
		System.out.println("\nPlease choose option 1 or 2");
		System.out.println("1.Sort products by price");
		System.out.println("2.Sort products by Stock");
		Scanner sc= new Scanner(System.in);
		option=sc.nextInt();
		if (option==1) {
			Collections.sort(product_list,new Sortbyprice());
			System.out.println("\nsorted by price");
			for (Product pdt : product_list) {
	            System.out.println(pdt);
	        }
		}else if (option==2) {
			Collections.sort(product_list,new Sortbystock());
			System.out.println("\nsorted by stock");
			for (Product pdt : product_list) {
	            System.out.println(pdt);
	        }
		}else {
			System.out.println("Wrong choice");
		}	
		
	}
	}

}
