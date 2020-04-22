package steps;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AprenderCucumber {

	@Given("^que criei o arquivo correntamente$")
	public void queCrieiOArquivoCorrentamente() throws Throwable {
	   
	}

	@When("^executa-lo$")
	public void executaLo() throws Throwable {
	   
	}

	@Then("^a especificacao deve finalizar com sucesso$")
	public void aEspecificacaoDeveFinalizarComSucesso() throws Throwable {
	    
	}
	
	@Then("^outro passo$")
	public void outroPasso() throws Throwable {
	    
	}
	
	
	
	
	private int contador = 0;
	@Given("^que o valor do contador e (\\d+)$")
	public void queOValorDoContadorE(int arg1) throws Throwable {
	    contador = arg1;
	}

	@When("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int arg1) throws Throwable {
	   contador += arg1;
	}

	@Then("^o valor do contador e (\\d+)$")
	public void oValorDoContadorE(int arg1) throws Throwable {
	   Assert.assertEquals(arg1, contador);
	}
	
	Date entrega = new Date();
	
	@Given("^que a entrega e dia (\\d{2})/(\\d{2})/(\\d{4})$")
	public void queAEntregaEDia(int dia, int mes, int ano) throws Throwable {
	    Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.DAY_OF_MONTH, dia);
	    cal.set(Calendar.MONTH, mes - 1);
	    cal.set(Calendar.YEAR, ano);    
	    entrega = cal.getTime();
	    
	}

	@When("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrasarEmDias(int arg1, String tempo) throws Throwable {
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(entrega);
	    
	    if(tempo.equals("dias")) {
	    	cal.add(Calendar.DAY_OF_MONTH, arg1);
	    }
	    if(tempo.equals("meses")) {
	    	cal.add(Calendar.MONTH, arg1);
	    }
	    entrega = cal.getTime();
	}

	@Then("^a entrega sera efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeraEfetuadaEm(String data) throws Throwable {
	    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	    String dataFormatada = format.format(entrega);
	    System.out.println("####################"+dataFormatada);
	    
	    //Assert.assertEquals(data, dataFormatada);
	}
	
	
	
	

@Given("^que o ticket e A.(\\d+)$")
public void queOTicketAF(int arg1) throws Throwable {
    
}

@Given("^que o valor da passagem e R\\$ (\\d+),(\\d+)$")
public void queOValorDaPassagemR$(int arg1, int arg2) throws Throwable {
    
}

@Given("^que o nome do passageiro e \"(.*)\"$")
public void queONomeDoPassageiro(String arg1) throws Throwable {
    
}

@Given("^que o telefone do passageiro  (\\d+)-(\\d+)$")
public void queOTelefoneDoPassageiro(int arg1, int arg2) throws Throwable {
   
}

@When("^criar os steps$")
public void criarOsSteps() throws Throwable {
   
}

@Then("^o teste vai funcionar$")
public void oTesteVaiFuncionar() throws Throwable {
    
}


	
	
}
