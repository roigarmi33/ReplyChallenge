public class RegionalProvider {

    private String region;
	private int totalPackagesAvailable;
    private float packageUnitCost;
    private int[] serviceUnitsPerPackage;
    private int[] countriesLatency;
    private int index;


	public RegionalProvider(String region, int index){
    	this.region = region;
		this.index = index;
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

	public void setServiceUnitsPerPackage(int[] servicePerPackage){
		this.serviceUnitsPerPackage = servicePerPackage;
	}


	public int getServiceUnitsFromPackage(int serviceIndex) {
		return serviceUnitsPerPackage[serviceIndex];
	}

	public void setServiceUnitsForPackage(int serviceIndex, int units) {
		this.serviceUnitsPerPackage[serviceIndex] = units;
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


	/**
	 * @return the index of the biggest number of units of a service
	 *
	 * Example:
	 * 10 100 5 -> 1
	 * 	4 	3 5 -> 2
	 *
	 */
	public int getIndexGreatestServiceUnit(){

		int max = 0;
		for(int units : this.serviceUnitsPerPackage){
			if (units > max){
				max = units;
			}
		}
		return max;
	}


	/**
	 * @return the index of the lowest latency
	 * in other words return the nearest country's index
	 *
	 */
	public int getIndexLowestCountryLatency(){

		int min = 0;
		for(int latency : this.countriesLatency){
			if (latency < min){
				min = latency;
			}
		}
		return min;
	}
	
}