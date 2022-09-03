package Sobrecarga_Sobreescritura_Metodos;

public class Persona {
    public String nombre;
    public int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo que tiene un nombre y no recibe parametros
     */
    public void queHizo(){
        System.out.println(" La persona" + nombre + "tiene " + edad + " años de edad. ");
    }

    /**
     *
     * @param asd
     * Metodo con el mismo nombre pero si recibe un parametro, de esta manera lo sobrecargamos
     */

    public void queHizo(String asd){
        System.out.println(" La persona" + nombre + "tiene " + edad + " años de edad y " + asd);
    }

}
