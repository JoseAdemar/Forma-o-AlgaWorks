package aula02_exemplo_com_lambda.com.algaworks.crm;

@FunctionalInterface
public interface Filtro<T> {

    boolean avaliar(T objeto);
}
