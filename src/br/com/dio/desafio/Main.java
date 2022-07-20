package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java.");
        curso1.setDescricao("Descrição curso de java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS.");
        curso2.setDescricao("Descrição curso de js.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java.");
        mentoria.setDescricao("Descrição mentoria java.");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-----");
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("*******************************************************");

        Dev devCinthia = new Dev();
        devCinthia.setNome("Cinthia");
        devCinthia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Cinthia: " + devCinthia.getConteudosInscritos());
        devCinthia.progredir();
        devCinthia.progredir();
        devCinthia.progredir();
        System.out.println("-----");
        System.out.println("Conteúdos inscritos Cinthia: " + devCinthia.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Cinthia: " + devCinthia.getConteudosConcluidos());
        System.out.println("XP: " + devCinthia.calcularTotalXp());

        System.out.println("*******************************************************");

        Dev devLucas = new Dev();
        devCamila.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Lucas: " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        System.out.println("-----");
        System.out.println("Conteúdos inscritos Lucas: " + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Lucas: " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());
    }
}
