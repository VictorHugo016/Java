package exe0;

import javax.management.modelmbean.ModelMBeanOperationInfo;

public class Carro {
    private String marca, modelo;
    private int ano;
    private float velocidade;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMarca(String marca){
        this.marca = marca  ;
    }

    public void setAno(int ano){
        if (ano >=0){
            this.ano = ano;
        }
        else{
            System.out.println("O ano deve ser maior que 0");
        }
    }

    public int getAno(){
        return this.ano;
    }

    public void setVelocidade(float velocidade) {
        if(velocidade >= 0) {
            this.velocidade = velocidade;
        }
        else{
            System.out.println("O velocidade deve ser maior que 0");
        }
    }

    public Carro(){
        this.marca = "Sem marca";
        this.modelo = "sem modelo";
    }

    public Carro(String marca, String modelo, int ano, float velocidade) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setVelocidade(velocidade);
    }
    public void acelerar(float x){
        if (this.velocidade >= 0) {
            this.velocidade += x;
        }
    }
    public void frear(float x){
        if (this.velocidade >= 0) {
            this.velocidade -= x;
        }
        else
            System.out.println("O velocidade deve ser maior que 0");
    }

    public String exibeDetalhes(){
        return ("marca: " + this.marca + "\nmodelo: " + this.modelo
        + "\nano: " + this.ano
        + "\nvelocidade: " + this.velocidade);
    }
    private void limita150(){
        if (this.velocidade >= 150) {
            this.velocidade = 150;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getVelocidade() {
        return velocidade;
    }
}

