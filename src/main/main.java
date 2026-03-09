package main;


import model.Cadeira;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando a primeira cadeira (Objeto 1)
        Cadeira cadeira1 = new Cadeira("Madeira", 4, 1.0F);
        System.out.println("Mudar material cadeira 1");
        cadeira1.mudarMaterial("Estofado"); // Sem erros

        // Criando a segunda cadeira (Objeto 2)
        Cadeira cadeira2 = new Cadeira("Metal", 5, 1.3F);
        System.out.println("Mudar material cadeira 2");
        cadeira2.mudarMaterial(4); // Erro de material inválido


    }
}