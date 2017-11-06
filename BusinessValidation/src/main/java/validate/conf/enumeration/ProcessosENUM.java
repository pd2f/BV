package validate.conf.enumeration;
/**
 * Classe ENUM utilizada para identificar os sistemas que estão pré-determinados
 * e submetidos as condições de validação estabelecidas pelos requisitos do negócio.
 * 
 * @category Validação (Validar Produto ou Componente de Produto)
 * 
 * @author pfranco
 * 
 * @since 1.0
 */
public enum ProcessosENUM {
/**
 * Constante ENUM que provê informações necessárias para providências programáticas do sistema ou subsistema a serem validados.
 */
	TESTE(101, "Utilizado para testes do software", 0L);

	private final Integer processos;
	private final String descricao;
	private final Long tipo;

	ProcessosENUM(Integer processo, String desc, Long tipo) {
		this.processos = processo;
		this.descricao = desc;
		this.tipo = tipo;
	}
/**
 * Retorna o identificador do processo
 * @return {@link Integer} testes
 */
	public Integer getIdentificador() {
		return this.processos;
	}
/**
 * Retorna a descrição do processo
 * @author pfranco 
 * @return {@link String} <b>descrição</b>
 */
	public String getDescricao() {
		return this.descricao;
	}

	/**
	 * Retorna o tipo de processo ao qual o componente
	 * está relacionando, como por exemplo: <b>batch</b>, <b> online</b>, <b> assincrono</b> e outros.
	 * @return {@link Long} tipo
	 */
	public Long getTipo() {
		return this.tipo;

	}
}
