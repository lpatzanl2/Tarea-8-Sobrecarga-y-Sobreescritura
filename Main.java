package Sobrecarga_Sobreescritura_Metodos;

public class Main {
    public static void main(String[] args) {
        Accion_Realizada b1 = new Accion_Realizada();

       b1.sbrecarga("Juanito", 20); //Mandamos los datos que el metodo necesita

        b1.sbrecarga("Corrio el dia de hoy 20 kilometros "); //Mandamos el dato al metodo

        b1.queHizo(); //Imprimos en consola el metodo Sobreescrito

    }
}
