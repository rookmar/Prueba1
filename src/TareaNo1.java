
import java.util.Scanner;// libreria para ingresar datos desde la consola
public class TareaNo1 {

        public static void main(String[] args) {

            //para almacenar los datos que ingresara el usuario
            Scanner entrada = new Scanner (System.in);
            //Variable que almacena los datos que ingrese el usuario es de tipo cadena
            String nombre = "";
            //pide al usuario que ingrese un nombre
            System.out.println("Ingrese un nombre ");
            //alacena en la variable "nombre" el nombre que ingrese el usuario
            nombre = entrada.nextLine();
            //impreme en consola lo que ingreso el usuario
            System.out.println("Bienvenido a Progra 2 2022 " +nombre);



        }

}
