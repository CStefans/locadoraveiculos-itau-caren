import br.com.ada.itau950.locadora.entidades.Locacao;
import br.com.ada.itau950.locadora.entidades.Veiculo;
import br.com.ada.itau950.locadora.exceptions.ValidacaoException;
import br.com.ada.itau950.locadora.service.LocacaoService;
import br.com.ada.itau950.locadora.service.VeiculoService;

import java.util.Map;
import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        new Main().start();

    }

    private void start() {

        VeiculoService veiculoService = new VeiculoService();
        LocacaoService locacaoService = new LocacaoService();

        System.out.println("Bem vindo - Locadora de Veiculos");

        //solicitar dados do cliente PF/PJ, endereco

        Map<String, Veiculo> veiculosMap = veiculoService.recuperarVeiculoArquivo();

        System.out.println("Veiculos disponiveis:");

        //listar veiculos

        System.out.println("Digite a placa do veiculo:");
        String placa = scanner.next();

        System.out.println("Data locaçao:");
        String dataLocacao = scanner.next();

        System.out.println("Data devoluçao:");
        String dataDevolucao = scanner.next();

        Locacao locacao = new Locacao();

        //1 - calcular o valor da locacao
        //2 - pedir para o cliente confirmar, se sim finalizar a locacao

        try {
            locacaoService.salvarLocacao(locacao);
        } catch (ValidacaoException e) {
            e.printStackTrace();
        }

    }

}
