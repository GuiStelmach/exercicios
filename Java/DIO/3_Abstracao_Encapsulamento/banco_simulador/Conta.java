package banco_simulador;

public class Conta {
    private Usuario titular;
    private String numeroConta;
    private double saldo;
    private double limiteChequeEspecial;
    private double dividaChequeEspecial;
    private static final double TAXA_USO_CHEQUE = 0.20;

    public Conta(Usuario titular, String numeroConta, double depositoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = depositoInicial;
        this.dividaChequeEspecial = 0.0;

        if (depositoInicial <= 500.0) {
            this.limiteChequeEspecial = 50.0;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }

        if (this.dividaChequeEspecial > 0) {
            double valorDaTaxa = this.dividaChequeEspecial * TAXA_USO_CHEQUE;
            double totalDevido = this.dividaChequeEspecial + valorDaTaxa;

            if (valor >= totalDevido) {
                valor = valor - totalDevido;
                this.dividaChequeEspecial = 0.0;
            }

            else {
                this.dividaChequeEspecial = totalDevido - valor;
                valor = 0.0;
            }
        }

        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            return false;
        }

        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }

        else {
            double valorExcedente = valor - this.saldo;
            double limiteDisponivel = this.limiteChequeEspecial - this.dividaChequeEspecial;

            if (valorExcedente <= limiteDisponivel) {
                this.dividaChequeEspecial += valorExcedente;
                this.saldo = 0.0;
                return true;
            }
        }

        return false;
    }

    public boolean pagarBoleto(double valor) {
        return this.sacar(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getLimiteChequeEspecial() {
        return this.limiteChequeEspecial;
    }

    public double getDividaChequeEspecial() {
        return this.dividaChequeEspecial;
    }

    public double consultarLimiteDisponivel() {
        return this.limiteChequeEspecial - this.dividaChequeEspecial;
    }
}
