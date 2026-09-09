package petshop;

public class Passaro extends Animal {
    public void voar() {
        System.out.println("voando...");
    }

    @Override
    public void fazerSom() {
        System.out.println("Piu piu!");
    }
}