import javax.swing.JOptionPane;

public class Expoente {
   public static void main (String [] args){
      int base = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero para ser elevado ao quadrado"));
      double numElevado = Math.pow(base, 2);
      
      JOptionPane.showMessageDialog(null, "Seu número ao quadrado é igual a " + numElevado);      
   }
}