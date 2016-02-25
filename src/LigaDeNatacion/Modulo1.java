/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LigaDeNatacion;
import java.util.Scanner;
public class Modulo1 {
    public static void main(String[] args) {
        
        Nadadores lista_nadadores= new Nadadores();
        Inscripcion lista_inscritos = new Inscripcion();
        Scanner lector = new Scanner(System.in);
        int opcion;
        boolean x=true;
        int i;
       
        String doc;
        lista_nadadores.inicializarvectores();
        lista_inscritos.nadieEstainscripto();
        
        do {          
        System.out.println("1.Ingresar deportista");
        System.out.println("2.Actualizar datos deportista");
        System.out.println("3.Eliminar Deportista");
        System.out.println("4. Buscar desportista");
        System.out.println("5. Listar todos los deportista");
        System.out.println("6. Inscribir deportistas");
        System.out.println("7. Eliminar Inscripcion");
        System.out.println("8.Salir");
        opcion = lector.nextInt();
            switch(opcion){
                case 1:
                    i = lista_nadadores.getAux();
                    lista_nadadores.ingresarDeportista(i);
                    System.out.println("Deportista ingresado");
                    break;
                case 2:
                    System.out.println("Digite el numero de documento del deportista");
                    lector.nextLine();
                    doc = lector.nextLine();
                    i = lista_nadadores.buscar(doc);
                    lista_nadadores.ActualizarDatos(i);
                    break;
                case 3:
                    System.out.println("Digite el numero de documento del deportista");
                    lector.nextLine();
                    doc = lector.nextLine();
                    lista_nadadores.eliminar(doc);
                    break;
                case 4:
                    System.out.println("Digite el numero de documento del deportista");
                    lector.nextLine();
                    doc = lector.nextLine();
                    lista_nadadores.buscar(doc);
                    break;
                case 5:
                    lista_nadadores.mostrarTodos();
                    break;
                case 6:
                    System.out.println("Digite el numero de documento del deportista");
                    lector.nextLine();
                    doc = lector.nextLine();
                    i=lista_nadadores.buscar(doc);
                    lista_inscritos.inscribir(i);
                    break;
                case 7:   
                    System.out.println("Digite el numero de documento del deportista");
                    lector.nextLine();
                    doc = lector.nextLine();
                    i=lista_nadadores.buscar(doc);
                    lista_inscritos.eliminarPrueba(i);
                    break;
                case 8:
                    System.out.println("Saliendo");
                    x = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
            }
        } while (x);
  
    }
}
