package br.com.tecnoestrutura.b2v.connection;

/**
 * Classe de interface de conexão para promover alta escalabilidade
 * As conexões necessárias para a aplicação devem implementar essa interface.
 * 
 * @author pfranco
 * 
 * @param <T>
*/
interface B2VConnectionProduct<T> {

	T getConnection();

	void setConnection(T conn);
	
	T getSession();
	
	void setSession(T sess);

}