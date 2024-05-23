package aula03_exemplo_com_lambda_mais_simplificado.algaworks.com.crm;

@FunctionalInterface
public interface Filtro<T> {

    boolean avaliar(T objeto);

}
