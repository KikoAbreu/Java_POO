package principal;

public class Vendedor {

    private int id_vendedor;
    private String nome_vendedor;
    private String telefone_vendedor;



    //const

    public Vendedor(int id_vendedor, String nome_vendedor, String telefone_vendedor) {
        this.id_vendedor = id_vendedor;
        this.nome_vendedor = nome_vendedor;
        this.telefone_vendedor = telefone_vendedor;
    }

    public Vendedor(){

    }





    // get and set


    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getNome_vendedor() {
        return nome_vendedor;
    }

    public void setNome_vendedor(String nome_vendedor) {
        this.nome_vendedor = nome_vendedor;
    }

    public String getTelefone_vendedor() {
        return telefone_vendedor;
    }

    public void setTelefone_vendedor(String telefone_vendedor) {
        this.telefone_vendedor = telefone_vendedor;
    }
}
