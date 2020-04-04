package singleton;

//Modulo Seguros
public class ModuloApiSeguros {

    public static void main(String[] args) {

        //Capa 1
        ConexionBD conexion1 = SingletonConexionBD.getConexionBDLazySync();

        //Capa negocio
        ConexionBD conexion2 = SingletonConexionBD.getConexionBDLazySync();;

        //Capa ventas
        ConexionBD conexion3 = SingletonConexionBD.getConexionBDLazySync();;

        //capa transacion
        ConexionBD conexion4 = SingletonConexionBD.getConexionBDLazySync();;

        System.out.println(conexion1+"\n"+conexion2+"\n"
                +conexion3+"\n"+conexion4);
    }
}
