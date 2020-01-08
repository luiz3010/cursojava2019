package controller;
import model.Carro;
public class Cadastro {

	public static void main(String[] args) {
	
	Carro carro01=new Carro();
	carro01.fabricante= "Fiat";
    carro01.modelo= "Palio";
    carro01.cor="Azul";
    carro01.ano=1994;
		
    Carro carro02=new Carro();
    
	carro01.fabricante= "Fiat";
    carro01.modelo= "Uno";
    carro01.cor="Verde";
    carro01.ano=1999;
	
    Carro carro03=new Carro();
    
carro03.fabricante= "Honda";
       carro03.modelo= "Civic";
       carro03.cor="Branco";
       carro03.ano=2015;
	System.out.println();
	}

}
