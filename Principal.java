package br.unipe.mlpIII.atividadedejava.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import br.unipe.mlpIII.atividadedejava.modelo.Item;

public class Principal {
	
	public static void main(String[] args) {
		
		Item item1 = new Item(1, "Item 1", 100);
		Item item2 = new Item(2, "Item 2", 200);
		Item item3 = new Item(3, "Item 3", 300);
		
		List<Item> itens = new ArrayList<>();
		itens.add(item3);
		itens.add(item2);
		itens.add(item1);
		
		Collections.sort(itens);
		System.out.println(itens);
		
		Collections.reverse(itens);
		System.out.println(itens);
	}

}
