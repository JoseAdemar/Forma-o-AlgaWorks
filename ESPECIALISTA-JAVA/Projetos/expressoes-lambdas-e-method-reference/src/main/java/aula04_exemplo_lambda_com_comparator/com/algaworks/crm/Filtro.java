package aula04_exemplo_lambda_com_comparator.com.algaworks.crm;

@FunctionalInterface
public interface Filtro<T> {

    boolean avaliar(T objeto);

}
