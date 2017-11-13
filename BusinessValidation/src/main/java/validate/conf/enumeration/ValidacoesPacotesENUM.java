package validate.conf.enumeration;

public enum ValidacoesPacotesENUM {

	TESTE("validate.service.impl.teste"),
	OUTRO_TESTE("validate.business.impl.teste");
	private String nomepacote;
	
	ValidacoesPacotesENUM(String nomepacote){
		this.nomepacote = nomepacote;
	}
	
	public String getNomePacote()
	{
		return this.nomepacote;
	}
}
