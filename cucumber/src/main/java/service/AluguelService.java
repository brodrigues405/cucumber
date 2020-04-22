package service;

import java.util.Calendar;

import entity.Filme;
import entity.NotaAluguel;

public class AluguelService {
	
	
	public NotaAluguel alugarFilme(Filme filme){
		NotaAluguel notaAluguel = new NotaAluguel();
		notaAluguel.setPreco(filme.getAluguel());
		
		
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 1);
		
		
		notaAluguel.setDataEntrega(c.getTime());
		
		filme.setEstoque(filme.getEstoque() - 1);
		
		return notaAluguel;
	}

}
