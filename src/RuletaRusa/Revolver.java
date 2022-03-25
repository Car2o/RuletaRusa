package RuletaRusa;
import java.util.Random;
public class Revolver {
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    //atributos del revolver
    protected int tambor;
    protected int posicion;
    protected int bala;
    //atributos para el random
    Random random = new Random();
    private int min =1;
    private int max = 6;

    //constructor
    Revolver(){
        generarBala();
        posicion=0;
        tambor=6;
    }

    //get

    public int getTambor() {
        return tambor;
    }

    public int getPosicion() {
        return posicion;
    }

    private int generarBala(){
        bala = random.nextInt(min + max)+min;
        return bala;
    }

    private int disparar(){
        posicion ++;
        if(posicion == bala){
            System.out.println("BANG");
        } else{
            System.out.println("Vives por ahora");
        }
        return posicion;
    }
}
