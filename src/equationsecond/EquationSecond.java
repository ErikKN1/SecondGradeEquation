/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package equationsecond;

import java.util.Scanner;

/**
 *
 * @author erik.hernandez
 */
public class EquationSecond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        double Discriminante, resultP,resultN;
        Scanner InDate=new Scanner(System.in);
        System.out.println("Enter value a ");
        a=InDate.nextInt();
        System.out.println("Enter value b ");
        b=InDate.nextInt();
        System.out.println("Enter value c ");
        c=InDate.nextInt();
        if(a==0){
            System.out.println("No es posible realizar la operacion ya que el valor de a "+ a + " es 0");
        }else{
            Discriminante=((Math.pow(b,2))-((4*a)*c));
            //x=Math.pow(b, 2);
            System.out.println(Discriminante);
            if(Discriminante<0){
                System.out.println("No es posible realizar la operacion, con raices negativas");
            }
            else{
                resultN= ((-b-Math.sqrt(Discriminante)))/(2*a);
                resultP= ((-b+Math.sqrt(Discriminante)))/(2*a);   
                System.out.println("Los resultados son: Raiz negativa " +resultN);
                System.out.println("Los resultados son: Raiz positiva " +resultP);
            }
            
        }
        
        

    }
    
}
