package carro_simulador;

public class Carro {
    private boolean motorLigado;
    private int marcha;
    private int velocidade;
    private static final int limiteMarcha = 6;
    private static final int limiteVelocidade = 120;


    public Carro() {
        this.motorLigado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public boolean ligarMotor() {
        if (!this.motorLigado) {
            this.motorLigado = true;
            return true;
        }
        return false;
    }

    public boolean desligarMotor() {
        if (this.motorLigado && this.velocidade == 0) {
            this.motorLigado = false;
            return true;
        }
        return false;
    }
}
