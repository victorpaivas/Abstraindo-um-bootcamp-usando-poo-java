package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {


    LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "\n Mentoria" +
                "\n titulo: " + getTitulo() +
                "\n descricao: " + getDescricao() +
                "\n data: " + data.format(formatter);
    }


}
