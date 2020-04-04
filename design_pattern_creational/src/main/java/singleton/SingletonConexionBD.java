package singleton;

public class SingletonConexionBD {
    private static ConexionBD conexionBD;
    private static ConexionBD conexionBDEager = new ConexionBD();

    public static ConexionBD getConexionEager(){
        return conexionBDEager;
    }

    public static ConexionBD getConexionLazy() {
        if(conexionBD == null){
            conexionBD = new ConexionBD();
        }
        return conexionBD;
    }
     //App1 -> hilo
     //App2 -> hilo
     //App3 -> hilo

    public static  ConexionBD getConexionBDLazySync(){
        if(conexionBD == null){
            synchronized (SingletonConexionBD.class){
                conexionBD = new ConexionBD();
            }
        }
        return conexionBD;
    }
}
