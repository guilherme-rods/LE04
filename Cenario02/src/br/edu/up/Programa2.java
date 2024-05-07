package br.edu.up;
public class Programa2 {
    public static void main(String[] args) throws Exception {
        //1. Crie um objeto ponto1 usando o primeiro construtor;
        Ponto ponto1 = new Ponto();

        //2. Crie um objeto ponto2 na posição (2,5);
        Ponto ponto2 = new Ponto(2, 5);

        //3. Calcule a distância do ponto1 ao ponto2;
        double distancia = calcularDistancia(ponto1, ponto2);
        System.out.println("A distância entre ponto1 e ponto2 é: " + distancia);

        //4. Calcule a distância do ponto2 às coordenadas (7,2);
        Ponto ponto3 = new Ponto(7, 2);
        distancia = calcularDistancia(ponto2, ponto3);
        System.out.println("A distância entre ponto2 e ponto3 é: " + distancia);

        //5. Altere o valor de x para 10 no ponto1; 
        ponto1.setX(10);

        //6. Altere o valor de y para 3 no ponto1;
        ponto1.setY(3);
    }

    public static double calcularDistancia(Ponto ponto1, Ponto ponto2) {
        double deltaX = ponto2.getX() - ponto1.getX();
        double deltaY = ponto2.getY() - ponto1.getY();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }
}


