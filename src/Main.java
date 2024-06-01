import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;



public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java em POO");
        curso1.setDescricao("avançado de POO usando Java");
        curso1.setCargaHorario(9);

        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript");
        curso2.setDescricao("descrição javascript");
        curso2.setCargaHorario(5);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Java e seus frameworks");
        mentoria1.setData(LocalDate.now());


        System.out.println(mentoria1.toString());


        System.out.println(curso1);
        System.out.println(curso2);

        //TODO POLIMORFISMO, PARTE 2 BOOTCAMP DIO SANTANDER
    }
}
