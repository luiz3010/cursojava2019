package controller;
import util.Teclado;
public class Operadores {
	public static void main(String[] args) {
String nome;
nome=Teclado.lerTexto("Digte nome do aluno:");

int nota01;

 nota01=Teclado.lerInt("Digita a nota 01: ");
int nota02;
 nota02=Teclado.lerInt("Dgita a nota 02: ");
int nota03;
 nota03=Teclado.lerInt("Digita a nota 03: ");
 int nota04;
 nota04=Teclado.lerInt("Digita a nota 04: ");
 int media;
 media=(nota01+nota02+nota03+nota04)/4;

 
 System.out.println("Média do aluno:"+media);
	
 
 
	


	if(media>=6) {
		System.out.println("Você foi aprovado:");
		
	} else { 
System.out.println("Você foi reprovado");
		
	}
		
}
}


