import java.util.Comparator;

public class Sortbystock implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.getStock()-p2.getStock();
	}

}
