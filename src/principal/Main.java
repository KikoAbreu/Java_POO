package principal;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Cliente obj_cliente = new Cliente("Flavio", "090909090","8199260000");
        Cliente obj_cliente2 = new Cliente();

        Vendedor obj_vendedor = new Vendedor(1,"Kilderys", "819000000");



        Pedido pedido = new Pedido();

        pedido.setId(1);
        pedido.setCliente(obj_cliente);
        pedido.setData(new Date());
        pedido.setVendedor(obj_vendedor);

        System.out.println("=========================================");
        System.out.println("ID PEDIDO:"+pedido.getId());
        System.out.println("Nome Cliente: " + pedido.getCliente().getNome());
        System.out.println("Nome Vendedor: " + pedido.getVendedor().getNome_vendedor() + ". ID_Vendedor: " + pedido.getVendedor().getId_vendedor());
        System.out.println(pedido.getData());
        System.out.println("=========================================");
    }
}