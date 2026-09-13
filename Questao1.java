import java.util.Locale;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        final double VAZAO_POR_HORA = 1000.0; // Litros por hora

        System.out.print("Informe a capacidade do tanque (em litros): ");
        double capacidadeLitros = scanner.nextDouble();

        // Cálculo do tempo total em horas
        double tempoHorasDecimal = capacidadeLitros / VAZAO_POR_HORA;

        // Separação em parte inteira (horas) e conversão do resto para minutos
        int horas = (int) tempoHorasDecimal;
        int minutos = (int) Math.round((tempoHorasDecimal - horas) * 60);

        System.out.printf("Tempo necessário: %d:%02d horas%n", horas, minutos);

        scanner.close();
    }
}
