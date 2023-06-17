/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_nahimhilsaca;


public class Libros {
    
    
    private String Titulo;
    private String escritor;
    private String genero;
    private int edad;
    
    public Libros(){
    
    }// constructor vacio
    
    public Libros( String tituloT, String escritorE, String generoG, int edadE){
    
        this.Titulo=tituloT;// variable titulo con su parametro tituloT
        this.escritor=escritorE;// variable esceritor con su parametro escritorE
        this.genero=generoG;// variable publicacion con su parametro generoG
        this.edad=edadE;// Variabe edad con su parametro edadE
    }// Constructor recargado

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;// variable this.Titulo con su parametro Titulo
    }
     public String getTitulo() {
        return Titulo;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }
     public String getEscritor() {
        return escritor;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
        
    
    
    
    
    
}// Fin de la clase
