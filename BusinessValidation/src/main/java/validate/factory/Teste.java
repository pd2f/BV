package validate.factory;

import java.util.ArrayList;
import java.util.List;

import validate.interfaces.ServicesValidates;
import validate.service.impl.teste.ServicesValidatesImpl;

public class Teste {

	public static <T> void main(String[] args) {
		Integer[] inteiros = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10 };
		List<Integer> lt = new ArrayList<>();

		for (Integer integer : inteiros) {
			lt.add(integer);

		}
		
		ServicesValidates val = new ServicesValidatesImpl();
		
		val.setListaProduzida(lt);
		
		System.out.println(val.valid());

	}

}
