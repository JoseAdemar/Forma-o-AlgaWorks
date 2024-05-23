package aula01_exemplo_sem_lambda.com.algaworks.crm;

public interface Filtro<T> {
    boolean avaliar(T objeto);
}
