package net.maromo;

import java.util.*;

public class Forca {
    private HashMap<String, String> map = new HashMap<>();
    private String palavra;
    private String ajuda;
    private List<Character> letrasJogadas = new ArrayList<>();
    private char[] certas;

    public Forca(){
        //Iniciar o sorteio da palavra
        formarDicionario();
        //Sortear  palavra
        sortearPalavra();
        //fazer um desenho da posicao da palavra
        desenharInicio();
    }

    public void formarDicionario(){

        map.put("GATO", "ANIMAL DOMESTICO");
        map.put("CACHORRO", "ANIMAL DOMESTICO");
        map.put("CALOPSITA", "ANIMAL DOMESTICO");
        map.put("CAMA", "MÓVEL");
        map.put("TELEVISAO", "ELETRODOMÉSTICO");
        map.put("CELULAR", "USA-SE PARA PASSAR ZAP");
        map.put("ROTEADOR", "APARELHO DE REDE DE COPUTADORES");
        map.put("BOLA", "MATERIAL ESPORTIVO");
        map.put("SANTOS", "TIME DE FUTEBOL");
        map.put("FATEC", "ESCOLA SUPERIOR");
        map.put("ETEC", "ESCOLA DE ENSINO MEDIO");
        map.put("CHACARA", "LUGAR PARA CHURRASCO");
    }

    public void sortearPalavra(){
        Random r = new Random();
        int posicao = r.nextInt(map.size());
        int i = 0;
        //Estudar 
        for (Map.Entry<String, String> sorteio: map.entrySet()) {
            if(posicao == i){
                palavra = sorteio.getKey();
                ajuda = sorteio.getValue();
            }
            i++;
        }
        certas = new char[palavra.length()];
    }

    public void desenharInicio(){
        for (int i = 0; i < palavra.length(); i++) {
            System.out.print("[ ] ");
        }
    }

    public void jogar(char letra){
        letrasJogadas.add(letra);
        int acertos = 0;
        for(char l : letrasJogadas){
            for(int i=0; i<palavra.length(); i++){
                if(l==palavra.charAt(i)){
                    certas[i] = l;
                    acertos++;
                }
            }
        }
        for (int i = 0; i < palavra.length(); i++) {
            System.out.printf("[%c] ", certas[i]);
        }
        //posso liberar a dica
        if(acertos >= palavra.length()/2){
            System.out.println("Ajuda: " + ajuda);
        }
        if(acertos==palavra.length()){
            System.out.println("Parabéns acabou o Roletrando");
            System.exit(0);
        }

    }
}
