package decimatercerasemana;

import javax.swing.JOptionPane;
public class MetodosDeOrdenamiento {

    private static int i;
    public static void main(String [] args){
        int vector[] = new int[10];
        for(int i=0;i < vector.length;i++){
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+ "º Numero :",0));
        }
        String Cadena ="Numeros Sin Ordernar \n";
        for(int i=0;i < vector.length;i++){
            Cadena = Cadena + vector[i] + "    ";
        }
        Insercion(vector);
        Cadena = Cadena  + "\nNumeros Impares Ordenados De Forma Ascendente";
        for(int i=0;i < vector.length;i++){
            if(vector[i]%2!=0){
                Cadena = Cadena + "\n" +  vector[i] ;
            }
        }
        JOptionPane.showMessageDialog(null,Cadena);

    }
public static void Insercion (int[] vector) {
        int i1 = i;
      for (int i=1; i1 < vector.length; i1++) {
         int aux = vector[i1];
         int j = 0;
         
         vector[j+1] = aux;
      }
   }
}
