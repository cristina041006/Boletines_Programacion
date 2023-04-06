package ejercicio.cr;



public class WebDesigner extends Candidate implements Frontend {

	public WebDesigner() {

	}
	
	public Double computeWebDesignCost() {
		return WEB_INTERFACE_DESIGN_COST;
	}
	
	public Double computeFEMaintenanceCost() {
		return FE_MAINTENANCE_COST;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public Double computeGrossSalary() {
		// TODO Auto-generated method stub
		return null;
	}

}
