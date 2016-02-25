/*
Sara Marcela Pavas Madrid
Gestión de deportistas: El primero se encarga de gestionar la información de los
nadadores, los datos que se almacenan de cada deportista son: nombre completo,
documento de identidad, rama (masculino o femenino), año de nacimiento, con el cual
clasifica los deportistas en tres categorías: infantil A (6 a 10 años), infantil B (11 a
17 años) juvenil (18 a 25 años) y senior (25 en adelante). Para cargar estos datos en
la aplicación se debe presentar un menú con las siguientes opciones:
 Ingresar deportista: Permite ingresar un deportista nuevo a la base de datos.
 Actualizar deportista: Permite actualizar los datos de un deportista.
 Eliminar deportista: Permite eliminar un deportista de la base de datos.
 Buscar deportista: Realiza la búsqueda de un deportista y muestra toda su
información.
 */

package LigaDeNatacion;
import java.util.Scanner;


public class Nadadores {
     String [] nombre=new String[100];
    String documento[]=new String[100];
   String rama[]=new String[100];
    int año[]=new int[100];
    int aux =0;
    
    public void inicializarvectores(){
        for (int i=0; i<100;i++){
         nombre[i] = "null";
         documento[i] = "null";
         rama[i] = "null";
         año[i] = 0;
        }
    }

    public int getAux() {
        return aux;
    }
    
    public void ingresarDeportista(int i){
        
        Scanner lector = new Scanner(System.in);
        System.out.print("Nombre completo: ");
        nombre[i] = lector.nextLine();
        System.out.print("Documento de identidad: ");
        documento[i] = lector.nextLine();
        System.out.print("Rama: ");
        rama[i] = lector.nextLine();
        
        System.out.print("Año de nacimiento: ");
        año[i] = lector.nextInt();
        aux++;
    }
    public void ActualizarDatos(int i){
       int opcion;
       boolean x=true;
       int count=0;
       String op;
       Scanner lector = new Scanner(System.in);
       
       do{
       System.out.println("Ingrese la opción que desea actualizar: ");
       System.out.println("1. Nombre");
       System.out.println("2. documento");
       System.out.println("3. Rama");
        System.out.println("4. Año de nacimiento");
           System.out.println("5. terminar");
       opcion = lector.nextInt();
       
        switch(opcion){
           case 1:
            System.out.println("1. Nombre");
            lector.nextLine();
            nombre[i] = lector.nextLine();
            System.out.println("Guadado, nombre: " +nombre[i]);
            count++;
            break;
           case 2:
            System.out.print("Documento: ");
            lector.nextLine();
            documento[i] = lector.nextLine();
            System.out.println("Guadado, documento: " +documento[i]);
            count++;
            break;
           case 3: 
            System.out.print("Rama: ");
            rama[i] = lector.nextLine();
            System.out.println("Guadado, Rama: " +rama[i]);
            count++;
            break;   
           case 4:
            System.out.print("Año de nacimiento: ");
            año[i] = lector.nextInt();
            System.out.println("Guadado, Año de nacimiento: " +año[i]);
            count++;
            break; 
           case 5:
             x = false;
             System.out.println("Saliendo");
             break;
           default:
            System.out.println("Ingrese una opción correcta");
           
        }
        if (count == 4){
               System.out.println("Datos Actualizados correctamente");
               x = false;
               break;
        }
       }while(x);
       
    }
    
    public void eliminar(String id){
        
        int x=0;
        int j;
        for (int i=0; i<aux;i++){
            if(documento[i].equals(id)){
                for (j = i; j<aux-1; j++){
                    nombre[j] = nombre[j+1];
                    documento[j] = documento[j+1];
                    rama[j] = rama[j+1];
                    año[j] = año[j+1];
                    x =1;
                }
                nombre[aux-1] = "null";
                documento[aux-1] = "null";
                rama[aux-1] = "null";
                año[aux-1] = 0;
                aux--;
            }
            
       }
        if(x==1)
            System.out.println("Deportista Eliminado");
        if(x==0)
            System.out.println("Usuario no encontrado");
    }
    
    public int buscar(String id){
        int x=0;
        int i;
        for ( i=0; i<100;i++){
            if(documento[i].equals(id)){
                System.out.println("Nombre:  "+nombre[i]);
                System.out.println("documento:  "+documento[i]);
                System.out.println("Rama:  "+rama[i]);
                System.out.println("Año de nacimineto:  "+año[i]);
                x=1;
                break;
                }
            
        }
        if(x==1)
            System.out.println("Busqueda satisfactoria");
        if(x==0)
            System.out.println("Usuario no encontrado");
       return i;   
       }
    public void mostrarTodos(){
        for (int i=0; i<aux;i++){
            
            System.out.println("Nombre "+i+":  "+nombre[i]);
            System.out.println("documento "+i+":  "+documento[i]);
            System.out.println("Rama "+i+":  "+rama[i]);
            System.out.println("Año de nacimineto "+i+":  "+año[i]);
        }   
         System.out.println("\n Hay "+aux+" nadadores registrados");    
                
        
    }
        
    
    
}
