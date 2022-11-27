import br.com.ada.itau950.locadora.entidades.Veiculo;
import br.com.ada.itau950.locadora.service.VeiculoService;

import java.util.Map;
import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        new Main().start();

    }

    private void start() {

        System.out.println("Bem vindo - Locadora de Veiculos");

        //solicitar dados do cliente PF/PJ, endereco

        Map<String, Veiculo> veiculosMap = new VeiculoService().recuperarVeiculoArquivo();

        System.out.println("Veiculos disponiveis:");

        //listar veiculos

        System.out.println("Digite a placa do veiculo:");
        String placa = scanner.next();

        System.out.println("Data locaçao:");
        String dataLocacao = scanner.next();

        System.out.println("Data devoluçao:");
        String dataDevolucao = scanner.next();

        //1 - calcular o valor da locacao
        //2 - pedir para o cliente confirmar, se sim finalizar a locacao

    }

}
