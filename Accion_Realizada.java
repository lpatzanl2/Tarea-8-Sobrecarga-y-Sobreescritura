package Sobrecarga_Sobreescritura_Metodos;

public class Accion_Realizada extends Persona {

    public Accion_Realizada() {
        super();
    }

    /**
     * Metodo que recibe un parametro unicamente
     * @param accionrealizada
     */
    public void sbrecarga(String accionrealizada){
        super.queHizo(accionrealizada);
    }

    /**
     * metodo llamado de mismo modo solo que al tener parametros diferentes, el sistema reconoce a cual le manda basdo en
     * el tipo de parametros que se esta enviando
     * @param nom
     * @param edad
     */
    public void sbrecarga(String nom, int edad){
        super.setEdad(edad);
        super.setNombre(nom);
        super.queHizo();
    }

    /**
     * Sobreescribimos el mismo metodo de la clase que se hereda y con el comando
     * override lo reconoce que proviene de nuestra clase padre
     */
    @Override
    public void queHizo(){
        System.out.println(" La persona" + nombre + "tiene " + edad + " años de edad. ");
    }
}
