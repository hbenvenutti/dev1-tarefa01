import java.util.Scanner;

import model.Client;
import service.ActivateClientService;

public class App {
    public static void main(String[] args) throws Exception {
        ActivateClientService activateService = new ActivateClientService();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro:\nNome:\n");
        String name = scanner.nextLine();

        System.out.println("\nE-mail:\n");
        String email = scanner.nextLine();

        System.out.println("\nTelefone:\n");
        String phone = scanner.nextLine();

        Client client = new Client(name, email, phone);

        activateService.activate(client);
    }
}
