
public class ProjectSupplies {

	public int[] suppliesPerRegionalProvider;
	private int totalRegionalProviders = 0;
	
	public ProjectSupplies(int totalRegionalProviders) {
		this.suppliesPerRegionalProvider = new int[totalRegionalProviders];
	}
	
	public int[] getSuppliesPerRegionalProvider() {
		return suppliesPerRegionalProvider;
	}

	public void setSuppliesPerRegionalProvider(int[] suppliesPerRegionalProvider) {
		this.suppliesPerRegionalProvider = suppliesPerRegionalProvider;
	}

	public int getTotalRegionalProviders() {
		return totalRegionalProviders;
	}

	public void setTotalRegionalProviders(int totalRegionalProviders) {
		this.totalRegionalProviders = totalRegionalProviders;
	}


}
