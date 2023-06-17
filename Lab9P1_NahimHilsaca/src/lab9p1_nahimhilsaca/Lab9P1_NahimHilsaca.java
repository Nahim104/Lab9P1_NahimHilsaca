/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_nahimhilsaca;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author nahim
 */
public class Lab9P1_NahimHilsaca {

   static Scanner leer= new Scanner(System.in);// Variable leer para los enteros
   static Scanner read= new Scanner(System.in);// Variable read para los Strings
   static ArrayList<Libros> libritos= new ArrayList<>();
    public static void main(String[] args) {
         boolean val= false; // Para validar si el usario no ingrsa primero el 1
        int op=0;
        while(op !=2){
            System.out.println("Menu");
            System.out.println("1. Libros y mas Libros REMASTERED");
            System.out.println("2. Salir");
            op= leer.nextInt();
            
        switch(op){
        
            case 1:
                boolean case1=true;
                
                while(case1){
                 System.out.println("Elegir una opcion: ");
                System.out.println("1. Agregar Libro");
                System.out.println("2. Listar Libros");
                System.out.println("3. Modificar Libro");
                System.out.println("4. Eliminar Libro");
                System.out.println("5. Buscar Libros por titulo");
                System.out.println("6. Buscar Libros segun autor");
                System.out.println("7. Busqueda con filtro de genero");
                System.out.println("8. Salir");
                int opcionc= leer.nextInt();
                    System.out.println("Opcion Ingresada "+opcionc);
                    System.out.println();
                
                switch(opcionc){
                
                    case 1:
                        System.out.println("Ha elegido la opcion para agregar un libro, por favor aporte la informacion solicitada");
                        AgregarLibros();
                        System.out.println("Libro agregado exitosamente! ");
                        val=true;
                    break;
              
                    case 2:
                        
                        if(val==true){
                            
                           ImprimirLibrero();
                        
                        }else{
                            System.out.println("Tiene que agregar Libros primero, o sea presione primero 1");
                        
                        }
                     
                        break;
                       
                    case 3:
                        
                         if(val==true){
                             
                        ModificarLibrero(libritos);
                        }else{
                            System.out.println("Tiene que agregar Libros primero, o sea presione primero 1");
                        
                        }
                      break;
                      
                    case 4:
                         if(val==true){
                        
                        Eliminarlibro(libritos);
                        }else{
                            System.out.println("Tiene que agregar Libros primero, o sea presione primero 1");
                        
                        }
                        
                        break;
                        
                    case 5:
                         if(val==true){
                        
                        BuscarTito(libritos);
                        }else{
                            System.out.println("Tiene que agregar Libros primero, o sea presione primero 1");
                        
                        }
                        
                        break;
                        
                    case 6:
                        
                         if(val==true){
                        
                         BuscarEscritor(libritos);
                        }else{
                            System.out.println("Tiene que agregar Libros primero, o sea presione primero 1");
                        
                        }
                        break;
                        
                    case 7:
                         if(val==true){
                        
                             BuscarGenero(libritos);
                        }else{
                            System.out.println("Tiene que agregar Libros primero, o sea presione primero 1");
                        
                        }
                        
                        break;
                        
                    case 8:
                        case1=false;
                        break;
                        
                        default:
                            System.out.println("Opcion Incorrecta. Hay que elegir de las opciones dadas");
                        break;
                        
                }// Fin del switch del case 1
                
                }// Fin del while del case 1
        }// Fin del switch del menu
        }// Fin del while
    }// Fin del main
    
    public static void AgregarLibros (){
    
        
         System.out.print("Titulo: ");
          String titulo= read.nextLine();
           System.out.print("Autor: ");
           String autor= read.nextLine();
           System.out.print("Genero: ");
           String genero= read.nextLine();
          System.out.print("Edad minima: ");
           int edad= leer.nextInt();
           
           while(edad<=0){
           
               System.out.println("Tiene que ingresar una edad real y que no sea 0");
               edad=leer.nextInt();
           }// Validar que la edad no sea 0 o negativo
         
          Libros L= new Libros(titulo, autor, genero, edad);
          libritos.add(L);
    }// Fin del metodo AgregarLibros
    
    public static void ImprimirLibrero(){
    
        System.out.println("Libros Disponibles: ");
        System.out.println();
        
        for( int i=0; i<libritos.size(); i++){
            System.out.println("Libro "+(i+1));
            System.out.println("Titulo: "+libritos.get(i).getTitulo());
            System.out.println("Autor: "+libritos.get(i).getEscritor());
            System.out.println("Genero: "+libritos.get(i).getGenero());
            System.out.println("Edad Minima: "+libritos.get(i).getEdad());
            System.out.println();
        }

    }// Fin del metodo ImprimirLibrero
    
    public static ArrayList<Libros> ModificarLibrero(ArrayList<Libros>libritos){
                boolean libros=false;
        System.out.println("Ha ingresado la opcion de modificar libros, elija el libro a modificar: ");
            ImprimirLibrero();
    
         System.out.print("Libro seleccionado: ");   
         int libro= leer.nextInt();
         
         for(int i=0; i<libritos.size(); i++){
         
             if(libro==(i+1)){
                    libros=true;
                 System.out.println("Ha seleccionado el libro "+libritos.get(i).getTitulo()+",que atributuo desea modificar?");
                 
                 System.out.println("1. Titulo");
                 System.out.println("2. Autor");
                 System.out.println("3. Genero");
                 System.out.println("4. Edad Minima");
                 int modificar=leer.nextInt();
                 
                 switch(modificar){
                 
                     case 1:
                         System.out.print("Modificara el Titulo del libro, ingrese un nuevo titulo: ");
                         String titulonvo=read.nextLine();
                         libritos.get(i).setTitulo(titulonvo);
                         libritos.get(i).getTitulo();
                         System.out.println("Libro modificado exitosamente!");
                         break;
                         
                     case 2:
                         System.out.print("Modificara el Autor del libro, ingrese un nuevo autor: ");
                         String autornvo=read.nextLine();
                         libritos.get(i).setEscritor(autornvo);
                         libritos.get(i).getEscritor();
                         System.out.println("Libro modificado exitosamente!");
                         break;
                     
                     case 3:
                         System.out.print("Modificara el Genero del libro, ingrese un nuevo genero: ");
                         String generonvo=read.nextLine();
                         libritos.get(i).setGenero(generonvo);
                         libritos.get(i).getGenero();
                         System.out.println("Libro modificado exitosamente!");
                         break;
                         
                     case 4:
                          System.out.print("Modificara la edad minima del libro, ingrese una nueva edad: ");
                         int edadnvo=leer.nextInt();
                          while(edadnvo<=0){
           
                         System.out.println("Tiene que ingresar una edad real y que no sea 0");
                          edadnvo=leer.nextInt();
                              }// Validar que la edad no sea 0 o negativo
         
                         libritos.get(i).setEdad(edadnvo);
                         libritos.get(i).getEdad();
                         System.out.println("Libro modificado exitosamente!");
                         break;
                 
                 }// Fin del switch
             
             }// Fin del if
         
         }// Fin del for
         
         if(libros==false){
             
                 System.out.println("Libro no encontrado ");
         }
            return libritos;
            
    }// Fin del metodo ModificarLibrero
    
    public static ArrayList<Libros> Eliminarlibro(ArrayList<Libros>libritos){
         boolean libros=false;
        System.out.print("Elija el libro a eliminar: ");
        System.out.println();
        ImprimirLibrero();
        
        System.out.println("Ingrse el libro a eliminar: ");
        int eliminar=leer.nextInt();
        
        for(int i=0; i<libritos.size(); i++){
        
        if(eliminar==(i+1)){
            libros=true;
        
            System.out.println("Ha eliminado el libro "+libritos.get(i).getTitulo());
                libritos.remove(i);
        }// Fin del if
        }// Fin del for
        if(libros==false){
                 System.out.println("Libro no encontrado ");
         }
            return libritos;
     }// Fin del metodo EliminarLibro
    
    public static void BuscarTito( ArrayList<Libros>libritos){
        boolean libros=false;
        
        System.out.print("Ingrese el titulo a buscar: ");
        String titulo=read.nextLine();
        System.out.println("Libros con titulo de "+titulo);

        for( int i=0; i<libritos.size(); i++){
        
        if(titulo.equalsIgnoreCase(libritos.get(i).getTitulo())){
            libros=true;
         System.out.println("Libro "+(i+1));
            System.out.println("Titulo: "+libritos.get(i).getTitulo());
            System.out.println("Autor: "+libritos.get(i).getEscritor());
            System.out.println("Genero: "+libritos.get(i).getGenero());
            System.out.println("Edad: "+libritos.get(i).getEdad());
            System.out.println();
        
        }// Fin del if
        }// Fin del for
        if(libros==false){
             
                 System.out.println("Libro no encontrado ");
         }
    }// Fin del metodo BuscarTito
     public static void BuscarEscritor( ArrayList<Libros>libritos){
        boolean libros=false;
        
        System.out.print("Ingrese el autor a buscar: ");
        String autor=read.nextLine();
        System.out.println("Libros con autor "+autor);

        for( int i=0; i<libritos.size(); i++){
        
        if(autor.equalsIgnoreCase(libritos.get(i).getEscritor())){
            libros=true;
         System.out.println("Libro "+(i+1));
            System.out.println("Titulo: "+libritos.get(i).getTitulo());
            System.out.println("Autor: "+libritos.get(i).getEscritor());
            System.out.println("Genero: "+libritos.get(i).getGenero());
            System.out.println("Edad: "+libritos.get(i).getEdad());
            System.out.println();
        
        }// Fin del if
        }// Fin del for
        if(libros==false){
                 System.out.println("Libro no encontrado ");
         }
    }// Fin del metodo BuscarEscritor
    public static void BuscarGenero( ArrayList<Libros>libritos){
        boolean libros=false;
        
        System.out.print("Ingrese el genero a buscar: ");
        String genero=read.nextLine();
        System.out.println("Libros con genero "+genero);

        for( int i=0; i<libritos.size(); i++){
        
        if(genero.equalsIgnoreCase(libritos.get(i).getGenero())){
            libros=true;
         System.out.println("Libro "+(i+1));
            System.out.println("Titulo: "+libritos.get(i).getTitulo());
            System.out.println("Autor: "+libritos.get(i).getEscritor());
            System.out.println("Genero: "+libritos.get(i).getGenero());
            System.out.println("Edad: "+libritos.get(i).getEdad());
            System.out.println();
        
        }// Fin del if
        }// Fin del for
        if(libros==false){
                 System.out.println("Libro no encontrado ");
         }
    }// Fin del metodo BuscarGenero
}// Fin de la clase
