import javax.swing.*;
public class TablaM {
    

   public static void main(String[]args){
      int x;
      String numero;
      numero=JOptionPane.showInputDialog("Cual multiplicacion deseas");
      x=Integer.parseInt(numero);
      JOptionPane.showMessageDialog(null,Multi(10,x));
   }
   public static String Multi(int a,int k){
      if(a==1){
         return k+" x "+1+" = "+k+"\n";
      }else{
         int b;
         b=a;
         return Multi(a-1,k)+k+" x "+b+" = "+(k*b)+"\n";
      }
   }
}