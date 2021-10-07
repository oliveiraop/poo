import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Poupex {
    private JPanel rootPanel;
    private JLabel label1;
    private JTextField jurosEntry;
    private JTextField anosEntry;
    private JTextField depositoMensalEntry;
    private JButton okButton;
    private JLabel labelResult;

    public Poupex() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double juros;
                double anos;
                double depositoMensal;
                double result;
                String transforma;
                transforma = jurosEntry.getText();
                transforma.replaceAll(",", ".");
                transforma.replaceAll("%", "");
                juros = Double.parseDouble(transforma);
                juros = juros/100.0;
                transforma = anosEntry.getText();
                transforma.replaceAll(",", ".");
                transforma.replaceAll("%", "");
                anos = Double.parseDouble(transforma);
                transforma = depositoMensalEntry.getText();
                transforma.replaceAll(",", ".");
                transforma.replaceAll("%", "");
                depositoMensal = Double.parseDouble(transforma);
                result = depositoMensal * (1+juros)*((Math.pow(1+juros, anos*12)-1)/juros);
                labelResult.setText("R$" + String.format("%.2f", result));

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Poupex");
        frame.setContentPane(new Poupex().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
