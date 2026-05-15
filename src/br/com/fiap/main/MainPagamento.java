package br.com.fiap.main;

import br.com.fiap.bean.Freelancer;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;
import java.util.Scanner;

public class MainPagamento {
    public static void main(String[] args) {
        do {
            try {
                String nome;
                float valorHoraTrabalho, comissao, adicionalNoturno;
                long CNPJ;
                Scanner scan;
                int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de contrato \n1. Vededor \n2. VIgia Noturno \n3. FreeLancer"));
                switch (opcao) {
                    case 1:
                        nome = JOptionPane.showInputDialog("Insira seu nome seu vendedor pobre burro");
                        valorHoraTrabalho = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da sua hora de trabalho"));
                        adicionalNoturno = Float.parseFloat(JOptionPane.showInputDialog("Qual a comissao paga ao seu cargo"));
                        Vendedor chines = new Vendedor(nome, valorHoraTrabalho, comissao);
                        JOptionPane.showMessageDialog(null, String.format("Nome: %s\nvalor Horas Trabalhadas: %.2f \nComissao: %.2f \n Salario TOTAL: %.2f", chines.getNome(),
                                chines.getValorHoraTrabalho(), chines.getComissao(), chines.calcularSalario()), "informação", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        nome = JOptionPane.showInputDialog("Insira seu nome seu Vigia fudido q vai more");
                        valorHoraTrabalho = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da sua hora de trabalho"));
                        adicionalNoturno = Float.parseFloat(JOptionPane.showInputDialog("Qual o adicional noturno pago ao seu cargo"));
                        VigiaNoturno MichaelAfton = new VigiaNoturno(nome, valorHoraTrabalho, adicionalNoturno);
                        JOptionPane.showMessageDialog(null, String.format("Nome: %s\nvalor Horas Trabalhadas: %.2f \nAdd noturno: %.2f \n Salario TOTAL: %.2f", MichaelAfton.getNome(),
                                MichaelAfton.getValorHoraTrabalho(), MichaelAfton.getAdicionalNoturno(), MichaelAfton.calcularSalario()), "informação", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        nome = JOptionPane.showInputDialog("Insira seu nome FreeLancer safado");
                        valorHoraTrabalho = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da sua hora de trabalho"));
                        CNPJ = Long.parseLong(JOptionPane.showInputDialog("Qual seu CNPJ"));
                        Freelancer CarlosBeterrada = new Freelancer(nome, valorHoraTrabalho, CNPJ);
                        JOptionPane.showMessageDialog(null, String.format("Nome: %s\nvalor Horas Trabalhadas: %.2f \nCNPJ: %d \n Salario TOTAL: %.2f", CarlosBeterrada.getNome(),
                                CarlosBeterrada.getValorHoraTrabalho(), CarlosBeterrada.getCNPJ(), CarlosBeterrada.calcularSalario()), "informação", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        throw new Exception("Opcoes invalidas");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja Continuar o Programa", "Pergunta", JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE) == 0);
    }
}

