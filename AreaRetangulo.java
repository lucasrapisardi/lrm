import javax.swing.JOptionPane;

public class AreaRetangulo {
   public static void main (String [] args){
      double base = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a base do ret�ngulo"));
      double altura = Double.parseDouble(JOptionPane.showInputDialog("Agora digite um valor para altura do ret�ngulo"));
      double areaRetangulo = base * altura;
      
      JOptionPane.showMessageDialog (null, "A area do seu ret�ngulo � de " + areaRetangulo + "cm�");
      
      
   }
}