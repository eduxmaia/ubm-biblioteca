package petshop;

public class Cachorro extends Animal {
    public void enterrarOsso() {
        System.out.println("enterrando o osso...");
    }

    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }
}