/*
For every project there will be totalRegionalProviders groups of 3 slots
	- Provider
	- RegionalProvider
	- Package
 */

public class ProjectSupplies {

	private int totalRegionalProviders;
	private int[][] suppliesPerProvider;

	public ProjectSupplies(int totalRegionalProviders) {
		this.totalRegionalProviders = totalRegionalProviders;
		this.suppliesPerProvider = new int[totalRegionalProviders][3];
	}
	
	public int[][] getAllSuppliesPerProvider() {
		return suppliesPerProvider;
	}

	public void setAllSuppliesPerProvider(int[][] suppliesPerProvider) {
		this.suppliesPerProvider = suppliesPerProvider;
	}

	/**
	 *
	 * @param i < totalRegionalProviders
	 * @param groupOfSuppliesFromProvider must be int[3]
	 *
	 */
	public void setSingleSupplieFromProvider(int i, int[] groupOfSuppliesFromProvider) {
		this.suppliesPerProvider[i] = groupOfSuppliesFromProvider;
	}

	public int[] getSingleSupplieFromProvider(int i) {
		return this.suppliesPerProvider[i];
	}

	public int gettotalRegionalProviders() {
		return totalRegionalProviders;
	}

	public void settotalRegionalProviders(int totalRegionalProviders) {
		this.totalRegionalProviders = totalRegionalProviders;
	}


}
