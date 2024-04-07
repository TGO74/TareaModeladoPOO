public abstract class CuentaBancaria {
	private int numeroDeCuenta;
	private LocalDate fechaApertura;
	private double saldo;
	public Cliente unnamed_Cliente_;

	public int getNumeroDeCuenta() {
		return this.numeroDeCuenta;
	}

	public void setNumeroDeCuenta(int numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public LocalDate getFechaApertura() {
		return this.fechaApertura;
	}

	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract CuentaBancaria mostrarDatosCuenta(CuentaBancaria cuenta);
}