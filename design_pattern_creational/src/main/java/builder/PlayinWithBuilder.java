package builder;

public class PlayinWithBuilder {

    public static void main(String[] args) {

        Almuerzo.Builder senoraMeridano = new Almuerzo.Builder();

        senoraMeridano.conEntrada("Sopa sin tomate")
                .conJugo("Con jugo sin azucar")
                .conSobremesa("Poste quitemele el azucar");

        Almuerzo almuerzoJose = senoraMeridano.build();
        System.out.println(almuerzoJose);

    }
}
