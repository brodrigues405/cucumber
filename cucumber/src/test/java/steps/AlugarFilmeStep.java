package steps;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import entity.Filme;
import entity.NotaAluguel;
import service.AluguelService;

public class AlugarFilmeStep {
	
	private Filme filme;
	private AluguelService aluguelService = new AluguelService();
	private NotaAluguel notaAluguel = new NotaAluguel();
	
	

@Given("^um filme com estoque de (\\d+) unidades$")
public void umFilmeComEstoqueDeUnidades(int arg1) throws Throwable {
    filme = new Filme();
    filme.setEstoque(arg1);
}

@Given("^que o preco de aluguel seja R\\$ (\\d+)$")
public void queOPreODeAluguelSejaR$(int arg1) throws Throwable {
   filme.setAluguel(arg1);
}

@When("^alugar$")
public void alugar() throws Throwable {
    notaAluguel = aluguelService.alugarFilme(filme);
}

@Then("^o preco do aluguel sera R\\$ (\\d+)$")
public void oPreODoAluguelSeraR$(int arg1) throws Throwable {
   Assert.assertEquals(arg1, notaAluguel.getPreco());
}

@Then("^a data de entrega sera no dia seguinte$")
public void aDataDeEntregaSeraNoDiaSeguinte() throws Throwable {

	Calendar calendar = Calendar.getInstance();
	calendar.add(Calendar.DAY_OF_MONTH, 1);

	Date entrega = notaAluguel.getDataEntrega();

	Calendar calRetorn = Calendar.getInstance();
	calRetorn.setTime(entrega);

	Assert.assertEquals(calendar.get(Calendar.DAY_OF_MONTH), calRetorn.get(Calendar.DAY_OF_MONTH));
	Assert.assertEquals(calendar.get(Calendar.MONTH), calRetorn.get(Calendar.MONTH));
	Assert.assertEquals(calendar.get(Calendar.YEAR), calRetorn.get(Calendar.YEAR));

}

@Then("^o estoque do filme sera (\\d+) unidade$")
public void oEstoqueDoFilmeSeraUnidade(int arg1) throws Throwable {
    Assert.assertEquals(arg1, filme.getEstoque());
}


/**

@Then("^nao sera possivel por falta de estoque$")
public void naoSeraPossivelPorFaltaDeEstoque() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^que o preco de aluguel seja R\\$ (\\d+)$")
public void queOPrecoDeAluguelSejaR$(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^que o tipo do aluguel seja extendido$")
public void queOTipoDoAluguelSejaExtendido() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^a data de entrega sera em (\\d+) dias$")
public void aDataDeEntregaSeraEmDias(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^a pontuacao recebida sera de (\\d+) pontos$")
public void aPontuacaoRecebidaSeraDePontos(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

**/

}
