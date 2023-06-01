package application;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Program {

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {

        String dataAtual = JOptionPane.showInputDialog(null, "Digite a data atual:");
        String dataNascimento = JOptionPane.showInputDialog(null, "Digite a data de nascimento");

        Date dataAtualFormatada = simpleDateFormat.parse(dataAtual);
        Date dataNascimentoFormatada = simpleDateFormat.parse(dataNascimento);

        String strDatatual = simpleDateFormat.format(dataAtualFormatada);
        String strDataNascimento = simpleDateFormat.format(dataNascimentoFormatada);

        String anoDataAtual = strDatatual.substring(6,10);
        String anoDataNascimento = strDataNascimento.substring(6,10);

        Integer anoResultado = Integer.valueOf(anoDataAtual) - Integer.valueOf(anoDataNascimento);
        JOptionPane.showMessageDialog(null, "Diferença de " + anoResultado + " anos");












    }
}