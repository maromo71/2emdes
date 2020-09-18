package net.maromo;

import java.util.*;

public class Forca {
    private HashMap<String, String> map = new HashMap<>();
    private String palavra;
    private String ajuda;
    private int acertos = 0;
    private List<Character> letrasJogadas = new ArrayList<>();
    private char[] certas;

    public Forca(){
        alimentarDicionario();
        //sortear a palavra.
        Random r = new Random();
        int x = r.nextInt(map.size());
        int i = 0;
        for (Map.Entry<String, String> e : map.entrySet()){
            if(i==x){
                palavra = e.getKey();
                ajuda = e.getValue();
            }
            i++;
        }
        certas = new char[palavra.length()];
        for (int col = 0; col < palavra.length(); col++) {
            System.out.print("[ ]");
        }
    }

    private void alimentarDicionario() {
        map.put("GELADEIRA", "ELETRODOMÉSTICO");
        map.put("TELEVISAO", "ELETRODOMÉSTICO");
        map.put("CAMA","MÓVEL DE CASA" );
        map.put("COMPUTADOR", "EQUIPAMENTE ELETRÔNICO PARA TRABALHO");
        map.put("PRIMAVERA", "ESTAÇÃO DO ANO");
        map.put("RATOEIRA", "PARA PEGAR ANIMAL ROEDOR");
        map.put("GATO", "ANIMAL DE ESTIMAÇÃO");
        map.put("USURPADORA", "PESSOA QUE PEGA O QUE NÃO LHE PERTENCE");
        map.put("JURURU", "DIZ-SE DA PESSOA QUE ESTÁ TRISTE");
        map.put("MARINGA", "CIDADE DO PARANÁ");
        map.put("SAO PAULO", "ESTADO DO BRASIL");
        map.put("ITAPIRA","CIDADE DO INTERIOR DE SAO PAULO" );
    }

    public void jogar(char letra){
        letrasJogadas.add(letra);
        acertos = 0;
        for (char l: letrasJogadas) {
            for (int i = 0; i < palavra.length(); i++) {
                if(l==palavra.charAt(i)){
                    acertos++;
                    certas[i] = l;
                }
            }
        }
        for(int i=0; i<palavra.length(); i++){
            System.out.printf("[%c] ", certas[i]);
        }
        if(acertos >= palavra.length() / 2){
            System.out.println("Ajuda: " + ajuda);
        }
        if(acertos==palavra.length()){
            System.out.println("parabéns, você ganhou");
            System.exit(0);
        }


    }

}
