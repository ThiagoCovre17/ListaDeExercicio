package lista;

public class Ex1 {
    static void imprimirLinha(int quantidade){
        for (int i=0; i< quantidade; i++){
            System.out.print("#");
        }
    }
    public static void main(String[] args){
        imprimirLinha(30);
        System.out.print("\nSEJA BEM VINDO");
        imprimirLinha(20);
    }
}
