import java.util.Random;

/* 🔹Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. Ao final, mostre os números e seus sucessores. */
public class exNumerosAleatorios {
  public static void main(String[] args) {
    Random random = new Random();
    int[] numerosAleatorios= new int [20];

    for(int i = 0; i < numerosAleatorios.length; i++){
      int numero = random.nextInt(100);
      numerosAleatorios[i]= numero;

    }
    System.out.println("Numeros Aleatorios: ");
    for (int numero : numerosAleatorios) {
      System.out.println(numero + " ");
    }
    System.out.println("\n Sucessores dos Numero aleatorios: ");
    for (int numero : numerosAleatorios) {
      System.out.println((numero+1) + " ");
    }

  }
}
