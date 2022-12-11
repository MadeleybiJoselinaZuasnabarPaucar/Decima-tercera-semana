package decimatercerasemana;

import javax.swing.JOptionPane;
public class MetodosDeOrdenamientoJugadores {
public static void main(String [] args){
    int x =Integer.parseInt(JOptionPane.showInputDialog("Ingrese Total De Equipos",0));
    int puntos[]= new int[x];
    String equipos[]= new String[x];
    for(int i =0;i < x;i++){
        equipos[i]= JOptionPane.showInputDialog("Ingrese Nombre De Equipo" );
        puntos[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese Puntos",0));
    }
    Burbuja(puntos,equipos);
    String Cadena = "Equipos Y Sus Puntos \n";
    for(int i =0;i < x;i++){
        Cadena = Cadena + equipos[i] + "     " + puntos[i] + "\n";
    }
    JOptionPane.showMessageDialog(null, Cadena);

}
public static void Burbuja(int[]matrix,String[]equipos){
        int temp;
        String tempe;
        for(int i=1;i < matrix.length;i++){
            for (int j=0 ; j < matrix.length- 1; j++){
                if (matrix[j] < matrix[j+1]){
                    temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j+1] = temp;
                    tempe = equipos[j];
                    equipos[j] = equipos[j+1];
                    equipos[j+1] = tempe;

                }
            }
        }
    }
//a = Inicio ; b = Final
public static void Rapido(int matrix[], int a, int b){
    matrix = new int[matrix.length];
    int buf;
    int from = a;
    int to = b;
    int pivot = matrix[(from+to)/2];
    do{
        while(matrix[from] < pivot){
            from++;
        }
        while(matrix[to] > pivot){
            to--;
        }
        if(from <=to){
            buf = matrix[from];
            matrix[from] = matrix[to];
            matrix[to] = buf;
            from++; to--;
        }
    }
    while(from <=to); 
    if(a < to){
        Rapido(matrix, a, to);
    }
    if(from < b){
        Rapido(matrix, from, b);
    }
}
}

