package br.com.fiap.bean;

import java.awt.geom.RoundRectangle2D;

public class Vendedor implements Funcionario{
    private String nome;
    private float valorHoraTrabalho;
    private float comissao;

    public Vendedor(){
    }
    public Vendedor(String nome, float valorHoraTrabalho, float comissao) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.comissao = comissao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }
    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        this.valorHoraTrabalho = valorHoraTrabalho;
    }
    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    /**
     * classe vem da interface funcionario, ela calcula o salario baseado em sua devida classe
     * @return
     */
    public float calcularSalario(){
        return (((valorHoraTrabalho * 40) * 4) * (1 + comissao/100));
    };
}
