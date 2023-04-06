package ejercicio.cr;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FullStarckDeveloper extends Candidate implements Backend, Frontend {

	public FullStarckDeveloper() {
		super();
	}
	
	public Double computeWebDesignCost() {
		return WEB_INTERFACE_DESIGN_COST;
	}
	
	public Double computeFEMaintenanceCost() {
		return FE_MAINTENANCE_COST;
	}
	
	public Double createWebAPIAndDBConnectionCost() {
		return WEB_API_DB_COST;
	}
	
	public Double maintenanceCost() {
		return BE_MAINTENANCE_COST;
	}

	@Override
	public Double computeGrossSalary() {
		/*
		Double tariff=(getCt().getPrecio())+((int)ChronoUnit.YEARS.between(getStartDate(),LocalDate.now())*EXPERIENCE_PERCENTAGE);
		*/
		return 0.0;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
