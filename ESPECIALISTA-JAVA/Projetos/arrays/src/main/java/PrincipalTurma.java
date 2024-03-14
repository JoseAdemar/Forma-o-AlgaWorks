import java.util.ArrayList;
import java.util.Arrays;

public class PrincipalTurma {

    public static void main(String[] args) {

        Turma turmaB = new Turma();
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.nome = "Pedro";
        aluno1.idade = 10;

        aluno2.nome = "Carla";
        aluno2.idade = 11;

        turmaB.identificacao = "Maternal-B";
        turmaB.professora = "Tia Maria";

        turmaB.alunos.add(aluno1);
        turmaB.alunos.add(aluno2);

        turmaB.adicionarAlunoAoArray(aluno1);
        turmaB.adicionarAlunoAoArray(aluno2);

        turmaB.imprimirAluno();

        //System.out.println(turmaB.toString());

    }
}
