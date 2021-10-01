public class Main {
    public static void main(String[] args) {

        ListaCircularDoblemteEnlazada lcde = new ListaCircularDoblemteEnlazada();

        System.out.println(lcde.estaVacia());
        lcde.insertar(1);
        lcde.insertar(2);
        lcde.insertar(3);
        lcde.insertar(4);
        lcde.insertar(5);

        lcde.eliminar();
        lcde.insertar(6);
        lcde.insertar(7);


        for (int i = 0; i <3 ; i++) {
            lcde.mostrarC();
        }
    }
}
