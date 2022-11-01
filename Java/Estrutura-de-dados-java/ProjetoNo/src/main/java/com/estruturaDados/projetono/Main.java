package com.estruturaDados.projetono;

public class Main {
    
    public static void main(String[] args){
        
        No no1 = new No("conteudo do no 1");
        
        No no2 = new No ("Conteudo do no 2");
        no1.setProximoNo(no2);

        No no3 = new No ("Conteudo do no 3");
        no2.setProximoNo(no3);
        
        No no4 = new No ("Conteudo do no 4");
        no3.setProximoNo(no4);
        
        //no1->no2->no3->no4
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getConteudo());
        
        
    }
    
}
