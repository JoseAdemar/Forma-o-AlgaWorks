import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Turma {
    String identificacao;
    String professora;
    ArrayList<Aluno> alunos = new ArrayList<>();





    void adicionarAlunoAoArray(Aluno aluno){
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno);
        /*this.alunos = Arrays.copyOf(this.alunos, this.alunos.length + 1);
        alunos[alunos.length - 1] = aluno;*/
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
                ", alunos=" + Arrays.toString(alunos.toArray()) +
                '}';
    }
}
