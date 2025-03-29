import models.*;

public class Main {
    public static void main(String[] args) {

        Escola escola = new Escola("Escola Senai");
        Aluno aluno1 = new Aluno("Carlos Silva", 15, "A123");
        Aluno aluno2 = new Aluno("Mariana Souza", 16, "A456");

        Professor professor1 = new Professor("João Pereira", "Mat");
        Professor professor2 = new Professor("Ana Costa", "Lp");

        Turma turma1 = new Turma("A", 2025, professor1);
        Turma turma2 = new Turma("B", 2025, professor2);

        Disciplina disciplina1 = new Disciplina("mat", 3, professor1);
        Disciplina disciplina2 = new Disciplina("Lp", 3, professor2);

        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        escola.adicionarProfessor(professor1);
        escola.adicionarProfessor(professor2);
        escola.adicionarTurma(turma1);
        escola.adicionarTurma(turma2);
        escola.adicionarDisciplina(disciplina1);
        escola.adicionarDisciplina(disciplina2);

        System.out.println("\n----------------------------\n");
        escola.listarAlunos();
        System.out.println("\n----------------------------\n");
        escola.listarProfessores();
        System.out.println("\n----------------------------\n");
        escola.listarTurmas();
        System.out.println("\n----------------------------\n");
        escola.listarDisciplina();

    }
}