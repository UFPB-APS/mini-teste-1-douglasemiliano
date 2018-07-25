public class LogicaVenda {

    private Custo iv = new CustoValorTotal();
    private Custo taxa;

    public Custo getSeguro() {
        return taxa;
    }
    
    public void setSeguro(Custo taxa) {
        this.taxa = taxa;
    }

    public double calcularTotal(Venda venda) {
        venda.setTotal(0.0);
        
        for (ItemVenda item: venda.getItens()) {
            if (item != null) {
                venda.setTotal(venda.getTotal() + item.getSubTotal());
            }
        }
        
        if ( this.iv != null) {
            venda.setTotal(venda.getTotal() + this.iv.calcularCusto(venda));
        }
        return venda.getTotal();
    }
}