import java.util.Arrays;

public class Turma {
    String identificacao;
    String professora;
    Aluno[] alunos = new Aluno[0];





    void adicionarAlunoAoArray(Aluno aluno){
        this.alunos = Arrays.copyOf(this.alunos, this.alunos.length + 1);
        alunos[alunos.length - 1] = aluno;
    }

    public void imprimirAluno() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.printf("Nome: %s Idade: %d anos %n", aluno.nome, aluno.idade);
            }else {
                System.out.println("Vagas para novos alunos.");
            }
        }
    }


    @Override
    public String toString() {
        return "Turma{" +
                "identificacao='" + identificacao + '\'' +
                ", professora='" + professora + '\'' +
                ", alunos=" + Arrays.toString(alunos) +
                '}';
    }
}
