package models;

public class Disciplina {
    private String nomeDis;
    private int cargaHor;
    private Professor professor;

    public Disciplina(String nomeDis, int cargaHor, Professor professor) {
        this.nomeDis = nomeDis;
        this.cargaHor = cargaHor;
        this.professor = professor;
    }

    public String getNomeDis() {
        return nomeDis;
    }

    public int getCargaHor() {
        return cargaHor;
    }

    public Professor getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "Disciplina='" + nomeDis + '\'' +
                ", cargo horaria=" + cargaHor +
                ", professor =" + professor +
                '}';
    }
}
