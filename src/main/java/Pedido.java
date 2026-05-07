import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;
    private StatusPedido status;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.status = StatusPedido.PENDENTE;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
    public void adicionarItem(ItemPedido item) {
        if (item == null) {
            throw new IllegalArgumentException("Item não pode ser nulo");
        }

        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public StatusPedido getStatus() {
        return status;
    }
    
   
     public void alterarStatus(StatusPedido novoStatus) {

    if (novoStatus == null) {
        throw new IllegalArgumentException("Status não pode ser nulo");
    }

    if (status == StatusPedido.PENDENTE &&
            novoStatus == StatusPedido.PAGO) {

        status = novoStatus;
        return;
    }

    if (status == StatusPedido.PAGO &&
            novoStatus == StatusPedido.EM_PREPARO) {

        status = novoStatus;
        return;
    }

    if (status == StatusPedido.EM_PREPARO &&
            novoStatus == StatusPedido.FINALIZADO) {

        status = novoStatus;
        return;
    }

    throw new IllegalStateException(
            "Transição de status inválida"
    );
}
    
}