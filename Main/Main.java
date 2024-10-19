import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class Main {
    private double num;
    private String opc;
    public static void main(String[] args) {
        new Main().Calc();

    }
    public void Calc(){
        JFrame janela = new JFrame("Calculadora");
        janela.setPreferredSize(new Dimension(350, 600));
        janela.setSize(350, 600);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        JPanel display = new JPanel();
        //display.setSize(330,60);

        display.setLayout(new FlowLayout());

        JTextField visor = new JTextField(20);
        visor.setFont(new Font("Arial", Font.PLAIN, 20));
        janela.setPreferredSize(new Dimension(300, 50));
        // visor.setSize(300,50);
        display.add(visor);
        janela.getContentPane().add(display, BorderLayout.NORTH);

        JPanel botoes = new JPanel();
        //botoes.setSize(330,50);
        janela.setPreferredSize(new Dimension(330, 60));
        botoes.setLayout(new GridLayout(5, 4));
        JButton botao[][] = new JButton[5][4];


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                botao[i][j] = new JButton(i + "" + j);
                botao[i][j].setFont(new Font("Arial", Font.PLAIN, 20));
                botao[i][j].setSize(82, 102);
                botoes.add(botao[i][j]);


            }
        }
        janela.getContentPane().add(botoes, BorderLayout.CENTER);
        botao[0][0].setText("÷");
        botao[0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num=Double.parseDouble(visor.getText());
                opc="/";
                visor.setText("");

            }
        });
        botao[0][1].setText("CE");
        botao[0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visor.setText("");
            }
        });
        botao[0][2].setText("C");
        botao[0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visor.setText("");
            }
        });

        botao[0][3].setText("<X");
        botao[0][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = visor.getText();
                texto = texto.substring(0, texto.length() - 1);
                visor.setText(texto);
                if (visor.getText().equals("")) {
                    visor.setText("0");
                }
            }
        });
        botao[1][0].setText("7");
        botao[1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                visor.setText(temp + "7");
            }
        });
        botao[1][1].setText("8");
        botao[1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                visor.setText(temp + "8");
            }
        });
        botao[1][2].setText("9");
        botao[1][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                visor.setText(temp + "9");
            }}
        );
        botao[1][3].setText("*");
        botao[1][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(visor.getText());
                opc= "*";
                visor.setText("");
            }}
        );

        botao[2][0].setText("4");
        botao[2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                visor.setText(temp + "4");
            }}
        );

        botao[2][1].setText("5");
        botao[2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                visor.setText(temp + "5");
            }}
        );
        botao[2][2].setText("6");
        botao[2][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                visor.setText(temp + "6");
            }}
        );
        botao[2][3].setText("-");
        botao[2][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(visor.getText());
                opc= "-";
                visor.setText("");
            }
        });
        botao[3][0].setText("1");
        botao[3][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                visor.setText(temp + "1");
            }}
        );
        botao[3][1].setText("2");
        botao[3][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                visor.setText(temp + "2");
            }}
        );
        botao[3][2].setText("3");
        botao[3][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                visor.setText(temp + "3");
            }}
        );
        botao[3][3].setText("+");
        botao[3][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num=Double.parseDouble(visor.getText());
                opc="+";
                visor.setText("");
            }}
        );
        botao[4][0].setText("%");
        botao[4][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num=Double.parseDouble(visor.getText());
                opc="%";
                visor.setText("");
            }}
        );

        botao[4][1].setText("0");
        botao[4][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                visor.setText(temp + "0");
            }}
        );
        botao[4][2].setText(",");
        botao[4][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (visor.getText().contains(".")){
                }
                else{
                    String temp = visor.getText();
                    visor.setText(temp + ".");
                }
            }
        });
        botao[4][3].setText("=");
        botao[4][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n2 = Double.parseDouble(visor.getText());
                double res = 0;
                switch (opc) {
                    case "/":
                        if (n2 != 0) {
                            res = num / n2;
                        } else {
                            visor.setText("Error");
                            return;
                        }
                        break;
                    case "*":
                        res = num* n2;
                        break;
                    case "-":
                        res = num - n2;
                        break;
                    case "+":
                        res = num + n2;
                        break;
                    case "%":
                        res = num * n2/100;
                        break;
                }
                visor.setText(String.valueOf(res));
            }
        });


    }

}