import java.util.Vector;

public class ProjectSupplies {

	private int totalRegionalProviders;
	private Vector<SingleProjectSupply> suppliesPerProvider;

	public ProjectSupplies(int totalRegionalProviders) {
		this.totalRegionalProviders = totalRegionalProviders;
		this.suppliesPerProvider = new Vector<SingleProjectSupply>();
	}


	/**
	 *
	 * @param regionalProviderIndex < totalRegionalProviders
	 * @param singleProjectSupply must be int[3] and the
	 *
	 */
	public void setSingleSupplieFromProvider(int regionalProviderIndex, SingleProjectSupply singleProjectSupply) {
		if (singleProjectSupply.getPackageUnitsNumber() != 0) {
			this.suppliesPerProvider.add(singleProjectSupply);
		}
	}

	public int[] getSingleSupplieFromProvider(int i) {
		return this.suppliesPerProvider[i];
	}

	public int getTotalRegionalProviders() {
		return totalRegionalProviders;
	}

	public void setTotalRegionalProviders(int totalRegionalProviders) {
		this.totalRegionalProviders = totalRegionalProviders;
	}


	public String getAllSuppliesPerRegionalProviderToString(){
		String line = "";
		boolean first = true;

		for(int i=0; i<this.totalRegionalProviders; i++) {
			line = addSupplieToString(line, i);
		}

	}

	private String addSupplieToString(String line, int i) {
		return line + supplieToString();
	}

	private String supplieToString(int i) {

		String line = "";

		if( arr[i][2] != 0 ){
			if (first){
				line = arr[i][0] + " " + arr[i][1] + " " + arr[i][2];
				first = false;
			} else {
				line = line + " " + arr[i][0] + " " + arr[i][1] + " " + arr[i][2];
			}
		}

		return line; // return empty line == new line
	}

}
