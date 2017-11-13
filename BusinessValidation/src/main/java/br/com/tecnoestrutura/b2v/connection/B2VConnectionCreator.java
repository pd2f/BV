package br.com.tecnoestrutura.b2v.connection;

/**
 * Classe abstrata que provome o design FactoryMethod a fim de promover alta
 * escalabilidade da aplicação.
 * 
 * @author pfranco
 *
 * @param <T>
 */
abstract class B2VConnectionCreator<T> {

	abstract B2VConnectionProduct<T> factoryMethod();


}
