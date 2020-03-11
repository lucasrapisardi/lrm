import javax.swing.JOptionPane;

public class AnosEmDias{
   public static void main (String [] args){
   
   int anos = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
   int calculaDias = anos * 365;
    
   JOptionPane.showMessageDialog(null, "Você viveu um total de " + calculaDias + " dias");
   
   }
}