package models;

public class Professor {

    private String nomeProfessor;
    private String disciplinaProfessor;

    public Professor(String nomeProfessor, String disciplinaProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.disciplinaProfessor = disciplinaProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getDisciplinaProfessor() {
        return disciplinaProfessor;
    }



    @Override
    public String toString() {
        return "Professor{" +
                "nomeProfessor='" + nomeProfessor + '\'' +
                ", disciplinaProfessor='" + disciplinaProfessor + '\'' +
                '}';
    }
}
