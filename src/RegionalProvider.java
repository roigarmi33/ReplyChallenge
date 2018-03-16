public class RegionalProvider {

    private String region;
	private int totalPackagesAvailable;
    private float packageUnitCost;
    private int[] servicePerPackage;
    private int[] countriesLatency;

    public RegionalProvider(){
    	region = "Nowhere to be found";
    }
    
    public RegionalProvider(String region){
    	this.setRegion(region);
    }

    public int getTotalPackagesAvailable() {
        return totalPackagesAvailable;
    }

    public void setTotalPackagesAvailable(int totalPackagesAvailable) {
        this.totalPackagesAvailable = totalPackagesAvailable;
    }

    public float getPackageUnitCost() {
        return packageUnitCost;
    }

    public void setPackageUnitCost(float packageUnitCost) {
        this.packageUnitCost = packageUnitCost;
    }
    
    public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int[] getServicePerPackage() {
		return servicePerPackage;
	}
	
    public void setServicePerPackage(int[] servicePerPackage){
    	this.servicePerPackage = servicePerPackage;
    }

	public int[] getCountriesLatency() {
		return countriesLatency;
	}

	public void setCountriesLatency(int[] countriesLatency){
		this.countriesLatency = countriesLatency;
	}		
	
}