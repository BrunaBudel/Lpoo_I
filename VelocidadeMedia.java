
/*
Faça uma classe executável que dados a distância percorrida (em Km)  e  o  tempo 
gasto  em  uma  viagem  (em  horas),  informe  a  velocidade média do carro, sabendo 
que Velocidade = DeltaS / DeltaT (variação de distância / variação do tempo). 
Imprima o valor com duas casas decimais.
*/

import java.util.Scanner;

public class VelocidadeMedia {
	public static void main(String[] args) {

		System.out.println("Insira a disância percorrida em Km:");
		Scanner s = new Scanner(System.in);
		float dist = s.nextFloat();
		System.out.println("Insira o tempo gasto em horas: ");
		float tempo = s.nextFloat();

		float deltas = dist * 1000;
		float deltat = tempo * 3600;
		float velocidade = deltas / deltat;
		System.out.printf("Velocidade média: %.2f", velocidade);
	}
}
