package telefoneCelular;

public class Celular {
    public static void main(String[] args) {
        telefoneCelular celular = new telefoneCelular();

        celular.setMarca("Samsung");
        celular.setModelo("Galaxy A30S");
        celular.setCor("Fúcsia");
        celular.setArmazenamento(64);
        celular.setPreco(1349.99);
        celular.status();
    }
}