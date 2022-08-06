/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialpr;
import java.util.Scanner;


/**
 *
 * @author regaz
 */
public class menuu {
    private static String[][] ventas=new String[5][11];
    
    
    private static void Datos(){
        ventas[0][0]="Rodrigo Garcia";
        ventas[0][1]="350";
        ventas[0][2]="600";
        ventas[0][3]="300";
        ventas[0][4]="200";
        
        ventas[1][0]="Luisa Paz";
        ventas[1][1]="100";
        ventas[1][2]="180";
        ventas[1][3]="500";
        ventas[1][4]="300";
        
        ventas[2][0]="Oldy Monzon";
        ventas[2][1]="800";
        ventas[2][2]="550";
        ventas[2][3]="630";
        ventas[2][4]="400";
        
        ventas[3][0]="Jose Morales";
        ventas[3][1]="400";
        ventas[3][2]="550";
        ventas[3][3]="2000";
        ventas[3][4]="300";
        
        ventas[4][0]="Marian Montez";
        ventas[4][1]="880";
        ventas[4][2]="200";
        ventas[4][3]="550";
        ventas[4][4]="300";
        
        
    }
    
    public static void DatMatri(){
        for(int i=0;i<5;i++){
            Datos();
        }
    }
    
    
    public static void Ejercicios(){
        int totven, totvenpor;
        for(int i=0;i<ventas.length;i++){
            totven=Integer.valueOf(ventas[i][1]);
            totven=totven+Integer.valueOf(ventas[i][2]);
            totven=totven+Integer.valueOf(ventas[i][3]);
            totven=totven+Integer.valueOf(ventas[i][4]);
            ventas[i][5]=totven+"";
            if(totven<2000){
                totvenpor=totven*20/100;
                ventas[i][6]=totvenpor+"";
                ventas[i][7]="0";
            }else{
                totvenpor=totven*35/100;
                ventas[i][6]="0";
                ventas[i][7]=totvenpor+"";
            }
            totven=totven+Integer.valueOf(ventas[i][6]);
            totven=totven+Integer.valueOf(ventas[i][7]);
            ventas[i][8]=totven+"";
            totvenpor=totven*5/100;
            ventas[i][9]=totvenpor+"";
            ventas[i][10]=totven-totvenpor+"";
        }
        
    }
    
    public static void herra(){
        DatMatri();
        Ejercicios();
        ImprimirDecorado();
    }
    
    
    public static void menu(){
            Scanner men=new Scanner(System.in);
            
            int op;
            boolean salir=false;
            System.out.println("\n");
            System.out.println("-----BIENVENIDO-----");
            System.out.println("--Elija una Opcion--");
            System.out.println("1)-Mostrar Matriz");
            System.out.println("2)-Obtener resultados");
            System.out.println("3)-Vendedor Mayor");
            System.out.println("4)-Vendedor Menor");
            System.out.println("5)-Salir");
            op=men.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("\t\t\t--MATRIZ OBTENIDA--");
                    DatMatri();
                    ImprimirDecorado();
                    break;
                case 2:
                    System.out.println("\t\t\t--MATRIZ COMPLETA--");
                    herra();
                    break;
                case 3:
                    VenMay();
                    break;
                case 4:
                    VenMen();
                    break;
                case 5:
                    System.out.println("Adios, hasta la proxima");
                    salir=true;
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                
                
            }
            
    }
    
    
    
    public static void ImprimirDecorado(){
        for(int x=0;x<ventas.length;x++){
            System.out.print("|");
            for (int y=0;y<ventas[x].length;y++){
                System.out.print(ventas[x][y]);
                if(y!=ventas[x].length-1){
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
    
    public static void VenMay(){
        DatMatri();
        Ejercicios();
        String y="";
        double may=0, numo=0;
        for(int i=0;i<5;i++){
            numo=Double.parseDouble(ventas[i][10]);
            if(numo>may){
                may=numo;
                y=ventas[i][10];
            }
            else{
                numo=numo;
            }
        }
        System.out.println("El vendedor que se le dara mas liquido es: "+y);
    }
    
    public static void VenMen(){
        DatMatri();
        Ejercicios();
        String y="";
        String z="";
        double may=100, numo=0;
        may=Double.parseDouble(ventas[4][10]);
        for(int i=0;i<5;i++){
            numo=Double.parseDouble(ventas[i][10]);
            if(numo<may){
                may=numo;
                y=ventas[i][10];
                
            }
            else{
                numo=may;
            }
        }
        //System.out.println("Su nombre es: "+z);
        System.out.println("El vendedor que recibira menos liquido: "+y);
    }
    
    public static void main(String[] args){
        menu();
        
    }
}
