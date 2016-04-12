package br.unipe.mlpIII.atividadedejava.modelo;

public class Item implements Comparable<Item>{
     
	private int codigo;
     private String descricao;
     private double preco;
     
     public Item(int codigo, String descricao, double preco){
    	 this.codigo = codigo;
    	 this.descricao = descricao;
    	 this.preco = preco;
     }
    
	public int compareTo(Item itens) {
		if (this.codigo < itens.codigo){
			return -1;
		}
		if(this.codigo > itens.codigo){
			return 1;
		}
		
		return 0;
	}
	
	public String toString(){
		return this.codigo+", "+this.descricao+", "+this.preco;
	}
}

