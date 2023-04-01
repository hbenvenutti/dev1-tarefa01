package service;

import model.Client;
import notification.EmailNotification;

public class ActivateClientService {
  private EmailNotification notification = new EmailNotification();
  
  // * --- methods -------------------------------------------------------- * //

  public void activate(Client client) {
    String clientName = client.getName();
    String message = String
      .format("Olá %s, seu cadastro foi ativado com sucesso!", clientName);

    client.setActive(true);

    notification.notify(message);
  }

  // ------------------------------------------------------------------------ //

  public void deactivate(Client client) {
    client.setActive(false);
  }
}

