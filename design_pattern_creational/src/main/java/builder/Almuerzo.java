package builder;

public class Almuerzo {

    public static class Builder{
        private String entrada;
        private String jugo;
        private String sobremesa;

        public Builder (){

        }
        public Builder conEntrada(String entrada){
            this.entrada = entrada;
            return this;
        }

        public Builder conJugo(String jugo){
            this.jugo = jugo;
            return this;
        }

        public Builder conSobremesa(String sobremesa){
            this.sobremesa = sobremesa;
            return this;
        }
        public Almuerzo build(){
            return  new Almuerzo(this);
        }



    }

    private String entrada;
    private String jugo;
    private String sobremesa;

    public Almuerzo(Builder builder){
        this.entrada = builder.entrada;
        this.jugo = builder.jugo;
        this.sobremesa = builder.sobremesa;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getJugo() {
        return jugo;
    }

    public void setJugo(String jugo) {
        this.jugo = jugo;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    @Override
    public String toString() {
        return "Almuerzo{" +
                "entrada='" + entrada + '\'' +
                ", jugo='" + jugo + '\'' +
                ", sobremesa='" + sobremesa + '\'' +
                '}';
    }
}
