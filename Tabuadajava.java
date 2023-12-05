import javax.swing.*;

class Tabuadajava {

    public static void main(String[] args) {
        int Tabuada;
        char op = 0;
        String msg = "", msgEntrada = "Digite 1 para repetição com for\nDigite 2 para repetição com while\nDigite 3 para repetição com do/while";

        Tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        op = JOptionPane.showInputDialog(null, msgEntrada).charAt(0);

        switch (op) {
            case '1': {
                msg = msg + "Tabuada do " + Tabuada + " pelo for: \n";
                for (int i = 1; i <= 10; i++) {
                    msg = msg + Tabuada + " x " + i + " = " + Tabuada * i + "\n";
                }
                break;
            }

            case '2': {
                msg = msg + "Tabuada do " + Tabuada + " pelo while: \n";
                int i = 1;
                while (i <= 10) {
                    msg = msg + Tabuada + " x " + i + " = " + Tabuada * i + "\n";
                    i++;  // Incremento adicionado
                }
                break;
            }

            case '3': {
                msg = msg + "Tabuada do " + Tabuada + " pelo do/while: \n";
                int i = 1;
                do {
                    msg = msg + Tabuada + " x " + i + " = " + Tabuada * i + "\n";
                    i = i + 1;
                } while (i <= 10);
                break;
            }
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");
        }

        if (op >= '1' && op <= '3') {
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
    }
}
