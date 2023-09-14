package principal;
import java.util.Date;
public class Pedido {


    private int id;
    private Date data;
    private Cliente cliente;
    private Vendedor vendedor;


    //construtores


    public Pedido(int id, Date data, Cliente cliente, Vendedor vendedor) {

        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public Pedido(){}
    //getters and setters



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
