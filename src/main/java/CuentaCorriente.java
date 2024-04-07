public class CuentaCorriente extends CuentaBancaria {
	private int lineaSobregiro;

	public int getLineaSobregiro() {
		return this.lineaSobregiro;
	}

	public void setLineaSobregiro(int lineaSobregiro) {
		this.lineaSobregiro = lineaSobregiro;
	}

	public CuentaBancaria mostrarDatosCuenta(CuentaBancaria cuenta) {
		throw new UnsupportedOperationException();
	}
}