package dcc603.biblioteca;

/**
 * Um exemplar é uma unidade atômica de um título.
 * 
 * Por exemplo:
 *  - Senhor dos Aneis e a Sociedade do Anel é um título X
 *    X->exemplars[0] é o primeiro exemplar
 *    X->exemplars[1] é o segundo exemplar
 */

public class Exemplar {
    private boolean isLoaned = false;
    private boolean isLost = false;
    private int daysLoaned = 0;
    private int daysInReserve = 0;

    private boolean isLate = false;

    private boolean keptAsReserve = false;

    // ------------------Construtor-------------------------
    // Todo exemplar é criado com variáveis padrão, à serem
    // modificadas durante a execução do código.
    public Exemplar(/*Constroi com variaveis padrão*/) {} //

	// -------------------Métodos---------------------------


    // -------------------Getter's/Setter's----------------
    public boolean isLoaned() {
        return isLoaned;
    }

    public void setLoaned(boolean isLoaned) {
        this.isLoaned = isLoaned;
    }

    public boolean isLost() {
        return isLost;
    }

    public void setLost(boolean isLost) {
        this.isLost = isLost;
    }

    public int getDaysLoaned() {
        return daysLoaned;
    }

    public void setDaysLoaned(int daysLoaned) {
        this.daysLoaned = daysLoaned;
    }

    public int getDaysInReserve() {
        return daysInReserve;
    }

    public void setDaysInReserve(int daysInReserve) {
        this.daysInReserve = daysInReserve;
    }

    public boolean isLate() {
        return isLate;
    }

    public void setLate(boolean isLate) {
        this.isLate = isLate;
    }

    public boolean isKeptAsReserve() {
        return keptAsReserve;
    }

    public void setKeptAsReserve(boolean keptAsReserve) {
        this.keptAsReserve = keptAsReserve;
    }
}
