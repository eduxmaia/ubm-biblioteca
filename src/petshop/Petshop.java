package petshop;

public class PetShop {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.cor = "branco";
        meuCachorro.peso = 15;
        Gato gatoDaVizinha = new Gato();
        gatoDaVizinha.cor = "malhado";
        gatoDaVizinha.peso = 5;
        meuCachorro.comer(); // herdado de Animal
        meuCachorro.enterrarOsso(); // so o Cachorro sabe
        gatoDaVizinha.subirEmArvore(); // so o Gato sabe
        Peixe peixeDoAquario = new Peixe();
        peixeDoAquario.nadar(); // so o Peixe sabe
        // Polimorfismo: a MESMA chamada, comportamentos diferentes
        Animal a1 = meuCachorro;
        Animal a2 = gatoDaVizinha;
        a1.fazerSom(); // Au au!
        a2.fazerSom(); // Miau!
        Peixe a3 = peixeDoAquario;
        a3.fazerSom(); // Glub glub!
    }
}