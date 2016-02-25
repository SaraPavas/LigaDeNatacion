
package LigaDeNatacion;

import java.util.Scanner;
public class Inscripcion extends Nadadores {
    
   
    int aux_ins =0;
    boolean pecho[]=new boolean[100];
    boolean mariposa[]=new boolean[100];
    boolean libre[]=new boolean[100];
    boolean espalda[]=new boolean[100];
    
    public void nadieEstainscripto(){
        for(int i=0;i<100;i++){
        mariposa[i]= false;
        pecho[i]=false;
        espalda[i]=false;
        libre[i]=false;
        
        }
    }        
    public void inscribir(int i){
        
        int op;
        
        Scanner lector = new Scanner(System.in);
        
     
        System.out.println("Ingrese la prueba en la que desea inscribirse: ");
        System.err.println("1.mariposa");
        System.out.println("2.pecho");
        System.out.println("3.espalda");
        System.out.println("4.Libre");
        System.out.println("5.terminar");
        op = lector.nextInt();
        
        
        switch(op){
            case 1:
                mariposa[i]=true;
                break;
            case 2:
                pecho[i]=true;
                break;
            case 3:
                espalda[i]=true;
                break;
            case 4:
                libre[i]=true;
                break;
            case 5:
                System.out.println("Inscrito");
                break;
            default:
                System.err.println("Ingrese una opcion correcta:");
        }
        
        
    }
    
    public void eliminarPrueba(int i){
        int op;
        
        Scanner lector = new Scanner(System.in);
       
        System.out.println("Ingrese la prueba que desea eliminar: ");
        if(mariposa[i])
            System.out.println("1. Inscrito en mariposa");
        if(pecho[i])
            System.out.println("2. Inscrito en pecho");
        if(espalda[i])
            System.out.println("3. Inscripto en espalda");
        if(libre[i])
            System.out.println("4. Inscripto en libre");
        else if(!mariposa[i] && !pecho[i] && !espalda[i] && !libre[i]) 
                System.out.println("No se encuentra inscrito ");
        
        
        
        op = lector.nextInt();
        
      
        switch(op){
            case 1:
                mariposa[i]=false;
                break;
            case 2:
                pecho[i]=false;
                break;
            case 3:
                espalda[i]=false;
                break;
            case 4:
                libre[i]=false;
                break;
            
            default:
                System.err.println("Ingrese una opcion correcta:");
        }
        
    }
}
    
    
        
    


    

    
   

