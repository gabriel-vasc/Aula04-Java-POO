/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author gabri
 */
public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    //Contruct ----------------------------------------------------------------<
    public Caneta() {
        this.tampar();
        this.setCor("Azul");       
    }
    
    public Caneta(String m, String c, float p) {
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }
    
    //Getters e Setters -------------------------------------------------------<
    public String  getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;        
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public String getCor() {
        return this.cor;        
    }
    public void setCor(String c) {
        this.cor = c;
    }
    public boolean isTampada() {
        return this.tampada;
    }
    public void setTampada(Boolean t){
        this.tampada = t;
    }
    
    //Tampar e Destampar ------------------------------------------------------<
    public void tampar() {
        
        this.setTampada(true);
        
    }
    
    public void destampar() {
        
        this.setTampada(false);
        
    }
    
    
    //Status ------------------------------------------------------------------<
    public void status() {
        
        System.out.println(""
                + "\nSobre a Caneta:"
                + "\nModelo: " + this.getModelo()
                + "\nPonta: " + this.getPonta()
                + "\nCor: " + this.getCor()
                + "\nTampada: " + ((this.isTampada()) ? "Sim" : "Não")  
        );
        
    }
    
}
