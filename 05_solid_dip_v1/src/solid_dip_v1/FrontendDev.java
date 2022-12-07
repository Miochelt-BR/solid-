package solid_dip_v1;

public class FrontendDev implements IDev{

	@Override
	public void dev() {
		this.react();
		
	}

	public void react() {
		System.out.println("\nDesenvolvedor React");
	}
	
}