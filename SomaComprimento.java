import javax.swing.JOptionPane;

public class SomaComprimento{
   public static void main (String [] args){
      String palavra1 = JOptionPane.showInputDialog("Digite uma palavra");
      String palavra2 = JOptionPane.showInputDialog("Digite uma palavra");
      String palavra3 = JOptionPane.showInputDialog("Digite uma palavra");
      String palavra4 = JOptionPane.showInputDialog("Digite uma palavra");
      
      int somaComprimento = palavra1.length() + palavra2.length() + palavra3.length() + palavra4.length();
      
      JOptionPane.showMessageDialog(null, "O comprimento da sua String é " + somaComprimento);
   }
}