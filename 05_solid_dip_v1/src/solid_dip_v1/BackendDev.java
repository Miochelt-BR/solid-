package solid_dip_v1;

public class BackendDev implements IDev{

	@Override
	public void dev() {
		this.java();
		
	}

	public void java() {
		System.out.println("\nDesenvolvedor Java");
	}

}