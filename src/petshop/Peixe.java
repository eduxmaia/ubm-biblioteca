package petshop;

public class Peixe extends Animal {
    public void nadar() {
        System.out.println("nadando...");
    }

    @Override
    public void fazerSom() {
        System.out.println("Glub glub!");
    }
}