/*
 * Faça  uma  classe  executávelque  dados  a  quantidade  de  DVDsque  uma  vídeo  locadora  possui  
 * e  o  valor  que  ela  cobra  por  cada  aluguel, informe:
 * 
 * a.Sabendo  que  um  terço dos  DVDssão  alugadas  por  mês,  o  seu faturamento anual.
 * 
 * b.Sabendo que quando o cliente atrasa a entrega, é cobrada uma multa de 10%  sobre  o  valor  do  aluguel  
 * e  que  um  décimo das  fitas  alugadas  no mês são devolvidas com atraso, o valor ganho com multas por mês.
 * 
 * c.Formate  a  saída  para  aparecer  com  duas  casas  decimais  e  (R$)  na frente.
 */
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Locadora {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt","BR");

        System.out.println("Qual a quantidade de DVDs?");
        Scanner s = new Scanner(System.in);
        float quant = s.nextFloat();
        System.out.println("Qual o valor de cada aluguel?");
        float valor = s.nextFloat();
        /*
         * Cálculo do faturamento
         */
        float quantmes = quant/3;
        float quantano = quantmes * 12;
        float faturamento = quantano * valor;
        /*
         * Cálculo do faturamento das multas
         */
        float quantatraso = quantmes/10;
        float multa = (valor * 10)/100;
        float total = multa * quantatraso;

        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR); 
        System.out.println("Faturamento anual: "+ dinheiro.format(faturamento));
        System.out.println("Faturamento mensal das multas: "+ dinheiro.format(total));
}
}
