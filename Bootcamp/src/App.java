import java.time.LocalDate;

import classes.Bootcamp;
import classes.Curso;
import classes.Dev;
import classes.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcmap Java Developer");
        bootcamp.setDescricao("Descroção Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKurianski = new Dev();
        devKurianski.setNome("Pedro");
        devKurianski.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro Kurianski:" + devKurianski.getConteudosInscritos());
        devKurianski.progredir();
        devKurianski.progredir();
        System.out.println("Conteúdos Inscritos Pedro Kurianski:" + devKurianski.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pedro Kurianski:" + devKurianski.getConteudosConcluidos());
        System.out.println("XP:" + devKurianski.calcularTotalXp());

        Dev devAlves = new Dev();
        devAlves.setNome("Henrique");
        devAlves.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Henrique Alves:" + devAlves.getConteudosInscritos());
        devAlves.progredir();
        System.out.println("Conteúdos Inscritos Henrique Alves:" + devAlves.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Henrique Alves:" + devAlves.getConteudosConcluidos());
        System.out.println("XP:" + devAlves.calcularTotalXp());
    }
}
