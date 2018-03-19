public class Project {

    private int penalty;
    private String countryName;
    private int[] servicesUnitsNeeded;

    public Project(int penalty, String countryName, int[] servicesUnitsNeeded){
        this.penalty = penalty;
        this.countryName = countryName;
        this.servicesUnitsNeeded = servicesUnitsNeeded;

    }

	public int getPenalty() {
		return penalty;
	}

	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int[] getServicesUnitsNeeded() {
		return servicesUnitsNeeded;
	}

	public void setServicesUnitsNeeded(int[] servicesUnitsNeeded) {
		this.servicesUnitsNeeded = servicesUnitsNeeded;
	}
    
}
