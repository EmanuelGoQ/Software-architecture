//tarea 1: Crear un programa que pida un nombre y lo guarde en un archivo
//Emanuel Gonzalez Quintero
import java.util.Scanner; //lector de entrada
import java.io.File; //para manejar archivos
import java.io.FileWriter; //para escribir en archivos

public class archivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // leer por consola
        System.out.print("Introduce tu nombre: "); //mensaje de entrada
        String nombre = scanner.nextLine(); //ingresa el nombre
        try {      
            File file = new File("nombre.txt"); //crea o hacer referencia al archivo
            FileWriter writer = new FileWriter(file); //escritor en el archivo
            writer.write(nombre); //escribe el nombre en el archivo
            writer.close(); //cierra el escritor
            System.out.println("Nombre guardado en " + file.getAbsolutePath()); //mensaje de éxito
        } catch (Exception e) { 
            System.out.println("Error al guardar el nombre: " + e.getMessage()); //mensaje de error
        } finally {
            scanner.close(); //cierra el scanner
        }
    }
}