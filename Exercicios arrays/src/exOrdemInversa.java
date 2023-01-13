/* 🔹Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa. */

public class exOrdemInversa {
    public static void main(String[] args)  {
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.println("Vetor: ");
        int contador=0;
        while(contador <  (vetor.length)){
            System.out.print(vetor[contador]+" ");
            contador++;
        }  
        
        System.out.println("Vetor: ");
        for(int i= vetor.length -1; i >= 0; i --){
            System.out.print(vetor[i]+" ");
        }
            
     }
}

