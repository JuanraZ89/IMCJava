import javax.swing.*;
import java.awt.font.NumericShaper;

public class IMCMain {

    public static void main(String[] args) {

        try {


            String Altura = JOptionPane.showInputDialog(null, "Cual es su altura: Ejemplo (1.80) Tiene que ser en metros. ");
            String Peso = JOptionPane.showInputDialog(null, "Cual es su peso: Ejemplo (70)");

            Double AlturaDouble = Double.parseDouble(Altura);
            Double PesoDouble = Double.parseDouble(Peso);

            Double AlturaDoubleCuadrado = Math.pow(AlturaDouble, 2);
            Double IMCUsuario = PesoDouble / AlturaDoubleCuadrado;

            if (18.5 > IMCUsuario){

                JOptionPane.showMessageDialog(null,"Su IMC es de: "+IMCUsuario+" \n Se Encuentra en Bajo Peso." );

            }

            else if (IMCUsuario >= 18.5 && IMCUsuario <= 24.9){

                JOptionPane.showMessageDialog(null,"Su IMC es de: "+IMCUsuario+" \n Se Encuentra en Peso Normal." );


            }

            else if(IMCUsuario >= 25 && IMCUsuario <= 29.9){

                JOptionPane.showMessageDialog(null,"Su IMC es de: "+IMCUsuario+" \n Se Encuentra en SobrePeso." );

            }

            else if(IMCUsuario >= 30){

                JOptionPane.showMessageDialog(null,"Su IMC es de: "+IMCUsuario+" \n Se Encuentra en Peso Obeso." );


            }


        }

        catch (NumberFormatException e ){

            JOptionPane.showMessageDialog(null,"ERROR: Has introducida un valor erroneo. Ejemplo (Letras, Caracteres, Debes Escribir Numeros. ");

        }



    }





}
