package application;

import javax.swing.*;
import java.text.ParseException;


public class Program {

    public static void main(String[] args) throws ParseException {
        String dataAniversario = JOptionPane.showInputDialog(null, "Digite a data aaniversário:");
        String dataHoje = JOptionPane.showInputDialog(null, "Digite a data atual:");

        Integer dataHojeConvertida = transformaStringEmInteiro(dataHoje);
        Integer dataAniversarioConvertida = transformaStringEmInteiro(dataAniversario);

        Integer resultadoExibir = calcularIdade(dataHojeConvertida, dataAniversarioConvertida);
        JOptionPane.showInputDialog(null, resultadoExibir);
    }

    public static Integer calcularIdade(Integer dataHoje, Integer dataAniversario) {
        Integer dataResultado = dataHoje - dataAniversario;
        return dataResultado;
    }

    public static Integer transformaStringEmInteiro(final String stringData) {
        Integer retorno = 0;
        String anoData  = stringData.substring(6,10);
        retorno = Integer.valueOf(anoData);
        return retorno;
    }
}
