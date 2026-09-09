public class Main {
    public static void main(String[] args) {

        Animal[] animais = {
            new Cachorro(),
            new Gato(),
            new Passaro(),
            new Peixe()
        };

        for (Animal animal : animais) {
            animal.fazerSom();
        }
    }
}