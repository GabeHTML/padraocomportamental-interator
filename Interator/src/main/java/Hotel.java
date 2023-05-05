import java.util.Iterator;

public class Hotel {
    public static Integer contarClientesAtivosPorRecepcionista(Recepcionista recepcionista) {
        int quantidade = 0;
        for (Cliente cliente : recepcionista) {
            if (cliente.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalClientesPorRecepcionista(Recepcionista recepcionista) {
        int quantidade = 0;
        for (Iterator a = recepcionista.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
