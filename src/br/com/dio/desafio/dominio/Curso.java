package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHorario;

    @Override
    public double calcularXP() {
        return 0;
    }


    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    @Override
    public String toString() {
        return "\n Curso" +
                "\n titulo: " + getTitulo() +
                "\n descricao: " + getDescricao() +
                "\n cargaHorario: " + cargaHorario;
    }


}
