import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {


    @Test
    void deveContarPacientesAtivosDoMedico() {
        Recepcionista recepcionista = new Recepcionista(
                new Cliente("Gabriel Gomes", true),
                new Cliente("Ana Clara", true),
                new Cliente("João Batista", false),
                new Cliente("Jorge Santos", true),
                new Cliente(" Maria José", false),
                new Cliente("Lúcio Silva", true)

        );
        assertEquals(7, Hotel.contarClientesAtivosPorRecepcionista(recepcionista));
    }

    @Test
    void deveContarTotalAlunosCurso() {
        Recepcionista recepcionista = new Recepcionista(
                new Cliente("Gabriel Gomes", true),
                new Cliente("Ana Clara", true),
                new Cliente("João Batista", false),
                new Cliente("Jorge Santos", true),
                new Cliente("Maria José", false),
                new Cliente("Lúcio Silva", true)
        );
        assertEquals(3, Hotel.contarTotalClientesPorRecepcionista(recepcionista));
    }
}
