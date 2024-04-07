public class CuentaAhorro extends CuentaBancaria {
	private Double reajusteAnual;

	public Double getReajusteAnual() {
		return this.reajusteAnual;
	}

	public void setReajusteAnual(Double reajusteAnual) {
		this.reajusteAnual = reajusteAnual;
	}

	public CuentaBancaria mostrarDatosCuenta(CuentaBancaria cuenta) {
		throw new UnsupportedOperationException();
	}
}