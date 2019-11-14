package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();  //lista inicialmente vazia
        lista.add("José");
        lista.add("Silvia");
        lista.add("Alice");
        lista.add("Leocádia");
        lista.add("Esther");
        lista.add("Larissa");
        lista.add("Laila");
        lista.add("Lea");
        lista.add("Yacov");
        lista.add("Vicente");
        lista.add("Leonardo");
        lista.add("Leonidas");
        lista.add("Carlos");
        lista.add("Sebastian");
        lista.add("Samuel");
        
        for (String x : lista) {
        	System.out.println(" " + x);	 // gera a primeira lista
        }
		
        System.out.println("--------------");
		System.out.println("O tamanho da lista é : " + lista.size());
		
		System.out.println("--------------");
		lista.remove("José");  //tira esse e a lista muda, comportamento de fila
		lista.remove(1);
		lista.removeIf(x -> x.charAt(0) == 'L');
		
		for (String y : lista) {
			System.out.println(" " + y);
		}
		
		System.out.println("------");
		System.out.println("Index de Vicente:" + lista.indexOf("Vicente"));
		System.out.println("Index de Sebastian:" + lista.indexOf("Sebastian"));
		System.out.println("------");
		
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) != 'S').collect(Collectors.toList());
		for (String k : resultado) {
		  System.out.println(k);	
		}
		System.out.println("------");
		String nome = lista.stream().filter(n -> n.charAt(0) == 'V').findFirst().orElse(null);
		System.out.println(nome);
		
	}

}
