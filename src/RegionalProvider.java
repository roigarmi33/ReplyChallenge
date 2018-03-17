public class RegionalProvider {

    private String region;
	private int totalPackagesAvailable;
    private float packageUnitCost;
    private int[] serviceUnitsPerPackage;
    private int[] countriesLatency;
    private int index;

    public RegionalProvider(){
    	this.region = "Nowhere to be found";
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

	public int[] getServiceUnitsPerPackage() {
		return serviceUnitsPerPackage;
	}
	
	public int getServiceUnitsPerPackage(int i) {
		return serviceUnitsPerPackage[i];
	}
	
    public void setServiceUnitsPerPackage(int[] servicePerPackage){
    	this.serviceUnitsPerPackage = servicePerPackage;
    }

	public int[] getCountriesLatency() {
		return countriesLatency;
	}

	public void setCountriesLatency(int[] countriesLatency){
		this.countriesLatency = countriesLatency;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}	
	
	public boolean isServiceAvailable(int serviceIndex) {
		return this.serviceUnitsPerPackage[serviceIndex] != 0 && this.totalPackagesAvailable > 0;
	}
	
	
}