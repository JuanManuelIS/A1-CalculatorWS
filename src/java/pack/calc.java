package pack;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

@WebService(serviceName = "calc")
@Stateless()
public class calc {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "sum")
    public int sum(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        return n1 + n2;
    }

    @WebMethod(operationName = "rest")
    public int rest(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        return n1-n2;
    }
}
