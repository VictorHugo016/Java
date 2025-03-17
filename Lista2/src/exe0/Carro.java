package exe0;

import javax.management.modelmbean.ModelMBeanOperationInfo;

public class Carro {
    private String marca, modelo;
    private int ano;
    private float velocidade;

    public void setModelo(){
        this.modelo = modelo;
    }
    public void setMarca(){
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

}

