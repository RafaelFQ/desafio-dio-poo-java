
import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
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
        bootcamp.setNome("Bootcamp Java com Spring");
        bootcamp.setDescricao("Descrição Bootcamp Java com Spring");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Camila");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devRafael.getConteudosInscritos());
        devRafael.progredir();
        devRafael.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devRafael.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devRafael.getConteudosConcluidos());
        System.out.println("XP:" + devRafael.calcularTotalXp());

        System.out.println("-------");

        Dev devTina = new Dev();
        devTina.setNome("Joao");
        devTina.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devTina.getConteudosInscritos());
        devTina.progredir();
        devTina.progredir();
        devTina.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devTina.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devTina.getConteudosConcluidos());
        System.out.println("XP:" + devTina.calcularTotalXp());

    }

}
