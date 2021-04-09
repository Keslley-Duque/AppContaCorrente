import javax.swing.JOptionPane;

public class principal {
    public static void main(String[] args) throws Exception {

        ContaCorrente conta = null;

        String menu = "";

        String[] opcoes = { "Criar Conta", "Visualizar informações da Conta", "Realizar Saque", "Realizar Deposito",
                "Sair" };

        while (!menu.equals("Sair")) {

            menu = (String) JOptionPane.showInputDialog(null, "Selecione a operaçao desejada", "Cadastro", 3, null,
                    opcoes, opcoes[0]);
            switch (menu) {

            case "Criar Conta":

                String nomeDoTitular = JOptionPane.showInputDialog(null, "Informe o nome: ");
                String numeroDaConta = JOptionPane.showInputDialog("Informe o numero da conta: ");
                JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
                conta = new ContaCorrente(nomeDoTitular, numeroDaConta);
                break;

            case "Visualizar informações da Conta":
                if (conta == null) {
                    JOptionPane.showMessageDialog(null, "Cadastre uma conta primeiramente");

                } else {
                    JOptionPane.showMessageDialog(null, conta.dados(), "Dados do cliente" + conta.getNomeDoTitular(),
                            1);
                }
                break;

            case "Realizar Saque":
                if (conta == null) {
                    JOptionPane.showMessageDialog(null, "Cadastre uma conta primeiramente");
                } else {
                    double valor = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Informe o valor a ser sacado: ", "Realizando Saque" + conta.getNomeDoTitular(), 1));
                    if (conta.saque(valor)) {
                        JOptionPane.showMessageDialog(null, "Valor sacado: " + valor);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Saldo insuficiente para sacar o valor de: " + valor + " Reais");
                    }

                }
                break;
            case "Realizar Deposito":
                if (conta == null) {
                    JOptionPane.showMessageDialog(null, "Cadastre uma conta primeiramente");
                } else {
                    double valor = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Informe o valor a ser depositado: ", "Realizando Deposito" + conta.getNomeDoTitular(), 1));
                    conta.deposito(valor);
                    JOptionPane.showMessageDialog(null, "Valor Depositado: " + valor);
                }
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Finalizando a Aplicação");
        System.exit(0);
    }
}
