
package decimatercerasemana;
import java.util.Scanner;

/**
 *
 * @ZUASNABAR PAUCAR MADELEYBI
 */
public class shell {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Ingresa el tamaño del arreglo:    ");
        int n=sc.nextInt();
        int[]arrayEntrada=new int[n];
       for(int i=0;i<n;i++){
        System.out.print("Numero"+(i+1)+":");
        arrayEntrada[i]=sc.nextInt();
        
    }
        shellSort(arrayEntrada);
        
    }
    public static void shellSort(int a[]){
        for(int gap=a.length/2;gap>0;gap=gap==2?1:(int)(gap/2.2)){
        for(int i=gap;i<a.length;i++){
            int tmp=a[1];
            int j;
            for (j=1;j>=gap&&tmp<a[j-gap];j-=gap){
                a[j]=a[j-gap];
            }
            a[j]=tmp;
        }
    }
        for (int i=0;i<a.length;i++){
        System.out.print(a[i]+"     ");
    }
    }
}
