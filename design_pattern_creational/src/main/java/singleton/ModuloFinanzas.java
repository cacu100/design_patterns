package singleton;

public class ModuloFinanzas {


    public static void main(String[] args) {

        //Capa 1
        ConexionBD conexion1 = SingletonConexionBD.getConexionEager();

        //Capa negocio
        ConexionBD conexion2 = SingletonConexionBD.getConexionEager();;

        //Capa ventas
        ConexionBD conexion3 = SingletonConexionBD.getConexionEager();;

        //capa transacion
        ConexionBD conexion4 = SingletonConexionBD.getConexionEager();;

        System.out.println(conexion1+"\n"+conexion2+"\n"
                +conexion3+"\n"+conexion4);
    }
}
