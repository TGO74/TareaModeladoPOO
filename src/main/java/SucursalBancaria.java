import java.util.ArrayList;

public class SucursalBancaria {
	private int codigoSucursal;
	private int codigoPostal;
	public ArrayList<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();

	public int getCodigoSucursal() {
		return this.codigoSucursal;
	}

	public void setCodigoSucursal(int codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
}