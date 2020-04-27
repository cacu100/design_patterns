package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ServiceProxy implements InvocationHandler {

    private Object object;
    public ServiceProxy(Object object){
        this.object = object;
    }

    public static Object getInstanceProxy(Object ob){
        return Proxy.newProxyInstance(ob.getClass().getClassLoader(), ob.getClass().getInterfaces(), new ServiceProxy(ob));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Llamando a traves del proxy AWS PROXY");
        Object obj = method.invoke(object, args);

        if(object.getClass().getName().equals(AliExpress.class.getName())){
            System.out.println("AliExpress Aplicar 10%");
        }else if(object.getClass().getName().equals(AmazonArticlesImpl.class.getName())){
            System.out.println("Amazon Aplicar 20%");
        }

        return obj;
    }
}
