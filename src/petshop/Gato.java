package petshop;

public class Gato extends Animal {
    public void subirEmArvore() {
        System.out.println("subindo na arvore...");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }
}