package br.com.fiap.bean;

public class VigiaNoturno implements Funcionario{
    private String nome;
    private float valorHoraTrabalho;
    private float adicionalNoturno;

    public VigiaNoturno(){
    }
    public VigiaNoturno(String nome, Float valorHoraTrabalho, Float adicionalNoturno) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.adicionalNoturno = adicionalNoturno;
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
    public void setValorHoraTrabalho(Float valorHoraTrabalho) {
        this.valorHoraTrabalho = valorHoraTrabalho;
    }
    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }
    public void setAdicionalNoturno(Float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    /**
     * classe calcular salario vem da interface funcionario, onde ela faz os calculaos baseados em sua devida classe
     * @return
     */
    public float calcularSalario(){
        return ((valorHoraTrabalho * 40) * 4 + adicionalNoturno);
    };
}
