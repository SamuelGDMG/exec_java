package com.bocalini.lucas.exercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FuncionarioTeste {

    public static void main(String[] args) {

      Funcionario func = new Funcionario();
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o id do funcionario: ");
        func.setIdFunc(Integer.parseInt(sc.nextLine()));
        System.out.println("digite o nome do funcionario: ");
        func.setNomeFunc(sc.nextLine());
        System.out.println("digite o salario do funcionario: ");
        func.setSalario(Integer.parseInt(sc.nextLine()));
        System.out.println("digite a data de contratacao do funcionario: ");
        String hoje = (sc.nextLine());

        DateTimeFormatter formatador =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(hoje, formatador);
        func.setDataContratacao(localDate);

        System.out.println("digite o departamento do funcionario: ");
        func.setDepartamento(sc.nextLine());
        System.out.println("digite o documento do funcionario: ");
        func.setDocumento(sc.nextLine());

        func.atualizarSalario(-51);

        func.atualizarSalario(500);

        func.imprimir();
        func.demiteFuncionario();
        func.imprimir();
      }
}
