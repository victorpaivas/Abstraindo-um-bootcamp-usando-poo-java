package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

   private String nome;
   private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
   private Set<Conteudo> conteudosConcluido = new LinkedHashSet<>();

   public void inscreverBootcamp(Bootcamp bootcamp) {

       this.conteudosConcluido.addAll(bootcamp.getConteudos());
       bootcamp.getDevsIncristos().add(this);
   }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscrito.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluido.add(conteudo.get());
            this.conteudosInscrito.remove(conteudo.get());
        } else {
            System.err.println("Você não está incristo em nenhum conteúdo");
        }
    }

    public double calcularTotalXP() {
       return this.conteudosConcluido   //utilizando Stream API e Method Reference
               .stream()
               .mapToDouble(Conteudo::calcularXP).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscrito() {
        return conteudosInscrito;
    }

    public void setConteudosInscrito(Set<Conteudo> conteudosInscrito) {
        this.conteudosInscrito = conteudosInscrito;
    }

    public Set<Conteudo> getConteudosConcluido() {
        return conteudosConcluido;
    }

    public void setConteudosConcluido(Set<Conteudo> conteudosConcluido) {
        this.conteudosConcluido = conteudosConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscrito, dev.conteudosInscrito) && Objects.equals(conteudosConcluido, dev.conteudosConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscrito, conteudosConcluido);
    }
}
