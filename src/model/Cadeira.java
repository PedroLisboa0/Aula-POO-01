package model;

public class Cadeira {
    public int quantidade_pes;
    public String material;
    public float altura;

    public Cadeira(String material, int quantidade_pes, float altura) {
        this.material = material;
        this.quantidade_pes = quantidade_pes; 
        this.altura = altura;
    }
    public void subirCadeira(float distancia) {
        // Regra de negócio: O valor da distancia deve ser positivo
        if (distancia <= 0) {
            System.out.println("Erro: O valor de distância deve ser maior que zero.");
            return;
        }
        this.altura += distancia;
        System.out.println("Cadeira erguida! Nova altura: " + this.altura);
    }
    public void mudarMaterial(String material) {
        // Regra de negócio: O material deve ser uma palavra
        if (!(material instanceof String)) {
            System.out.println("Erro: O material é inválido.");
            return;
        }
        this.material = material;
        System.out.println("Material atualizado! Novo material: " + this.material);
    }
}

