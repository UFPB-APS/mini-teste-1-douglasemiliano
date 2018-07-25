
public class CustoValorTotal implements Custo {
    
    private String nome;
    private double taxa;
    
    public CustoValorTotal (){
        }
   
    public CustoValorTotal(String nome, double taxa) {
        this.nome = nome;
        this.taxa = taxa;
    }
   
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setTaxa(double taxa){
        this.taxa = taxa;
    }
    
    public double getTaxa (){
        return this.taxa;
    }
    
    public double calcularCusto(Venda venda) {
        return venda.getTotal() * taxa;
    }
}