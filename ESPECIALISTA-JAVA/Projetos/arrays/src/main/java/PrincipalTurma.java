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

        turmaB.alunos = new Aluno[2];

        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].nome = "João";
        turmaB.alunos[0].idade = 6;

        turmaB.alunos[1] = new Aluno();
        turmaB.alunos[1].nome = "Luisa";
        turmaB.alunos[1].idade = 7;

        turmaB.adicionarAlunoAoArray(aluno1);
        turmaB.adicionarAlunoAoArray(aluno2);

        turmaB.imprimirAluno();

        //System.out.println(turmaB.toString());

    }
}
