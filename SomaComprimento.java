import javax.swing.JOptionPane;

public class SomaComprimento{
   public static void main (String [] args){
      String palavra1 = JOptionPane.showInputDialog("Digite uma palavra");
      
      int comprimento = palavra1.length();
      JOptionPane.showMessageDialog(null, "O comprimento da sua String é " + comprimento);
   }
}