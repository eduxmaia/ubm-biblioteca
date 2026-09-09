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
        Passaro passaroDoParque = new Passaro();
        passaroDoParque.voar(); // so o Passaro sabe
        Peixe peixeDoAquario = new Peixe();
        peixeDoAquario.nadar(); // so o Peixe sabe
        // Polimorfismo: a MESMA chamada, comportamentos diferentes
        Animal a1 = meuCachorro;
        Animal a2 = gatoDaVizinha;
        a1.fazerSom(); // Au au!
        a2.fazerSom(); // Miau!
        Passaro a3 = passaroDoParque;
        a3.fazerSom(); // Piu piu!
        Peixe a4 = peixeDoAquario;
        a4.fazerSom(); // Glub glub!
    }
}