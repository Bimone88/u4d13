package simonemanca.entities;

import javax.persistence.Entity;

@Entity
public class PartitaDiCalcio extends Evento {
    private String squadraCasa;
    private String squadraOspite;
    private String squadraVincente; // Null se pareggio
    private int numeroGolSquadraDiCasa;
    private int numeroGolSquadraOspite;

    public PartitaDiCalcio() {}

    // Costruttore completo
    public PartitaDiCalcio(String titolo, String squadraCasa, String squadraOspite, int numeroGolSquadraDiCasa, int numeroGolSquadraOspite) {
        super(titolo);
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.numeroGolSquadraDiCasa = numeroGolSquadraDiCasa;
        this.numeroGolSquadraOspite = numeroGolSquadraOspite;
        this.squadraVincente = determinaVincente();
    }

    // Getter e Setter

    private String determinaVincente() {
        if(numeroGolSquadraDiCasa > numeroGolSquadraOspite) {
            return squadraCasa;
        } else if(numeroGolSquadraOspite > numeroGolSquadraDiCasa) {
            return squadraOspite;
        } else {
            return null; // Pareggio
        }
    }
}

