package models;

import java.util.ArrayList;

public class Escola {
    private String nomeEscola;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professors;
    private ArrayList<Turma> turmas;
    private ArrayList<Disciplina> disciplinas;

    public Escola(String nome) {
        this.nomeEscola = nomeEscola;
        this.alunos = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        professors.add(professor);
    }
    public void adicionarTurma(Turma turma){
        turmas.add(turma);

    }
    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);


    }

    public void listarAlunos() {
        System.out.println("lista de alunos");
        System.out.println();
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void listarProfessores() {
        System.out.println("Lista de professor");
        System.out.println();
        for (Professor professor : professors) {
            System.out.println(professor);
        }

    }
    public void listarTurmas() {
        System.out.println("Lista das Turmas");
        System.out.println();
        for (Turma turma: turmas) {
            System.out.println(turma);
        }

    }
    public void listarDisciplina() {
        System.out.println("As disciplinas");
        System.out.println();
        for (Disciplina disciplina: disciplinas) {
            System.out.println(disciplina);
        }

    }

}

