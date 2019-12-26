package entities;

import java.util.List;

public class Estoque {
   Product prod;
   List<Product> lst;
   
   public Estoque() {}
   
   public void addItem(String name, double price) {
	   prod = new Product(name, price);
	   lst.add(prod);
   }
   
   
   public void remItem(int itemNum) {
	   lst.remove(itemNum);
   }
   
   
   public String checkList() {
	   return lst.toString();
   }
   
}
